
# WIX1002: Fundamentals of Programming"

**Total Questions:** 100
**Time Limit:** 180 Minutes
**Passing Score:** 60/100 | **Distinction:** 80/100

---

## **Part 1: The Filter (Q1 – Q25)**

*Focus: Static/Instance Order, Loops, Basic I/O, and Shadowing.*

**Q1. (MCA) Analyze the following static initialization code:**

```java
class Base {
    static { System.out.print("A"); }
    { System.out.print("B"); }
    Base() { System.out.print("C"); }
}
class Derived extends Base {
    static { System.out.print("D"); }
    { System.out.print("E"); }
    Derived() { System.out.print("F"); }
}
public class Test {
    public static void main(String[] args) {
        System.out.print("Start ");
        new Derived();
    }
}

```

**Which statements are TRUE regarding the execution order?**
I. The output begins with "Start AD".
II. The static blocks `A` and `D` execute before "Start " is printed.
III. The instance blocks `B` and `E` run before their respective constructors.
IV. The final output is `ADStart BCEF`.

A. I and III only
B. II and III only
C. II, III, and IV
D. I, II, and III
E. All statements are true.

**Q2. (MCQ) A file `data.txt` contains exactly these bytes: `A\nB\r\nC`.**
You run the following code on a Windows machine:

```java
File f = new File("data.txt");
long len = f.length();
System.out.print(len);

```

**What is the output?**
A. 3
B. 4
C. 5
D. 6
E. Throws `IOException`

**Q3. (Code Completion) You are processing a CSV where the 3rd column contains prices (e.g., "10.50"). Some rows are corrupted (e.g., "N/A"). You want to sum valid prices and count errors.**

```java
String[] rows = data.split("\n");
double sum = 0; int err = 0;
for(String r : rows) {
    try {
        sum += __________________________;
    } catch (__________________________) {
        err++;
    }
}

```

**Which option correctly fills the blanks?**
A. `Double.parse(r.split(",")[2])` / `InputMismatchException e`
B. `Double.parseDouble(r.split(",")[2])` / `NumberFormatException e`
C. `Double.valueOf(r.charAt(2))` / `ClassCastException e`
D. `(double)r.split(",")[2]` / `Exception e`
E. `Double.parseDouble(r.substring(2))` / `ArithmeticException e`

**Q4. (MCA) Which of the following code snippets will compile WITHOUT error?**
I. `float f = 3.14;`
II. `long x = 1000; float y = x;`
III. `double d = 10.5; int i = (int) d;`
IV. `boolean b = 1;`

A. I and II
B. II and III
C. I, II, and III
D. III only
E. II and IV

**Q5. (Error Recognition) Identify the logical flaw in this "Swap" method.**

```java
public void swap(Integer a, Integer b) {
    Integer temp = a;
    a = b;
    b = temp;
}
// Called as: swap(x, y);

```

A. The code fails to compile because `Integer` is immutable.
B. It throws a `NullPointerException` if `a` or `b` are null.
C. It compiles and runs, but the values of `x` and `y` in the caller method remain unchanged (Pass-by-Value).
D. It throws a `ClassCastException` at runtime.
E. It works perfectly for numbers between -128 and 127 due to caching.

**Q6. (MCQ) What is the result of the following polymorphic logic?**

```java
class P { int x = 10; void show() { System.out.print("P"); } }
class C extends P { int x = 20; void show() { System.out.print("C"); } }

P obj = new C();
System.out.print(obj.x + " ");
obj.show();

```

A. `10 P`
B. `20 C`
C. `10 C`
D. `20 P`
E. Compilation Error

**Q7. (MCA) Regarding Java Exception Handling:**
I. A `try` block can exist without a `catch` block if a `finally` block is present.
II. `FileNotFoundException` is an unchecked (Runtime) exception.
III. If `System.exit(0)` is called in the `try` block, the `finally` block is skipped.
IV. You can catch `Exception` before catching `IOException`.

A. I and III only
B. I, II, and III
C. II and IV only
D. I and IV only
E. All statements are true.

**Q8. (Logic/Arrays) You are traversing a 2D array `matrix[N][N]` to find the sum of the "Secondary Diagonal" (Top-Right to Bottom-Left).**
Which loop correctly targets these elements?
A. `for(int i=0; i<N; i++) sum += matrix[i][i];`
B. `for(int i=0; i<N; i++) sum += matrix[i][N-i];`
C. `for(int i=0; i<N; i++) sum += matrix[i][N-1-i];`
D. `for(int i=0; i<N; i++) sum += matrix[N-i][i];`
E. `for(int i=1; i<=N; i++) sum += matrix[i][N-i];`

**Q9. (MCQ) What is the output of this String manipulation code?**

```java
String s1 = "Java";
String s2 = s1.concat("Rules");
s2.toUpperCase();
s2.replace('A', 'X');
System.out.println(s2);

```

A. JAVARULES
B. JavaRules
C. JXVARULES
D. JXVXRULES
E. Java

**Q10. (Code Completion) You need to write an object `Student` to a file named "data.ser".**

```java
Student st = new Student("Ali", 3.5);
try (__________________________) {
    out.writeObject(st);
} catch (IOException e) { ... }

```

