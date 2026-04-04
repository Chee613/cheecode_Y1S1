package Lab7;

import java.io.*;

public class ConvertBinaryToText{
    public static void main(String[] args) {
        String binaryFile = "C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\coursename.dat";
        String textFile = "C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\coursename.txt"; // The output text file

        try (
            // Create the reader for the binary file
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(binaryFile));
            // Create the writer for the text file
            PrintWriter out = new PrintWriter(new FileOutputStream(textFile))
        ) {
            System.out.println("Reading from " + binaryFile + "...");

            // Loop indefinitely until EOFException is thrown
            while (true) {
                // Read the data in the exact order it was written in Question 1
                String code = in.readUTF();
                String name = in.readUTF();

                // Write to the text file in a readable format
                out.printf("%s\t%s%n", code, name);
                
                // Optional: Print to console so you can see it happening
                System.out.println("Converted: " + code + " - " + name);
            }

        } catch (EOFException e) {
            System.out.println("Conversion complete! Check " + textFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + binaryFile + " not found. Make sure you ran Question 1 first.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}