/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Random;

/**
 *
 * @author Tan Chee Keat
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd =new Random();
        int sum=0;
        System.out.println("Random number generator");
        System.out.println("-----------------------");
        for (int i = 0; i < 3; i++) {
            int num= rd.nextInt(41)+10;
            System.out.printf("The value for number %d is %d%n",(i+1),num);
            sum+=num;
            
            
        }
        double average= (double)sum/3;
        System.out.printf("The sum of these numbers is %d%n",sum);
        System.out.printf("The average of these numbers is %.2f%n",average);
        
    }
    
}
