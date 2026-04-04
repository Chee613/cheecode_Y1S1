import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            // Print leading spaces for alignment
            for (int s = 1; s <= (lines - i); s++) {
                System.out.print(" ");
            }
            // Print descending numbers 
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print ascending numbers 
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
