package com.patterns;

/**
 *                  *
 *                * *
 *              * * *
 *            * * * *
 *          * * * * *
 *          * * * * *
 *            * * * *
 *              * * *
 *                * *
 *                  *
 */
public class Pattern2 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n; i >0 ; i--) {
            print(i, n);
        }

        for (int i = 1; i <=n ; i++) {
            print(i, n);
        }
    }

    private static void print(int i, int n) {
        int j = 1;
        while(j<=(i+i)-2) {
            System.out.print(" ");
            ++j;
        }
        int tempStar = n-i+1;
        while(tempStar>0) {
            System.out.print(" *");
            --tempStar;
        }
        System.out.println();
    }
}
