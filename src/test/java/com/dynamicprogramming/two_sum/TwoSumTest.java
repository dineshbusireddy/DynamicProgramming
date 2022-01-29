package com.dynamicprogramming.two_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class TwoSumTest {

    @InjectMocks
    private TwoSum twoSum;

    private static Stream<Arguments> sourceStream() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{2, 1, 5, 3}, 4, new int[]{1, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("sourceStream")
    void testFindTwoSum(int[] input, int target, int[] expected) {
        assertArrayEquals(expected, twoSum.findTwoSum(input, target));
    }


    @ParameterizedTest
    @MethodSource("sourceStream")
    void testFindTwoSumBruteForce(int[] input, int target, int[] expected) {
        assertArrayEquals(expected, twoSum.findTwoSumBruteForce(input, target));
    }
}