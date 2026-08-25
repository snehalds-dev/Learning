### Output
### System.out.println()
-  Prints the given data and then moves the cursor to the next line
- Working:
  - System: System is a final class present in the java.lang package. It provides access to system-related resources such as input, output, and error streams. 
  - out: out is a public static object of type PrintStream defined inside the System class. It represents the standard output stream, usually the console. 
  - println(): println() is a method of the PrintStream class. It prints the specified value and then adds a new line at the end of the output. It is an enhanced version of print().
  - {{ java.lang.System => out object of type PrintStream, java.io.PrintStream => println() method }}
- Parameter is optional
- Can print a blank line using println().


### System.out.print()
- print() keeps the cursor on the same line
- At least one parameter required
- Cannot print a blank line directly.


### Input
### User Input - Scanner Class
- belongs to the java.util package.
- can read input from keyboard (console), files, strings, and data streams.
- simple syntax and easy to use as compared to older approaches like BufferedReader.
- Steps to use:
  - Import the Scanner class using import java.util.Scanner; 
  - Create a Scanner object. 
    - Scanner sc = new Scanner(System.in); 
    - System.in represents standard input - keyboard.
  - Use Scanner's methods to read the response
    - nextInt() for whole numbers, Int values
    - nextLine() for full text lines 
    - next() for single words
    - nextFloat() for float values
    - nextDouble() for decimal numbers 
    - nextLong() for Long values
    - nextShort() for Short values
    - nextBoolean() for Boolean value. 
    - nextByte() for Byte value.
  - Close the Scanner using sc.close();
- Using nextLine() consistently helps avoid common input issues caused by leftover newline characters.


### BufferedReader 
| Aspects | BufferedReader                                                                | Scanner Class                                                 |
|----------|-------------------------------------------------------------------------------|---------------------------------------------------------------|
|Primary Use | Efficient reading of character streams                                        | Reading formatted input (e.g., integers, strings)             |
|Speed | Faster for large input as it does less parsing.                               | Slower due to parsing overhead (e.g., nextInt(), nextFloat()) |
|Exception Handling	| Throws checked exceptions (e.g., IOException)                                 | No checked exceptions; easier to use                          |
|Flexibility | Allows reading larger input efficiently                                       | Best suited for reading simple data types                     |
|Thread Safety | Synchronized, making it thread-safe                                           | Not thread-safe by default                                    |
|Common Use | Used for reading large input efficiently | Commonly used for smaller, formatted input                    |