/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Random;

/**
 *
 * @author Tan Chee Keat
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd=new Random();
        int num=rd.nextInt(10001);
        int sum=0;
        int place=1;
        
        System.out.println("The random number generated is "+num);
        while(num>0){
            int digit=num%10;
            sum+=digit;
            
            System.out.println("The digit for the "+place+" place is "+digit+"(current sum:"+sum+")");
            num/=10;
            place*=10;
        }
        System.out.println("The sum of all digits is: "+sum);
            
        
    }
    
}
