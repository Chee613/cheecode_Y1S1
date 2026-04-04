import java.util.*;

public class L5Q3{
    public static void main(String[]args){
        Random rd= new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of employee: ");
        int N= input.nextInt();

        for( int i=0;i<N;i++){

            System.out.println("Working hour for emoloyee "+(i+1));
            int totalHour=0;
            for(int j=1; j<=7;j++){
                
                int hour=rd.nextInt(8)+1;
                System.out.printf("Day %d: %d hours%n",j,hour);
                totalHour+=hour;
            }

            System.out.println("The total hour of working for this week: "+totalHour);
            System.out.println();
        }


    }
}