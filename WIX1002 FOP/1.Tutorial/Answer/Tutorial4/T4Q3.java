public class T4Q3{
    public static void main(String[]args){

        int fn=0,fn1=1;
        int fibonacci;

        System.out.println("Fibonacci sequence displayer: ");
        System.out.println("------------------------------");
        System.out.print("The first ten values of Fibonacci sequences: ");
        System.out.printf("%d,%d,",fn,fn1);

        for(int i=0;i<10-2;i++){

            fibonacci=fn+fn1;
            fn=fn1;
            fn1=fibonacci;
            System.out.print(fibonacci+",");

        }

    }
}