package viva2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num= input.next();
        char[]digit=num.toCharArray();
        while(digit.length!=1){
            digit=calculate(digit);
        }
        System.out.println("Digit root: "+digit[0]);
    }

    public static char[] calculate(char[]digit){
        int sum=0;
        for(int i=0;i<digit.length;i++){
            int num=digit[i]-'0';
            sum+=num;
        }
        return digit= String.valueOf(sum).toCharArray();

    }
    
}
