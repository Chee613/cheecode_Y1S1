import java.util.Scanner;

public class L6Q2{
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        System.out.print("Enter triangle height: ");
        int height=input.nextInt();

        for(int i=1;i<=height;i++){
            multiPrint(height-i,' ');
            multiPrint(i*2-1,'*');
            System.out.println();
        }

        System.out.print("Enter diamond height: ");
        int height2=input.nextInt();
       
        for(int j=1;j<=height2-1;j++){
            multiPrint(height2-j,' ');
            multiPrint(j*2-1,'*');  
            System.out.println();          
        }

        for(int j=height2-1;j>=1;j--){
            multiPrint(height2-j,' ');
            multiPrint(2*j-1,'*');
            System.out.println();
        }
        
        
    }

    public static void multiPrint(int n, char c){
        for(int i=0; i<n;i++){
            System.out.print(c+"");
        }
    }
}