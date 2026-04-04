import java.util.Scanner;

public class L3Q6{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double radius=input.nextDouble();
        System.out.print("Enter the x-coordinate of a point: ");
        int x=input.nextInt();
        System.out.print("Enter the y-coordinate of a point: ");
        int y=input.nextInt();
        System.out.print("Enter the x-coordinate of the center: ");
        int x2=input.nextInt();
        System.out.print("Enter the y-coordinate of the center: ");
        int y2=input.nextInt();

        double distance=Math.sqrt(Math.pow((y2-y),2)+ Math.pow((x2-x),2));

        if(distance>radius)
            System.out.printf("The point (%d,%d) is outside the circle with center (%d,%d)",x,y,x2,y2);
        else if (distance<radius)
            System.out.printf("The point (%d,%d) is inside the circle  with center (%d,%d)",x,y,x2,y2);
        else
            System.out.printf("The point (%d,%d) is on the circle  with center (%d,%d)",x,y,x2,y2);
    }
}