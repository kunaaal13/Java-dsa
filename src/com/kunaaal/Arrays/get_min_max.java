package com.kunaaal.Arrays;

// https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

import java.util.Scanner;

class Pair {
    int min;
    int max;

    public Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

public class get_min_max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        Pair p = findMinMax(arr);
        System.out.println(p.min + " " + p.max);

        s.close();
    }

    public static Pair findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        return new Pair(min, max);
    }
}

