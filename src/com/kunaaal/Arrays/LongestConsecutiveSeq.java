package com.kunaaal.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2};
        int ans = longestConsecutive(nums);
        System.out.println(ans);

    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;

        for(int num:nums){
            if(!set.contains(num-1))
            {
                int j=num;
                int currlen=1;
                while(set.contains(j+1))
                {
                    j++;
                    currlen++;
                }
                max=Math.max(max,currlen);
            }

        }
        return max;

    }


}
