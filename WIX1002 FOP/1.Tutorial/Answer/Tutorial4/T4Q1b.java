public class T4Q1b{
    public static void main(String[]args){

        int num=1;
        int square;

        for(int i=0;i<12;i++){
            
            square=num*num;
            System.out.printf("The square of %d is %d%n",num,square);
            num+=1;
        }
    }
}