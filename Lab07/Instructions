# Lab 07 - Linear Sorting

_**Note:** Files already exist for the following classes:_
- `src/main/java/Lab07.java`
- `src/main/java/Buckets.java`
- `src/main/java/BinaryRadixSorter.java`

## Overview
In this lab assignment, we will implement a common linear sorting method:  Radix sort.  This is one of the few techniques for sorting numbers which operate in linear time.

## Instructions
To make things simple, we will use only binary numbers.  To make them even simpler, we will represent our binary numbers in string form, which will make it easier to collect individual digits at an arbitrary index d (`number.charAt(d)`).

Provided is a class to assist in implementing a binary bucket sort.  This class has two buckets:  one for the binary digit 0, and one for the binary digit 1.  the `getAllInOrder()` method returns the values in the 1 bucket (the higher values), followed by the values in the 0 bucket (the lower values).  This will facilitate sorting in ascending order.

```
import java.util.*;

public class Buckets {
    private List<String> zeroBucket;
    private List<String> oneBucket;

    public Buckets() {
        zeroBucket = new ArrayList<>();
        oneBucket = new ArrayList<>();
    }

    public void addZero(String newValue) {
        zeroBucket.add(newValue);
    }

    public void addOne(String newValue) {
        oneBucket.add(newValue);
    }

    public List<String> getAllInOrder() {
        List<String> result = new ArrayList<>();

        for (String val : zeroBucket) {
            result.add(val);
        }

        for (String val : oneBucket) {
            result.add(val);
        }

        return result;
    }
}
```

Write the code to perform the radix sort in a function called `sort` in the `BinaryRadixSorter` class.  This function will take `numDigits` (`int`, how many digits to be sorted) and `numbers` (`List<int>`, the list of numbers to be sorted), and will return the fully sorted list of numbers.  The `sort` function will iterate over the digit positions (e.g. for a number with 4 digits, it will repeat once for each of those 4 digits), and will call another function `sortDigit`, which will perform one iteration of the sort.  

The `sortDigit` function will take `digitIndex` (`int`, the index of the digit to be used for sorting) and `numbers` (`List<String>`, the list of 'numbers' to be sorted), and will return a list of Strings (containing binary numbers) which have been sorted using one iteration of radix sort, using the `digitIndex` given.

_**Hint:** If you keep the number as a string, you can use the `.charAt()` function to get individual digits more easily than if it is in numeric form._

Write a static function (`toString`) in the `BinaryRadixSorter` class to convert the sorted list of numbers to a string, to be printed after each (digit-based) iteration.  This will make it easier to debug your program.

Below is some code, included in `Lab07`, which will let you test your radix sort behaviour:
```
public static void main(String[] args) {
    int numDigits = 4;
    String[] origNumbers = { "0011", "1001", "1000", "0111", "0101" };
    ArrayList<String> numbers = new ArrayList<String>(Arrays.asList(origNumbers));

    System.out.println("Before sorting:");
    System.out.println(BinaryRadixSorter.toString(numbers));

    numbers = BinaryRadixSorter.sort(numDigits, numbers);

    System.out.println("After sorting:");
    System.out.println(BinaryRadixSorter.toString(numbers));
}
```

The program should produce output similar to the following, which includes the list before any changes, and one-line print of the list after each iteration.  The last line is the final sorted (in ascending order) list:

```
[ 0011 1001 1000 0111 0101 ]
[ 1000 0011 1001 0111 0101 ]
[ 1000 1001 0101 0011 0111 ]
[ 1000 1001 0011 0101 0111 ]
[ 0011 0101 0111 1000 1001 ]
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
