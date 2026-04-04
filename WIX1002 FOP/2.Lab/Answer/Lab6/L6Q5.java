package Lab.Lab6;

import java.util.*;

public class L6Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rd=new Random();

        int score=0;

        while(true){
            System.out.println("Enter negative number to quit.");
            int num1=rd.nextInt(13);
            int num2=rd.nextInt(13);
            System.out.printf("%d x %d = ",num1,num2);
            int num3=input.nextInt();

            if(num3>=0) 
                score=score+compare(num1,num2,num3);
            else 
                break;
        }
        System.out.println("Your score is "+score);
    }

    public static int compare(int a,int b,int c){
        int score;
        if(a*b==c)
            score=1;
        else
            score=0;

        return score;
    }
    
}
