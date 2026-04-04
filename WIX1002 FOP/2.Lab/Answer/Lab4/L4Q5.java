import java.util.Random;

public class L4Q5{
    public static void main(String[]args){
        Random rd= new Random();

        int roll1=0;
        int roll2=0;
        int point1=0;
        int point2=0;

        while(point1<100&&point2<100){
            System.out.println("\nCurrent point");
            System.out.println("----------------");
            System.out.println("Player 1 point "+point1);
            System.out.println("Player 2 point "+point2);
            System.out.println();
            
            roll1=rd.nextInt(6)+1;
            roll2=rd.nextInt(6)+1;
            point1+=roll1;
            point2+=roll2;

            System.out.println("Player 1 rolled: "+roll1);
            System.out.println("Player 2 rolled: "+roll2);            

            if(point1>=100||point2>=100)break;
            while(roll1==6){
                System.out.println("Player 1 has the chance to roll again!");
                roll1=rd.nextInt(6)+1;
                point1+=roll1;
                System.out.println("Player 1 rolled: "+roll1);
                if(point1>=100||point2>=100)break;
            }
            

            if(point1>=100||point2>=100)break;
            while(roll2==6){
                roll2=rd.nextInt(6)+1;
                point2+=roll2;
                System.out.println("Player 2 rolled: "+roll2);
                if(point1>=100||point2>=100)break;
            }
            
        }
        if(point1>point2){
            System.out.println("Player 1 wins");
            System.out.println("Player 1 scores: "+point1);
            System.out.println("Player 2 scores: "+point2);
        }
        else if(point2>point1){
            System.out.println("Player 2 wins");
            System.out.println("Player 1 scores: "+point1);
            System.out.println("Player 2 scores: "+point2);
        }
        else{
            System.out.println("It's a draw");
        }

    }
}