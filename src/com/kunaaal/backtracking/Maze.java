package com.kunaaal.backtracking;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));

        path("", 3,3);
    }

    static int count(int row, int col){
        if (row == 1 || col == 1)
            return 1;

        int left = count(row-1, col);
        int right = count(row, col - 1);

        return right + left;
    }

    static void path(String p, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if (col > 1)
            path(p+"r", row, col-1);

        if (row  > 1)
            path(p+"d", row-1, col);
    }
}