**Select the correct stream initialization:**
A. `ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"))`
B. `ObjectWriter out = new ObjectWriter(new FileWriter("data.ser"))`
C. `DataOutputStream out = new DataOutputStream(new File("data.ser"))`
D. `PrintWriter out = new PrintWriter("data.ser")`
E. `FileOutputStream out = new FileOutputStream(new ObjectOutputStream("data.ser"))`

**Q11. (MCA) Which of the following result in a Compilation Error?**
I. `abstract class A { abstract void go(); }`
II. `abstract class B { void go() {} }`
III. `class C { abstract void go(); }`
IV. `interface D { int x = 10; }`

A. I and III
B. III only
C. II and III
D. III and IV
E. I, II, and III

**Q12. (MCQ) The "Shadowing" Trap.**

```java
public class Shadow {
    int x = 0;
    public void method(int x) {
        this.x = x;
        x = 10;
        System.out.print(this.x + ":" + x);
    }
    public static void main(String[] args) {
        new Shadow().method(5);
    }
}

```

**Output:**
A. 0:10
B. 5:5
C. 5:10
D. 0:5
E. 10:10

**Q13. (Logic) What is the result of `10 % -3` in Java?**
A. 1
B. -1
C. 2
D. -2
E. 0

**Q14. (MCA) Regarding Interfaces in Java 8+:**
I. Interfaces can contain `default` methods with a body.
II. Interfaces can contain `static` methods.
III. Interface variables are implicitly `public static final`.
IV. A class can implement multiple interfaces but extend only one class.

A. I and IV only
B. I, III, and IV
C. II and III only
D. All statements are true.
E. I, II, and IV

**Q15. (Code Completion) Read a file line-by-line using the most efficient modern approach (Java 8+ logic in standard IO).**

```java
File file = new File("log.txt");
try (Scanner sc = new Scanner(file)) {
    while (__________) {
        System.out.println(__________);
    }
}

```

A. `sc.hasNext()`, `sc.next()`
B. `sc.nextLine() != null`, `sc.getLine()`
C. `sc.hasNextLine()`, `sc.nextLine()`
D. `sc.exists()`, `sc.read()`
E. `sc.isOpen()`, `sc.readLine()`

**Q16. (Error Recognition) Why does this code fail?**

```java
final class Parent {}
class Child extends Parent {
    int x;
}

```

A. `Child` does not define a constructor.
B. `Parent` cannot be extended because it is `final`.
C. `Child` must be `final` if `Parent` is `final`.
D. `x` is not initialized.
E. There is no error; it compiles fine.

**Q17. (MCQ) What is the value of `arr[1]` after this code executes?**

```java
int[] arr = {1, 2, 3};
int[] copy = arr;
copy[1] = 99;
arr[0] = 5;

```

A. 1
B. 2
C. 5
D. 99
E. ArrayOutOfBoundsException

**Q18. (MCA) Which of these are CHECKED exceptions?**
I. `NullPointerException`
II. `IOException`
III. `ArrayIndexOutOfBoundsException`
IV. `ClassNotFoundException`

A. I and III
B. II and IV
C. II only
D. All of them
E. I, II, and III

**Q19. (Logic) Analyze the loop output:**

```java
for (int i = 0; i < 3; i++) {
    for (int j = 3; j > i; j--) {
        System.out.print("*");
    }
    System.out.print(" ");
}

```

A. `*** ** * `
B. `*** *** *** `
C. `* ** *** `
D. `** * ` (Infinite Loop)
E. `*** ** *` (No trailing space)

**Q20. (MCQ) Overloading vs Overriding.**

```java
class A {
    public int doIt(int x) { return x; }
}
class B extends A {
    // INSERT CODE HERE
}

```

**Which code, if inserted at line 5, represents valid OVERLOADING (not overriding)?**
A. `public int doIt(int y) { return y; }`
B. `public double doIt(int x) { return (double)x; }`
C. `public int doIt(double x) { return (int)x; }`
D. `private int doIt(int x) { return x; }`
E. `public void doIt(int x) { }`

---

**Case Study 1: The "Fragile" Logistics System (Q21-Q24)**

```java
1.  abstract class Package {
2.      double weight;
3.      Package(double w) { this.weight = w; }
4.      abstract double cost();
5.  }
6.  
7.  class AirPackage extends Package {
8.      static double rate = 10.0;
9.      AirPackage(double w) { super(w); }
10.     double cost() { return weight * rate; }
11. }
12. 
13. class GroundPackage extends Package {
14.     double rate = 5.0;
15.     GroundPackage(double w) { super(w); }
16.     double cost() { return weight * rate; }
17. }
18.
19. public class Logistics {
20.     public static void main(String[] args) {
21.         Package[] packs = new Package[3];
22.         packs[0] = new AirPackage(2.0);
23.         packs[1] = new GroundPackage(5.0);
24.         AirPackage.rate = 15.0; 
25.         packs[2] = new AirPackage(2.0);
26.         
27.         for(Package p : packs) {
28.             if (p instanceof AirPackage) 
29.                 System.out.print(p.cost() + " ");
30.             else 
31.                 System.out.print(((GroundPackage)p).cost() + " ");
32.         }
33.     }
34. }

```

