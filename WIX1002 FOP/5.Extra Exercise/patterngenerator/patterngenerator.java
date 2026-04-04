import java.util.Scanner;

public class patterngenerator{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a character: ");
        char char1= input.next().charAt(0);
        System.out.print("Enter number of times to be repeated: ");
        int freq1= input.nextInt();
        System.out.print("Enter another character: ");
        char char2= input.next().charAt(0);
        System.out.print("Enter number of times to be repeated: ");
        int freq2= input.nextInt();
        System.out.print("Enter number of row: ");
        int row= input.nextInt();
        System.out.print("Enter number of column: ");
        int column= input.nextInt();

        int freqchar1=0,freqchar2=0;

        //loop for row
        for(int i=0;i<row;i++){
            System.out.println("");
            //loop for column
            for(int j=0;j<column;j++){

                    //print char1 freq1 time
                    if(freqchar1<freq1){
                        System.out.print(char1);
                        freqchar1++;
                        
                    }
                    //print char2 freq2 time
                    else if(freqchar2<freq2){
                        System.out.print(char2);
                        freqchar2++;
                       
                    }
                    //reset after printing freq1+freq2 time
                    else{
                        freqchar1=0;
                        freqchar2=0;
                        System.out.print(char1);
                        freqchar1++;
                       
                    }
                }
                    
                

                
                
                
            
        }

        


    }
}