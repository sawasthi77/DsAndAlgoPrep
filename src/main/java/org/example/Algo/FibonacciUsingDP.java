package org.example.Algo;

public class FibonacciUsingDP {

    private static int fibonacciSeriesElement(int n) {
        Integer[] memo = new Integer[100];

        if (memo[n] != null) {
            return memo[n];
        }
        if (n == 0 || n == 1) {
            return n;
        }
        memo[n] = fibonacciSeriesElement(n - 1) + fibonacciSeriesElement(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Element " + fibonacciSeriesElement(40));
    }
}
