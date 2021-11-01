# Lab 06 - Recursion

_**Note:** Files already exist for the following classes:_
- `src/main/java/Lab06.java`

## Overview
In this lab assignment, we will implement two well-known recursive algorithms:  Fibonacci and the Towers of Hanoi.  For Fibonacci, we will compare an iterative and a recursive approach.


## Part 1
In the first part of this lab assignment, you will write two versions of Fibonacci and will compare them.
1.	The recursive version
    - This version has been presented during the lectures
    - Base case:  	n, when n == 0 or n == 1
    - Recursive: 	Fibonacci(n-1) + Fibonacci(n-2)
2.	The iterative version

The iterative version of the algorithm will calculate the nth Fibonacci number by calculating the 0th-nth Fibonacci numbers, in a linear way.  This is similar to the linear recursion version presented in the lectures, but you will use a loop instead of recursion in your solution.

To compare the two algorithms, write code similar to the previous lab to count the number of recursive calls in the recursive version, and count the number of iterations in the loop of the iterative version.  Use a static variable, e.g. `callCount`, to store the number of recursive calls (or iterations), and create a `static` function (`resetCallCount`) to reset this to zero before the initial call.

Below, you will find some test code:

```
public static void main(String[] args) {
    System.out.println("Fibonacci:");
    int n = 15;

    resetCallCount();
    int recursiveResult = fibonacciRec(n);
    int recursiveCalls = getCallCount();
    System.out.printf("Recursive result: %d (%d recursive calls)\n", recursiveResult, recursiveCalls);

    resetCallCount();
    int iterativeResult = fibonacciIter(n);
    int iterations = getCallCount();
    System.out.printf("Iterative result: %d (%d iterations)\n", iterativeResult, iterations);
}
```

Run the driver code multiple times, with different values for n, and summarize the results.

## Part 2
In the second part of this lab assignment, you will solve the Towers of Hanoi problem by implementing a function called `solveHanoi`.  This function will take four arguments (`start`, `end`, `temp`, `numRings`), which are the indices of the pegs to be used as the starting point, ending point, temporary ring storage, and the number of rings to be moved.  The function will return a `String`, which will contain one line of output for each ring to be moved.

The Towers of Hanoi is a classic problem.  The rules of the game are simple. You can move only one ring at a time, from any peg to any other peg, except that never can a larger ring be placed on top of a smaller ring. The rings are initially stacked up on the first peg (peg 1) (from smallest at the top, to largest at the bottom), and the goal is to move all the rings from peg 1 to peg 3.

To move N rings from peg 1 to peg 2 (using peg 3 as a temporary holder), you:

1. Move N-1 rings from peg 1 to peg 3
2. Move 1 ring from peg 1 to peg 2
3. Move N-1 rings from peg 3 to peg 2

To complete this algorithm, use the following function which simulates (sort of) moving a single ring from one peg to another, directly:

```
public static String move1(int source, int dest) {
    return "Move top ring from peg " + source + " to peg " + dest + ".\n";
}
```

Below, you will find the test code found in `Lab06.java`:

```
public static void main(String[] args) {
    String solution = solveHanoi(1, 3, 2, 4);
    System.out.print(solution);
}
```

## Compiling and Running Your Program
To compile and run your program, use the following command:
`gradle run`

If you want to see if your program passes the tests, i.e. is correct, use the following command:
`gradle test`

## Submission Instructions
Modify the Java classes as described in this document, and add any additional classes you decide you want to write to complete this lab assignment.  Commit and push your code to this repository.

Every lab assignment is due by the start of the following lab period, giving you an extra week to work on it.  Do not expect to continue to work on it during this next lab period, as the lab instructor will not permit that, since it would lead to you missing potential instructions/help for the next lab.

This repository will be marked by the lab instructor at their convenience, but any changes made to this repository after the due date (described above) will not be considered.  Labs not submitted on time, with the exception of documented absences/illnesses or SAS accommodations, will not be accepted.

**Note:**  Each lab is due by the _beginning_ of your next lab period.

## Getting Help
If you run into difficulty, you may wish to check out some of the following resources:
- https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html - A series of tutorials for the Java programming language, focusing almost entirely on the features of Java
- https://docs.oracle.com/en/java/javase/14/ - The standard documentation for Java classes, including methods that you can use, some of which will be discussed later in this course
- http://stackoverflow.com/ - A forum for asking questions about programming. Chances are, someone else has asked the same question as you have, and some knowledgeable person has already answered it.  This might be a good time to use the ‘site:’ feature in Google!

Of course, you can always ask the lab instructor for help! However, learning how to find the answers out for yourself is a skill that will pay off in the future, as solving your own problem is immediate (and satisfying)!

## Academic Integrity
Discussing strategies with your fellow students is acceptable, but once it is time to write the code you should do so on your own.  The instructor has learning goals planned for this course which are cumulative.  If you fail to learn some elements in this lab assignment, it most likely will affect your performance on higher-stakes assessments in the future.  You can also ask the lab instructor for help, but they won't directly solve your problems for you, but will rather point you in the right direction to find the solution yourself.
