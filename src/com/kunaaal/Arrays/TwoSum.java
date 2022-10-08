package com.kunaaal.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int target = s.nextInt();
        int [] ans = twoSum(arr, target);

        System.out.println(ans[0] + " "+ans[1]);
    }

    public static int[] twoSum(int[] arr, int target) {
        int [] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            // present
            if(map.containsKey(arr[i])){
                ans[0] = map.get(arr[i]);
                ans[1] = i;
                return ans;
            }
            else {
                map.put(diff, i);
            }
        }


        return ans;
    }
}
