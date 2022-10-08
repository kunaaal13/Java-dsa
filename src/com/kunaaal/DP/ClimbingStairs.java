package com.kunaaal.DP;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countPaths(n));

        int [] dp = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            dp[i] = -1;
        }
        System.out.println(memoization(n, dp));

        System.out.println(tabulation(n));
    }

    // Recursion
    public static int countPaths(int n){
        if (n == 0)
            return 1;
        else if (n < 0) {
            return 0;
        }

        int path1 = countPaths(n-1);
        int path2 = countPaths(n-2);
        int path3 = countPaths(n-3);

        return path1 + path2 + path3;
    }

    // Memoization
    public static int memoization(int n, int [] dp){
        if (n == 0)
            return 1;
        else if (n < 0) {
            return 0;
        }

        if (dp[n] != -1)
            return dp[n];

        int path1 = countPaths(n-1);
        int path2 = countPaths(n-2);
        int path3 = countPaths(n-3);

        dp[n] = path1 + path2 + path3;

        return dp[n];
    }

    // Tabulation
    public static int tabulation(int n){
        int [] dp = new int[n+1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1)
                dp[i] = dp[i-1];
            else if (i == 2)
                dp[i] = dp[i-1] + dp[i-2];
            else
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
}
