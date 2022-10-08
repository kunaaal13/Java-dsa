package com.kunaaal.DP;

import java.util.Arrays;
import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    public static int tribonacci(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return memo(n, dp);
    }

    public static int memo(int n, int[] dp) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        // check if already calculated
        if (dp[n] != -1){
            return dp[n];
        }

        dp[n] = memo(n-1, dp) + memo(n-2, dp) + memo(n-3, dp);
        return dp[n];
    }
}