**Q21. (Output) What is the exact output of the program?**
A. `20.0 25.0 30.0 `
B. `30.0 25.0 30.0 `
C. `20.0 25.0 20.0 `
D. `30.0 25.0 20.0 `
E. Compilation Error at Line 24.

**Q22. (Error Recognition) If Line 15 was changed to `GroundPackage(double w) { weight = w; }`, what would happen?**
A. No change in behavior.
B. Compilation Error: Implicit super constructor is undefined.
C. Logic Error: `weight` would be 0.0.
D. Runtime Error: NullPointerException.
E. Compilation Error: `weight` is not accessible.

**Q23. (Logic/OOP) If we add `rate = 20.0;` inside the `main` method after Line 24:**
A. Only `packs[2]` cost changes.
B. `packs[0]` and `packs[2]` costs change.
C. All packages costs change.
D. Compilation Error: `rate` cannot be resolved.
E. Runtime ClassCastException.

**Q24. (Polymorphism) Which line in the code is REDUNDANT (unnecessary for the code to compile and run)?**
A. Line 3 (`this.weight = w`)
B. Line 4 (`abstract double cost()`)
C. Line 28 (`if (p instanceof AirPackage)`) and the cast on Line 31.
D. Line 9 (`super(w)`).
E. Line 21 (`new Package[3]`).

**Q25. (MCQ) What happens if you run this code?**

```java
int x = 0;
while (x++ < 5) {
    if (x == 3) continue;
    System.out.print(x);
}

```

A. `1245`
B. `0124`
C. `12456`
D. `124`
E. Infinite Loop

---

## **Part 2: The Deep Dive (Q26 – Q50)**

*Focus: Polymorphism in depth, Abstract Class Traps, and "Chain Reaction" Exceptions.*

**Q26. (MCA) Which of the following is true about Java Abstract Classes?**
I. An abstract class cannot be instantiated.
II. An abstract class can hold a `main` method and run.
III. An abstract class must have at least one abstract method.
IV. A subclass of an abstract class must override all abstract methods unless the subclass is also abstract.

A. I and IV only
B. I, II, and IV
C. I, III, and IV
D. I and III only
E. All statements are true.

**Q27. (Logic) Trace the output:**

```java
String[] arr = {"A", "B", "C"};
int i = 0;
try {
    System.out.print(arr[i++] + " ");
    System.out.print(arr[i++] + " ");
    System.out.print(arr[i++] + " ");
    System.out.print(arr[i++] + " ");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.print("E ");
} finally {
    System.out.print("F " + i);
}

```

A. `A B C E F 3`
B. `A B C E F 4`
C. `A B C F 3`
D. `A B C F 4`
E. `A B C E F`

**Q28. (MCQ) What is the result of this boolean logic?**

```java
boolean b1 = true;
boolean b2 = false;
int i = 0;
if (b2 && (i++ > 0)) {
    System.out.print("A");
} else if (b1 || (i++ > 0)) {
    System.out.print("B");
}
System.out.print(i);

```

A. `B0`
B. `B1`
C. `A1`
D. `B2`
E. `A0`

**Q29. (Error Recognition) Identify the issue in this File I/O code:**

```java
try (PrintWriter pw = new PrintWriter("out.txt")) {
    pw.write(100);
    pw.println(100);
}

```

A. `write(int)` writes a byte/char (ASCII 'd'), while `println(int)` writes the string "100".
B. `PrintWriter` does not have a `write` method.
C. `println` throws an IOException which is not caught.
D. `try-with-resources` cannot be used with `PrintWriter`.
E. The code works perfectly and writes "100\n100".

**Q30. (Code Completion) You want to ensure a variable `MAX` in an interface cannot be modified.**

```java
public interface Config {
    __________ int MAX = 100;
}

```

A. `public static final`
B. `final`
C. `static`
D. `const`
E. No keywords needed (Implicitly public static final).

**Q31. (MCA) Analyze the following Polymorphic Cast:**

```java
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

Animal a = new Dog();
Cat c = (Cat) a;

```

**What occurs at line 6?**
A. Compilation Error.
B. Runtime `ClassCastException`.
C. `c` becomes null.
D. Java automatically converts the Dog to a Cat.
E. Runtime `InstantiationException`.

**Q32. (Logic) 2D Array Traversal.**
You want to print a matrix in "Snake" order (Right, then Left, then Right...).

```java
for (int i=0; i<N; i++) {
    if (i % 2 == 0) {
        for (int j=0; j<N; j++) print(matrix[i][j]);
    } else {
        // FILL THIS LINE
    }
}

```

**Which loop correctly traverses backwards?**
A. `for (int j=0; j<N; j++) print(matrix[i][N-j]);`
B. `for (int j=N-1; j>=0; j--) print(matrix[i][j]);`
C. `for (int j=N; j>0; j--) print(matrix[i][j]);`
D. `for (int j=N-1; j>0; j--) print(matrix[i][j]);`
E. `for (int j=0; j<N; j++) print(matrix[N-i][j]);`

