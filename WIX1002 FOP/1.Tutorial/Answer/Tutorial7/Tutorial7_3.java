package Tutorial.Tutorial7;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileInputStream;

public class Tutorial7_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        // WRITE SECTION: Append new sentence and its ASCII binary to file
        try{
            PrintWriter out= new PrintWriter(new FileOutputStream("C:/Users/Tan Chee Keat/OneDrive/Documents/W1002 FOP/cheecode/WIX1002/Tutorial/Tutorial7/data1.txt", true));
            System.out.print("Enter a sentence: ");
            String sentence=input.nextLine();
            String ascii="";

            for(int i=0; i<sentence.length();i++){
                ascii+=String.format("%8s",Integer.toBinaryString(sentence.charAt(i))).replace(" ","0");
            }

            // Write both original sentence and ASCII binary on separate lines
            out.println(sentence);
            out.println(ascii);
            out.close();

        }catch(IOException e){
            System.out.println("The file cannot be written");
        }

        // READ SECTION: Read all data from file and decode
        try{
            Scanner in= new Scanner(new FileInputStream("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Tutorial\\Tutorial7\\data1.txt"));

            System.out.println("\n=== All entries in file ===");
            while(in.hasNextLine()){
                String originalSentence = in.nextLine();
                if(!in.hasNextLine()) break;  // Need both sentence and ASCII line
                
                String binaryLine = in.nextLine();
                
                System.out.println("Original: " + originalSentence);
                System.out.println("Binary: " + binaryLine);
                
                // Decode the binary back to text
                String wholesentence = "";
                for(int i=0; i<binaryLine.length(); i+=8){
                    int code=0;
                    for(int j=i, z=7; j<i+8 && j<binaryLine.length(); j++, z--){
                        code += Integer.parseInt(String.valueOf(binaryLine.charAt(j))) * Math.pow(2, z);
                    }
                    char letter = (char)code;
                    wholesentence += letter;
                }
                System.out.println("Decoded: " + wholesentence);
                System.out.println();
            }
            in.close();
        }catch(IOException e){
            System.out.println("The file is not available");
        }
    }
    
}
