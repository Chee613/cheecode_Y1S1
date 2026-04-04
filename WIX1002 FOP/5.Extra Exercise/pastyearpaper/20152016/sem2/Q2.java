import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        
        int sum = 0;
        int temp = number;
        
        // Loop to extract and sum digits 
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("The sum of the digits is " + sum);
    }
}