**Q33. (MCQ) What is the result of `String.join("-", "A", "B", "C")`?**
A. "ABC"
B. "A-B-C"
C. "-A-B-C-"
D. "A-B-C-"
E. Compilation Error

**Q34. (Logic) Recursive Mystery.**

```java
int fun(int n) {
    if (n == 0) return 1;
    return n * fun(n - 1);
}

```

**What does `fun(5)` calculate?**
A. 5
B. 15
C. 120 (5 Factorial)
D. 25
E. StackOverflowError

**Q35. (Error Recognition) Why does this Interface fail?**

```java
interface I {
    void print() { System.out.println("I"); }
}

```

A. Interfaces cannot have methods with bodies unless marked `default` or `static`.
B. `System.out.println` is not allowed in interfaces.
C. The method must be marked `public`.
D. Interfaces must be abstract.
E. No error.

**Q36. (MCA) Which class allows reading primitive data types (`int`, `double`) directly from a file?**
I. `FileReader`
II. `DataInputStream`
III. `ObjectInputStream`
IV. `Scanner`

A. II and IV
B. II and III
C. I, II, and IV
D. II, III, and IV
E. All of them

**Q37. (MCQ) `Math.round(2.5) + Math.ceil(2.5)**`
A. 5
B. 6
C. 5.0
D. 6.0 (long + double -> double)
E. 4

**Q38. (Logic) Bitwise Ops `5 >> 1**`
A. 2
B. 10
C. 5
D. 1
E. 0

**Q39. (Code Completion) Check if a file is a directory.**

```java
File f = new File("path");
if (__________) { ... }

```

A. `f.isDir()`
B. `f.isDirectory()`
C. `f.folder()`
D. `f.type() == File.DIRECTORY`
E. `f.exists()`

**Q40. (MCA) Exception Hierarchy.**
I. `RuntimeException` extends `Exception`.
II. `Error` extends `Exception`.
III. `Throwable` is the parent of `Exception` and `Error`.
IV. You can catch `Throwable`.

A. I and III
B. I, III, and IV
C. I, II, and III
D. All are true.
E. III and IV

---

**Case Study 2: The "Secure" Database (Q41-Q45)**

```java
1.  interface Security {
2.      boolean authenticate(String pass);
3.  }
4.  
5.  abstract class Database implements Security {
6.      private String dbName;
7.      Database(String name) { this.dbName = name; }
8.      void connect() { System.out.print("Conn:" + dbName + " "); }
9.  }
10. 
11. class SQLDB extends Database {
12.     SQLDB(String name) { super(name); }
13.     public boolean authenticate(String pass) {
14.         return pass.equals("admin");
15.     }
16.     void query() { System.out.print("Querying... "); }
17. }
18. 
19. public class App {
20.     public static void main(String[] args) {
21.         Database db = new SQLDB("UserDB");
22.         db.connect();
23.         
24.         if (db.authenticate("admin")) {
25.             ((SQLDB)db).query();
26.         }
27.         
28.         // db.query(); // Line 28
29.     }
30. }

```

**Q41. (Output) What is the output of the program?**
A. `Conn:UserDB Querying... `
B. `Conn:null Querying... `
C. `Conn:UserDB `
D. Compilation Error at Line 13.
E. Runtime Error at Line 25.

**Q42. (Polymorphism) Why is Line 28 commented out?**
A. Because `query()` is private.
B. Because `query()` is not defined in the `Database` class (Reference Type).
C. Because `db` is null.
D. Because `query()` throws an unchecked exception.
E. It is redundant.

**Q43. (Error Recognition) If Line 6 was `public String dbName;`, what risk does this introduce?**
A. It breaks Encapsulation (Any class can modify the name).
B. It causes a Compilation Error.
C. It prevents Inheritance.
D. It makes the class final.
E. No risk.

**Q44. (Logic) If `SQLDB` did not implement `authenticate`, what would happen?**
A. Compilation Error: `SQLDB` must implement abstract methods.
B. `SQLDB` would become abstract implicitly.
C. It would use the default implementation in `Database`.
D. It would run fine but return false.
E. Runtime Error.

**Q45. (Inheritance) Can `Database` instantiate `Security` directly?**
i.e., `Security s = new Security();`
A. Yes.
B. No, Interfaces cannot be instantiated.
C. Only if `Security` had a default method.
D. Yes, using `super`.
E. Only in the `main` method.

---

**Q46. (MCQ) What is the result of `String.valueOf(null)`?**
A. "null"
B. "" (Empty String)
C. NullPointerException
D. Compilation Error
E. "0"

**Q47. (Logic) Loop Logic.**

```java
int count = 0;
do {
    count++;
} while (count < 5);
System.out.print(count);

```

A. 4
B. 5
C. 6
D. 0
E. Infinite Loop

**Q48. (MCA) `ArrayList` vs `Array`.**
I. Arrays have fixed size; `ArrayList` grows dynamically.
II. `ArrayList` can store primitives (`int`), Arrays cannot.
III. `length` is a field for Arrays, `size()` is a method for `ArrayList`.
IV. Both are zero-indexed.

A. I and IV
B. I, III, and IV
C. I, II, and III
D. All are true.
E. I and III

