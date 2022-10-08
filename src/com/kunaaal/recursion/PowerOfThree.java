package com.kunaaal.recursion;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return Helper(n, 0);
    }

    public static boolean Helper(int n, int r) {
        if (n == 1 && r == 0)
            return true;

        if ( n < 0 || r != 0)
            return false;


        int rem = n % 3;
        int quo = n / 3;

        return Helper(quo, rem) && rem == 0;
    }
}
