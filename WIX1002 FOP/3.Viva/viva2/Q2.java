package viva2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter expression: ");
        String expression= input.next();
        boolean valid=isBalance(expression);
        if(valid)
            System.out.println("Balanced");
        else
            System.out.println("Not balanced");
        
    }

    public static boolean isBalance(String s){
        char[]statement=s.toCharArray();

        int count=0;
        for(int i=0; i<statement.length;i++){
            if(statement[i]=='(')
                count++;
            else if(statement[i]==')')
                count--;
            //validate if ending bracket come first
            if (count < 0) 
                return false;

        }
        return count==0;
    }
}
