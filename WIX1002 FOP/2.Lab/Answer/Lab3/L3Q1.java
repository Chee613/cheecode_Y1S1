import java.util.Scanner;

public class L3Q1{
    public static void main(String[]args){
        
        Scanner input= new Scanner(System.in);

        

        System.out.print("Enter two integer number: ");
        double num1= input.nextInt();
        double num2= input.nextInt();

        System.out.print("Enter the operand: ");
        char operand=input.next().charAt(0);
        double result=0;

        switch(operand){
            case '+' :
            result=num1+num2;
            System.out.println(num1+""+operand+""+num2+"="+result);
            break;

            case '-' : 
            result=num1-num2;
            System.out.println(num1+""+operand+""+num2+"="+result);
            break;

            case '*' :
            result=num1*num2;
            System.out.println(num1+""+operand+""+num2+"="+result);
            break;

            case '/' : 
            result=num1/num2;
            System.out.println(num1+""+operand+""+num2+"="+result);
            break;

            default :
            System.out.println("Invalid operand");
            break;
        }
        boolean go=true;

        while(go==true){
        System.out.print("Do you want to continue with another number (Y/N) ");
        char valid=input.next().charAt(0);

        if(valid=='Y'){
            System.out.print("Enter integer number: ");
            double num= input.nextInt();
           

            System.out.print("Enter the operand: ");
            char operand2=input.next().charAt(0);
        
            double result2=0;
            
        switch(operand2){
            case '+' :
            result2=result+num;
            System.out.println(result+""+operand2+""+num+"="+result2);
            break;

            case '-' : 
            result2=result-num;
            System.out.println(result+""+operand2+""+num+"="+result2);
            break;

            case '*' :
            result2=result*num;
            System.out.println(result+""+operand2+""+num+"="+result2);
            break;

            case '/' : 
            result2=result/num;
            System.out.println(result+""+operand2+""+num+"="+result2);
            break;

            default :
            System.out.println("Invalid operand");
            break;
        }
            
        }
        else
            go=false;
        }
        
    }
}