package com.kunaaal.DP;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSumNonAdjacent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i, s.nextInt());
        }

        System.out.println(maximumNonAdjacentSum(arr));

    }

    public static int solvrec(ArrayList<Integer> arr, int n) {
        if (n < 0)
            return 0;

        if (n == 0)
            return arr.get(0);

        int include = solvrec(arr, n - 2) + arr.get(n);
        int exclude = solvrec(arr, n - 1);

        return Math.max(include, exclude);

    }

    public static int maximumNonAdjacentSum(ArrayList<Integer> arr) {
        // Write your code here.
        // // Recursive
        // int n = arr.size();
        // int ans = solvrec(arr, n - 1);

        // // Memoization
        int n = arr.size();
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int ans = memo(arr, n - 1, dp);

        return ans;
    }

    public static int memo(ArrayList<Integer> arr, int n, int[] dp) {
        if (n < 0)
            return 0;

        if (n == 0)
            return arr.get(n);

        if (dp[n] != -1)
            return dp[n];

        int include = memo(arr, n - 2, dp) + arr.get(n);
        int exclude = memo(arr, n - 1, dp);

        dp[n] = Math.max(include, exclude);
        return dp[n];
    }
}



