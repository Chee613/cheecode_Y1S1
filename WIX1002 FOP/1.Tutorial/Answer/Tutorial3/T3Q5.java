import java.util.Scanner;

public class T3Q5{
    public static void main(String[]args){
        
        Scanner input= new Scanner(System.in);

        System.out.print("Enter current year: ");
        int year= input.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0)
            System.out.printf("This year (%d) is a leap year",year);
        else
            System.out.printf("This year (%d) is not a leap year",year);
        

    }
}