**Q49. (Code Completion) Write a text file "notes.txt" without overwriting existing content (Append Mode).**
A. `new FileWriter("notes.txt")`
B. `new FileWriter("notes.txt", true)`
C. `new PrintWriter("notes.txt", true)`
D. `new File("notes.txt").append()`
E. `new FileOutputStream("notes.txt", false)`

**Q50. (Final Boss of Part 2) Trace.**

```java
try {
    System.out.print("A");
    throw new RuntimeException();
} catch (Exception e) {
    System.out.print("B");
    try {
        throw new Exception();
    } catch (Exception e2) {
        System.out.print("C");
    } finally {
        System.out.print("D");
    }
} finally {
    System.out.print("E");
}

```

A. `ABCDE`
B. `ABDE`
C. `ABC`
D. `ABE`
E. Compilation Error

---

## **Part 3: The "Real Exam" Simulation (Q51–Q75)**

*Focus: Scenario-based Debugging and Spaghetti Code.*

**Scenario A: The Student Database (Q51-Q54)**

```java
1.  public class GradeProcessor {
2.      public static void main(String[] args) {
3.          List<Integer> grades = new ArrayList<>();
4.          try (Scanner sc = new Scanner(new File("grades.txt"))) {
5.              while (sc.hasNextLine()) {
6.                  String[] parts = sc.nextLine().split(",");
7.                  try {
8.                      grades.add(Integer.parseInt(parts[1]));
9.                  } catch (NumberFormatException e) {
10.                     System.out.print("Skip-" + parts[0] + " ");
11.                 }
12.             }
13.         } catch (IOException e) {
14.             System.out.print("IOError ");
15.         }
16.         System.out.print("Grades:" + grades.size());
17.     }
18. }

```

*Assume `grades.txt` contains:* `Ali,85`, `Abu,Invalid`, `Chong,90`.

**Q51. (Output) What is the EXACT output of this program?**
A. `Skip-Abu Grades:2`
B. `IOError Grades:0`
C. `Skip-Abu Grades:3`
D. `Grades:2`
E. Runtime `NumberFormatException` (Crash)

**Q52. (Code Design) If we wanted to calculate the average grade, where is the BEST place to add the logic?**
A. Inside the `catch (NumberFormatException)` block.
B. Inside the `while` loop, after line 8.
C. After line 17, iterating through the `grades` list.
D. Inside the `finally` block of the file reader.
E. It is impossible because `ArrayList` cannot store primitives (`int`).

**Q53. (Error ID) What happens if the file `grades.txt` does not exist?**
A. The code crashes with `FileNotFoundException`.
B. It prints `IOError Grades:0`.
C. It prints `Skip-null Grades:0`.
D. It prints `IOError` and then crashes at line 17.
E. Compilation Error.

**Q54. (Refactoring) To make this code robust, we want to ensure `grades` is never modified after the main method. How do we declare it?**
A. `final List<Integer> grades = ...`
B. `static List<Integer> grades = ...`
C. `const List<Integer> grades = ...`
D. `private List<Integer> grades = ...`
E. `immutable List<Integer> grades = ...`

---

**Scenario B: The Banking Inheritance Trap (Q55-Q58)**

```java
class Account {
    double balance = 100;
    void withdraw(double amt) {
        balance -= amt;
        System.out.print("Acc:" + balance + " ");
    }
}
class Savings extends Account {
    double balance = 500; // Shadowing
    void withdraw(double amt) {
        balance -= (amt + 5); // Fee
        System.out.print("Sav:" + balance + " ");
    }
    void superWithdraw(double amt) {
        super.withdraw(amt);
    }
}
public class Bank {
    public static void main(String[] args) {
        Account a = new Savings();
        a.withdraw(10);
        System.out.print("Final:" + a.balance);
    }
}

```

**Q55. (Output) What is the output of the code?**
A. `Sav:485.0 Final:100.0`
B. `Sav:485.0 Final:500.0`
C. `Acc:90.0 Final:90.0`
D. `Sav:485.0 Final:485.0`
E. `Sav:490.0 Final:100.0`

