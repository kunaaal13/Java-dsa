package com.kunaaal.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAna {

    public int  groupAnagrams(List<String> words) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String temp = words.get(i);
            char ch[] = temp.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(map.containsKey(s)){
                map.get(s).add(temp);
            }
            else{
                map.put(s, new ArrayList<>());
                map.get(s).add(temp);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for (String ss : map.keySet()) {
            ans.add(map.get(ss));
        }

        return ans.size();
    }
}
