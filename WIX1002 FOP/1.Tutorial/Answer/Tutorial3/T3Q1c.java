import java.util.Scanner;

public class T3Q1c{
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a capital letter: ");
        char letter = input.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is a capital letter.");
        } else {
            System.out.println(letter + " is not a capital letter.");
        }
    }
}