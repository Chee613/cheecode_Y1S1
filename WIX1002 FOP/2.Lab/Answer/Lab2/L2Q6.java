/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Tan Chee Keat
 */
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static double convertor(double x){
        return ((x-32)/1.8);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double M=input.nextInt()/1000;
        System.out.print("Enter the initial temperature in Fahrenheit:");
        double initialtemp=convertor(input.nextDouble());
        System.out.print("Enter the final temperature in Fahrenheit:");
        double finaltemp=convertor(input.nextDouble());
        
        double Q=M*(finaltemp-initialtemp)*4184;
        
        System.out.printf("The energy needed is %.6e%n",Q);


        
    }
    
}
