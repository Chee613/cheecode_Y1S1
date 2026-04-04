//self coded
import java.util.Random;
import java.util.Scanner;

public class Q2a {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rd= new Random();

        int playerwin=0;
        int computerwin=0;
        while(playerwin<3&&computerwin<3){
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            int choice= input.nextInt();
            String player=choices(choice);
            int computer=rd.nextInt(3)+1;
            String computerString=choices(computer);

            System.out.printf("Player : %s ----- Computer : %s%n",player,computerString);
            
            if(playercheckWin(player,computerString)){
                playerwin++;
                System.out.println("Player win "+playerwin+" time(s)");
            }
            else if(computercheckWin(computerString,player)){
                computerwin++;
                System.out.println("Computer win "+computerwin+" time(s)");
            }
            else
                System.out.println("It's a draw");

        }
        String winner;
        if(playerwin==3)
            winner="Player";
        else
            winner="Computer";

        System.out.printf("%s wins the game.",winner);
    }

    public static String choices(int a){
        String choice= switch(a){
                case 1-> "Paper";
                case 2-> "Scissor";
                case 3-> "Rock";
                default->"Invalid choice";
        };
        return choice;
    }

    public static boolean playercheckWin(String player, String computer){
        if(player.equals("Paper")&&computer.equals("Rock")){
            return true;
        }
        else if(player.equals("Rock")&&computer.equals("Scissor")){
            return true;
        }
        else if(player.equals("Scissor")&&computer.equals("Paper")){
            return true;
        }
        else
            return false;
    }

    public static boolean computercheckWin(String computer, String player){
        if(computer.equals("Paper")&&player.equals("Rock")){
            return true;
        }
        else if(computer.equals("Rock")&&player.equals("Scissor")){
            return true;
        }
        else if(computer.equals("Scissor")&&player.equals("Paper")){
            return true;
        }
        else
            return false;
    }
}
