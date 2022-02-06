package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LongestCommonPrefixTest {

    @InjectMocks
    private LongestCommonPrefix longestCommonPrefix;

    private static Stream<Arguments> testLongestCommonPrefix() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""),
                Arguments.of(new String[]{"dog", "", "doe"}, ""),
                Arguments.of(new String[]{"cir", "car"}, "c"),
                Arguments.of(new String[]{"hello"}, "hello")
        );
    }

    @ParameterizedTest
    @MethodSource("testLongestCommonPrefix")
    void executeTests(String[] input, String expected) {
        assertEquals(expected, longestCommonPrefix.longestCommonPrefix(input));
    }
}