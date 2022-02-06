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
                Arguments.of(5672, "Five Thousand Six Hundred and Seventy Two"),
                Arguments.of(99, "Ninety Nine"),
                Arguments.of(999, "Nine Hundred and Ninety Nine"),
                Arguments.of(9999, "Nine Thousand Nine Hundred and Ninety Nine"),
                Arguments.of(99999, "Ninety Nine Thousand Nine Hundred and Ninety Nine"),
                Arguments.of(999999, "Nine Lakh Ninety Nine Thousand Nine Hundred and Ninety Nine"),
                Arguments.of(56945781, "Five Crore Sixty Nine Lakh Forty Five Thousand Seven Hundred and Eighty One"),
                Arguments.of(999999999, "Ninety Nine Crore Ninety Nine Lakh Ninety Nine Thousand Nine Hundred and Ninety Nine"),
                Arguments.of(246864256, "Twenty Four Crore Sixty Eight Lakh Sixty Four Thousand Two Hundred and Fifty Six"),
                Arguments.of(931945251, "Ninety Three Crore Nineteen Lakh Forty Five Thousand Two Hundred and Fifty One"),
                Arguments.of(461450510, "Forty Six Crore Fourteen Lakh Fifty Thousand Five Hundred and Ten"),
                Arguments.of(280765944, "Twenty Eight Crore Seven Lakh Sixty Five Thousand Nine Hundred and Forty Four"),
                Arguments.of(843919757, "Eighty Four Crore Thirty Nine Lakh Nineteen Thousand Seven Hundred and Fifty Seven"),
                Arguments.of(27903936, "Two Crore Seventy Nine Lakh Three Thousand Nine Hundred and Thirty Six"),
                Arguments.of(539123533, "Fifty Three Crore Ninety One Lakh Twenty Three Thousand Five Hundred and Thirty Three"),
                Arguments.of(13595904, "One Crore Thirty Five Lakh Ninety Five Thousand Nine Hundred and Four"),
                Arguments.of(467257040, "Forty Six Crore Seventy Two Lakh Fifty Seven Thousand Forty"),
                Arguments.of(179242024, "Seventeen Crore Ninety Two Lakh Forty Two Thousand Twenty Four"),
                Arguments.of(262269097, "Twenty Six Crore Twenty Two Lakh Sixty Nine Thousand Ninety Seven")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testConvert(int input, String expected) {
        assertEquals(expected, numberToWord.convert(input));
    }
}