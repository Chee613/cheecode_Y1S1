# WIX1002: Advanced Java Mastery Challenge (First 50 Questions)

Difficulty: Master / Competitive Programming
Topics: Initialization Lifecycle, Complex Inheritance, Exception Propagation, Memory Management, and Polymorphic Binding.

Part 1: Advanced Execution Logic (Q1 – Q25)

**Q1. Analyze the initialization sequence:**
```java
class Alpha {
    static { System.out.print("1"); }
    Alpha() { System.out.print("2"); }
}
class Beta extends Alpha {
    static { System.out.print("3"); }
    Beta() { this(4); System.out.print("5"); }
    Beta(int x) { System.out.print(x); }
}
// In main: new Beta();
```

- A. 12345
- B. 13245
- C. 31245
- D. 13425
- E. 21345

**Q2. Regarding ObjectInputStream, what happens if the class version (serialVersionUID) of the serialized object doesn't match the current class definition during deserialization?**

- A. It resets all fields to null.
- B. It throws InvalidClassException.
- C. It ignores missing fields.
- D. It throws ClassNotFoundException.
- E. It re-runs the constructor.

**Q3. Shadowing and Reference Types:**
```java
class Parent { int x = 10; }
class Child extends Parent { int x = 20; }
// In main: Parent p = new Child(); System.out.print(p.x + " " + ((Child)p).x);
```

- A. 10 20
- B. 20 20
- C. 10 10
- D. 20 10
- E. Compilation Error

**Q4. Polymorphism with Static Methods:**
```java
class A { static void run() { System.out.print("A"); } }
class B extends A { static void run() { System.out.print("B"); } }
// In main: A obj = new B(); obj.run();
```

- A. A
- B. B
- C. AB
- D. Compilation Error
- E. Runtime Exception

**Q5. Logic Trap (Increment):**
```java
int x = 5; x = x++ + ++x; System.out.print(x);
```

- A. 11
- B. 12
- C. 10
- D. 13
- E. 5

**Q6. Recursive Exception Propagation:**
If a recursive method throws a checked exception, how many throws clauses are required in a call stack 5 levels deep if none catch it?

- A. 1
- B. 5
- C. 0
- D. 6
- E. It is not allowed.

**Q7. Floating Point Precision:**
```java
System.out.print(1.0 / 0.0);
```

- A. ArithmeticException
- B. Infinity
- C. NaN
- D. 0
- E. Compilation Error

**Q8. Array Covariance Check:**
```java
Number[] n = new Integer[2];
n[0] = 1.5; 
```

- A. Compiles and runs.
- B. Compilation Error.
- C. Runtime ArrayStoreException.
- D. Runtime ClassCastException.
- E. Truncation to 1.

**Q9. Short-circuit logic:**
```java
int x=0; if (true || (x++ > 0)) { x += 10; }
```

- A. 10
- B. 11
- C. 0
- D. 1
- E. Error

**Q10. Final Array Contents:**
```java
final int[] arr = {1, 2}; arr[0] = 5;
```

- A. Success.
- B. Compilation Error.
- C. Runtime Exception.
- D. Only if arr is static.
- E. Only in Java 17+.

**Q11. Code Completion:**
```java
try (Resource r = new Resource()) { ... }
```
requires Resource to implement:

- A. Serializable
- B. AutoCloseable
- C. Cloneable
- D. Runnable
- E. FileHandler

**Q12. The finally Return Trap:**
```java
int test() {
    try { return 1; }
    finally { return 2; }
}
```

- A. 1
- B. 2
- C. 12
- D. Compilation Error
- E. 0

**Q13. Byte Overflow:**
```java
byte b = 127; b++; System.out.print(b);
```

- A. 128
- B. -128
- C. 0
- D. 127
- E. Error

**Q14. String Pool Logic:**
```java
String s1 = "Java"; String s2 = new String("Java"); System.out.print(s1 == s2.intern());
```

- A. true
- B. false
- C. null
- D. Error
- E. depends on JVM

**Q15. Abstract Class Rules:**
Can an abstract class be declared final?

- A. Yes.
- B. No, they are contradictory.
- C. Only if it has no methods.
- D. Only if it's an inner class.
- E. Only in Java 8.

**Q16. Interface Collision:**
If Class C implements A and B, and both have a default method void hello(), C must:

