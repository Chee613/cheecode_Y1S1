package WIX1002.viva.viva1;

import java.util.Scanner;
public class Q6{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);

        //Number of log strings to be tested
        System.out.print("Enter number of log to be tested: ");
        int T=input.nextInt();
            
        for(int i=0; i<T; i++){
            int length=0;
            boolean invalid = false;
            System.out.print("Enter the compressed string "+(i+1)+" :");
            String compressed= input.next();

            //rules A
            if(Character.isDigit(compressed.charAt(0))){
                System.out.println("Invalid Log ");
                continue;
            }

            //loop to check each character in th elog
            for (int j=0; j<compressed.length();j++){

                //store current character
                char current= compressed.charAt(j);

                //current character is letter
                if(Character.isLetter(current)){
                    length++;
                }
                //current character is digit
                else if(Character.isDigit(current)){

                    //rules B
                    if(current=='0'||current=='1'){
                        invalid=true;
                        break;
                    }

                    //rules C
                    char prev= compressed.charAt(j-1);
                    if (Character.isDigit(prev)){
                        invalid=true;
                        break;
                    }

                    //change char to int and add d-1 time to length
                    int d=current-'0';
                    length+=(d-1);
                    
                }
                

            }
            if (invalid) {
                System.out.println("Invalid Log ");
            } else {
                System.out.println(length+ " ");
            }
           
        }
    }
}