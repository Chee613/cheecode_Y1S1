import java.util.Random;

public class L4Q8{
    public static void main(String[]args){
        Random rd= new Random();

        int freq=rd.nextInt(26)+1;
        System.out.printf("The first %d prime number :",freq);
        int ct=0;
        for(int i=0;i<=100;i++){
            if(ct!=freq){
                if(isPrime(i)){
                    System.out.print(i+", ");
                    ct++;
                }
            }
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