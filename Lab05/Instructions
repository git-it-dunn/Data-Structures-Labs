# Lab 05 - Data Structure Comparison

_**Note:** Files already exist for the following classes:_
- `src/main/java/Warrior.java`
- `src/main/java/Lab05.java`
- `src/main/java/LinkedList.java`
- `src/main/java/SortedDoublyLinkedList.java`

## Overview
In this lab assignment, we will compare our sorted doubly-linked list class, from lab 04, and develop an
array-based alternative. These two implementations will then be compared for performance.

## Instructions
In the previous lab assignment, you were tasked with writing a sorted doubly-linked list class to store a
number of Warrior instances, keeping them sorted by the speed stat (highest to lowest). Implement the
same behaviour in a class, called SortedArray, and add operating counting to both classes. Operation
counting should focus only on assignment operations, and in both cases merely updating a public instance
variable will be sufficient.

To count the number of assignment statements, create an instance variable `assignmentCount`, initially `0`, and increment this before every assignment statement inside your data structure's code.

_**Note:** You can initialize your array to have 100 elements, just for simplicity.  It is not required that you handle more than 100 elements._

_**Note:** The behaviour of the `SortedArray` class, aside from performance, should be identical to the `SortedDoublyLinkedList` class._

The driver code that follows, which is included in this repository already, can be used to compare your two implementations:
```
import java.util.Random;

public class Lab05 {
    public static void main(String[] args) {
        SortedDoublyLinkedList list = new SortedDoublyLinkedList();
        SortedArray array = new SortedArray();

        // insert 100 elements into both lists (randomly generated)
        for (int i = 0; i < 100; i++) {
            Warrior newWarrior = new Warrior("Generic",
            genStat(50),
            genStat(50),
            genStat(200));
            list.insert(newWarrior);
            array.insert(newWarrior);
        }

        // compare the number of assignment operations:
        System.out.println("Linked List assignmentCount: " + list.assignmentCount);
        System.out.println("Sorted Array assignmentCount: " + array.assignmentCount);
    }

    public static int genStat(int max) {
        // randomly choose an integer between 1 and max
        Random rand = new Random();
        return rand.nextInt(max) + 1;
    }
}
```

Run the driver code multiple times, and summarize the results. Try to come up with an explanation for
why the test produced the values that it did.  What would happen if the warriors were added to the linked list and array in increasing order?  What about decreasing order?

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
