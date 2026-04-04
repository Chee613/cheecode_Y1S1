/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Tan Chee Keat
 */
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Monthly Installment Calculator");
        System.out.println("------------------------------");
        
        //input
        System.out.print("Enter the price of the car:RM");
        double P= input.nextDouble();
        System.out.print("Enter your down payment:RM");
        double D=input.nextDouble();
        System.out.print("Enter the interest rate in %:");
        double R=input.nextDouble()/100;
        System.out.print("Enter the loan duration in year:");
        double Y=input.nextDouble();
        
        double M=(P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("The monthly installment for your car is RM%.2f",M);
        
        
                
        
    }
    
}
