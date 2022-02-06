package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PalindromeNumberTest {

    @InjectMocks
    private PalindromeNumber palindromeNumber;

    private static Stream<Arguments> testIsPalindrome() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testIsPalindrome")
    void executeTests(int input, boolean expected) {
        assertEquals(expected, palindromeNumber.isPalindrome(input));
    }
}