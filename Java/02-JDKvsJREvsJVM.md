### JDK
- Java Development Kit
- Used to build Java applications. It contains the JRE and a set of development tools. 
- Required by developers to write, compile, and debug code.
- Components of JDK:
  - JRE (JVM + libraries)
  - Development tools (compiler- javac,, debugger,, Utilities - jar, javadoc)
- JDK is platform-dependent (different version for windows, Linux, macOS)
- Working:
  - Source Code (.java): Developer writes a Java program. 
  - Compilation: The JDK’s compiler (javac) converts the code into bytecode stored in .class files.
### JRE
- Java Runtime Environment
- provides an environment to run Java programs. It is intended for end-users who only need to execute applications.
- Does not support compilation or debugging.
- Components of JRE:
  - JVM
  - Libraries(rt.jar) + other components needed to run application
- It is platform-dependent (different builds for different OS).
- Working:
  - Class Loading: Loads compiled .class files into memory.
  - Bytecode Verification: Ensures security and validity of bytecode.
  - Execution: Uses the JVM (interpreter + JIT compiler) to execute instructions and make system calls

### JVM
- Java Virtual Machine
- The core execution engine of Java. Responsible for converting bytecode into machine-specific instructions.
- Performs memory management and garbage collection.
- Provides portability by executing the same bytecode on different platforms.
- JVM implementations are platform-dependent. Bytecode is platform-independent and can run on any JVM.
- Modern JVMs rely heavily on Just-In-Time (JIT) compilation for performance.
- Components of JVM:
  - Class Loader, JIT Compiler, Garbage collector
- Working:
  - Loading: Class loader loads bytecode into memory. 
  - Linking: Performs verification, preparation, and resolution. 
  - Initialization: Executes class constructors and static initializers. 
  - Execution: Interprets or compiles bytecode into native code.