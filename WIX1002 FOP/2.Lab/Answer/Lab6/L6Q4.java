package Lab.Lab6;

public class L6Q4 {
    public static void main(String[] args) {
        gcd(24,8);
        gcd(200,625);
    }

    public static void gcd(int a,int b) {

        int num1,num2;
        if(a>b){
            num1=a;
            num2=b;
        }
        else if(a<b){
            num2=a;
            num1=b;
        }
        else{
            System.out.println("Their Greatest Common Divisor is 1");
            return;
        }
        int gcd = 1;
        for(int i = 1; i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
            gcd = i;
            }
        }
        System.out.println("Their Greatest Common Divisor is "+gcd);
        
    }
    
}
