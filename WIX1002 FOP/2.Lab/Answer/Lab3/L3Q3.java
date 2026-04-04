import java.util.Scanner;

public class L3Q3{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the sales volume:");
        int sales=input.nextInt();
        
        double rate;

        if(sales>0){

            if(sales<=100)
                rate=0.05;
            else if(sales<=500)
                rate=0.075;
            else if (sales<=1000)
                rate=0.1;
            else
                rate=0.125;

            double commission=sales*rate;
            System.out.printf("The commission for total sales of %d is %.2f%n",sales,commission);

        }
        else
            System.out.println("Invalid sales number");
        
        
    }
}