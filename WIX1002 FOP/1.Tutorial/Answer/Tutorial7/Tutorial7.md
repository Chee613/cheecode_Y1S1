# Tutorial 7 File Input and File Output
##
<details><summary><i>1. Write statements for each of the following</i></summary>

#### a. Store ten random integers within 0 to 1000 to a text file name integer.txt.
```bash
import java.util.Random;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tutorial7_1a{
    public static void main(String[]args){

        Random rd=new Random();
        try{
            PrintWriter io=new PrintWriter(new FileOutputStream("src/integer.txt"));
            for(int i=0;i<10;i++){
                io.println(rd.nextInt(1001));
            }
            io.close();
        }catch(IOException e){
            System.out.println("Error with the file output");
        }
    }
}
```
#
#### b. Read from the text file generated in a. Display all the integer and the largest integer.
```bash
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tutorial7_1b {
    public static void main(String[] args) {
        int max=0;
        int min=1001;
        System.out.print("The file consists: ");

        try{
            Scanner in= new Scanner(new FileInputStream("src/integer.txt"));
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
```
#
#### c. Store ten random integers within 0 to 1000 to a binary file name integer.dat.
```bash
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Tutorial7_1c {
    public static void main(String[]args){
        Random rd=new Random();
        try{
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("src/integer.dat"));
            for(int i=0;i<10;i++){
                out.writeInt(rd.nextInt(1001));
            }
            out.close();
        }catch(IOException e){
            System.out.println("Error with file output");
        }
    }
}

```
#
#### d. Read from the binary file generated in a c. Display the all the integer and the average.
```bash
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Tutorial7_1d {
    public static void main(String[] args) {
        int total=0;
        int freq=0;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/integer.dat"))){
            while (true) {
                int num = in.readInt();
                total += num;
                freq++;
                System.out.print(num + " ");
            }
        } catch (EOFException e) {
            System.out.println("\nFinished reading file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        double average=(double)total/freq;
        System.out.printf("The average for all these numbers is %.2f%n",average);
    }
}
```
</details>

#
<details><summary><i>2. Correct the error for the following statements</i></summary>

### a.
```bash
//wrong
PrintWriter out = new PrintWriter(new FileOutputStream ("d:\data\matrix.txt"));

//correct
PrintWriter out = new PrintWriter(new FileOutputStream ("d:\\data\\matrix.txt"));

@or

PrintWriter out = new PrintWriter(new FileOutputStream ("d:/data/matrix.txt"));
```

### b.
```bash
//wrong
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
    out.close();
} catch (FileNotFoundException e) {
    System.out.println("Problem with file output");
}

///correct
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
    out.close();
} catch(IOException e) {
    System.out.println("Problem with file output");
}
```

### c.
```bash
//wrong
int num;
Scanner a = new Scanner(new FileInputStream("data.dat"));
num = a.readInt();
a.close();

//correct
int num;
ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
num = a.readInt();
a.close();
```

### d.
```bash
//wrong
ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
o.print('A');
o.close();

//correct
ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
o.writeUTF("A");
o.writeChar('A');
o.close();
```
</details>

#
<details><summary><i>3. Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it in a text file named data.txt. Then, read from the text file and display the sentence.</i></summary>

## Rewrite everytime||Remove previous data
```bash
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileInputStream;

public class Tutorial7_3b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            PrintWriter out= new PrintWriter(new FileOutputStream("src/data.txt"));
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
```
### Reserve previous data
```bash
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
            PrintWriter out= new PrintWriter(new FileOutputStream("src/data1.txt", true));
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
```
</details>