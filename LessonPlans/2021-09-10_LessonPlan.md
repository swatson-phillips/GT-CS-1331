# 1331 Day 8 - 09/10/21 Lesson Plan

## Announcements:
- [Make sure you are getting your weekly COVID Surveillance Test](https://health.gatech.edu/coronavirus/testing/surveillance)
- Make sure to check the living schedule for updates on topics as we cover material
- You have 1 "get out of jail free card" this semester where the late penalty on a PE or HW can be waived, just fill out the form. This is not an additional extension.

## Topics: I/O (continued), Packages, Math, and Random
### Variable aliasing
-  Strings as objects... let's draw it out
-  == vs .equals

### Packages
- Packages - grouping of classes, sets of related classes
- They are essentially folders where you put your class files.
- 2 ways to import/include a Class/package:
  - Explicit - import specific classes
`import java.util.Random;`
  - Wildcard - imports all classes in the package
`import java.util.*; `

### Input
- [`Scanner`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html): in the `java.util` package so it must be imported
- `System.in`: standard console input
- Tokens
-  Common Scanner methods
   - [`String nextLine()`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html#nextLine())
   - [`int nextInt()`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html#nextInt())
   - [`double nextDouble()`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html#nextDouble())  
   - [`String next()`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html#next()) // next token
   - [`void useDelimeter(String)`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html#useDelimiter(java.lang.String))
- `DelimiterExample.java`
- `ScannerUseDelimiterExample.java`
- If you are really interested in the [Patterns for specifying delimiter here](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- `GasMileage.java`
### Formatted Output
- `printf`: uses a format specifyer string to format string output. The format specifier string is in the following format:

  `% [flags] [width] [.precision] [argsize] typechar`

- Common Conversion characters (Format Specifier Characters)
http://www.c-jump.com/bcc/c157c/Week08/Week08.html#W01_0120_formatting_output_wit
![image](http://www.c-jump.com/bcc/c157c/Week08/const_images/printf_conversions.png)

- [Lots of details and additional format specifiers can be found in the Java API](https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html)
<hr>
Stopped here 9/10/21
<hr>

- Specifying Minimum Width and Precision

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Printf.svg/640px-Printf.svg.png?1631233486532)

https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Printf.svg/640px-Printf.svg.png?1631233486532

- But wait there's more...

![image](https://docs.oracle.com/javase/tutorial/figures/essential/io-spec.gif)

https://docs.oracle.com/javase/tutorial/figures/essential/io-spec.gif

- [Oracle tutorial on format method](https://docs.oracle.com/javase/tutorial/essential/io/formatting.html)
- Left justification:

<img width="974" alt="image" src="https://user-images.githubusercontent.com/49889272/132780801-9f120019-e65c-43b9-a0f4-452cf853b978.png">

### Some useful Classes/Packages
#### `java.util.Random`
- A pseudo random number generator.
- Must import java.util.Random;
- Important to keep in mind what the range of methods in this class are
  - `nextInt();` // all possible int values
  - `nextInt(int bound);` // from 0 to the bound
  - `nextFloat();` // 0.0f (inclusive) to 1.0f (exclusive)
- See examples: `RandomBasics.java` & `RandomEx.java`
#### `java.lang.Math`
- All methods are static (you do not need to create an object to use them)
- trigonometric functions are in radians
- helpful constants: Math.PI and Math.E
- See examples: `BasicMathDemo.java` & `ExponentialDemo.java`
- https://liveexample.pearsoncmg.com/liang/intro12e/html/FormatDemo.html
