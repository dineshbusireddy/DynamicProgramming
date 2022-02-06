package com.programming.practice.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaximumSubArrayTest {

    @InjectMocks
    private MaximumSubArray maximumSubArray;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{5,4,-1,7,8}, 23),
                Arguments.of(new int[]{-2,-1,-1}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testMaxSubArray(int[] input, int expected) {
        assertEquals(expected, maximumSubArray.maxSubArray(input));
    }

}