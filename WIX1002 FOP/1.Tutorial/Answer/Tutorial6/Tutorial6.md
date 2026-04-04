# Tutorial 6 Java Method
##
<details><summary><i>1. Write statements for each of the following</i></summary>

#### a. Define a static method that returns the maximum number from 3 integer parameters.
```bash
public static int maxTerm(int a, int b, int c){

    int max=0;

    if(a>b&&a>c)
        max=a;
    else if(b>c)
        max=b;
    else
        max=c;
    return max;

}
```
#
#### b. Define a static method that that determine whether the given integer is a square number.
```bash
public static boolean isSquare(int num){
    int root=(int)Math.sqrt(num);

    return root*root==num;
}
```
#
#### c. Define a static method that use to compute combination function C(n,k). C(n,k) gives the number of different k-element subsets that can be found in a given set of n elements. C(n,k) = n! / (k! (n-k)!
```bash
public static int C(int n,int k){

    return factorial(n)/(factorial(k)*factorial(n-k));
}

public static int factorial(int n){

    int factorial=1;

    for(int i=1;i<=n;i++){
        factorial*=i;
    }

    return factorial;
}
```
#
#### d. Define a static method that used to determine whether the parameter is a pentagonal number. A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon. Pn = ½ n(3n -1)

```bash
//Solution 1

public static boolean isPentagonal(int num){
    double test=(1+ Math.sqrt(1+24*num))/6;

    return test==(int)test;
}

//Solution 2
 
public static boolean isPentagonal(int num){
    int low=1;
    int high=num;

    while(low<=high){
        int mid=(low+high)/2;
        int p=mid*(3*mid-1)/2;

        if(p==num) return true;
        if(p<num) low=mid+1;
        else high=mid-1;
    }
    return false;
}
```
#
#### e. Define a static method that displays the number of letters and the number of digits of a String parameter.
```bash
public static void letter_digit_freq(String sentence){
    char[]character=sentence.toCharArray();

    int digit=0;
    int letter=0;
    for(int i=0;i<sentence.length()){
        if(Character.isDigit(character[i])==true) digit++;
        else if(Character.isLetter(character[i])==true) letter++;
        else continue;
    }
    System.out.println("The number of letters is"+letter);
    System.out.println("The number of digits is"+digit);
}
```
# 
#### f. Define a static void method that generates 10 random numbers within 0 to 100 to the method’s parameter. The random numbers can be accessed by the main method.
```bash
import java.util.Random;

public static void main(String[]args){
    int[]random= new int[10];
    randomGenerator();
}

public static void randomGenerator(){
    Random rd= new Random();
    for(int i=0;i<10;i++){
        random[i]=rd.nextInt(101);
    }
}
```
#
#### g. Define a static void method that returns the area and the circumference of a circle given the argument is radius. Area = πr2 and Circumference = 2 πr.
```bash
public static double area(double radius){
    return Math.PI*Math.pow(radius,2);
}

public static double circumference(double radius){
    return 2*Math.PI*radius;
}
```
#
#### h. Define a static method that generate random number within 0 – 10. The method will return the first random number that generate twice.
```bash
//Solution 1

import java.util.Random;

public static int randowTwice(){
    random rd= new Random();
    while(true){
        int num1=rd.nextInt(10);
        int num2=rd.nextInt(10);
        if (num1==num2) return num1;
    }

}

//Solution 2

import java.util.Random;

public static int randowTwice(){
    random rd= new Random();
    int[]numList= new int[11];

    while(true){
        int random=rd.nextInt(10);
        numList[random]++;
        if(numList[random]>1) return random;
    }

}
```
</details>

#
<details><summary><i>2. Write a program that consists of a method that can display three numbers in decreasing order.</i></summary></details>

#
```bash
import java.util.Scanner;

public class T6Q2{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int [] num= new int[3];

        System.out.print("Input three integer number: ");
        for(int i=0;i<3;i++){
            num[i]=input.nextInt();
        }

        decereasing(num);
    }

    public static void decreasing(int[]num){

        for(int i=0;i<num.length-1;i++)
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]<num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
}
```
</details>
