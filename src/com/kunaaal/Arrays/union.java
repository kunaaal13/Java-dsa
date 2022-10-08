package com.kunaaal.Arrays;

import java.util.*;

public class union {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        int ans = doUnion(a, n, b, m);

        System.out.println(ans);

    }

    public static int doUnion(int[] a, int n, int[] b, int m) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            hash.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            hash.add(b[i]);
        }

        return hash.size();
    }

    public static int Union(int a[], int n, int b[], int m) {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean a_is_small = a.length < b.length;

        if (a_is_small) {
            for (int i = 0; i < b.length; i++) {
                arr.add(b[i]);
            }
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
                int ans = binarySearch(arr, a[i]);
                if (ans == -1) {
                    arr.add(a[i]);
                }
            }
        }

        else {
            for (int i = 0; i < a.length; i++) {
                arr.add(a[i]);
            }
            Arrays.sort(b);
            for (int i = 0; i < b.length; i++) {
                int ans = binarySearch(arr, b[i]);
                if (ans == -1) {
                    arr.add(b[i]);
                }
            }
        }

        return arr.size();
    }

    public static int binarySearch(ArrayList<Integer> arr, int key) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == key) {
                return mid;
            } else if (arr.get(mid) > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}

