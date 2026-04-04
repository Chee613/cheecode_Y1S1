package viva2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char[][]tictactoe=new char[3][3];
        for(int i=0;i<3;i++){
            System.out.print("Enter row"+(i+1)+" :");
            String row=input.next();
            for(int j=0;j<3;j++){
                tictactoe[i][j]=row.charAt(j);
            }
        }

        int xMove=countMoves(tictactoe,'X');
        int oMove=countMoves(tictactoe,'O');

        if(xMove!=oMove&&xMove!=oMove+1){
            System.out.println("Invalid board: number of moves is not valid.");
            System.exit(0);
        }

        switch(checkWinner(tictactoe)){

            case 'X'-> System.out.println("Winner: X");
            case 'Y'-> System.out.println("Winner: Y");
            case '.'-> System.out.println("No winner");
            
        }
    }
    public static char checkWinner(char[][]board){
        for(int i=0;i<3;i++){
            char []character=new char[3];
            for(int j=i,k=0;k<3;k++){
                character[k]=board[j][k];
            }
            if(character[0]==character[1]&&character[1]==character[2]){
                return character[0];
            }
        }

        for(int i=0;i<3;i++){
            char []character=new char[3];
            for(int j=i,k=0;k<3;k++){
                character[k]=board[k][j];
            }
            if(character[0]==character[1]&&character[1]==character[2]){
                return character[0];
            }
        }

        if(board[0][2]==board[1][1]&&board[1][1]==board[2][0]&&board[0][2]!='.')
            return board[0][2];
        else if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]!='.')
            return board[0][0];
        else
            return '.';
    }
    
    public static int countMoves(char[][] board, char player){

        int count=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==player)
                    count++;
            }
        }
        return count;
    }
}
