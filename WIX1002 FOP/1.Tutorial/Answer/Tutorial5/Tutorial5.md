# Tutorial 5 Arrays
##
<details><summary><i>1. Write statements for each of the following</i></summary>

### a. Declare an array that used to store 12 floating point numbers.
#
```bash
float []num= new float [12];
```
### b. Initialize an array that used to store the value of A to E.
#
```bash
char []alphabet= new char [5];
for (int i=0; i<alphabet.length; i++){
    char[i]=(char)('A'+i);
}
for (char c:alphabet){
    System.out.print(c+" ");
}
```
### c. Declare an array that used to store 100 students name.
#
```bash
String []name= new String [100];
```
### d. Declare an array for a table with 6 rows 2 columns that used to store integer value.
#
```bash
int [][] num= new int [6][2];
```
### e. Initialize an array with the following value:
#
```bash
int [][] num={{6,9},
             {2,5},
             {4,6}};
```
### f. After initialize the array, modify the value of the above array 
#
```bash
num[1][1]=4;
num[2][0]=3;
num[2][1]=7;
```
### g. Display all the values of an array name contact in separate lines.
#
```bash
for (String name:contact){
    System.out.println(name);
}
```
</details>

##
<details><summary><i>2. Correct the error for the following statements.</i></summary>

### a.
```bash
\\wrong

String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};

\\correct

String[] code = {"AAA", "AAB", "AAC", "AAD"};
```

### b.
```bash
\\wrong

int[] num = new num[10];
for(int k=0; k<=num.length(); k++)
    sum+=num;

\\correct

int[] num = new num[10];
for(int k=0; k<num.length(); k++)
    sum+=num [k];
```

### c.
```bash
\\wrong

int [][]t = new int[3][];
t[1][2] = 5;

\\correct

int [][]t = new int[3][3];
t[1][2] = 5;
```

### d.
```bash
\\wrong

int i=4;
int []score = new int[5];
score [1] = 78;
score[++i] = 100;

\\correct

int i=4;
int []score = new int[6];
score [1] = 78;
score[++i] = 100;
```
</details>

##
<details><summary><i>3. Determine the values of each element of array marks. Assume the array was declared as:</i></summary>

#
```bash
int[] marks = new int[5];
int i = 0, j = 1;
marks[i] = 12; //marks[0]=12
marks[j] = marks[i] + 19; //marks[1]=31
marks[j-1] = marks[j] * marks [j]; //marks[0]=961
marks[j*3] = marks[i+1]; //marks[3]=31
marks[++j] = marks[i]%5; //marks[2]=1
marks[2*j] = marks[j-1]; //marks[4]=31
```
##
```bash
marks[0]=961
marks[1]=31
marks[2]=1
marks[3]=31
marks[4]=31
```
</details>

##
<details><summary><i>4. Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence.</i></summary>

#
```bash
String sentence ="The most delicious food is the pizza"
String []arrSentence= sentence.split(" ");

int freqThe=0;
for (String c : arrSentence){
    if (c.equalsIgnoreCase("the")){
        freqThe++;
    }
}
```
##
</details>

##
<details><summary><i>5. Write the statements that display the string array name sentence in reverse order. Each string element must be displayed in reverse order as well.</i></summary>

#
```bash
String sentence ="The most delicious food is the pizza";
String []arrSentence= sentence.split(" ");
for(int i=arrSentence.length-1;i>=0;i--){

    for(int j=arrSentence[i].length()-1;j>=0;j--){
        System.out.print(arrSentence[i].charAt(j));
    }
    System.out.print(" ");
}
```
##
</details>

##
<details><summary><i>6. Write the statements that generate 1 random integer within 0 – 255. Convert the number to binary and store the bit into an 8 bit array. Then, display the binary number.</i></summary>

#
```bash
import java.util.Random;
public class binary{
    public static void main(String[]args){
        Random rd= new Random();

        int num=rd.nextInt(256);
        int bit[]= new int[8];
        
        for(int i=7;i>=0;i--){
            bit[i]=num%2;
            num/=2;
        }

        for(int j=0;j<bit.length;j++){
            System.out.print(bit[j]);
        }
    }
}
```

##
</details>