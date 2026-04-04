package WIX1002.Lab.Lab5;

import java.util.Scanner;

public class L5Q1{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter number of student: ");
        int N= input.nextInt();

        int []score= new int[N];

        double average=0;
        int sum=0;
        int min=999999;
        int max=0;
        int freq=0;

        for (int i=0; i<N; i++){
            System.out.printf("The score for student %d : ",(i+1));
            score[i]=input.nextInt();

            sum+=score[i];
            freq++;

            if(score[i]>max)
                max=score[i];
            
            if(score[i]<min)
                min=score[i];
            
             
        }

        average= (double)sum/freq;
        System.out.println("List of marks");
        System.out.println("--------------");
        for (int c: score){
            System.out.println(c);
        }

        System.out.println("The highest score :" +max);
        System.out.println("The lowest score :" +min);
        System.out.println("The average score :" +average);
        
        
    }
}