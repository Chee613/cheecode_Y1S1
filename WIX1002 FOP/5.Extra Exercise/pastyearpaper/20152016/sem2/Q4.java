import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = input.nextInt();
        System.out.print("Enter the length of a particular side (in meter), s: ");
        double s = input.nextDouble();

        System.out.printf("The area is: %.2f squared meters.%n", area(n, s));
    }

    public static double area(int n, double s) {
        // Formula requires converting 180 degrees to Radians for Math.tan
        return (n * Math.pow(s, 2)) / (4 * Math.tan(Math.toRadians(180.0 / n)));
    }
}