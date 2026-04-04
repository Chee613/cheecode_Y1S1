package Lab.Lab6;

import java.util.Scanner;

public class L6Q3{
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
        
        System.out.print("Reversed array: ");
        int[]reversedArray=reversed(num);
        for(int c:reversedArray){
            System.out.print(c+",");
        }



    }

    public static int[] reversed(int[]num){
        int[]reversed=new int[10];
        for(int i=0;i<10;i++){
            reversed[i]=num[10-i-1];
        }
        return reversed;
    }
}
