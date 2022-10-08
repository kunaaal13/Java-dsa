package com.kunaaal.SlidingWindow;

public class MaxSumSubarr {
    public static void main(String[] args) {
        int [] arr = {2,5,1,8,2,9,1};
        int k = 3;
        int ans = maxSum(arr, k);
        System.out.println(ans);
    }

    private static int maxSum(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while(j < arr.length){
            sum = sum + arr[j];

            if (j - i + 1 < k)
                j++;
            else if(j - i + 1 == k){
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }


        return max;

    }
}
