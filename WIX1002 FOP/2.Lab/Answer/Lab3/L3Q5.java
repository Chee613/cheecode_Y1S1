import java.util.Scanner;

public class L3Q5{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the value for a,b,c,d,e,and f ");
        System.out.print("a:");
        double a=input.nextDouble();
        System.out.print("b:");
        double b=input.nextDouble();
        System.out.print("c:");
        double c=input.nextDouble();
        System.out.print("d:");
        double d=input.nextDouble();
        System.out.print("e:");
        double e=input.nextDouble();
        System.out.print("f:");
        double f=input.nextDouble();

        double determinant=(a*d)-(b*c);

        if (determinant==0)
            System.out.println("The equation has no solution");
        else{
            double x=((e*d)-(b*f))/determinant;
            double y=((a*f)-(e*c))/determinant;
            System.out.printf("The value for x: %.1f   y: %.1f ",x,y);
        }
        
        
    }
}