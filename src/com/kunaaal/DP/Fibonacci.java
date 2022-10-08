package com.kunaaal.DP;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        System.out.println(fib(n));

        int[] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

//        System.out.println(memoization(n, dp));

        System.out.println(tabulation(n));
    }

    // Basic recursion
    public static int fib(int n){
        if (n == 0 || n == 1)
            return n;

        return fib(n-1) + fib(n-2);
    }

    // memoization
    public static int memoization(int n, int[] dp){
        if (n == 0 || n == 1)
            return n;

        // check if already calculated
        if (dp[n] != -1){
            return dp[n];
        }

        dp[n] = memoization(n-1, dp) + memoization(n-2, dp);
        return dp[n];
    }

    // Tabulation
    public static int tabulation(int n){
        int [] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
