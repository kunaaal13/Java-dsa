package com.kunaaal.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StairsPath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        } else if(n < 0) {
            ArrayList<String> ans = new ArrayList<>();
            return ans;
        }

        ArrayList<String> p1 = getStairPaths(n-1);
        ArrayList<String> p2 = getStairPaths(n-2);
        ArrayList<String> p3 = getStairPaths(n-3);

        ArrayList<String> ans = new ArrayList<>();

        // For 1
        for(String path : p1){
            ans.add("1"+path);
        }

        // For 2
        for(String path : p2){
            ans.add("2"+path);
        }

        // For 3
        for(String path : p3){
            ans.add("3"+path);
        }


        return ans;

    }
}
