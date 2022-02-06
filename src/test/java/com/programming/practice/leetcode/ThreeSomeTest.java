package com.programming.practice.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ThreeSomeTest {

    @InjectMocks
    private ThreeSome threeSome;

    private static Stream<Arguments> dataStream() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, "[[-1, -1, 2], [-1, 0, 1]]"),
                Arguments.of(new int[]{}, "[]"),
                Arguments.of(new int[]{0}, "[]"),
                Arguments.of(new int[]{0, 1}, "[]"),
                Arguments.of(new int[]{0, 1, -1}, "[[-1, 0, 1]]"),
                Arguments.of(new int[]{-2, 0, 0, 2, 2}, "[[-2, 0, 2]]")
        );
    }

    @ParameterizedTest
    @MethodSource("dataStream")
    void testThreeSum(int[] input, String expected) {
        assertEquals(expected, threeSome.threeSum(input).toString());
    }

}