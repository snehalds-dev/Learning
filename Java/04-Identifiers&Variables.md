### Identifiers
- An identifier is a name given to the elements like variables, classes, methods, packages, and interfaces.
- Uniquely Identifies the elements
- Rules for Naming Identifiers:
  - The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), '$'(dollar sign) and '_' (underscore)
  - Should not start with Digits[0-9]
  - They are case-sensitive
  - No limit on length of identifier, but keep it short and meaningful.
  - Reserved words can't be used as identifiers.
- Eg: myVar, _myVar, $myVar, sum_of_array, sne123


### KeyWords
- Keywords are reserved words with predefined meanings used by the compiler to perform specific operations. 
- They are part of the language syntax and cannot be modified. 
- They cannot be used as identifiers.
- Total Reserved words in Java21 : 55
  - Keywords: 52 (Used: 50 + Unused: 2)
  - Literals: 3
- Reserved Literal: true, false, null
- Unused Keywords: const, goto
- Used Keywords:

| Category                        | Keywords                                                                                                                  | Total |
|---------------------------------|---------------------------------------------------------------------------------------------------------------------------|----|
| Data Type                       | int, short, long, float, double, char, byte, boolean, void                                                                | 9  |
| Control Flow                    | if, else, switch, case, default, for, while, do, break, continue, return                                                  | 11 |
| Exception Handling              | try, catch, finally, throw, throws, assert                                                                                | 6  |
| Object Oriented                 | class, interface, extends, implements,new, this, super,abstract, final, static, sealed, permits, enum, record, instanceof | 15 |
| Access Control                  | public, private, protected                                                                                                | 3  |
| Package, Import                 | package, import                                                                                                           | 2  |
| Multithreading, Synchronisation | synchronized, volatile                                                                                                    | 2  |
| Memory Mgmt, Obj Serialization  | transient, native                                                                                                         | 2  |
| Modifier & Utility              | strictfp, yield, var                                                                                                      | 3  |


### Variables
- Variables are containers used to store data in memory
- It has three components:
  - Data Type: the kind of data stored. Eg. int, String, float 
  - Variable Name: A unique identifier for variable. 
  - Value: The actual data assigned to the variable.
  - Eg:  int age = 25;
- Only Declaration: 
  - Type Name;  (int age;)
- Initialization:
  - Type Name = Value; (int rollNumber = 15;)
- Rules for Naming:
  - Must start with [A-Z or a-z or $ or _ ]
  - Can only have  [A-Z or a-z or 0-9 or $ or _ ]
  - Spaces not allowed.
  - Case sensitive.
  - Keywords can't be used as variable names
  - Follow CamelCase. Eg. totalMarks, rollNumber.


### Types of Variables
#### Local Variables
  - It is defined within a block, method, or constructor
  - It is created at time of declaration and destroyed when function ends.
  - Scope: Within the block in which they are declared.
  - No default value. Must be initialized before use.


#### Instance Variables
  - They are non-static variables and are declared in a class outside of any method, constructor, or block. 
  - Scope: They are created when an object is instantiated and destroyed when the object is destroyed.
  - Stored in HEAP memory.
  - They can have access specifiers. 'default' access is used if not specified.
  - Accessed only via Objects of the class. Eg. Student s1; s1.firstName;
  - Default value is based on data type.
  - Can be Initialised using constructors or Instance Blocks.


  - Instance Blocks / Initialization Blocks:
    - Nameless block of code, Declared inside a class but outside all methods 
    - Executed for every object creation, before the constructor 
    - Common logic shared across all constructors 
    - Cannot accept parameters
    - Advantages 
      - Avoids code duplication across multiple constructors 
      - Ensures common initialization logic runs for every object 
      - Useful when multiple constructors require the same setup logic 
    - Limitations 
      - Cannot accept parameters 
      - Not suitable for object-specific initialization 
      - All objects are initialized with the same logic and values


  - Static Blocks:
    - executes only once when the class is loaded.
    - A class can have any number of static blocks, and they can appear anywhere in the class body. 
    - The runtime system guarantees that static blocks are called in the order that they appear in the source code.

#### Note: The sequence of execution of instance blocks follows the order- Static block, Instance block, and Constructor.
#### Static Variables 
  - It declared with the static keyword inside a class but outside any method.
  - There is only one copy of a static variable for the entire class, and all objects share it 
  - It is accessed using the class name. Eg. Student.collegeName;
  - Default value is based on data type.
  - Scope: They are created at program start and destroyed when the program ends. 
  - Can be initialized using static blocks.

#### Scope of Variables
- Curly braces { } define the scope of variables. 
- A variable can be accessed only within the block where it is declared.
- Local variables exist only inside methods. 
- Instance variables can be accessed by all methods of the class. 
- Static variables are shared among all objects of the class. 
- Block variables are accessible only inside that block. 
- Loop variables cannot be accessed outside the loop. 
- this keyword is used to access class variables when names are same.
