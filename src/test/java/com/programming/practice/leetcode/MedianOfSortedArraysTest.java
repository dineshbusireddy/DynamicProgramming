package com.programming.practice.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MedianOfSortedArraysTest {

    @InjectMocks
    private MedianOfSortedArrays medianOfSortedArrays;

    private static Stream<Arguments> testFindMedianSortedArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2.00000),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.50000)
        );
    }

    @ParameterizedTest
    @MethodSource("testFindMedianSortedArrays")
    void executeTests(int[] firstArray, int[] secondArray, double expected) {
        assertEquals(expected, medianOfSortedArrays.
                findMedianSortedArrays(firstArray, secondArray));
    }
}