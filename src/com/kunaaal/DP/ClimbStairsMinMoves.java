package com.kunaaal.DP;

import java.util.Scanner;

public class ClimbStairsMinMoves {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(tabulation(n, arr));

    }

    private static int tabulation(int n, int[] arr) {
        Integer [] dp = new Integer[n + 1];
        dp[n] = 0;

        for (int i = n-1; i >=0 ; i--) {
            int min = Integer.MAX_VALUE;
            if (arr[i] > 0){
                for (int j = 1; j <= arr[i] && i + j<dp.length; j++){
                    if (dp[i + j] != null)
                        min = Math.min(min, dp[i + j]);
                }

                if (min != Integer.MAX_VALUE){
                    dp[i] = min + 1;
                }

            }
        }

        return dp[0];
    }
}
