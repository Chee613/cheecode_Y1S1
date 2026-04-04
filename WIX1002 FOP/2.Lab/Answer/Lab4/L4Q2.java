import java.util.Scanner;

public class L4Q2{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num=input.nextInt();
        int sum=0;
        int temp=0;

        for(int j=1;j<=num;j++){
            System.out.print("(");
            for (int k=1;k<=j;k++){
                System.out.print(k);
                if(k<j)
                    System.out.print(("+"));
            }
            System.out.print(")");
            if(j<num){
                System.out.print(" + ");
            }
        }

        for(int i=1;i<=num;i++){
            temp+=i;
            sum+=temp;

        }
        System.out.println("\nThe sum for its ascending sequence is "+sum);
        
    }
}