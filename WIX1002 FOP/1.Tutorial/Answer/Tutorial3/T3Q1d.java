import java.util.Scanner;

public class T3Q1d{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = input.next();
        System.out.print("Enter second String: ");
        String str2 = input.next();

        int compare= str1.compareToIgnoreCase(str2);
        if (compare <0){
            System.out.println(str1+" "+str2);
        }
        else{
            System.out.println(str2+" "str1);
        }
    }
}

        