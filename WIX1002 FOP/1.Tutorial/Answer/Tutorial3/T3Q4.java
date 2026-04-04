import java.util.Random;
public class T3Q4{
    public static void main(String[]args){
        Random rd=new Random();
        long max=-999999999999L;
        for(int i=0; i<3;i++){
            int num=rd.nextInt();
            System.out.printf("num%d is  %d%n",i+1,num);

            if(num>max){
                max=num;
            }
        }
        System.out.println("The maximum number among these three is "+ max);
        
    }
}