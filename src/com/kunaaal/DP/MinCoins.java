package com.kunaaal.DP;

import java.util.Scanner;

public class MinCoins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();

        System.out.println(minimumElements(arr, x));
    }

    public static int minimumElements(int coins[], int x) {
        // Write your code here..

        // // Recursive
        // int ans = solveRecursive(coins, x);
        // if (ans == Integer.MAX_VALUE) {
        // return -1;
        // }
        // return ans;

        // // Memoization
        // int[] dp = new int[x + 1];
        // for (int i = 0; i < dp.length; i++) {
        // dp[i] = -1;
        // }

        // int ans = memo(coins, x, dp);

        // if(ans == Integer.MAX_VALUE) {
        // return -1;
        // }

        // return ans;

        // // Tabulation

        int ans = tab(coins, x);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static int tab(int[] coins, int x) {
        int[] dp = new int[x + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[x];
    }

    public static int memo(int coins[], int x, int[] dp) {
        // Base case
        if (x == 0)
            return 0;

        if (x < 0)
            return Integer.MAX_VALUE;

        if (dp[x] != -1)
            return dp[x];

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int ans = solveRecursive(coins, x - coins[i]);
            if (ans != Integer.MAX_VALUE)
                mini = Math.min(mini, ans + 1);
        }

        dp[x] = mini;

        return dp[x];
    }

    public static int solveRecursive(int coins[], int x) {
        // Base case
        if (x == 0)
            return 0;

        if (x < 0)
            return Integer.MAX_VALUE;

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int ans = solveRecursive(coins, x - coins[i]);
            if (ans != Integer.MAX_VALUE)
                mini = Math.min(mini, ans + 1);
        }

        return mini;

    }
}
