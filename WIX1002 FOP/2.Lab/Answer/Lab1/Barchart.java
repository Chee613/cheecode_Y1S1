/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Tan Chee Keat
 */
public class Barchart {
    public static int maximum(int[]amount){
        int max=amount[0];
        for (int i = 1; i < amount.length; i++) {
            if(amount[i]>max){
            max=amount[i];
                    }
            
        }
    return max;}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[]month={"January","February","March","April","May","June"};
        int[]amount={2500,1600,2000,2700,3200,800};
        
        
        int max=maximum(amount);
        int barlength=15;
        
        System.out.printf("%-15s |%s %n","Month","Amount");
        for (int i = 0; i < month.length; i++){
            System.out.printf("%-15s:", month[i]);
            int length = (int) ((double) amount[i] / max * barlength);
            for (int j = 0; j <length; j++) {
                System.out.print("*");
                
            }
            System.out.printf("(%d)%n",amount[i]);    
        }
        
        
    }
    
}
