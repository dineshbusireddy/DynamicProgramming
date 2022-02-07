package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

@SpringBootTest
class ClimbingStairsTest {

    @InjectMocks
    private ClimbingStairs climbingStairs;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(4, 5),
                Arguments.of(10, 89)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testClimbStairs(int input, int expected) {
        assertTimeoutPreemptively(Duration.ofMillis(50),
                () -> assertEquals(expected, climbingStairs.climbStairs(input)));
    }
}