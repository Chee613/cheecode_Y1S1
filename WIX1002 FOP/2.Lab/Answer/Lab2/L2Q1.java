/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Tan Chee Keat
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input= new Scanner(System.in);
    
        System.out.println("Temperature convertor(Fahrenheit to degree Celcius)");
        System.out.println("---------------------------------------------------");
        
        
        System.out.print("Enter a temperature in degree Fahrenheit:");
    double fahrenheit= input.nextDouble();
    double celcius=(fahrenheit-32)/18;
    System.out.printf("The value for %.2fF in degree Celcius is %.2fC%n",fahrenheit,celcius);
    
    
  
    
    }
    
}
