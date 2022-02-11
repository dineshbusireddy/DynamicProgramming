package com.patterns;

/*
        A B C D E F

        A B C D E

        A B C D

        A B C

        A B

        A

        A

        A B

        A B C

        A B C D

        A B C D E

        A B C D E F
*/
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int start = 'A';
        int end = 'A' + n -1;
        for (int i = end; i >=start ; i--) {
            print(i, start, end);
        }
        for (int i = start; i <=end ; i++) {
            print(i, start, end);
        }
    }

    private static void print(int i, int start, int end) {
        int characterStart = start;
        while (characterStart <= i) {
            System.out.print((char) characterStart + " ");
            ++characterStart;
        }
        System.out.println();
    }
}
