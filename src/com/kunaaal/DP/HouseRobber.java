package com.kunaaal.DP;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
//        return recursion(nums, nums.length-1);

//        int dp[] = new int[nums.length];
//        Arrays.fill(dp, -1);
//
//        return memo(nums, dp, nums.length-1);

        return tabulation(nums);
    }

    private static int memo(int[] nums, int[] dp, int i) {
        if (i == 0)
            return nums[0];

        if (i < 0)
            return 0;

        // step 1
        if (dp[i] != -1)
            return dp[i];

        int include = memo(nums, dp, i-2) + nums[i];
        int exclude = memo(nums, dp, i-1);

        // step2
        dp[i] =  Math.max(include, exclude);

        // step 3
        return dp[i];
    }

    public static int recursion(int[] nums, int i) {
        if (i == 0)
            return nums[0];

        if (i < 0)
            return 0;

        int include = recursion(nums, i - 2) + nums[i];
        int exclude = recursion(nums, i - 1);

        return Math.max(include, exclude);
    }

    public static int tabulation(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 0);

        dp[0] = nums[0];

        for (int j = 1; j < nums.length; j++) {
            int include = dp[j-2] + nums[j];
            int exclude = dp[j-1];

            dp[j] = Math.max(include, exclude);
        }

        return dp[nums.length-1];
    }






}
