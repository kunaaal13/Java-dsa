package com.kunaaal.recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

//        System.out.println(power(x, n));
        System.out.println(powerLogarithmic(x, n));
    }

    private static int powerLogarithmic(int x, int n) {
        if(n <= 0){
            return 1;
        }

        int half = powerLogarithmic(x, n/2);

        if(n % 2 == 0){
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static int power(int x, int n){
        if(n <= 0){
            return 1;
        }

        return x * power(x,n-1);
    }


}
