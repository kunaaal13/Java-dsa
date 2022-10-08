package com.kunaaal.recursion;

import java.util.Scanner;

public class FirstLastIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int x = s.nextInt();

        System.out.println(lastIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int i, int x){
        if (i == arr.length-1){
            if(arr[i] == x)
                return i;
            else
                return -1;
        }

        // Baki ke array me pehla index dedo
        int firstRest = firstIndex(arr, i+1, x);

        if(arr[i] == x)
            return i;
        else
            return firstRest;
    }

    public static int lastIndex(int[] arr, int i, int x){
        if (i == arr.length-1){
            if (arr[i] == x)
                return i;
            else
                return -1;
        }

        // Baki ke array me last index dedo
        int lastRest = lastIndex(arr, i+1, x);

        if(lastRest == -1 && arr[i] == x) {
            return i;
        } else {
            return lastRest;
        }
    }

    public static int[] allIndices(int[] arr, int x, int i, int noOfX) {
        // write ur code here
        if (i == arr.length){
            return new int[noOfX];
        }

        if (arr[i] == x){
            int [] res = allIndices(arr, x, i+1, noOfX+1);
            res[noOfX] = i;
            return res;
        }
        else {
            int [] res = allIndices(arr, x, i+1, noOfX);
            return res;
        }

    }
}
