public class T4Q1e{
    public static void main(String[]args){

        double sum=0;

        for(int i=1;i<=25;i++){

            sum+=(double)i/(26-i);

        }
        System.out.printf("The sum of 1/25 + 2/24 + 3/23... + 25/1 is %.2f",sum);


    }
}