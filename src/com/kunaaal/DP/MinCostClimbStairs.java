package com.kunaaal.DP;

import java.util.ArrayList;
import java.util.Scanner;

public class MinCostClimbStairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
//        int ans = Math.min(solveRec(cost, n-1), solveRec(cost, n-2));
//        return ans;

//        int [] dp = new int[n + 1];
//        for (int i = 0; i < dp.length; i++) {
//            dp[i] = -1;
//        }
//
//        int ans = Math.min(solveMem(cost, n-1, dp), solveMem(cost, n-2, dp));
//        return ans;

        return solveTab(cost, n);


    }

    private static int solveTab(int[] cost, int n){
        int [] dp = new int[n + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++){
            dp[n] = cost[n] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-1], dp[n-2]);
    }

    private static int solveMem(int[] cost, int n, int[] dp) {
        if (n == 0)
            return cost[0];
        if (n == 1)
            return cost[1];

        if (dp[n] != -1)
            return dp[n];
        dp[n] = cost[n] + Math.min(solveRec(cost, n-1), solveRec(cost, n-2));
        return dp[n];
    }

    private static int solveRec(int[] cost, int n) {
        if (n == 0)
            return cost[0];
        if (n == 1)
            return cost[1];

        int ans = cost[n] + Math.min(solveRec(cost, n-1), solveRec(cost, n-2));
        return ans;
    }


}
