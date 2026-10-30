import java.util.Random;

public class L4Q8{
    public static void main(String[]args){
        Random rd= new Random();

        int freq=rd.nextInt(26)+1;
        System.out.printf("The first %d prime number :",freq);
        int ct = 0;
        int num = 2;
        while(ct < freq){
            if(isPrime(num)){
                System.out.print(num + (ct == freq - 1 ? "" : ", "));
                ct++;
            }
            num++;
        }
    }
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}