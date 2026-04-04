package Tutorial.Tutorial7;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Tutorial7_1d {
    public static void main(String[] args) {
        int total=0;
        int freq=0;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Tutorial\\Tutorial7\\integer.dat"))){
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