- A. Override hello().
- B. Use A's version by default.
- C. Use B's version.
- D. Be abstract.
- E. Compile error (cannot fix).

**Q17. Bitwise Shift:**
-1 >>> 1 results in:

- A. -1
- B. 1
- C. 2147483647
- D. 0
- E. -2

**Q18. Constructor Context:**
Can this() and super() be called in the same constructor?

- A. Yes.
- B. No, both must be the first statement.
- C. Only if this() comes first.
- D. Only if super() comes first.
- E. Only in static classes.

**Q19. Debugging:**
```java
ArrayList<int> list = new ArrayList<>();
```

- A. Works fine.
- B. Error: Cannot use primitives in Generics.
- C. Needs new int[].
- D. Needs static.
- E. Success.

**Q20. Instanceof null:**
```java
String s = null; System.out.print(s instanceof String);
```

- A. true
- B. false
- C. NullPointerException
- D. Error
- E. null

**Q21. Hidden Fields Access:**
How does a child class access a shadowed parent field x?

- A. this.x
- B. super.x
- C. parent.x
- D. ((Parent)this).x
- E. B and D are both valid.

**Q22. Covariant Return Types:**
A parent method returns Object. A child override returns String. Is this valid?

- A. Yes.
- B. No.
- C. Only if cast.
- D. Only if String is final.
- E. Only if static.

**Q23. Anonymous Inner Class:**
```java
new Object() { void sayHi() { System.out.print("Hi"); } }.sayHi();
```

- A. Prints "Hi".
- B. Compilation Error (sayHi not in Object).
- C. Runtime Error.
- D. Prints nothing.
- E. Success.

**Q24. Functional Interface:**
An interface with exactly one abstract method is called:

- A. Singular Interface
- B. Functional Interface
- C. Abstract Interface
- D. Lambda Holder
- E. Primitive Interface

**Q25. Default Method Override:**
Can a default method be overridden as abstract in a subclass?

- A. Yes.
- B. No.
- C. Only if private.
- D. Only if the parent is also abstract.
- E. Only in interfaces.

Part 2: Deep Inheritance & Variable Scoping (Q26 – Q50)

**Q26. Private Method Inheritance:**
Are private methods inherited?

- A. Yes, but not accessible.
- B. No.
- C. Only if they are static.
- D. Only in inner classes.
- E. Yes, via reflection only.

**Q27. Static Block Lifecycle:**
How many times does a static block execute if 100 objects of that class are created across different threads?

- A. 100
- B. 1
- C. 0
- D. 10
- E. Every time a constructor finishes.

**Q28. Polymorphic Casting Trap:**
```java
Animal a = new Dog(); Cat c = (Cat) a; (Assuming Cat and Dog both extend Animal).
```

- A. Compilation Error.
- B. ClassCastException.
- C. null.
- D. Works if Dog is static.
- E. Works if Cat extends Dog.

**Q29. Implicit Interface Modifiers:**
All variables defined inside an interface are implicitly:

- A. public abstract
- B. public static final
- C. protected static
- D. private final
- E. volatile

**Q30. Diamond Problem Logic:**
Java handles the Diamond Problem in classes by:

- A. Supporting multiple inheritance.
- B. Allowing only single inheritance for classes.
- C. Using default methods for interfaces.
- D. Forcing a manual override in the child.
- E. B and C.

**Q31. Multi-Dimensional Array Length:**
```java
int[][] arr = new int[3][5]; System.out.print(arr.length + " " + arr[0].length);
```

- A. 3 5
- B. 5 3
- C. 15 15
- D. 8 8
- E. 3 3

**Q32. Exception Masking:**
```java
try { throw new NullPointerException(); }
finally { throw new ArithmeticException(); }
```
What exception does the caller receive?

- A. NullPointerException
- B. ArithmeticException
- C. Both
- D. None
- E. Runtime Error

**Q33. String Memory Address:**
```java
String a = "hi"; String b = "hi"; String c = new String("hi");
```

- A. a == b is true, a == c is false.
- B. All are true.
- C. All are false.
- D. a.equals(c) is false.
- E. Error.

**Q34. Protected Access in Subclasses:**
A protected field in Class A (Package P1) is accessed by Class B (Package P2) which extends A. This is done via new A().field.

