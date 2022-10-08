package com.kunaaal.searchingSorting;

import java.util.ArrayList;
import java.util.Scanner;

public class First_last_pos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(searchRange(arr, x));
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};
        int first = search(nums, target, true);
        int last = search(nums, target, false);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    public static int search(int [] nums, int target, boolean firstStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else {
                // Potential ans
                ans = mid;
                if(firstStartIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


}
