package Lab.Lab9;
import java.util.Scanner;

public class L9Q4 {
    public static void playDinoGame1(){
        DiceGame1 player1 = new DiceGame1("Player 1");
        DiceGame1 player2 = new DiceGame1("Player 2");
        
        while(true){
            player1.rollDice();
            
            if(player1.checkWin()){
                System.out.println("Player 1 win the game");
                break;
            }
            
            player2.rollDice();
            
            if(player2.checkWin()){
                System.out.println("Player 2 win the game");
                break;
            }
            
        }
    }
    
    public static void playDinoGame2(){
        DiceGame2 player1 = new DiceGame2("Player 1");
        DiceGame2 player2 = new DiceGame2("Player 2");
        
        while(true){
            player1.rollDice();
            
            if(player1.checkWin()){
                System.out.println("Player 1 win the game");
                break;
            }
            
            player2.rollDice();
            
            if(player2.checkWin()){
                System.out.println("Player 2 win the game");
                break;
            }
            
        }
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("There two mode of dice game.");
        System.out.println("Pick mode 1 or mode 2");
        int mode=input.nextInt();

        if(mode==1)
            playDinoGame1();
        else
            playDinoGame2();
    }
}