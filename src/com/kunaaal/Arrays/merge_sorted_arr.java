package com.kunaaal.Arrays;

import java.util.*;

public class merge_sorted_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        merge(a, b, m, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    // with extra space
    // public static void merge(int[] arr1, int m, int[] arr2, int n) {
    // ArrayList<Integer> ans = new ArrayList<Integer>();
    // int i = 0, j = 0;

    // while (i < m && j < n) {
    // if (arr1[i] < arr2[j]) {
    // ans.add(arr1[i]);
    // i++;
    // } else {
    // ans.add(arr2[j]);
    // j++;
    // }
    // }

    // while (i < m) {
    // ans.add(arr1[i]);
    // i++;
    // }

    // while (j < n) {
    // ans.add(arr2[j]);
    // j++;
    // }

    // for (int k = 0; k < arr1.length; k++) {
    // arr1[k] = ans.get(k);
    // }

    // }

    // without extra space
    public static void merge(long arr1[], long arr2[], int m, int n) {
        // code here
        int i = 0, j = 0, k = m - 1;
        while (i <= k && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                long temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
}
