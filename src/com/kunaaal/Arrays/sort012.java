package com.kunaaal.Arrays;

import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        sort(arr);

        s.close();
    }

    public static void sort(int[] arr) {
        int zero = 0;
        int one = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            }
        }

        int i = 0;

        while (i < arr.length) {
            if (zero != 0) {
                arr[i] = 0;
                zero--;
            } else if (one != 0) {
                arr[i] = 1;
                one--;
            } else {
                arr[i] = 2;
            }
            i++;
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

