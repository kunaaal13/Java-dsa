package com.kunaaal.searchingSorting;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(mySqrt(n));
    }

    public static int mySqrt(int x) {
        if (x < 2)
            return x;

        int start = 0;
        int end = x;

        while (start <= end){
            int mid = start + (end - start)/2;
            int mul = x/mid;

            if (mid == mul)
                return mid;

            if (mid > mul)
                end = mid;
            else
                start = mid + 1;
        }

        return start - 1;
    }
}
