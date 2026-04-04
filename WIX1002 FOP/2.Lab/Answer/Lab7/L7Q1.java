package Lab7;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        String binaryFile = "C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\coursename.dat";

        // Part 1: Write the data to the binary file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(binaryFile))) {
            // We can write them as pair of strings
            out.writeUTF("WXES1116"); out.writeUTF("Programming I");
            out.writeUTF("WXES1115"); out.writeUTF("Data Structure");
            out.writeUTF("WXES1110"); out.writeUTF("Operating System");
            out.writeUTF("WXES1112"); out.writeUTF("Computing Mathematics I");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Part 2: Read from file based on user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a course code: ");
        String searchCode = input.next();
        
        boolean found = false;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(binaryFile))) {
            // Loop until we hit the end of the file
            while (true) {
                String code = in.readUTF();
                String name = in.readUTF();

                if (code.equalsIgnoreCase(searchCode)) {
                    System.out.println("Course Name: " + name);
                    found = true;
                    break; 
                }
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Course code not found.");
        }
    }
}