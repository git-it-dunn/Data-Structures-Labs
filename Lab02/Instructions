# Lab 02 - Java II

_**Note:** Files already exist, and should be modified, for the following classes:
- `src/main/java/Lab02.java`
- `src/main/java/Song.java`_

## Part 1
For this part of the lab, you will write a static function, called `map()`, in the class called `Lab02`, which will take two arguments: an array of `double` values, and an interface containing a single-argument (unary) function. Your `map()` function will iterate over the elements of the list, creating a new list which contains the results of calling that function on every element of the input list. The interface has been defined as follows:

```
public interface UnaryFunction {
    double exec(double argument);
}
```

In order to test your `map()` function, write your own class (`Doubler`) that implements the `UnaryFunction` interface, above, and multiplies its argument by two, using the above interface.  Test your `map()` function also with another function, using lambda notation.

In the `main` method for the `Lab02` class, call your `map` function will the array `{1.0, 2.0, 3.0, 4.0, 5.0}` and
an instance of `Doubler`. The result will be the array: `{2.0, 4.0, 6.0, 8.0, 10.0}`. Print this array after `map()` returns.

## Part 2
For this part of the lab, we’ll write a simple object-oriented program in Java.
We'll create our own class, called `Song`. `Song` will have the following fields:
- `artist` (a string)
- `title` (a string)
- `duration` (an integer, recorded in seconds)
- `collectionName` (a string)

All fields, except for `collectionName`, will be unique for each song. The `collectionName` will have the same value for all songs.

Write a public function `toString()` which will return a string of the form:  `TITLE (ARTIST) - MIN:SEC`.

In addition to these four fields, you will also create a set of get/set methods and a constructor. The
get/set methods must be present for artist, title, and duration. Those fields should also be
private. The collectionName can be public, and should be a single, shared value for all instances of
Song. The constructor will take values for artist, title, and duration as arguments.

Code to test your `Song` class is provided below. Add this code to the end of your `Lab02` class' `main` method.
```
Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
Song one = new Song("Daft Punk", "One More Time", 322);

Song.collectionName = "Randy's Collection";
System.out.println("Collection: " + Song.collectionName);

System.out.println(sed); // this will invoke the toString() function on the Song instance 'sed'
System.out.println(one);
```

## Compiling and Running Your Program
To compile and run your program, use the following command:
`gradle run`

If you want to see if your program passes the tests, i.e. is correct, use the following command:
`gradle test`

## Submission Instructions
Modify the `src/main/java/Lab02.java` and `src/main/java/Song` as described in this document, and any other classes you decide you want to write to complete this lab assignment.  Commit and push your code to this repository.

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
