import java.util.Random;

public class L4Q6{
    public static void main(String[]args){
        Random rd=new Random();

        int num;

        do{
           num= rd.nextInt(); 
        }while(num<0);

        System.out.println("The number generate is: "+num);

        int digit=0;
        int temp=num;

        for(int i=1;i<num;i*=10){
            
            if(temp>0){
                digit+=1;
                temp/=10;
            }
            else break;
        }
        System.out.printf("There are %d digits in this number",digit);

    }
}