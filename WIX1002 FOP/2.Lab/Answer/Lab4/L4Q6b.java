import java.util.*;

public class L4Q6b{
    public static void main(String[]args){
        Random rd= new Random();

        int random= rd.nextInt(Integer.MAX_VALUE);
        System.out.println("The positive random number is :"+random);
        int digit=0;

        int i=(random==0)?1:0;

        while(random>0){
            random/=10;
            digit++;
        }
        System.out.println("The number of digit for this number is :"+digit);
        
    }
}