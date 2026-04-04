package Lab.Lab6;

public class L6Q1 {
    public static void main(String[] args) {

        for(int i=1;i<=20;i++){
            System.out.print(triangularNumber(i)+",");
        }
    }

    public static int triangularNumber(int num){
        
        int result=0;
        for(int i=1;i<=num;i++){
            result+=i;
        }
        return result;
    } 
}
