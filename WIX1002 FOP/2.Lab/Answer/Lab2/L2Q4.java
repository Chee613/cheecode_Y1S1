/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Tan Chee Keat
 */
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec=input.nextInt();
        
        int hour=sec/3600;
        int min=sec%3600/60;
        int seconds=sec%60;
        
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n",sec,hour,min,seconds);
        
        
    }
    
}
