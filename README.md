# Quadratic Equation Solver

## Description

This is a Java program that solves quadratic equations. It can be used in both interactive and non-interactive modes.
In the interactive mode, the program prompts the user to enter the coefficients of a quadratic equation and displays the resulting equation along with its roots.
In the non-interactive mode, the program takes the coefficients as command line arguments and displays the roots.

## Installation

+ Install the **Java Development Kit (JDK)**: You can download the JDK from the official Java [website](https://www.java.com/en/).
+ Add the JDK to the **environment variable**: To run Java programs from the command line, you need to add the path to the JDK to the environment variable. 
Open the command prompt and enter the following command:
```
set PATH "%PATH%;<your path>" 
```
+ Clone **repo** on your computer.
```cmd
git clone https://github.com/hrystynaa/mtsd_lab1.git
```
+ **Compile the code:** Open the command prompt and navigate to the directory
  with the ***QuadraticEquationSolver.java*** file.
  Enter the following command to compile the code:
```
cd ./mtsd_lab1/src
javac QuadraticEquationSolver.java
```
+ **Run the program:** After successful compilation, you can run the program by entering the following command in the command prompt:
```
java QuadraticEquationSolver // program will start in interactive mode
java QuadraticEquationSolver <file path> // program will start in non-interactive mode
```
### File format
In non-interactive mode, the program accepts one argument - the path to a file 
with equation coefficients. The file contains 3 numbers: a, b, c separated by 
a single space. The decimal symbol expected is a dot. After the last coefficient (c),
there should be a new line character (\n), and the file ends there. You can see example file [here](./src/test.txt)


> [Revert Commit](https://github.com/hrystynaa/mtsd_lab1/commit/8e452c6ba11954a4a763b125638f33a730032cda)