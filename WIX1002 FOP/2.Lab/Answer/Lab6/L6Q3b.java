package Lab.Lab6;

import java.util.Scanner;

public class L6Q3b{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int[]num=new int[10];
        System.out.print("Enter 10 numbers : ");
        for(int i=0;i<10;i++){
            num[i]=input.nextInt();
        }   

        System.out.print("Unreversed array: ");
        for(int c:num){
            System.out.print(c+",");
        }

        System.out.println();
        reversedArray(num);
        
        System.out.print("Reversed array: ");
        for(int c: num){
            System.out.print(c+",");
        }

    }
    public static void reversedArray(int[]num){
        for(int i=0;i<10;i++){
            String strnumber= Integer.toString(num[i]);
            StringBuilder reversedStr= new StringBuilder(strnumber).reverse();
            int reversed= Integer.parseInt(reversedStr.toString());
            num[i]=reversed;
        }
    }
}
