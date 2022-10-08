package com.kunaaal.Arrays;

import java.util.*;

public class kadane_algo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(maxSubarraySum(arr, n));

    }

    public static long maxSubarraySum(int arr[], int n) {
        // Your code here
        long max_so_far = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum > max_so_far)
                    max_so_far = sum;
            }
        }

        return max_so_far;
    }
}
