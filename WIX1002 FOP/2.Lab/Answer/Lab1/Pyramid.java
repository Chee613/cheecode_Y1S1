/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Tan Chee Keat
 */
public class Pyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the height of the pyramid (level):");
        int height= input.nextInt();
        
        for (int i = 1; i <= height; i++) {
            
            for (int j = 0; j < height-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        System.out.printf("This is a pyramid with %d level%n",height);   
                
    }
    
}
