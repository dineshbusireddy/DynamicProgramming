package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LongestSubStringTest {

    @InjectMocks
    private LongestSubString longestSubString;

    private static Stream<Arguments> testLengthOfLongestSubstring() {
        return Stream.of(
                Arguments.of("abcdeafbdgcbb", 7),
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testLengthOfLongestSubstring")
    void executeTests(String input, int expected) {
        assertEquals(expected, longestSubString.lengthOfLongestSubstring(input));
    }
}