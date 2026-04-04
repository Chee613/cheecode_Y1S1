import java.util.Scanner;

public class T4Q4{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a random word: ");
        String word= input.next();
        System.out.print("The reversed word is: ");

        for(int i=word.length();i>0;i--){
            System.out.print(word.charAt(i-1));
        }
        input.close();
    }
}