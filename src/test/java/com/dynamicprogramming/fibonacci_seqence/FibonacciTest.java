package com.dynamicprogramming.fibonacci_seqence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

@SpringBootTest
class FibonacciTest {

    @InjectMocks
    private Fibonacci fibonacci;

    private static Stream<Arguments> testFibonacci() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(10, 55),
                Arguments.of(20, 6765),
                Arguments.of(60, 1548008755920L)
        );
    }

    @ParameterizedTest
    @MethodSource("testFibonacci")
    void testFibonacciRecursive(int input, long expected) {
        assertTimeoutPreemptively(Duration.ofMillis(40), () -> assertEquals(expected, fibonacci.fibonacciRecursive(input)));
    }

    @ParameterizedTest
    @MethodSource("testFibonacci")
    void testFibonacciMemoization(int input, long expected) {
        assertEquals(expected, fibonacci.fibonacciMemoization(input));
    }

    @ParameterizedTest
    @MethodSource("testFibonacci")
    void testFibonacciBottomUp(int input, long expected) {
        assertEquals(expected, fibonacci.fibonacciDynamicProgramming(input));
    }

}