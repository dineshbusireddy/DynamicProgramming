package com.programming.practice.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ContainerWithMostWaterTest {

    @InjectMocks
    private ContainerWithMostWater containerWithMostWater;

    private static Stream<Arguments> testMaxArea() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{2, 7, 3, 2, 5, 9, 8, 9, 9, 9}, 56)
        );
    }

    @ParameterizedTest
    @MethodSource("testMaxArea")
    void executeTests(int[] input, int expected) {
        assertEquals(expected, containerWithMostWater.maxArea(input));
    }
}