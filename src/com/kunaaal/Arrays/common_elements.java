package com.kunaaal.Arrays;

import java.util.*;

public class common_elements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int p = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }
        int[] c = new int[p];
        for (int i = 0; i < p; i++) {
            c[i] = s.nextInt();
        }

        ArrayList<Integer> ans = commonElements(a, b, c, n, m, p);
        System.out.println(ans);

    }

    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashSet<Integer> hash1 = new HashSet<Integer>();
        HashSet<Integer> hash2 = new HashSet<Integer>();
        HashSet<Integer> hash3 = new HashSet<Integer>();

        for (int i = 0; i < n1; i++) {
            hash1.add(A[i]);
        }

        for (int i = 0; i < n2; i++) {
            hash2.add(B[i]);
        }

        for (int i = 0; i < n3; i++) {
            if (hash1.contains(C[i]) && hash2.contains(C[i]) && !hash3.contains(C[i])) {
                if (!hash3.contains(C[i])) {
                    ans.add(C[i]);
                }
                hash3.add(C[i]);
            }
        }

        return ans;

    }
}

