import java.util.Random;

public class T4Q1c{
    public static void main(String[]args){
        Random rd= new Random();

        int[][] Matrix=new int[4][5];

        for(int i=0;i<4;i++){
            
            for(int j=0;j<5;j++){
                Matrix[i][j]=rd.nextInt(101);

            }
        }

        System.out.println("Printing 4x5 Matrix: ");
        for(int i=0;i<4;i++){
            System.out.println("");
            for(int j=0;j<5;j++){
                System.out.printf("%-4d ",Matrix[i][j]);

            }
        }

        
    }
}