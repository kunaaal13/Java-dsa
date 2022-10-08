package com.kunaaal.recursion;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

//        displayArr(arr, 0);
        displayArrReverse(arr, 0);
    }

    public static void displayArr(int[] arr, int i){
        if(i == arr.length)
            return;

        System.out.println(arr[i]);
        displayArr(arr, i+1);
    }

    public static void displayArrReverse(int[] arr, int i) {
        if(i == arr.length)
            return;

        displayArrReverse(arr, i+1);
        System.out.println(arr[i]);
    }
}
