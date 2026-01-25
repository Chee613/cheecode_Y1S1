import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        int[]num={34,15,12,27,74,23};//int no need double quote ""
        int cnt=0;
        
        for(int i=0;i<num.length;i++){//array size.length not .length() and open bracket{}
            if(isEven(num[i]))//check index value 
                cnt++;
        }

        System.out.println("The number of even number is "+cnt);
        System.out.println("The sum of the array is "+getTotal(num));//get all array not index 0 only

    }

    public static boolean isEven(int a){// method must be static to be called by main
        if(a%2==0)//boolean operator
            return true;
        else
            return false;
    }

    public static int getTotal(int[]a){//return integer value
        int total=0;
        for(int i=0;i<a.length;i++){
            total+=a[i];//addition correction
        }
        return total;//return after loop
    }
}