package com.kunaaal.recursion;

public class PowerOfFour {
    public static void main(String[] args) {

    }

    public static boolean Helper(int n, int r) {
        if (n == 1 && r == 0)
            return true;

        if ( n < 0 || r != 0)
            return false;


        int rem = n % 4;
        int quo = n / 4;

        return Helper(quo, rem) && rem == 0;
    }
}
