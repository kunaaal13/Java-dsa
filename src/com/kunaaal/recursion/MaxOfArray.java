package com.kunaaal.recursion;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = s.nextInt();
        }

        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int i){
        if(i == arr.length-1){
            return arr[i];
        }

        // max of rest of arr
        int maxRest = maxOfArray(arr, i+1);
        if(arr[i] > maxRest){
            return arr[i];
        }
        else {
            return maxRest;
        }

    }
}
