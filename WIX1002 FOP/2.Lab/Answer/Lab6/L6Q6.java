package Lab.Lab6;

public class L6Q6 {
    public static void main(String[] args) {
        display20PalindromePrime();
        display20Emrip();
    }

    public static void display20PalindromePrime(){
        int num=2;
        int freq=0;
        while(freq<20){
            if(isPalindromePrime(num)){
                System.out.print(num+",");
                freq++;
            }
            num++;       
        }
        System.out.println();
    }

    public static void display20Emrip(){
        int num=2;
        int freq=0;
        while(freq<20){
            if(isEmrip(num)){
                System.out.print(num+",");
                freq++;
            }
            num++;       
        }
        System.out.println();
    }

    public static boolean isEmrip(int num){
        if(isPrime(num)&&isPrime(reverse(num))&&!isPalindromePrime(num))
            return true;
        else
            return false;
    }
    public static boolean isPalindromePrime(int num){
        if(isPalindrome(num)&&isPrime(num))
            return true;
        else
            return false;
    }

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static int reverse(int num){
        String strNum= Integer.toString(num);
        StringBuilder reversed= new StringBuilder(strNum).reverse();
        int reverseNum= Integer.parseInt(reversed.toString());

        return reverseNum;

    }

    public static boolean isPalindrome(int num){
        String strNum= Integer.toString(num);
        StringBuilder reversed= new StringBuilder(strNum).reverse();
        int reverseNum= Integer.parseInt(reversed.toString());

        if(reverseNum==num)
            return true;
        else
            return false;
    }



    

}
