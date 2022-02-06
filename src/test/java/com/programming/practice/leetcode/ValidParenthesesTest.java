package com.programming.practice.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ValidParenthesesTest {

    @InjectMocks
    private ValidParentheses validParentheses;

    private static Stream<Arguments> testIsValid() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("{[()]}", true),
                Arguments.of("{}{", false),
                Arguments.of("{[()]}}", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testIsValid")
    void executeTests(String input, boolean expected) {
        assertEquals(expected, validParentheses.isValid(input));
    }
}