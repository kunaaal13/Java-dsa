package com.kunaaal.Arrays;

import java.util.*;

public class cyclically_rotate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        clockwiseRotate(arr, n);

    }

    public static void clockwiseRotate(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n; i++) {
            int x = temp;
            temp = arr[i];
            arr[i] = x;
        }

        arr[0] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