- A. Success.
- B. Compilation Error (must be accessed via inheritance).
- C. Runtime Error.
- D. Success only if field is static.
- E. Success only in Java 11+.

**Q35. Default Interface Method Resolution:**
If Class C implements A and B, but only Interface A provides a default method test(), does C need to override it?

- A. Yes.
- B. No, it uses A's.
- C. Only if B is abstract.
- D. Only if B has a static test().
- E. Compilation Error.

**Q36. Serializing Non-Serializable Parents:**
If Sub is Serializable but Super is not, what happens to Super's fields when Sub is deserialized?

- A. Throws Exception.
- B. Super's no-arg constructor runs, resetting fields.
- C. Super's fields are restored.
- D. JVM crashes.
- E. Static values are lost.

**Q37. Math.round vs Math.floor:**
```java
Math.round(-2.5)
```
results in:

- A. -2
- B. -3
- C. -2.0
- D. -2.5
- E. 0

**Q38. Logical XOR Operator:**
```java
true ^ true
```
results in:

- A. true
- B. false
- C. null
- D. 0
- E. Error

**Q39. ArrayList Initial Capacity:**
What is the default initial capacity of an empty ArrayList?

- A. 0
- B. 10
- C. 16
- D. 32
- E. Depends on RAM.

**Q40. Constructor 'this' Chain:**
```java
class X {
    X() { System.out.print("1"); }
    X(int a) { this(); System.out.print("2"); }
}
new X(5);
```

- A. 12
- B. 21
- C. 1
- D. 2
- E. Error

**Q41. Varargs Ambiguity:**
```java
void m(int x) vs void m(int... x). Calling m(5)
```
results in:

- A. Exact match wins.
- B. Varargs wins.
- C. Ambiguous Error.
- D. Both run.
- E. Runtime Error.

**Q42. Scanner hasNextLine vs hasNext:**
Which one checks for the existence of any character before the next delimiter?

- A. hasNextLine
- B. hasNext
- C. hasNextInt
- D. next
- E. None

**Q43. Final Method Overloading:**
Can you overload a final method in the same class?

- A. Yes.
- B. No.
- C. Only if private.
- D. Only if static.
- E. Only in inner classes.

**Q44. Static Field Shadowing:**
If a class has a static field and an instance field with the same name:

- A. Compilation Error.
- B. Success.
- C. Only if types differ.
- D. Only if one is final.
- E. Only in Java 8.

**Q45. Object clone() visibility:**
The default clone() method in the Object class has which modifier?

- A. public
- B. protectedex
- C. private
- D. package-private
- E. final

**Q46. Abstract method with body:**
What keyword allows an interface method to have a body?

- A. abstract
- B. default
- C. final
- D. native
- E. synchronized

**Q47. String substring(int, int):**
```java
"Java".substring(1, 3)
```
returns:

- A. "av"
- B. "jav"
- C. "ava"
- D. "a"
- E. Error

**Q48. Primitive to String:**
```java
int i = 5
```
Which is the most memory-efficient way to convert to String?

- A. "" + i
- B. String.valueOf(i)
- C. new Integer(i).toString()
- D. i.toString()
- E. (String)i

**Q49. Boolean reference vs primitive:**
```java
Boolean b1 = true; boolean b2 = true; System.out.print(b1 == b2);
```

- A. true (Autounboxing)
- B. false
- C. Error
- D. null
- E. static

**Q50. Class initialization block order:**
In a class, which runs first: static block or instance block?

- A. Static block.
- B. Instance block.
- C. Constructor.
- D. Parallel.
- E. Random.

WIX1002: Advanced Java Mastery Challenge (Questions 51 – 100)

Difficulty: Master / Competitive Programming

Topics: String Interning, Stream Nesting, Logic Puzzles, Collection Internals, and Pass-by-Value Nuances.

Part 3: Memory, Strings & Streams (Q51 – Q75)

**Q51. String Immutability Trace:**
```java
String s = "A";
s.concat("B");
s.replace('A', 'C');
System.out.print(s);
```

- A. AB
- B. C
- C. A
- D. CB
- E. Error

**Q52. StringBuilder Performance:**
Why is StringBuilder preferred over String concatenation inside a loop that runs 1,000,000 times?

- A. It is thread-safe.
- B. It uses a mutable char array, avoiding $O(N^2)$ object creation.
- C. It is a primitive type.
- D. It can be stored in the String Pool.
- E. It prevents NullPointerException.

