package com.kunaaal.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String t = s.nextLine();
        System.out.println(isAnagram(str, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map =new HashMap<>();
        if(s.length()!= t.length()){
            return false;
        }

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
            }
        }


        return map.isEmpty();

    }
}
