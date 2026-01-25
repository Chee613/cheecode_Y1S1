import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        
        // Calculation based on 1 lb = 0.454 kg 
        double kilograms = pounds * 0.454;
        
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}