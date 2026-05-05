# Chapter 1 - Java Primer  
Building data structures and algorithms requires that we communicate detailed instructions to a computer. An excellent way to perform such communication is using a high-level computer language, such as Java. In this chapter, we provide an overview of the Java programming language, and we continue this discussion in the next chapter, focusing on object-oriented design principles. We assume that readers are somewhat familiar with an existing high-level language, although not necessarily Java. This book does not provide a complete description of the Java language (there are numerous language references for that purpose), but it does introduce all aspects of the language that are used in code fragments later in this book.
## The Java Compiler  
Java is a compiled language.  
Programs are compiled into byte-code executable files, which are executed through the Java Virtual Machine (JVM).  
- The JVM reads each instruction and executes that instruction.  

A programmer defines a Java program in advance and saves that program in a text file known as source code.  
For Java, source code is conventionally stored in a file named with the **.java** suffix (e.g., **demo.java**) and the byte-code file is stored in a file named with a **.class** suffix, which is produced by the Java compiler.  
## Components of a Java Program  
![Figure 1.01](Images/Fig1_01.png)  
You can run this program by [clicking here](EX01_01/EX01_01.java) or navigating to the EX01_01 folder.  
  
In Java, executable statements are placed in functions, known as **methods**, that belong to class definitions.  
The static method **main** is th efirst method to be executed when running a Java program.  
Any set of statements between the braces **{** and **}** define a program block.  
## Identifiers  
The name of a class, method or variable in Java is called an **identifier**, which can be any string of characters as long as it begins with a letter and consists of letters.  
  
You cannot use **Reserved Words** as identifiers.  
![Figure 1.02](Images/Fig1_02.png)  
## Comments  
In addition to executable statements and declarations, Java allows a programmer to embed comments, which are annotations provided for human readers that are not processed by the Java compiler.  
Java allows two kind of comments:  Inline comments and block comments.  
You can run a program with comments by [clicking here](EX01_02/EX01_02.java) or navigating to the EX01_02 folder.  
*Note:*  The program doesn't do anything because it ignores all of the comments!  

## Base Types  
Java has several base types (also called **primitive types**), which are basic ways of storing data.  
An identifier variable can be declared to hold any base type and it can later be reassigned to hold another value of the same type.  

This is a list of the base types in Java:  
![Figure 1.03](Images/Fig1_03.png)  

A nice feature of Java is that when base-type variables are declared as instance variables of a class (see next section), Java ensures initial default values if not explicitly initialized.  

In particular, all numeric types are initialized to zero, a boolean is initialized to false, and a character is initialized to the null character by default.  

You can run a program that shows how to declare and initialize base types by [clicking here](EX01_03/EX01_03.java) or navigating to the EX01_03 folder.  
*Note:*  The program doesn't output anything because the variables are only declared and initialized, but not used for anything else!  

## Classes and Objects  
Every **object** is an instance of a **class**, which serves as the type of the object and as a blueprint, defining the data which the object stores and the methods for accessing and modifying that data.  

The critical members of a class in Java are the following:
- **Instance variables**, which are also called **fields**, represent the data associated with an object of a class.  Instance variables must have a type, which an either be a base type (such as int, float or double) or any class type.  
- **Methods** in Java are blocks of code that can be called to perform actions.  Methods can accept parameters as arguments, and their behavior may depend on the object upon which they are invoked and the values of any parameters that are passed.  A method that returns information to the caller without changing any instance variables is know as an **accessor** method, while an **update** or **mutator** method is one that may change one or more instance variables when called.  

This is an example of a class:  
![Figure 1.04](Images/Fig1_04.png)  

You can [click here](EX01_04/Counter.java) to see the code for this class or navigate to the EX01_04 folder.  

This class includes one instance variable, named *count*, which will have a default value of zero, unless we initialize it.  
The class includes to special methods known as constructors, one accessor method, and three update methods.  