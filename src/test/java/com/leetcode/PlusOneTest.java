package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class PlusOneTest {


    @InjectMocks
    private PlusOne plusOne;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{1, 0, 0}, new int[]{1, 0, 1}),
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 5}),
                Arguments.of(new int[]{9}, new int[]{1, 0}),
                Arguments.of(new int[]{6, 9}, new int[]{7, 0}),
                Arguments.of(new int[]{9, 9}, new int[]{1, 0, 0}),
                Arguments.of(new int[]{6, 7, 9}, new int[]{6, 8, 0}),
                Arguments.of(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testPlusOne(int[] input, int[] expected) {
        assertArrayEquals(expected, plusOne.plusOne(input));
    }

}