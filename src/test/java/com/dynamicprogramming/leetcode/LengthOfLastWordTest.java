package com.dynamicprogramming.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LengthOfLastWordTest {

    @InjectMocks
    private LengthOfLastWord lengthOfLastWord;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("Hello Rishi", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6),
                Arguments.of("Cherry", 6)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testLengthOfLastWord(String input, int expected) {
        assertEquals(expected, lengthOfLastWord.lengthOfLastWord(input));
    }

}