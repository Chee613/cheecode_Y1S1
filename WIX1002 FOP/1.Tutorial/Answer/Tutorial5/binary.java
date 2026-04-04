package WIX1002.Tutorial.Tutorial5;

import java.util.Random;
public class binary{
    public static void main(String[]args){
    Random rd= new Random();

    int num=rd.nextInt(256);
    int bit[]= new int[8];
    
    for(int i=7;i>=0;i--){
        bit[i]=num%2;
        num/=2;
    }

    for(int j=0;j<bit.length;j++){
        System.out.print(bit[j]);
    }

    }
}