**Q53. Serialization and transient:**
When an object is serialized using ObjectOutputStream, what happens to a field marked transient?

- A. It is encrypted.
- B. It is skipped and initialized to its default value (0/null) upon deserialization.
- C. It causes a NotSerializableException.
- D. It becomes static.
- E. It is saved in a separate .txt file.

**Q54. File I/O (Append Mode):**
Which constructor call correctly opens a file for writing without erasing existing content?

- A. new PrintWriter("file.txt")
- B. new FileOutputStream("file.txt", true)
- C. new FileWriter("file.txt", false)
- D. new DataOutputStream("file.txt")
- E. new File("file.txt").append()

**Q55. Scanner Delimiter Behavior:**
```java
Scanner sc = new Scanner("1,2 3");
sc.useDelimiter(",");
System.out.print(sc.next() + "|" + sc.next());
```

- A. 1|2
- B. 1|2 3
- C. 1,2|3
- D. 1|3
- E. NoSuchElementException

**Q56. BufferedReader Logic:**
What is the primary advantage of wrapping a FileReader in a BufferedReader?

- A. It allows reading binary data.
- B. It reduces the number of I/O operations by reading large blocks into memory.
- C. It automatically closes the file.
- D. It enables the writeUTF method.
- E. It makes the code static.

**Q57. Binary Stream Length:**
If you use DataOutputStream.writeUTF("Java"), how many bytes are written to the file?

- A. 4
- B. 6 (2 bytes for length prefix + 4 for data)
- C. 8
- D. 2
- E. 16

**Q58. Random Number Predictability:**
If two Random objects are created using the same seed new Random(100), what is true?

- A. They generate different numbers.
- B. They generate the exact same sequence of values.
- C. The second one throws an error.
- D. They share the same memory address.
- E. The seed is only used for the first number.

**Q59. Floating Point Identity:**
What is the result of Double.NaN == Double.NaN?

- A. true
- B. false
- C. null
- D. 0
- E. Compilation Error

**Q60. String.valueOf vs toString:**
What happens when calling String.valueOf(null)?

- A. NullPointerException
- B. Returns the string "null"
- C. Returns an empty string ""
- D. Compilation Error
- E. Returns a null reference

**Q61. ArrayList Removal Overload:**
```java
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
list.remove(1);
System.out.print(list);
```

- A. [2, 3]
- B. [1, 3]
- C. [1, 2]
- D. IndexOutOfBoundsException
- E. [1, 2, 3]

**Q62. Sorting Algorithm:**
The Arrays.sort() method for an array of primitives (int[]) in modern Java typically uses:

- A. Bubble Sort
- B. Dual-Pivot Quicksort
- C. Merge Sort
- D. Heap Sort
- E. Insertion Sort

**Q63. Integer Caching:**
```java
Integer a = 127; Integer b = 127;
Integer c = 128; Integer d = 128;
System.out.print((a == b) + " " + (c == d));
```

- A. true true
- B. true false
- C. false false
- D. false true
- E. Error

**Q64. PrintWriter Nesting:**
Can PrintWriter be initialized with a FileOutputStream?

- A. Yes.
- B. No, it requires a Writer or a File.
- C. Only if the file is .txt.
- D. Only in a static context.
- E. Only if autoFlush is true.

**Q65. Exception Suppression:**
In try-with-resources, if the try block throws $E_1$ and the auto-close throws $E_2$:

- A. $E_2$ is thrown.
- B. $E_1$ is thrown, and $E_2$ is added to the "suppressed" list.
- C. Both are thrown as a MultiException.
- D. The program crashes.
- E. $E_2$ is ignored entirely.

Part 4: Logic Puzzles & Trap Snippets (Q66 – Q100)

**Q66. Array Covariance Runtime Error:**
```java
Number[] arr = new Integer[5]; arr[0] = 1.5;
```
results in:

- A. Compilation Error
- B. ArrayStoreException
- C. ClassCastException
- D. Truncation to 1
- E. Success

**Q67. 2D Array Memory:**
In Java, an int[3][4] is actually:

- A. A contiguous block of 12 integers.
- B. An array of 3 references to arrays of 4 integers.
- C. A static matrix.
- D. A Vector of Vectors.
- E. Only accessible via pointers.

