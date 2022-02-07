package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class MergeSortedArrayTest {

    @InjectMocks
    private MergeSortedArray mergeSortedArray;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(null, 0, null, 0, null),
                Arguments.of(new int[]{1}, 1, null, 0, new int[]{1}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testMerge(int[] firstArray, int firstArraySize, int[] secondArray, int secondArraySize, int[] expected) {
        mergeSortedArray.merge(firstArray, firstArraySize, secondArray, secondArraySize);
        Assertions.assertArrayEquals(expected, firstArray);
    }

}