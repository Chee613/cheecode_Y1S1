//gemini-coded
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q4b {
    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("Q4.txt"));
            while (read.hasNextLine()) {
                String p = read.nextLine();
                if (isStrong(p)) System.out.println("Strong password.");
                else System.out.println("Not a strong password.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static boolean isStrong(String p) {
        if (p.length() < 8) return false;
        boolean upper = false, lower = false, digit = false, special = false;
        for (char c : p.toCharArray()) {
            if (Character.isUpperCase(c)) upper = true;
            else if (Character.isLowerCase(c)) lower = true;
            else if (Character.isDigit(c)) digit = true;
            else if (c != ' ') special = true;
        }
        return upper && lower && digit && special;
    }
}