**Q68. Char Size:**
The char data type in Java is 16-bit because:

- A. It supports ASCII.
- B. It supports Unicode (UTF-16).
- C. It is converted to int anyway.
- D. To match C++.
- E. It is a signed type.

**Q69. File Directory Logic:**
new File("dir1/dir2").mkdir() fails if dir1 does not exist. Which method should be used instead?

- A. mkpath()
- B. mkdirs()
- C. createDirectory()
- D. forceMkdir()
- E. init()

**Q70. String Padding:**
String.format("|%5s|", "Hi") returns:

- A. |Hi   |
- B. |   Hi|
- C. |Hi|
- D. |000Hi|
- E. Error

**Q71. Infinite Loop Syntax:**
Which of the following is a valid infinite loop?

- A. for(;;)
- B. while(1)
- C. do{}while(true);
- D. A and C
- E. All of the above

**Q72. Double Increment Puzzle:**
```java
int x = 10; x = ++x + x++;
```
What is x?

- A. 21
- B. 22
- C. 20
- D. 11
- E. 12

**Q73. Signed Byte Logic:**
```java
byte b = 127; b++;
```
What is the value of b?

- A. 128
- B. -128
- C. 0
- D. 1
- E. -1

**Q74. Ternary Precedence:**
```java
String res = 1 < 2 ? "A" : "B" + "C";
```

- A. "A"
- B. "AC"
- C. "BC"
- D. "ABC"
- E. Error

**Q75. Math.abs Edge Case:**
```java
Math.abs(Integer.MIN_VALUE)
```
returns:

- A. Integer.MAX_VALUE
- B. Integer.MIN_VALUE (Negative)
- C. 0
- D. ArithmeticException
- E. 1

**Q76. Main Method Varargs:**
Is public static void main(String... args) a valid entry point?

- A. Yes.
- B. No, it must be String[].
- C. Only in interfaces.
- D. Only if the class is public.
- E. No, ... is only for int.

**Q77. Catch Block Order:**
```java
try { ... }
catch (Exception e) { ... }
catch (ArithmeticException a) { ... }
```

- A. Valid.
- B. Compilation Error (Unreachable code).
- C. Valid only if finally is used.
- D. Valid for Runtime exceptions only.
- E. Only in Java 17+.

**Q78. Labelled Loop Control:**
```java
outer: for(int i=0; i<3; i++) {
    for(int j=0; j<3; j++) {
        if(i == 1) break outer;
    }
}
```
How many times does the inner loop run in total?

- A. 3
- B. 4
- C. 9
- D. 1
- E. 0

**Q79. String Identity:**
```java
String s1 = ""; String s2 = "";
```
What is s1 == s2?

- A. true
- B. false
- C. Error
- D. null
- E. static

**Q80. Static Constructor:**
Can a class have a static constructor?

- A. Yes.
- B. No, only static initialization blocks.
- C. Only in abstract classes.
- D. Only if private.
- E. Only in Java 8.

**Q81. Effectively Final:**
An anonymous inner class can access a local variable from its parent method only if that variable is:

- A. static
- B. final or effectively final.
- C. public
- D. volatile
- E. transient

**Q82. Interface Method Conflict:**
If Class C implements A and B, both of which have a default void msg(), C must:

- A. Use A's version.
- B. Override msg().
- C. Be declared final.
- D. Not compile.
- E. Use super.msg().

**Q83. Final Array Reference:**
```java
final int[] a = {1, 2}; a = new int[]{3, 4};
```

- A. Success.
- B. Compilation Error.
- C. Runtime Error.
- D. Only if static.
- E. Only in Java 8.

**Q84. Overloading Resolution:**
```java
void calc(int x) and void calc(long x)
```
If you call calc(10), which is executed?

- A. calc(int) (Nearest match).
- B. calc(long).
- C. Ambiguous Error.
- D. Both.
- E. Random.

**Q85. Multi-catch Restriction:**
```java
catch (IOException | FileNotFoundException e)
```
results in:

- A. Success.
- B. Compilation Error (FileNotFound is a subclass of IO).
- C. Success only if rethrown.
- D. Success in Java 7+.
- E. Runtime Error.

**Q86. System.exit Execution:**
```java
try { System.exit(0); } finally { System.out.print("End"); }
```

