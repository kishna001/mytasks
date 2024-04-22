
package variables;

import java.util.Arrays;

public class Fibonacci {
    public static int Fibonacci (int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int[] generateFibonacciSequence(int n) {
        int[] fibonacciArray = new int[n];
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }
        return fibonacciArray;
    }

    public static void main(String[] args) {
        int n = 10; 
        int[] fibonacciSequence = generateFibonacciSequence(n);

        System.out.println("Fibonacci sequence of " + n + " elements:");
        System.out.println(Arrays.toString(fibonacciSequence));

        
        int nthElement = fibonacci(n - 1);
        System.out.println("The " + n + "th element of the Fibonacci sequence is: " + nthElement);
    }
}

