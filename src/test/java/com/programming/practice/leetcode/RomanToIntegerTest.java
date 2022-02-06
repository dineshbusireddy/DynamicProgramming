package com.programming.practice.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RomanToIntegerTest {

    @InjectMocks
    private RomanToInteger romanToInteger;

    private static Stream<Arguments> sourceStream() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("V", 5),
                Arguments.of("VI", 6),
                Arguments.of("IX", 9),
                Arguments.of("X", 10),
                Arguments.of("XXV", 25),
                Arguments.of("XXX", 30),
                Arguments.of("XL", 40),
                Arguments.of("XLV", 45),
                Arguments.of("L", 50),
                Arguments.of("LVIII", 58),
                Arguments.of("LXX", 70),
                Arguments.of("XC", 90),
                Arguments.of("XCVII", 97),
                Arguments.of("C", 100),
                Arguments.of("CCCXXV", 325),
                Arguments.of("CD", 400),
                Arguments.of("CDXC", 490),
                Arguments.of("D", 500),
                Arguments.of("DXC", 590),
                Arguments.of("DCCL", 750),
                Arguments.of("CM", 900),
                Arguments.of("CML", 950),
                Arguments.of("M", 1000),
                Arguments.of("MXXV", 1025),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("MMDXXV", 2525),
                Arguments.of("MMMCMXCIX", 3999),
                Arguments.of("MMMMMMMMMMDXXV", 10525)
        );
    }

    @ParameterizedTest
    @MethodSource("sourceStream")
    void testRomanToInt(String input, int expected) {
        assertEquals(expected, romanToInteger.romanToInt(input));
    }
}