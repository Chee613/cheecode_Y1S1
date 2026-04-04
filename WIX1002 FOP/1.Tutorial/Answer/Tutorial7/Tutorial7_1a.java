package Tutorial.Tutorial7;

import java.util.Random;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tutorial7_1a{
    public static void main(String[]args){

        Random rd=new Random();
        try{
            PrintWriter io=new PrintWriter(new FileOutputStream("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Tutorial\\Tutorial7\\integer.txt"));
            for(int i=0;i<10;i++){
                io.println(rd.nextInt(1001));
            }
            io.close();
        }catch(IOException e){
            System.out.println("Error with the file output");
        }
    }
}