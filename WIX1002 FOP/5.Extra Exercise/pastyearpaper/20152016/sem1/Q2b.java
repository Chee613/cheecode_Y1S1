//gemini coded
import java.util.Scanner;
import java.util.Random;

public class Q2b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int pWin = 0, cWin = 0;

        while (pWin < 3 && cWin < 3) {
            System.out.print("Enter 1. Paper 2. Scissor 3. Rock: ");
            int player = s.nextInt();
            int comp = r.nextInt(3) + 1;

            String[] choices = {"", "Paper", "Scissor", "Rock"};
            System.out.println("Player: " + choices[player]);
            System.out.println("Computer: " + choices[comp]);

            if (player == comp) {
                System.out.println("Tie!");
            } else if ((player == 1 && comp == 3) || (player == 2 && comp == 1) || (player == 3 && comp == 2)) {
                pWin++;
                System.out.println("Player win " + pWin + " time(s)");
            } else {
                cWin++;
                System.out.println("Computer win " + cWin + " time(s)");
            }
        }
        System.out.println(pWin == 3 ? "Player wins the game." : "Computer wins the game.");
    }
}

