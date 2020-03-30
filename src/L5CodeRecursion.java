/*
File : L5CodeRecursion.java - Recursion implementation Code for NotesL6.java for CS 113 Lewis Lecture 6
Author : Lauren Ruff
Date : 03.30.2020
 */

public class L5CodeRecursion {

    //region Recursive and Iterative formulas : Factorial
    public int recursiveFactorial(int n){
        //the base case : if n = 0, 0! = 1, so return 1
        if(n == 0){
            return 1;
        }
        //if n < 0, throw an exception.
        //if this case is not added, the program will not terminate if a negative number is passed to this method
        else if(n < 0){
            throw new IllegalArgumentException();
        }
        // the recursive case
        else{
            return n * recursiveFactorial(n-1);
        }
    }

    public int iterativeFactorial(int n){
        int total = 0;
        if(n == 0){
            return 1;
        }

        else if(n < 0){
            throw new IllegalArgumentException();
        }

        else{
            total = n;
            for(int i = n-1; i > 0; i--){
                total *= i;
            }
        }
        return total;
    }
    //endregion Recursive and Iterative formulas : Factorial

    //region Recursive and Iterative formulas : Powers
    public int recursivePower(int base, int exp){
        if( exp == 0){
            return 1;
        }
        else if(exp < 0){
            throw new IllegalArgumentException();
        }
        else{
            return base * recursivePower(base, exp-1);
        }
    }

    public int iterativePower(int base, int exp){
        int total = base;
        if( exp == 0){
            return 1;
        }
        else if(exp < 0){
            throw new IllegalArgumentException();
        }
        else{
            for(int i = exp-1; i > 0; i--){
                total *= base;
            }
        }
        return total;
    }


    //endregion //region Recursive and Iterative formulas : Powers

    //region Recursive and Iterative formulas : Greatest Common Divisors (GCD)
    public int recursiveGCD(int v1, int v2){

        //if either of the inputs is less than zero, throw an exception
        if(v1 < 0 || v2 < 0){
            throw new IllegalArgumentException();
        }

        //if the smaller number divides the larger number, return the smaller number
        else if(v1 % v2 == 0){
            return v2;
        }
        //if the fist input is less than the second input, switch them
        else if(v1 < v2){
            recursiveGCD(v2, v1);
        }

        //recursive statement
        return recursiveGCD(v2, v1%v2);

    }

    public int iterativeGCD(int v1, int v2){
        //if either of the inputs is less than zero, throw an exception
        if(v1 < 0 || v2 < 0){
            throw new IllegalArgumentException();
        }

        //if the fist input is less than the second input, switch them
        else if(v1 < v2){
            int temp = v1;
            v1 = v2;
            v2 = temp;
        }

        //if the smaller number divides the larger number, return the smaller number
        if(v1 % v2 == 0){
            return v2;
        }

        while(v1 % v2 != 0){
            int temp = v1%v2;
            v1 = v2;
            v2 = temp;
            if(temp == 0){
                return v2;
            }
        }

        return v2;
    }
    //endregion //region Recursive and Iterative formulas : Greatest Common Divisors (GCD)

    //region Recursive and Iterative Formulas : Fibonacci Numbers

    //wrapper method so start the method execution
    //this is an example of tail recursion (AKA last line recursion) : when the recursive call is the last line of a method
        //arguments and local variables do not need to be saved in the activation frame
    //efficiency is O(n)
    public int recursiveFibStart(int n){
        return recursiveFib(1, 0, n);
    }
    public int iterativeFibStart(int n){
        return iterativeFib(1, 0, n);
    }

    public static int recursiveFib(int cur, int prev, int n){
        if(n == 1){
            return cur;
        }
        else{
            return recursiveFib(cur+prev, cur, n-1);
        }
    }

    public int iterativeFib(int cur, int prev, int n){
        if(n == 1){
            return cur;
        }
        else{
            while(n != 1){
                int temp = cur;
                cur += prev;
                prev = temp;
                n--;
            }
            return cur;
        }
    }
    //endregion Recursive and Iterative Formulas : Fibonacci Numbers
}
