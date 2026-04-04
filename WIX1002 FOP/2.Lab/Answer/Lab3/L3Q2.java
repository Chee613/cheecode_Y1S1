import java.util.Random;

public class L3Q2{
    public static void main(String[]args){
        Random rd=new Random();

        int num=rd.nextInt(11)+50;
        //word="";

        // switch(num){
        //     case 0-> word="zero";
        //     case 1-> word="one";
        //     case 2-> word="two";
        //     case 3-> word="three";
        //     case 4-> word="four";
        //     case 5-> word="five";
        //     default-> System.out.println("Invalid number");
        // }
        String num1=Integer.toString(num);
        char digit1= num1.charAt(0);
        char digit2= num1.charAt(1);
        String word1="";
        String word2="";
        

        switch(digit1){
            case '5': word1="Fifty";break;
            case '6': word1="Sixty";break;
            default:; break;
        }
        switch(digit2){
            case '1':  word2="one";break;
            case '2':  word2="two";break;
            case '3':  word2="three";break;
            case '4':  word2="four";break;
            case '5':  word2="five";break;
            case '6':  word2="six";break;
            case '7':  word2="seven";break;
            case '8':  word2="eight";break;
            case '9':  word2="nine";break;
            default:   word2="";break;
        }
        System.out.println(num+" is "+word1+" "+word2);
        
    }
}