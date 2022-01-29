package com.dynamicprogramming.longest_palindromic_substring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LongestPalindromicSubstringTest {

    @InjectMocks
    private LongestPalindromicSubstring longestPalindromicSubstring;

    private static Stream<Arguments> testLongestPalindrome() {
        return Stream.of(
                Arguments.of("babad", "aba"), // or bab
                Arguments.of("cbbd", "bb"),
                Arguments.of("a", "a"),
                Arguments.of("aa", "aa"),
                Arguments.of("abcdef", "f")// any character
        );
    }

    @ParameterizedTest
    @MethodSource("testLongestPalindrome")
    void executeTests(String input, String expected) {
        assertEquals(expected, longestPalindromicSubstring.longestPalindrome(input));
    }
}