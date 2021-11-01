//Riley Dunn 100760858
//Monday November 1 2021
//Part 1 of this code explores the fibonacci sequence using recursion and iterative techniques
//Part 2 follows a tower of hanoi logic with recursion

public class Lab06 {
    //Part 1
    //make count variable
    public static int count;

    //Recursive Fibonacci
    public static int fibonacciRec(int n){
        if (n == 1 || n == 2){
            count++;
            return 1;
        }else{
            count++;
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }

    //Iterative Fibonacci
    public static int fibonacciIter(int n){
        int lastlastNum = 0;
        int lastNum = 0;
        int currNum = 1;

        if (n == 1 || n == 2){
            count++;
            return 1;
        }else{
            for (int i = 1; i < n; i++){
                lastlastNum = lastNum;
                lastNum = currNum;

                currNum = lastlastNum + lastNum;
                count++;
            }
        }
        return currNum;
    }

    //gets and returns the "count variable
    public static int getCallCount(){
        return count;
    }
    //resets the "count" variable to zero
    public static void resetCallCount(){
        count = 0;
    }

    //Part 2
    /* Towers of Hanoi */
    public static String solveHanoi(int pegOne, int pegThree, int pegTwo, int rings){
        if (rings == 1) {
            return move(pegOne, pegThree);
        }
        return solveHanoi(pegOne, pegTwo, pegThree, rings - 1) + move(pegOne, pegThree) + solveHanoi(pegTwo, pegThree, pegOne, rings - 1);
    }
    //function used for printing the move of a ring
    public static String move(int source, int dest) {
        return "Move top ring from peg " + source + " to peg " + dest + ".\n";
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci:");
        int n = 15;

        //make "count" equal zero, call both the recursive fibonacci and the count function
        resetCallCount();
        int recursiveResult = fibonacciRec(n);
        int recursiveCalls = getCallCount();
        System.out.printf("Recursive result: %d (%d recursive calls)\n", recursiveResult, recursiveCalls);

        //make "count" equal zero, call both the iterative fibonacci and the count function
        resetCallCount();
        int iterativeResult = fibonacciIter(n);
        int iterations = getCallCount();
        System.out.printf("Iterative result: %d (%d iterations)\n", iterativeResult, iterations);

        System.out.println(" ");

        //calls tower of hanoi class and prints solution
        System.out.println("Towers of Hanoi:");
        String solution = solveHanoi(1, 3, 2, 3);
        System.out.print(solution);
    }
}