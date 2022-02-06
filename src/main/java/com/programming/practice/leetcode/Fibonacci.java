package com.programming.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Long> fibonacciMap = new HashMap<Integer, Long>() {
        {
            put(0, 0L);
            put(1, 1L);
        }
    };

    public long fibonacciRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }

    //Problem statement: wasting space till last
    public long fibonacciMemoization(int n) {
        long result = 0;
        if (fibonacciMap.containsKey(n)) {
            result = fibonacciMap.get(n);
        } else {
            result = fibonacciMemoization(n - 2) + fibonacciMemoization(n - 1);
            fibonacciMap.put(n, result);
        }
        return result;
    }

    // Solve earlier sub problems
    public long fibonacciDynamicProgramming(int n) {
        long[] result = new long[n+2];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n ; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];
    }
}
