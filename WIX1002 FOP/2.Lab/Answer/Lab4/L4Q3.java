import java.util.Scanner;

public class L4Q3{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        int min=9999999;
        int max=0;
        int sum=0;
        int sums2=0;
        int n=0;
        double average=0.0;
        boolean valid=true;
    
        while(valid==true){
            System.out.print("Enter a score [negative score to quit]: ");
            int num= input.nextInt();

            if(num>0){
            sum+=num;
            sums2+=(num*num);
            n+=1;

            if(num>max)
                max=num;
            if(num<min)
                min=num;
            }
            else
                valid=false;   
        }

        average=(double)sum/n;
        double sd=Math.sqrt((sums2-(sum*sum)/n)/(n-1));

        System.out.println("\nSum of all nuumbers: "+(double)sum);
        System.out.println("Minimum Score: "+min);
        System.out.println("Maximum Score: "+max);
        System.out.printf("Average Score: %.2f%n",average);
        System.out.printf("Standard Deviation: %.2f%n",sd);
    
    }
}