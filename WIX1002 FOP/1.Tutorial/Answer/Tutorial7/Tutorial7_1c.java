package Tutorial.Tutorial7;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Tutorial7_1c {
    public static void main(String[]args){
        Random rd=new Random();
        try{
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Tutorial\\Tutorial7\\integer.dat"));
            for(int i=0;i<10;i++){
                out.writeInt(rd.nextInt(1001));
            }
            out.close();
        }catch(IOException e){
            System.out.println("Error with file output");
        }


    }
}
