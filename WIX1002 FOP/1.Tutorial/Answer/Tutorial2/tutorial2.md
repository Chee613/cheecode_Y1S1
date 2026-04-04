# Tutorial 2 

<details><summary><i>
 1. Display the sentence Faculty of Computer Science and Information Technology : </summary></i>
  
### a. In one line using multiple Java statements
  
```bash
System.out.print("Faculty");
System.out.print("of");
System.out.print("Computer");
System.out.print("Science");
System.out.print("and");
System.out.print("Technology");
```
### b. In multiple lines using one Java statement
```bash
System.out.println("Faculty\n of\n Computer\n Science\n and\n Information\n Technology\n"); 
```
</details>

##
<details><summary><i>2.Write a Java statement that print "SDN" - Software-defined networking</summary></i>

##
```bash
System.out.println("\"SDN\" -Software-defined networking");
```
</details>

##
<details><summary><i>3.Correct the error for the following statements.</i></summary>

### Wrong Syntax
```bash
a.System.Println("Java Programming");
b.System.in.println("Introduction to Java!")
c.System.out.println("\t is the horizontal tab character");
d.system.out.println("Java is case sensitive!" );
```
### Corrected Syntax
```bash
a. System.out.println("Java Programming");
b. System.out.println("Introduction to Java!");
c. System.out.println("\\t is the horizontal tab character");
d. System.out.println("Java is case sensitive!");
```
</details>

##
<details><summary><i>4.Write statements for each of the following:</i></summary>

##
```
a.Declare a variable that used to store the value of a matric number.
b.Declare a variable that used to store the value of π.
c.Initialize a variable named M with the value set to false.
d.Initialize a variable named P with the value set to 8800000000.
e.Initialize a variable named letter with the value set to U.
f.Declare a constant variable named PRO. The value of the constant variable is Java.
```
```bash
a. int matric_number;
b. final double pi=3.142;
c. boolean M=false;
d. long P= 8800000000L;
e. char letter= ‘U’;
f. final String PRO= "Java";

```
</details>

##
<details><summary><i>5.Correct the error for the following statements. </i></summary>

### 5.a.
```bash
5.a.
final double AMOUNT = "32.5"; AMOUNT += 10;
System.out.println("The amount is " + AMOUNT);

```

### Corrected answer
```bash
double AMOUNT= "32.5";
AMOUNT +=10;
System.out.println("The amount is "+ AMOUNT);
```
### 5.b.
```bash
5.b.
string chapter = 'Summary'; 
System.out.println(chapter);

```

### Corrected answer
```bash
String chapter= "Summary";
System.out.println(chapter);
```
### 5.c.
```bash
5.c.
int num;
++num++; num1 = num;

```

### Corrected answer
```bash
int num=0;
num++;
int num1= num;
```
### 5.d.
```bash
5.d.
int num = 3000; System.out.printf("%4.2f\n", num);

```

### Corrected answer
```bash
double num= 3000;
System.out.printf("%4.2f%n",num);
```

### 5.e.
```bash
5.e.
String contact;
Scanner keyboard = new Scanner(System.out); contact = keyboard.nextLine();
```

### Corrected answer
```bash
String contact;
Scanner keyboard= new Scanner(System.in);
contact= keyboard.next();
```
</details>

##
<details><summary><i>6.Write a java program that print the circumference of a circle. The input of the program is diameter. Display the result in three decimal places. (Note pi= Math.PI)</i></summary>

##

```bash
import java.util.Scanner 

public class circumference{

    public static void main(String[]args){

        Scanner input= new Scanner(System.in);

        System.out.print("Enter diameter:");
        double diameter= input.nextDouble();

        double circum= diameter* Math.PI;

        System.out.printf("The circumference of the circle is %.3f%n",circum);

    }
}
```
</details>

##
<details><summary><i>7.Write a java program that converts inches to meters. (Given 1 inch equals to 2.54 centimeters). Print the output in two decimal places.</i></summary>

##

```bash
import java.util.Scanner 

public class circumference{

    public static void main(String[]args){

        Scanner input= new Scanner(System.in);

        System.out.print("Enter value in inch:");
        double inch= input.nextDouble();

        double cm= inch*2.54/100;

        System.out.printf("%.2f inches= %.2f meters%n",inch,cm);

    }
}
```
</details>


