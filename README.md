# CSCI161-CH01-EXAMPLES
Examples from Data Structures and Algorithms in Java 6th Edition.
# Chapter 1 - Java Primer 
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

