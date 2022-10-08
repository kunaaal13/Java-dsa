package com.kunaaal.recursion;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printPermutations(str, "");
        s.close();
    }

    public static void printPermutations(String str, String asf) {
        if (str.length() == 0){
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);

            String rest = left+right;
            printPermutations(rest, asf+c);
        }


    }
}
