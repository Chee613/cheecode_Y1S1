package Tutorial.Tutorial7;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tutorial7_1b {
    public static void main(String[] args) {
        int max=0;
        int min=1001;
        System.out.print("The file consists: ");

        try{
            Scanner in= new Scanner(new FileInputStream("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Tutorial\\Tutorial7\\integer.txt"));
            while(in.hasNextInt()){
                int num=in.nextInt();
                System.out.print(num+ " ");
                if(num<min) min=num;
                if(num>max) max=num;
            }
            in.close();
        
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");  
        } 


        System.out.println("\nThe largest number is "+max);
        System.out.println("The smallest number is "+min);
    }
    
}
    

