package Tutorial.Tutorial7;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileInputStream;

public class Tutorial7_3b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            PrintWriter out= new PrintWriter(new FileOutputStream("C:/Users/Tan Chee Keat/OneDrive/Documents/W1002 FOP/cheecode/WIX1002/Tutorial/Tutorial7/data.txt",true));
            System.out.print("Enter a sentence: ");
            String sentence=input.nextLine();
            String ascii="";

            for(int i=0; i<sentence.length();i++){
                ascii+=String.format("%8s",Integer.toBinaryString(sentence.charAt(i))).replace(" ","0");
            }

            out.print(ascii);
            out.close();

        }catch(IOException e){
            System.out.println("The file cannot be written");
        }

        try{
            Scanner in= new Scanner(new FileInputStream("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Tutorial\\Tutorial7\\data.txt"));

            String wholesentence="";
            String sentence="";

            while(in.hasNextLine()){
                sentence=in.next();
            }

            System.out.println("The sentence in ascii is "+sentence);
            for(int i=0;i<sentence.length();i+=8){
                int code=0;
                for(int j=i,z=7;j<i+8;j++,z--){
                    code+=Integer.parseInt(String.valueOf(sentence.charAt(j)))*Math.pow(2,z);
                }

                char letter=(char)code;
                wholesentence+=letter;
            }
            System.out.println("The actual sentence is "+wholesentence);
            in.close();
        }catch(IOException e){
            System.out.println("The file is not available");
        }
    }
    
}
