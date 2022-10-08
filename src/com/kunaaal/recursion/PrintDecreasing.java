package com.kunaaal.recursion;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        printDecreasing(n);
//        printIncreasing(n);
        pdi(n);
    }

    private static void printIncreasing(int n) {
        if(n <= 0)
            return;

        printIncreasing(n-1);

        // Vapas Aate waqt
        System.out.println(n);
    }

    public static void printDecreasing(int n){
        if(n <= 0)
            return;

        // jate waqt
        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void pdi(int n){
        if(n <= 0)
            return;

        // jate waqt
        System.out.println(n);
        pdi(n-1);
        // Aate waqt
        System.out.println(n);
    }
}
