package com.kunaaal.Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,6,9};
        int k = 3;

        int ans = getKthLargest(arr, k);
        System.out.println(ans);
    }

    private static int getKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for (int i = 0; i < k; i++) {
//            pq.add(arr[i]);
//        }
//
//        for (int i = k; i < arr.length; i++) {
//            if (pq.peek() < arr[i]){
//                pq.poll();
//                pq.add(arr[i]);
//            }
//        }


        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < k-1; i++) {
            pq.poll();
        }
        return pq.peek();
    }


}
