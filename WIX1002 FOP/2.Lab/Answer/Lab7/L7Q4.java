package Lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L7Q4 {
    public static void main(String[] args) {
        // Ensure you have a file named 'data.txt' or change the name below
        File file = new File("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\lecturer.txt");
        
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lineCount++;
                
                // Count characters (including spaces in the line)
                charCount += line.length();

                // Count words (splitting by space as requested)
                // If the line is not empty, split it
                if (!line.trim().isEmpty()) {
                    String[] words = line.split(" ");
                    wordCount += words.length;
                }
            }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
