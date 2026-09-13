### To Check if java is installed on your machine
1. java -version

### To Run Java Programs in Terminal
1. javac Filename.java
2. java Filename

### IDE's
IntelliJ IDEA, Netbeans, Eclipse 

#### basics
- Earlier as Oak Project(1991), Developed by Sun Microsystem in 1995, Oracle acquired SunMS in 2010
- Famous Applications built using Java - LinkedIn, Uber, Amazon, Spotify, MineCraft [Java Edition], NASA WorldWind
- Every line of code that runs in Java must be inside a class. And the class name should always start with an uppercase first letter.  
- Java is case-sensitive: "MyClass" and "myclass" has different meaning.  
- Each code statement must end with a semicolon (;)  
- Text inside println() must be wrapped inside double quotations marks "".  
- print() method is also similar to println(). But it does not insert a new line at the end of the output.

#### Features of Java
- Object-Oriented Programming (OOP) - supports modular and reusable code using classes and objects.
- Platform Independence(WORA) - allows Java programs to run on any OS with a JVM.
- Robust and Secure - No pointers, Also provides strong memory management, exception handling, and built-in security features.
- Multithreading and Concurrency - enables multiple tasks to execute simultaneously for better performance.
- Rich API and Standard Libraries - offer extensive built-in libraries for common programming tasks.
- Frameworks for Enterprise and Web Development - support building enterprise applications, web applications, and REST APIs.
- Maintainability and Scalability - makes Java applications easy to maintain, enhance, and scale as requirements grow.

#### How to run the Java code?
- Write code in a file like HelloWorld.java.
- Java Compiler "javac" compiles it into bytecode "HelloWorld.class".
- JVM (Java Virtual Machine) reads the .class file and interprets the bytecode.
- The JVM initially interprets bytecode and uses JIT (Just-In-Time) compilation to convert frequently executed code into native machine code for better performance.

#### Naming Conventions
- Classes, Interfaces: Pascal Case(Starts with Capital letter) eg. HelloWorld
- Methods, Variables: CamelCase eg. printMessage(), totalMarks
  - Variable names should not start with underscore _ or dollar sign $ characters, even though both are allowed.
- Constant variables: All CAPS with underscores eg. PI, MIN_VALUE
- Package:Lowercase eg. org, com, edu, import java.util.* (util)

#### Comments:  Non-executable statements that explain code and improve readability
- Single line comment: used to comment on one line of code
  - Eg. // Single line comment here
- Multi-Line Comments: used to describe complex code or methods
  -  /* Comment line 1 
  - Comment line 2 
  - Comment line 3 
  - */
- Documentation Comments: used to generate external documentation using Javadoc. They are generally used in professional projects to describe classes, methods, and parameters.
  -  /**
  - *Finds average of three integers.
  - *@param numA First parameter
  - *@param numB Second parameter
  - *@param numC Third parameter
  - *@return Average of numA, numB, and numC
    */