package com.kunaaal.searchingSorting;

import java.util.Scanner;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] > arr[mid+1]){
                //inc
                start = mid + 1;
            } else if (arr[mid] < arr[mid+1]) {
                end = mid;
            }
        }
        
        return start;
    }
}
