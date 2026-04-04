# Tutorial 3

<details><summary><i>Question 1: Write statements for each of the following</i></summary>

#
## a. Determine whether 3x8=27.
```bash
System.out.println("Is 3x8=27?");
System.out.println(3*8==27);
```
## b. Determine whether an input integer is an odd number or even number.
```bash
import java.util.Scanner;

public class T3Q1b{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
```
## c. Determine whether a  character is a capital letter.
```bash
import java.util.Scanner;

public class T3Q1c{
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a capital letter: ");
        char letter = input.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is a capital letter.");
        } else {
            System.out.println(letter + " is not a capital letter.");
        }
    }
}
```
## Display two strings in alphabetical order ignoring their case.
```bash
import java.util.Scanner;

public class T3Q1d{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = input.next();
        System.out.print("Enter second String: ");
        String str2 = input.next();

        int compare= str1.compareToIgnoreCase(str2);
        if (compare <0){
            System.out.println(str1+" "+str2);
        }
        else{
            System.out.println(str2+" "str1);
        }
    }
}
```
## e. A switch statement that display Sunday, Monday,..., Saturday if the input is 0,1,...,6.
```bash
import java.util.Scanner;

public class T3Q1d{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = input.next();
        System.out.print("Enter second String: ");
        String str2 = input.next();

        int compare= str1.compareToIgnoreCase(str2);
        if (compare <0){
            System.out.println(str1+" "+str2);
        }
        else{
            System.out.println(str2+" "str1);
        }
    }
}
```
</details>

#
<details><summary><i>Question 2: Correct the error for the following statements</i></summary>

## a.
```bash
if(num1=num2)
    System.out.println("Number 1 is equal to number 2.");

Corrected

if(num1==num2)
    System.out.println("Number 1 is equal to number 2.");
```
## b.
```bash
if(x>y>z)
    System.out.println("x is the largest number");

Corrected

if(x>y&&y<z)
    System.out.println("x is the largest number");
```
## c.
```bash
String s1,s2;
if(s1==s2)
    System.out.println("They are equal strings.");
else (s1!=s2)
    System.out.println("They are not equal strings.");

Corrected

String s1,s2;
if(s1.equals(s2))
    System.out.println("They are equal strings.");
else 
    System.out.println("They are not equal strings.");
```
## d.
```bash
if x>0 or y>0;
    System.out.println("Either x or y is positive");

Corrected

if (x>0 || y>0)
    System.out.println("Either x or y is positive");
```
</details>

#
<details><summary><i>Question 3: Write the output for the following statements when x=9 and y=10</i></summary>

## a.
```bash
if (x < 10) 
if (y > 10)
System.out.println("*****"); 
else
System.out.println("#####"); 
System.out.println("$$$$$");

Output:
#####
$$$$$
```
## b.
```bash
if (x < 10) { 
if (y < 10)
System.out.println("*****"); 
else{ 
System.out.println("#####");
System.out.println("$$$$$");
}}

Output:
#####
$$$$$
```
## c.
```bash
if (x < 10) { 
if (y < 10)
System.out.println("*****");
System.out.println("#####");
}
else { 
System.out.println("$$$$$");
}

Output:
#####
```
## d.
```bash
if (x > 10) {
if (y > 10) { 
System.out.println("*****"); 
System.out.println("#####"); } 
else 
System.out.println("$$$$$");
}

Output:
$$$$$
```
</details>

#

<details><summary><i>Question 4: Write the java statements that used the if statement to find the biggest number among three given integers.</i></summary>

#
```bash
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
```
</details>

#
<details><summary><i>Question 5: Write the java statements that determine whether the Leap year. A Leap year is divisible by 4 but not by 100. However, a Leap year is also divisible by 400.</i></summary>

#
```bash
import java.util.Scanner;

public class T3Q5{
    public static void main(String[]args){
        
        Scanner input= new Scanner(System.in);

        System.out.print("Enter current year: ");
        int year= input.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0)
            System.out.printf("This year (%d) is a leap year",year);
        else
            System.out.printf("This year (%d) is not a leap year",year);
        

    }
}
```
</details>



