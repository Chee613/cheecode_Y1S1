//self-coded
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q4a {
    public static void main(String[] args) {
    
        try{
            Scanner read= new Scanner(new FileInputStream("pastyearpaper\\20152016\\sem1\\Q4.txt"));
            while(read.hasNextLine()){
                String p=read.nextLine();
                if(isStrong(p))
                    System.out.println("Strong password");
                else
                    System.out.println("Not a strong password");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found"+ e.getMessage());
        }
    }

    public static boolean isStrong(String p){
            boolean noCharacter,UpperCase,LowerCase,digit,specialCharacter;
            noCharacter=UpperCase=LowerCase=digit=specialCharacter=false;

            if(p.length()>=8)
                noCharacter=true;

            for(int i=0;i<p.length();i++){
                char c= p.charAt(i);
                if(Character.isUpperCase(c))  UpperCase=true;
                else if(Character.isLowerCase(c))  LowerCase=true;
                else if(Character.isDigit(c))  digit=true;
                else if(c==' ')  specialCharacter=false;
                else specialCharacter=true;
            }

            return noCharacter&&UpperCase&&LowerCase&&digit&&specialCharacter;
        }
}
