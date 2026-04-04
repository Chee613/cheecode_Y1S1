package Lab7;
import java.io.*;
import java.util.Scanner;

public class L7Q3 {
    public static void main(String[] args) {
        // Change "input.txt" to whatever text file you are reading from
        File sourceFile = new File("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\order.txt"); 
        File destFile = new File("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\reverse.txt");

        try (Scanner sc = new Scanner(sourceFile);
             PrintWriter writer = new PrintWriter(new FileOutputStream(destFile))) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // Use StringBuilder to reverse the string easily
                StringBuilder reversed = new StringBuilder(line);
                writer.println(reversed.reverse().toString());
            }
            System.out.println("Lines reversed and saved to reverse.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
