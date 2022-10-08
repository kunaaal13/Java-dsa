package com.kunaaal.twoPointers;

public class countArithmeticTriplets {
    public static void main(String[] args) {

    }

    public static int arithmeticTriplets(int[] arr, int diff) {
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[j] - arr[i] == diff){
                    for (int k = j+1; k < arr.length; k++) {
                        if (arr[k] - arr[j] == diff)
                            count++;
                    }
                }
            }
        }

        return count;
    }
}