**Q56. (Logic) If we added `((Savings)a).superWithdraw(10);` at line 23.5, which balance is modified?**
A. The `balance` in `Savings` (500).
B. The `balance` in `Account` (100).
C. Both balances.
D. Neither (Methods don't modify state).
E. Compilation Error.

**Q57. (Error ID) If line 10 was `private double balance = 500;`, would the code compile?**
A. Yes, but `a.balance` in line 24 would fail.
B. Yes, and the output remains the same.
C. No, you cannot hide a public field with a private one.
D. No, `main` cannot access `a.balance`.
E. Yes, but `a` would become null.

**Q58. (Design) The `balance` field logic is confusing. What is the Object-Oriented Principle that prevents this confusion?**
A. Polymorphism
B. Encapsulation (Making fields private)
C. Inheritance
D. Abstraction
E. Overloading

---

**Scenario C: The Polymorphic Exception (Q59-Q61)**

```java
class A { void process() throws IOException { System.out.print("A"); } }
class B extends A { void process() throws FileNotFoundException { System.out.print("B"); } }
class C extends B { void process() { System.out.print("C"); } }

public class Test {
    public static void main(String[] args) {
        A obj = new C();
        try { obj.process(); } 
        catch (IOException e) { System.out.print("Catch"); }
    }
}

```

**Q59. (Output) What is the result?**
A. `C`
B. `B`
C. `A`
D. `Catch`
E. Compilation Error

**Q60. (Rules) Why is `class B` allowed to throw `FileNotFoundException` when `A` throws `IOException`?**
A. Because `FileNotFoundException` is a subclass of `IOException` (Covariant).
B. Because overriding methods can throw ANY exception.
C. Because `FileNotFoundException` is unchecked.
D. It is NOT allowed; this is a compilation error.
E. Because `B` extends `A`.

**Q61. (Rules) Why does `class C` NOT need a `throws` clause?**
A. Because it throws nothing. Overriding methods can choose to throw *fewer* or *no* exceptions.
B. Because it inherits the throws clause from `B`.
C. Because it is the final class.
D. Because `process()` is void.
E. Compilation Error.

---

**Scenario D: The 2D Array Puzzle (Q62-Q64)**

```java
int[][] grid = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print(grid[i][j]);
    }
}

```

**Q62. (Output) What shape does this print?**
A. The whole square.
B. The Lower Triangle (1 45 789).
C. The Upper Triangle (123 56 9).
D. The Diagonal (1 5 9).
E. IndexOutOfBoundsException.

**Q63. (Code Completion) If we wanted to print the column sums (1+4+7, 2+5+8, 3+6+9), how should we nest the loops?**
A. Keep loops as is.
B. `for(j from 0 to N) { for(i from 0 to N) sum += grid[i][j]; }`
C. `for(i from 0 to N) { for(j from 0 to N) sum += grid[j][i]; }`
D. Both B and C work.
E. Arrays cannot be summed column-wise.

**Q64. (Logic) What is `grid[2][1]`?**
A. 6
B. 8
C. 5
D. 7
E. 2

---

**Scenario E: The "Static" Confusion (Q65-Q67)**

```java
class Robot {
    static int battery = 100;
    int id;
    Robot(int id) { this.id = id; battery -= 10; }
}
// In main:
Robot r1 = new Robot(1);
Robot r2 = new Robot(2);
Robot r3 = new Robot(3);
System.out.println(r1.battery + " " + r2.id);

```

**Q65. (Output) What is the output?**
A. `70 2`
B. `90 2`
C. `100 2`
D. `70 1`
E. `90 1`

**Q66. (Design) Why is using `r1.battery` considered bad practice?**
A. Because `battery` is private (it's not).
B. Because static variables should be accessed via the Class Name (`Robot.battery`).
C. Because it resets the battery.
D. Because `r1` might be null.
E. It is good practice.

**Q67. (Modification) If `battery` was NOT static:**
A. Output would be `90 2`.
B. Output would be `70 2`.
C. Compilation Error.
D. Output would be `90 1`.
E. Output would be `100 2`.

---

**Scenario F: The Interface Conflict (Q68-Q70)**

```java
interface A { default void hello() { System.out.print("A"); } }
interface B { default void hello() { System.out.print("B"); } }
class C implements A, B { /* Missing Code */ }

```

**Q68. (Compilation) Class C fails to compile. Why?**
A. Interfaces cannot have methods with bodies.
B. Duplicate default methods named `hello` create a Diamond Problem.
C. Class C must be abstract.
D. Interfaces A and B are incompatible.
E. `void` methods cannot be default.

**Q69. (Fix) How do we resolve this inside Class C?**
A. Delete `implements B`.
B. Override `hello` and call `A.super.hello();`.
C. Make `hello` abstract in C.
D. Remove `default` from A.
E. Rename the method in B.

**Q70. (Deep Logic) If `interface A` also had `int VAL = 1;` and `interface B` had `int VAL = 2;`, and Class C printed `VAL`:**
A. It prints 1.
B. It prints 2.
C. It prints 0.
D. Compilation Error (Ambiguous Reference).
E. Runtime Exception.

---

**Rapid Fire (Q71-Q75)**

**Q71. (Keywords) Which keyword PREVENTS inheritance?**
A. `static`
B. `abstract`
C. `final`
D. `volatile`
E. `transient`

**Q72. (Memory) Where are Objects (like `new Student()`) stored?**
A. Stack
B. Heap
C. String Pool
D. Metaspace
E. Register

**Q73. (Logic) `String` Equality.** `"Test".equalsIgnoreCase("test")` returns:
A. `true`
B. `false`
C. Compilation Error
D. `0`
E. `1`

**Q74. (Arrays) Array Resizing.** How do you resize an array `int[] arr` in Java?
A. `arr.resize(10)`
B. `arr.length = 10`
C. You cannot; you must create a new array and copy elements.
D. `Arrays.resize(arr, 10)`
E. `arr.add()`

**Q75. (Exceptions) The "Catch-All".** Which catch block handles **Division by Zero**?
A. `catch(NullPointerException e)`
B. `catch(ArithmeticException e)`
C. `catch(IOException e)`
D. `catch(ClassCastException e)`
E. `catch(IndexOutOfBoundsException e)`

---

## **Part 4: The Final Exam (Q76–Q100)**

*Focus: Case Study and Trick Snippets.*

**Case Study: The "SmartHome" System (Q76–Q85)**

**File `config.txt`:** `Light,LivingRoom,ON` | `Thermo,Hall,25` | `Light,Kitchen,OFF` | `Fan,Bedroom,HIGH`

```java
1.  interface Switchable { void toggle(); }
2.  abstract class Device {
3.      static int count = 0; String id;
4.      Device(String id) { this.id = id; count++; }
5.      abstract void status();
6.  }
7.  class Light extends Device implements Switchable {
8.      boolean on;
9.      Light(String id, boolean s) { super(id); this.on = s; }
10.     public void toggle() { on = !on; }
11.     void status() { System.out.print("L:" + id + ":" + (on ? "1" : "0") + " "); }
12. }
13. class Thermo extends Device {
14.     int temp;
15.     Thermo(String id, int t) { super(id); this.temp = t; }
16.     void status() { System.out.print("T:" + id + ":" + temp + " "); }
17. }
18. public class Controller {
19.     public static void main(String[] args) {
20.         List<Device> devs = new ArrayList<>();
21.         try (Scanner sc = new Scanner(new File("config.txt"))) {
22.             while (sc.hasNext()) {
23.                 String[] p = sc.nextLine().split(",");
24.                 try {
25.                     if (p[0].equals("Light")) {
26.                         boolean state = p[2].equals("ON");
27.                         devs.add(new Light(p[1], state));
28.                     } else if (p[0].equals("Thermo")) {
29.                         devs.add(new Thermo(p[1], Integer.parseInt(p[2])));
30.                     }
31.                 } catch (Exception e) { System.out.print("Err-" + p[0] + " "); }
32.             }
33.         } catch (Exception e) { System.out.print("FileErr "); }
34.         
35.         for (Device d : devs) {
36.             if (d instanceof Switchable) ((Switchable)d).toggle();
37.             d.status();
38.         }
39.         System.out.print("Total:" + Device.count);
40.     }
41. }

```

**Q76. (Trace) What is the EXACT output sequence?**
A. `L:LivingRoom:0 T:Hall:25 L:Kitchen:1 Err-Fan Total:4`
B. `L:LivingRoom:0 T:Hall:25 L:Kitchen:1 Err-Fan Total:3`
C. `L:LivingRoom:1 T:Hall:25 L:Kitchen:0 Total:3`
D. `L:LivingRoom:0 T:Hall:25 L:Kitchen:1 Total:3`
E. `FileErr Total:0`

**Q77. (Logic) Why does the line `Fan,Bedroom,HIGH` NOT trigger "Err-Fan"?**
A. Because `Fan` class does not exist.
B. Because `Fan` is not handled in the `if-else` block, so it falls through and does nothing.
C. Because `Integer.parseInt("HIGH")` fails.
D. It silently ignores the Fan line.
E. `Scanner` throws `NoSuchElementException`.

**Q78. (Inheritance) Line 36: `((Switchable)d).toggle()`. Which objects get toggled?**
A. Only `Light` objects.
B. Only `Thermo` objects.
C. All objects.
D. None, because `d` is type `Device`.
E. Runtime ClassCastException.

**Q79. (Variables) What is the value of `Device.count` at the end?**
A. 4 (Light, Thermo, Light, Fan)
B. 3 (Light, Thermo, Light)
C. 0 (Static variable resets)
D. 2 (Only Lights)
E. 5

**Q80. (Design) If we wanted `Thermo` to be switchable (ON/OFF) as well:**
A. `Thermo` must extend `Light`.
B. `Thermo` must implement `Switchable` and define `toggle()`.
C. `Device` must implement `Switchable`.
D. We must change `toggle()` to be abstract in `Device`.
E. Both B and C are valid.

**Q81. (Exceptions) If `config.txt` is missing:**
A. Prints `FileErr Total:0`.
B. Prints `FileErr` then crashes at Line 53 (NullPointer).
C. Prints `FileErr Total:3` (using default values).
D. Prints `FileErr` then crashes at Line 57.
E. Compilation Error.

**Q82. (Code Completion) We want to sort the devices by `id` (alphabetically). What must `Device` implement?**
A. `Comparable<Device>` and override `compareTo`.
B. `Comparator<Device>` and override `compare`.
C. `Serializable`.
D. `Sortable`.
E. Nothing, `ArrayList` sorts automatically.

**Q83. (OOP) Can we do `Device d = new Device("Gen");`?**
A. Yes.
B. No, because `Device` is abstract.
C. No, because the constructor is package-private.
D. Only inside the `Device` class.
E. Yes, if we implement `status()`.

**Q84. (Polymorphism) In Line 37 `d.status()`, how does Java know which `status()` method to call?**
A. It checks the Reference Type (`Device`).
B. It checks the Object Type (Dynamic Binding).
C. It calls the one in `Device` because it is abstract.
D. It is determined at Compile Time.
E. It calls the most recently added method.

**Q85. (Logic) If Line 3 was `int count = 0;` (removing static), what is the final "Total:" output?**
A. Total:3
B. Total:0
C. Total:1 (The last object's count)
D. Total:4
E. Compilation Error (Cannot access instance variable via Class name).

---

**"Snippets from Hell" (Q86–Q95)**

**Q86. (The "Increment" Trap)**

```java
int x = 5; x = x++; System.out.print(x);

```

A. 5
B. 6
C. 4
D. Compilation Error
E. Runtime Error

**Q87. (The "Finally" Override)**

```java
static int test() { try { return 1; } catch (Exception e) { return 2; } finally { return 3; } }

```

A. Returns 1
B. Returns 2
C. Returns 3
D. Compilation Error
E. Returns 1 and 3

**Q88. (The "Octal" Trap)**

```java
int a = 010; int b = 10; System.out.print(a + b);

```

A. 20
B. 1010
C. 18
D. 01010
E. Compilation Error

**Q89. (The "String" Pool)**

```java
String a = "java"; String b = "ja" + "va"; String c = new String("java");
System.out.print((a==b) + " " + (a==c));

```

A. `true true`
B. `true false`
C. `false true`
D. `false false`
E. `true null`

**Q90. (The "Array" Trap)**

```java
int[] a = new int[5]; System.out.print(a[0]);

```

A. null
B. 0
C. Garbage Value
D. Compilation Error
E. Runtime Error

**Q91. (The "Loop" Trap)**

```java
for (int i=0; i<10; i+=2) { if (i==3) break; System.out.print(i); }

```

A. 0123
B. 02
C. 02468
D. 0
E. Infinite Loop

**Q92. (The "Casting" Trap)**

```java
double d = 100.99; int i = (int) d; byte b = (byte) i;
System.out.print(i + " " + b);

```

A. 100 100
B. 101 101
C. 100 101
D. 100.99 100
E. 100 Error

**Q93. (The "Boolean" Trap)**

```java
boolean b = false; if (b = true) System.out.print("X"); else System.out.print("Y");

```

A. X
B. Y
C. Compilation Error
D. No Output
E. XY

**Q94. (The "Static" Block)**

```java
class Test { static int x; static { x = 10; } public static void main(String[] args) { System.out.print(x); x = 20; } static { x = 30; } }

```

A. 10
B. 30
C. 0
D. 20
E. Compilation Error

**Q95. (The "List" Removal)**

```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
list.remove(1); System.out.print(list);

```

A. `[A, C]`
B. `[A, B]`
C. `[A, null, C]`
D. `[B, C]`
E. `IndexOutOfBoundsException`

---

**Architecture & Debugging (Q96–Q100)**

**Q96. (Scenario) Your app reads a 10GB text file. `java.util.Scanner` is causing `OutOfMemoryError`. What is the correct fix?**
A. Increase Heap size (`-Xmx`).
B. Use `BufferedReader` and read line-by-line.
C. Use `ArrayList` to store the data.
D. Use `ObjectInputStream`.
E. Use `Scanner.useDelimiter()`.

**Q97. (Design) You need a class `Config` that has only ONE instance in the entire application. What pattern is this?**
A. Factory Pattern
B. Singleton Pattern
C. Observer Pattern
D. Decorator Pattern
E. MVC Pattern

**Q98. (Error Correction) This recursive factorial fails. Why?**

```java
int fact(int n) { return n * fact(n-1); }

```

A. Syntax Error.
B. Logic Error: No Base Case (StackOverflow).
C. `n` becomes negative.
D. Returns `0`.
E. Both B and C.

**Q99. (Design) Which collection is best for storing unique student IDs where order does NOT matter?**
A. `ArrayList`
B. `LinkedList`
C. `HashSet`
D. `TreeSet` (Sorted)
E. `HashMap`

**Q100. (The Final Check) Which `main` method signature is valid entry point?**
I. `public static void main(String[] args)`
II. `static public void main(String[] args)`
III. `public static void main(String... a)`
IV. `public void main(String[] args)`

A. I only
B. I and II
C. I, II, and III
D. All are valid
E. I and III

---

### **Answer Key**

**Part 1:**

1. A | 2. D | 3. B | 4. C | 5. C
2. C | 7. A | 8. B | 9. B | 10. A
3. D | 12. A | 13. A | 14. A | 15. C
4. B | 17. D | 18. C | 19. A | 20. C
5. B | 22. B | 23. B | 24. C | 25. A

**Part 2:**
26. B | 27. B | 28. A | 29. A | 30. A
31. B | 32. B | 33. B | 34. C | 35. A
36. B | 37. D | 38. A | 39. B | 40. B
41. A | 42. B | 43. A | 44. A | 45. B
46. C | 47. B | 48. B | 49. B | 50. A

**Part 3:**
51. A | 52. C | 53. D | 54. A | 55. A
56. B | 57. B | 58. B | 59. A | 60. A
61. A | 62. B | 63. D | 64. B | 65. A
66. B | 67. A | 68. B | 69. B | 70. D
71. C | 72. B | 73. A | 74. C | 75. B

**Part 4:**
76. D | 77. B | 78. A | 79. B | 80. B
81. A | 82. A | 83. B | 84. B | 85. E
86. A | 87. C | 88. C | 89. B | 90. B
91. C | 92. A | 93. A | 94. B | 95. A
96. B | 97. B | 98. B | 99. C | 100. C