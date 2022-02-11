package com.patterns;

/**
 *             1
 *            212
 *           32123
 *          4321234
 *           32123
 *            212
 *             1
 */
public class Pattern6 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            print(i, n);
        }
        for (int i = n-1; i > 0; i--) {
            print(i, n);
        }
    }

    private static void print(int i, int n) {
        int space = n-i;
        while (space>0) {
            System.out.print(" ");
            --space;
        }
        int number = i;
        while (number>1) {
            System.out.print(number);
            number--;
        }
        while (number<=i) {
            System.out.print(number);
            number++;
        }
        System.out.println();
    }
}
