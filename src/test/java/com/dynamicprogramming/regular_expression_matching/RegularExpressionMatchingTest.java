package com.dynamicprogramming.regular_expression_matching;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RegularExpressionMatchingTest {

    @InjectMocks
    private RegularExpressionMatching regularExpressionMatching;

    private static Stream<Arguments> testIsMatch() {
        return Stream.of(
                Arguments.of("aa", "a", false),
                Arguments.of("aa", "a.", true),
                Arguments.of("aab", "a*", true),
                Arguments.of("ab", ".*", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testIsMatch")
    void isMatch(String input, String pattern, boolean expected) {
        assertEquals(expected, regularExpressionMatching.isMatch(input, pattern));
    }
}