- A. Prints "End".
- B. Prints nothing.
- C. Compilation Error.
- D. Prints "End" twice.
- E. Depends on JVM version.

**Q87. Bitwise Mystery:**
```java
int x = -1 >>> 31;
```
What is x?

- A. -1
- B. 1
- C. 0
- D. 31
- E. -31

**Q88. Octal Literal Trap:**
```java
int x = 010;
```
What is the value of x?

- A. 10
- B. 8
- C. 16
- D. 0
- E. Error

**Q89. String Construction:**
```java
String s = new String("A") + new String("B");
```
How many String objects are in the Heap (including pool) after this?

- A. 2
- B. 5
- C. 6
- D. 3
- E. 1

**Q90. Autoboxing Equality:**
```java
Boolean b = true; if (b == true) System.out.print("1");
```

- A. 1
- B. No output
- C. Error
- D. null
- E. 0

**Q91. Abstract Method in Interface:**
In Java 8+, can an interface have a private method?

- A. No.
- B. Yes (since Java 9).
- C. Only if it is default.
- D. Only if static.
- E. Only for constants.

**Q92. Instance Initializer:**
{ System.out.print("Init "); } inside a class runs:

- A. Before the static block.
- B. After the super() call in the constructor.
- C. Only once for the class.
- D. Only if static.
- E. Never.

**Q93. Field Hiding access:**
```java
class P { int x = 1; } class C extends P { int x = 2; }
P obj = new C();
```
How to get the value 2 from obj?

- A. obj.x
- B. ((C)obj).x
- C. super.x
- D. obj.getX()
- E. Impossible.

**Q94. Static Hiding:**
```java
class A { static void m() {} } class B extends A { static void m() {} }
A obj = new B(); obj.m();
```
calls:

- A. A's m().
- B. B's m().
- C. Both.
- D. Compilation Error.
- E. Runtime Error.

**Q95. Double Super Constructor:**
Can a constructor have two super() calls?

- A. Yes.
- B. No.
- C. Only if one is this().
- D. Only in abstract classes.
- E. Only in Java 8.

**Q96. Massive File Scanner:**
Using Scanner to read a 50GB file will likely cause:

- A. StackOverflowError
- B. OutOfMemoryError
- C. IOException
- D. Success.
- E. NullPointerException

**Q97. Singleton Pattern:**
A class with a private constructor and a static getInstance() method is a:

- A. Factory
- B. Singleton
- C. Observer
- D. Decorator
- E. Adapter

**Q98. Recursive Base Case:**
```java
int f(int n) { return n * f(n-1); }
```
results in:

- A. Factorial
- B. StackOverflowError
- C. 0
- D. 1
- E. Compilation Error

**Q99. Set for Sorting:**
Which Set implementation maintains a sorted order of elements?

- A. HashSet
- B. LinkedHashSet
- C. TreeSet
- D. ArraySet
- E. HashMap

**Q100. Local Reference Swap:**
```java
void swap(int[] x) { x = new int[]{5, 6}; }
// In main: int[] a = {1, 2}; swap(a); System.out.print(a[0]);
```

- A. 5
- B. 1
- C. 6
- D. 2
- E. Error

# WIX1002: Advanced Java Mastery Challenge - Answer Key (Q1–Q50)

- **Q1. B**  
    Static 1, Static 3, Alpha 2, Beta(4), Beta 5
- **Q2. B**  
    Throws InvalidClassException to ensure data integrity
- **Q3. A**  
    Instance variables are shadowed and bind to the reference type Parent
- **Q4. A**  
    Static methods are hidden, not overridden; bind to reference type A
- **Q5. B**  
    Calculation: 5 + 7 = 12; middle x is 6 after first increment
- **Q6. B**  
    Every method in the recursive chain must declare the exception
- **Q7. B**  
    Floating-point division by zero results in Infinity, not an exception
- **Q8. C**  
    Runtime ArrayStoreException: an Integer array cannot hold a Double
- **Q9. A**  
    The '||' short-circuits, so x++ is never executed; 0 + 10 = 10
- **Q10. A**  
    Final prevents the reference from changing, but the array elements can be modified
- **Q11. B**  
    The try-with-resources statement requires the AutoCloseable interface
- **Q12. B**  
    The finally block return statement overrides the try block return
