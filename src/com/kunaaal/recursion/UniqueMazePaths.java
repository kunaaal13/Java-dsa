package com.kunaaal.recursion;

public class UniqueMazePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(23, 12));
    }

    public static int uniquePaths(int m, int n) {
        return Helper(0, 0, m-1, n-1);
    }

    public static int Helper(int sx, int sy, int ex, int ey){
        if (sx == ex && sy == ey)
            return 1;

        if (sx > ex || sy > ey)
            return 0;

        int down = Helper(sx+1,sy,ex,ey);
        int right = Helper(sx, sy+1, ex, ey);

        return down + right;
    }
}
