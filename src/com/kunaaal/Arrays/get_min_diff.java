package com.kunaaal.Arrays;

import java.util.*;

public class get_min_diff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int ans = getMinDiff(a, n, k);
        System.out.println(ans);
    }

    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        // Maximum possible height difference
        int ans = arr[n - 1] - arr[0];

        int tempmin, tempmax;
        tempmin = arr[0];
        tempmax = arr[n - 1];

        for (int i = 1; i < n; i++) {

            // if on subtracting k we got negative then
            // continue
            if (arr[i] - k < 0)
                continue;

            // Minimum element when we add k to whole array
            tempmin = Math.min(arr[0] + k, arr[i] - k);

            // Maximum element when we subtract k from whole
            // array
            tempmax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    }

}

