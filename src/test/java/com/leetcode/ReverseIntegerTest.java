package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReverseIntegerTest {

    @InjectMocks
    private ReverseInteger reverseInteger;

    private static Stream<Arguments> testReverse() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21),
                Arguments.of(1534236469, 0),
                Arguments.of((int) Math.pow(-2, 31), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testReverse")
    void executeTests(int input, int expected) {
        assertEquals(expected, reverseInteger.reverse(input));
    }
}