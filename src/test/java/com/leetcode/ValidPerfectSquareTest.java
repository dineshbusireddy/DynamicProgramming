package com.leetcode;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ValidPerfectSquareTest {

    @InjectMocks
    private ValidPerfectSquare validPerfectSquare;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(16, true),
                Arguments.of(14, false),
                Arguments.of(9, true),
                Arguments.of(1, true),
                Arguments.of(2, false),
                Arguments.of(625, true),
                Arguments.of(2147483647, false),
                Arguments.of(808201, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    @Timeout(unit = TimeUnit.MILLISECONDS, value = 50)
    void testIsPerfectSquare(int input, boolean expected) {
        assertTimeoutPreemptively(Duration.ofMillis(50),
                () -> assertEquals(expected, validPerfectSquare.isPerfectSquare(input)));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testIsPerfectSquareBruteForce(int input, boolean expected) {
        assertTimeoutPreemptively(Duration.ofMillis(50),
                () -> assertEquals(expected, validPerfectSquare.isPerfectSquareBruteForce(input)));
    }

}