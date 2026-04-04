public class T4Q1a{
    public static void main(String[]args){

        int n=0;

        while(Math.pow(n,3)<2000){
            n+=1;
        }
        System.out.printf("The largest integer so that n^3 is less than 2000 is %d%n",n-1);
        
    }
}