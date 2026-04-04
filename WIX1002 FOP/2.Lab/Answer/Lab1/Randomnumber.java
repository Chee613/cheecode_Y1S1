/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tan Chee Keat
 */
public class Randomnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        Random rd= new Random();
        System.out.println("Enter the range for a random number");
        System.out.print("Lower boundery:");
        double LB=input.nextDouble();
        System.out.print("Upper boundary:");
        double UB=input.nextDouble();
        System.out.print("Print how many number:");
        int freq=input.nextInt();

        for (int i = 0; i < freq; i++) {
        double number= rd.nextDouble(UB-LB)+LB;    
        System.out.printf("The number between %.2f and %.2f is %.2f%n",LB,UB,number);
        }
        
    }
    
}
