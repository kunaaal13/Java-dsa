package com.kunaaal.Arrays;
import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>numFreqMap=new HashMap<>();
        List<List<Integer>>freq=new ArrayList<>();
        int[]res=new int[k];
        for(int i=0;i<=nums.length;i++){
            freq.add(new ArrayList<>());
        }


        for(int num:nums){
            numFreqMap.put(num,numFreqMap.getOrDefault(num,0)+1);
        }


        for(Map.Entry<Integer,Integer> entry:numFreqMap.entrySet()){
            int key=entry.getKey();
            int v=entry.getValue();
            List<Integer>elList=freq.get(v);
            elList.add(key);
            freq.set(v,elList);
        }

        int j=0;
        for(int i=freq.size()-1;i>0;i--){
            List<Integer>elList=freq.get(i);
            for(int el:elList){
                if(j==k)
                    break;
                res[j]=el;
                j++;

            }
        }
        return res;
    }
}
