package com.kunaaal.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/

public class GroupAnagrams {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            HashMap<Character,Integer> subMap =new HashMap<>();
            for(char c : str.toCharArray()){
                if(subMap.containsKey(c)){
                    subMap.put(c,subMap.get(c)+1);
                }
                else{
                    subMap.put(c,1);
                }
            }

            // present
            if(map.containsKey(subMap)){
                ArrayList<String> value = map.get(subMap);
                value.add(str);
                map.put(subMap, value);
            }
            else {
                ArrayList <String> value = new ArrayList<>();
                value.add(str);
                map.put(subMap, value);
            }
        }


        for (ArrayList<String> value : map.values()){
            ans.add(value);
        }
        return ans;
    }
}