- **Q13. B**  
    Byte overflow: 127 wraps around to -128
- **Q14. A**  
    intern() returns the string from the pool, matching the literal s1
- **Q15. B**  
    Abstract classes must be extended; final classes cannot be. They are contradictory
- **Q16. A**  
    C must override to resolve the diamond-style default method conflict
- **Q17. C**  
    Unsigned shift '>>>' fills with zeros, resulting in the max positive integer
- **Q18. B**  
    Both must be the first statement in a constructor, making it impossible to call both
- **Q19. B**  
    Java Generics do not support primitive types like 'int'
- **Q20. B**  
    The 'instanceof' operator always returns false for null
- **Q21. E**  
    Both super.x and casting the reference allow access to the hidden field
- **Q22. A**  
    Java supports covariant return types for overridden methods
- **Q23. B**  
    The reference is of type Object, which does not contain the sayHi method
- **Q24. B**  
    By definition, an interface with one abstract method is a Functional Interface
- **Q25. A**  
    A class can override a default method and declare it abstract
- **Q26. B**  
    Private methods are not inherited because they are not visible to subclasses
- **Q27. B**  
    Static blocks run only once when the class is first loaded into memory
- **Q28. B**  
    ClassCastException: A Dog instance cannot be cast to a Cat
- **Q29. B**  
    Interface variables are implicitly public, static, and final
- **Q30. E**  
    Java prevents class diamond problems via single inheritance and interface rules
- **Q31. A**  
    arr.length is the number of rows (3); arr[0].length is the columns (5)
- **Q32. B**  
    An exception thrown in finally masks/suppresses the exception from the try block
- **Q33. A**  
    String literals use the pool; 'new' always creates a separate object in the heap
- **Q34. B**  
    Protected members outside the package must be accessed via inheritance, not a new parent instance
- **Q35. B**  
    No override needed; if there is no conflict, the single default method is used
- **Q36. B**  
    If the parent isn't serializable, its state is lost and its no-arg constructor runs
- **Q37. A**  
    Math.round(-2.5) rounds towards positive infinity to -2
- **Q38. B**  
    Logical XOR: returns true only if the operands are different
- **Q39. B**  
    The default initial capacity of an ArrayList is 10
- **Q40. A**  
    Constructor chaining: X() executes first (1), then X(int) (2)
- **Q41. A**  
    The compiler prioritizes the exact match over the variable argument match
- **Q42. B**  
    hasNext() checks for the next token based on the delimiter
- **Q43. A**  
    Final only prevents overriding in subclasses; same-class overloading is allowed
- **Q44. B**  
    It is legal, though the static field is usually accessed via the class name
- **Q45. B**  
    The clone() method in Object is protected to force classes to override it
- **Q46. B**  
    The 'default' keyword allows interface methods to provide an implementation
- **Q47. A**  
    Substring index is inclusive of start (1) and exclusive of end (3): 'av'
- **Q48. B**  
    String.valueOf(i) is generally preferred over concatenation or manual boxing
- **Q49. A**  
    Autounboxing converts the Boolean object to a primitive for comparison
- **Q50. A**  
    Static blocks run at class loading; instance blocks run during object instantiation

# WIX1002: Advanced Java Mastery Challenge - Answer Key (Q51–Q100)

- **Q51. C**  
    Strings are immutable; concat() and replace() return new objects, and the original string s remains "A"
- **Q52. B**  
    StringBuilder uses a mutable char array, avoiding O(N²) object creation overhead in loops
- **Q53. B**  
    Transient fields are skipped during serialization and initialized to their default values upon deserialization
- **Q54. B**  
    Boolean true as the second argument to FileOutputStream enables append mode
- **Q55. B**  
    The delimiter "," separates "1" from "2 3", resulting in "1|2 3"
- **Q56. B**  
    BufferedReader reduces I/O operations by reading data into a buffer, improving efficiency
- **Q57. B**  
    2 bytes for the length prefix + 4 bytes for "Java" = 6 bytes total
- **Q58. B**  
    Random objects with the same seed generate the exact same deterministic sequence of numbers
- **Q59. B**  
    NaN is defined as never equal to itself per IEEE 754 floating-point standards
- **Q60. B**  
    String.valueOf(null) returns the string literal "null", not a NullPointerException
- **Q61. B**  
    list.remove(1) removes the element at index 1 (the value 2), leaving [1, 3]
