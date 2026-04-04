import java.util.*;

public class L4Q7{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double P= input.nextDouble();
        System.out.print("Enter interest in %: ");
        double interest= input.nextDouble();
        System.out.print("Enter total number of month (s): ");
        double N=input.nextDouble();

        double suminterest=0;

        //calculation
        double payment=((P*(interest/(12*100)))/(1-Math.pow((1+(interest/(12*100))),-N)));
        System.out.printf("%-9s%15s%15s%10s%18s%18s%n","Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        for(int n=1;n<=N;n++){
            
            double principaldue=(payment*Math.pow((1+(interest/(12*100))),-(1+N-n)));
            double interestdue= payment-principaldue;
            double remaining= interestdue/(interest/(12*100))-principaldue;
            suminterest+=interestdue;

            System.out.printf("%-9d%15.2f%15.2f%10.2f%18.2f%18.2f%n",n,payment,principaldue,interestdue,remaining,suminterest);
        }
        

    }
}
