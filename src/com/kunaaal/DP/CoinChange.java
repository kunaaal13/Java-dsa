package com.kunaaal.DP;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int [] coins = {1,2,5};
        int amount = 11;

        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
//        int ans = recursive(coins, amount);
//        if (ans == Integer.MAX_VALUE)
//            return -1;
//        return ans;

//        int []dp = new int[amount + 1];
//        Arrays.fill(dp, -1);
//
//        int ans = memoization(coins, amount, dp);
//        if (ans == Integer.MAX_VALUE)
//            return -1;
//        return ans;

        return tab(coins, amount);
    }

    private static int tab(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= amount ; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]]!= Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }

        if (dp[amount] == Integer.MAX_VALUE)
            return -1;

        return dp[amount];
    }

    private static int memoization(int[] coins, int amount, int[] dp) {
        if (amount == 0)
            return 0;

        if (amount < 0)
            return Integer.MAX_VALUE;

        if (dp[amount] != -1)
            return dp[amount];

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int ans = memoization(coins, amount - coins[i], dp);

            if (ans != Integer.MAX_VALUE){
                mini = Math.min(mini, 1 + ans);
            }
        }

        dp[amount] = mini;

        return dp[amount];
    }

    public static int recursive(int[] coins, int amount){
        if (amount == 0)
            return 0;

        if (amount < 0)
            return Integer.MAX_VALUE;

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int ans = recursive(coins, amount - coins[i]);

            if (ans != Integer.MAX_VALUE){
                mini = Math.min(mini, 1 + ans);
            }
        }

        return mini;
    }

}
