# Tutorial 4: Flow of Control (Repetition)
##
<details><summary><i>1. Write statements for each of the following</i></summary>

### a. Find the largest integer n so that n^3 is less than 2000.
```bash
public class T4Q1a{
    public static void main(String[]args){

        int n=0;

        while(Math.pow(n,3)<2000){
            n+=1;
        }
        System.out.printf("The largest integer so that n^3 is less than 2000 is %d%n",n-1);
        
    }
}
```

### b. Display the square number of the first twelve integers starting from 1.
```bash
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
```

### c. Display a 4-by-5 matrix using random number within 0 to 100.
```bash
import java.util.Random;

public class T4Q1c{
    public static void main(String[]args){
        Random rd= new Random();

        int[][] Matrix=new int[4][5];

        for(int i=0;i<4;i++){
            
            for(int j=0;j<5;j++){
                Matrix[i][j]=rd.nextInt(101);

            }
        }

        System.out.println("Printing 4x5 Matrix: ");
        for(int i=0;i<4;i++){
            System.out.println("");
            for(int j=0;j<5;j++){
                System.out.printf("%-4d ",Matrix[i][j]);

            }
        }

        
    }
}
```

### d. Compute the sum of numbers from 1 to a given number.
```bash
import java.util.Scanner;

public class T4Q1d{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter an integer number (I'll sum it from 0): ");
        int num= input.nextInt();

        int sum=0;

        for(int i=1; i<=num;i++){
            sum+=i;
        }

        System.out.printf("The sum of 1 to %d is %d%n",num,sum);
    }
}
```

### e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
```bash
public class T4Q1e{
    public static void main(String[]args){

        double sum=0;

        for(int i=1;i<=25;i++){

            sum+=(double)i/(26-i);

        }
        System.out.printf("The sum of 1/25 + 2/24 + 3/23... + 25/1 is %.2f",sum);


    }
}
```
</details>

##
<details><summary><i>2. Correct the error for the following statements.</i></summary>

## a.
```bash
//wrong

for (x = 10; x > 0; x++)
    sum += x;

//correct

for (int x=10; x > 0;x--)
    sum += x;
```
## b.
```bash
//wrong

do
    x += 2;
    y += x;
    System.out.println(x + " and " + y);
while (x < 100)

//correct

int x=0;
int y=0;

do{
    x += 2;
    y += x;
    System.out.println(x + " and " + y);
}
while (x < 100);
```
## c.
```bash
//wrong

for ( x==1, y==20; x < y, x++, y-=2);
    System.out.println(x & " " & y);

//correct

for ( int x=1, int y=20; x < y, x++, y-=2);
    System.out.println(x + " " + y);
```
## d.
```bash
//wrong

i =1;
while(i<10) {
    if (i==10)
        System.out.println("Program End");
}

//correct

i =1;
while(i<10) {
    if (i==10)
        System.out.println("Program End");
    i++;
}
```
</details>

##
<details><summary><i>3. Write the statements that display the first ten values of the Fibonacci sequence. Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.</i></summary>

#
```bash
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
```
</details>

## 
<details><summary><i>4. Write the statements that display the string in reverse order. (use String.length() to get the length of the string)</i></summary>

#
```bash
import java.util.Scanner;

public class T4Q4{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a random word: ");
        String word= input.next();
        System.out.print("The reversed word is: ");

        for(int i=word.length();i>0;i--){
            System.out.print(word.charAt(i-1));
        }
        input.close();
    }
}
```
</details>
