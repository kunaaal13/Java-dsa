package com.kunaaal.Arrays;

import java.util.*;

public class chocolate_distribution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            array.add(s.nextInt());
        }

        long ans = findMinDiff(array, n, m);
        System.out.println(ans);

    }

    public static long findMinDiff(ArrayList<Integer> arr, int n, int m) {
        // your code here
        arr.sort(Comparator.naturalOrder());
        long min = Long.MAX_VALUE;

        for (int i = 0; i + m - 1 < arr.size(); i++) {
            long diff = arr.get(i + m - 1) - arr.get(i);
            if (diff < min) {
                min = diff;
            }
        }

        return min;
    }
}

