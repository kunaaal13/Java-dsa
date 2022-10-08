package com.kunaaal.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n <= 0){
            return 1;
        }

        int fact = factorial(n-1);
        return fact * n;
    }
}
