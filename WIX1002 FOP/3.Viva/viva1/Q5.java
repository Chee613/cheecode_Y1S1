package WIX1002.viva.viva1;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T;
        // ---------------------------------------------------------
        // VALIDATION 1: Number of words (1 - 100)
        // ---------------------------------------------------------
        do {
            System.out.print("Enter number of words (1-100): ");
            while (!sc.hasNextInt()) { // Check if input is actually a number
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Consume bad input
                System.out.print("Enter number of words (1-100): ");
            }
            T = sc.nextInt();
            
            if (T < 1 || T > 100) {
                System.out.println("Error: T must be between 1 and 100.");
            }
        } while (T < 1 || T > 100);

        String vowels = "aeiou";
        
        for (int t = 0; t < T; t++) {
            String word;
            boolean validWord = false;

            // ---------------------------------------------------------
            // VALIDATION 2: Word validation (Length 1-50, lowercase only)
            // ---------------------------------------------------------
            do {
                System.out.printf("Enter word %d: ", t + 1);
                word = sc.next();

                // Check length constraint
                if (word.length() < 1 || word.length() > 50) {
                    System.out.println("Error: Word length must be between 1 and 50.");
                    continue; // Skip to next iteration of do-while
                }

                // Check lowercase constraint using Regex
                // [a-z]+ means "one or more characters from a to z"
                if (!word.matches("[a-z]+")) {
                    System.out.println("Error: Word must consist only of lowercase English letters.");
                    continue; // Skip to next iteration of do-while
                }

                validWord = true; // If we pass both checks, the word is valid

            } while (!validWord);

            // ---------------------------------------------------------
            // PROCESSING LOGIC (Unchanged)
            // ---------------------------------------------------------
            char[] letters = word.toCharArray();
            boolean isHarmony = true;

            // Rule 1: Last letter cannot be a vowel
            if (vowels.indexOf(letters[letters.length - 1]) != -1) {
                isHarmony = false;
            }

            // Rule 2: No two consecutive vowels
            for (int i = 0; i < letters.length - 1; i++) {
                if (vowels.indexOf(letters[i]) != -1 &&
                    vowels.indexOf(letters[i + 1]) != -1) {
                    isHarmony = false;
                    break;
                }
            }

            if (isHarmony) {
                System.out.println("  Result: Harmony");
            } else {
                System.out.println("  Result: Chaos");
            }
        }

        sc.close();
    }
}