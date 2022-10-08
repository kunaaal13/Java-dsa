package com.kunaaal.DP;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseRobberTwo {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != n-1)
                first.add(nums[i]);

            if (i != 0)
                second.add(nums[i]);
        }

        int [] dp = new int[first.size()];
        int [] dpt = new int[second.size()];

        int nt = first.size()-1;
        int ntt = second.size()-1;

        return (int) Math.max(memo(first, dp, nt), memo(second, dpt,ntt ));
    }

    private static double memo(ArrayList<Integer> nums,int[] dp, int i ) {
        if (i == 0)
            return nums.get(0);

        if (i < 0)
            return 0;

        // step 1
        if (dp[i] != -1)
            return dp[i];

        int include = (int)memo(nums, dp, i-2) + nums.get(i);
        int exclude = (int) memo(nums, dp, i-1);

        // step2
        dp[i] =  Math.max(include, exclude);

        // step 3
        return dp[i];
    }


}
