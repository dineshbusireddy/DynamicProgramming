package com.patterns;

/**
 *     *
 *     * *
 *     * * *
 *     * * * *
 *     * * * * *
 *     * * * * *
 *     * * * *
 *     * * *
 *     * *
 *     *
 */
public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while(j<=i) {
                System.out.print("* ");
                ++j;
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            int j = 1;
            while(j<=i) {
                System.out.print("* ");
                ++j;
            }
            System.out.println();
        }
    }
}
