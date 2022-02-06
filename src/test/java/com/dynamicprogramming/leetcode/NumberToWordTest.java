package com.dynamicprogramming.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NumberToWordTest {

    @InjectMocks
    private NumberToWord numberToWord;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(10000000, "One Crore"),
                Arguments.of(1000000, "Ten Lakh"),
                Arguments.of(100000, "One Lakh"),
                Arguments.of(1000, "One Thousand"),
                Arguments.of(100, "One Hundred"),
                Arguments.of(90, "Ninety"),
                Arguments.of(80, "Eighty"),
                Arguments.of(70, "Seventy"),
                Arguments.of(60, "Sixty"),
                Arguments.of(50, "Fifty"),
                Arguments.of(40, "Forty"),
                Arguments.of(30, "Thirty"),
                Arguments.of(20, "Twenty"),
                Arguments.of(19, "Nineteen"),
                Arguments.of(18, "Eighteen"),
                Arguments.of(17, "Seventeen"),
                Arguments.of(16, "Sixteen"),
                Arguments.of(15, "Fifteen"),
                Arguments.of(14, "Fourteen"),
                Arguments.of(13, "Thirteen"),
                Arguments.of(12, "Twelve"),
                Arguments.of(11, "Eleven"),
                Arguments.of(10, "Ten"),
                Arguments.of(9, "Nine"),
                Arguments.of(8, "Eight"),
                Arguments.of(7, "Seven"),
                Arguments.of(6, "Six"),
                Arguments.of(5, "Five"),
                Arguments.of(4, "Four"),
                Arguments.of(3, "Three"),
                Arguments.of(2, "Two"),
                Arguments.of(1, "One"),
                Arguments.of(200, "Two Hundred"),
                Arguments.of(56345672, "Five Crore Sixty Three Lakh Forty Five Thousand Six Hundred and Seventy Two"),
                Arguments.of(5672, "Five Thousand Six Hundred and Seventy Two")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testConvert(int input, String expected) {
        assertEquals(expected, numberToWord.convert(input));
    }
}