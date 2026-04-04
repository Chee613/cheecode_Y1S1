import java.util.Scanner;

public class T3Q1e{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Input your day number from 0-6: ");
        int day= input.nextInt();

        switch (day) {
            case 0 -> System.out.println("Today is Sunday");
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            default -> System.out.println("Invalid day number");
        }
    }
}