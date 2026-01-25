//self coded
import java.util.Random;
import java.util.Scanner;

public class Q3a {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rd= new Random();

        System.out.print("Enter the number of random integer :");
        int n=input.nextInt();
        int []array= new int[n];

        for (int i=0;i<array.length; i++){
            array[i]=rd.nextInt(1001);
        }

        displayArray(array);
        System.out.println("\nMaximum Number: "+getMax(array));
        System.out.print("The approximation of the integer to the nearest tenth : ");
        getRounded(array);
        displayReverseArray(array);

    }

    public static void displayArray(int []array){
        System.out.print("The random integer: ");
        for(int num:array){
            System.out.print(num+" ");
        }
    }

    public static int getMax(int[]array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }

    public static void getRounded(int[]array){
        for (int num : array) {
            int rounded = ((num + 5) / 10) * 10;
            System.out.print(rounded + " ");
        }
        System.out.println();

    }

    public static void displayReverseArray(int []array){
        System.out.print("The random integer in reverse order: ");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