- **Q62. B**  
    Arrays.sort() for primitives uses Dual-Pivot Quicksort for optimal performance
- **Q63. B**  
    Integer caching in Java extends from -128 to 127; 127 == 127 is true, but 128 == 128 is false
- **Q64. A**  
    PrintWriter can be initialized with a FileOutputStream; the constructor adapts it as a Writer
- **Q65. B**  
    In try-with-resources, the primary exception from the try block is preserved and secondary exceptions from auto-close are added to the "suppressed" list
- **Q66. B**  
    ArrayStoreException occurs at runtime because an Integer array cannot store a Double value
- **Q67. B**  
    A 2D array in Java is an array of references to 1D arrays, not a contiguous memory block
- **Q68. B**  
    The char type is 16-bit because Java uses Unicode (UTF-16) encoding, not ASCII
- **Q69. B**  
    mkdir() fails if the parent directory doesn't exist; mkdirs() recursively creates all parent directories
- **Q70. B**  
    String.format("|%5s|", "Hi") right-aligns the string within 5 characters: "|   Hi|"
- **Q71. D**  
    Both for(;;) and do{}while(true) are valid infinite loops; while(1) is not because 1 is not a boolean
- **Q72. B**  
    Calculation: ++x increments to 11, then 11 + 11 (x then x++) = 22
- **Q73. B**  
    Byte overflow: 127++ wraps around to -128 due to two's-complement representation
- **Q74. A**  
    Ternary operator: condition "1 < 2" is true, so the result is "A"
- **Q75. B**  
    Math.abs(Integer.MIN_VALUE) overflows and returns Integer.MIN_VALUE itself due to the asymmetry in two's-complement
- **Q76. A**  
    Yes, public static void main(String... args) is a valid main method entry point
- **Q77. B**  
    Compilation Error: ArithmeticException is a subclass of Exception, making it unreachable after the broader catch
- **Q78. B**  
    The inner loop runs 3 times for i=0, then 1 time for i=1 before "break outer" executes = 4 iterations total
- **Q79. A**  
    Both empty string literals "" refer to the same object in the String Pool
- **Q80. B**  
    Java does not have static constructors; instead, static blocks are used for static initialization
- **Q81. B**  
    Local variables accessed by anonymous inner classes must be effectively final or explicitly final
- **Q82. B**  
    Class C must override the default method to resolve the diamond-style conflict between interfaces A and B
- **Q83. B**  
    Compilation Error: a final reference cannot be re-assigned, even to a new array
- **Q84. A**  
    The compiler prioritizes the exact match calc(int) over the widening conversion to calc(long)
- **Q85. B**  
    Compilation Error: FileNotFoundException is a subclass of IOException, making it redundant in the multi-catch
- **Q86. B**  
    System.exit(0) terminates the JVM immediately; the finally block does not execute
- **Q87. B**  
    Unsigned shift: -1 >>> 31 performs a logical shift, resulting in 1
- **Q88. B**  
    Octal literal: 010 is interpreted as octal notation, which equals 8 in decimal
- **Q89. C**  
    Multiple String objects are created: two for literals "A" and "B", plus intermediate concatenation objects = 6 total
- **Q90. A**  
    Prints "1": The Boolean object is unboxed to primitive true, matching the comparison
- **Q91. B**  
    Yes, since Java 9, interfaces can have private methods for sharing code between default methods
- **Q92. B**  
    Instance initializer blocks run after the super() call but before the rest of the constructor body
- **Q93. B**  
    Casting to the child class ((C)obj).x accesses the hidden field in the child class
- **Q94. A**  
    Static methods are hidden, not overridden; the method is bound to the reference type A
- **Q95. B**  
    A constructor can have at most one super() call, and it must be the first statement
- **Q96. B**  
    Scanner internally creates regex Pattern objects for every delimiter operation, causing OutOfMemoryError on large files
- **Q97. B**  
    A class with a private constructor and a static getInstance() method implements the Singleton pattern
- **Q98. B**  
    StackOverflowError: The recursive method f(n) lacks a base case, causing infinite recursion
- **Q99. C**  
    TreeSet maintains a sorted order of elements using an underlying TreeMap structure
- **Q100. B**  
    Prints "1": Reassigning the local parameter x does not affect the original array reference a in main