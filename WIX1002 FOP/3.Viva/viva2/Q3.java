package viva2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter ticket number: ");
        String ticket=input.next();
        
        char[]number= ticket.toCharArray();
        for(int i=0;i<number.length;i++){
            if(Character.isDigit(number[i])&&number.length%2==0)
               continue;
            else{
                System.out.println("Invalid ticket number.");
                System.exit(0);
            }
        }

        if(isLuckyTicket(ticket))
            System.out.println("Lucky");
        else
            System.out.println("Unlucky");
        
    }

    public static boolean isLuckyTicket(String ticket){

        int firsthalf=0;
        int secondhalf=0;
        char[]number= ticket.toCharArray();

        for(int i=0;i<number.length/2;i++){
            int num=number[i]-'0';
            firsthalf+=num;
        }

        for(int i=number.length-1;i>number.length/2-1;i--){
            int num=number[i]-'0';
            secondhalf+=num;
        }

        if(firsthalf==secondhalf)
            return true;
        else
            return false;
        



    }
}
