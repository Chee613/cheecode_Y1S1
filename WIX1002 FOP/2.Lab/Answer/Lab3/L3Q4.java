import java.util.Random;

public class L3Q4{
    public static void main(String[]args){
        Random rd=new Random();

        int score1,score2;
        int sum1=0,sum2=0;

        for(int i=0;i<2;i++){
            
            score1=rd.nextInt(7);
            sum1+=score1;
            System.out.printf("The value of dice for round %d for player 1 is %d (score: %d) %n ",i+1,score1,sum1);

            score2=rd.nextInt(7);
            sum2+=score2;
            System.out.printf("The value of dice for round %d for player 2 is %d (score: %d) %n",i+1,score2,sum2);

        }

        if(sum1>sum2)
            System.out.printf("The winner is player 1 with total score %d%n",sum1);
        else if(sum1<sum2)
            System.out.printf("The winner is player 2 with total score %d%n",sum2);
        else
            System.out.println("It is a draw!");
        
    }
}