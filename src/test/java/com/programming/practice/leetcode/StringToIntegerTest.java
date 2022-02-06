package com.programming.practice.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringToIntegerTest {

    @InjectMocks
    private StringToInteger stringToInteger;

    private static Stream<Arguments> sourceStream() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("      -42", -42),
                Arguments.of("   +42", 42),
                Arguments.of("4193 with words", 4193),
                Arguments.of("abc", 0),
                Arguments.of("-a", 0),
                Arguments.of("abc 123", 0),
                Arguments.of("-1 ", -1),
                Arguments.of("-91283472332", -2147483648),
                Arguments.of("0032", 32),
                Arguments.of("-2147483647", -2147483647)
        );
    }

    @ParameterizedTest
    @MethodSource("sourceStream")
    void testMyAtoi(String input, int expected) {
        assertEquals(expected, stringToInteger.myAtoi(input));

    }
}