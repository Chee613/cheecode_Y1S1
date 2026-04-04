import java.util.Scanner;

public class T4Q1d{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter an integer number (I'll sum it from 0): ");
        int num= input.nextInt();

        int sum=0;

        for(int i=1; i<=num;i++){
            sum+=i;
        }

        System.out.printf("The sum of 1 to %d is %d%n",num,sum);
        

        
    }
}