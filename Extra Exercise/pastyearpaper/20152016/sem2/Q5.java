import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        Random rd = new Random();

        // Fill and print board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = rd.nextInt(2);
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        // Check rows and columns 
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
                System.out.println("All " + board[i][0] + "s on row " + i);
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
                System.out.println("All " + board[0][i] + "s on column " + i);
        }
        
        // Check diagonals 
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
            System.out.println("All " + board[0][0] + "s on diagonal");
    }
}
