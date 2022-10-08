package com.kunaaal.recursion;

public class climbStairs {
    public static void main(String[] args) {
//        System.out.println(climbStairs(2));
        int n = 3;
        int [] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(memo(n, dp));
    }

    public static int climbStairs(int n) {
        if (n == 0)
            return 1;
        else if(n < 0)
            return 0;

        int one = climbStairs(n-1);
        int two = climbStairs(n-2);

        return one + two;
    }

    public static int memo(int n, int [] dp){
        if (n == 0)
            return 1;
        else if(n < 0)
            return 0;

        if (dp[n] == -1){
            int one = memo(n-1, dp);
            int two = memo(n-2, dp);

            dp[n] = one + two;
            return dp[n];
        }

        return dp[n];
    }
}
