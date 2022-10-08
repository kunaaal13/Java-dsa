package com.kunaaal.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class AllSubsequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(getSubsequence(str));
    }

    public static ArrayList<String> getSubsequence(String str) {
        if (str.length() == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        // pehla char nikalo
        char c = str.charAt(0);

        // aage ke subsequence
        ArrayList<String> rest = getSubsequence(str.substring(1));
        ArrayList<String> ans = new ArrayList<>();

        // Nahi karna include
        for(String s : rest){
            ans.add(""+s);
        }

        // karna include
        for(String s : rest){
            ans.add(c+s);
        }

        return ans;
    }
}
