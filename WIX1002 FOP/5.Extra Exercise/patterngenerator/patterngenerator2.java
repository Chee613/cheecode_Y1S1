import java.util.Scanner;

public class patterngenerator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section
        System.out.print("Enter first character: ");
        char c1 = input.next().charAt(0);

        System.out.print("Enter number of times this character needs to be repeated: ");
        int n = input.nextInt();

        System.out.print("Enter another character: ");
        char c2 = input.next().charAt(0);

        System.out.print("Enter number of times this character needs to be repeated: ");
        int m = input.nextInt();

        System.out.print("Enter number of rows: ");
        int row = input.nextInt();

        System.out.print("Enter number of columns: ");
        int column = input.nextInt();

        // Logic part
        int i = 0;  // total character counter
        int j = 0;  // inner counter

        while (i < column * row) {

            // print c1 n times
            j = 0;
            while (j < n) {
                if (i == column * row) break;
                System.out.print(c1);
                i++;

                if (i % column == 0) {
                    System.out.println();
                }
                j++;
            }

            // print c2 m times
            j = 0;
            while (j < m) {
                if (i == column * row) break;
                System.out.print(c2);
                i++;

                if (i % column == 0) {
                    System.out.println();
                }
                j++;
            }
        }

        input.close();
    }
}