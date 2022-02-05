package com.dynamicprogramming.leetcode;

import com.dynamicprogramming.leetcode.StringInString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StringInStringTest {

    @InjectMocks
    private StringInString stringInString;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("hello", "ll", 2),
                Arguments.of("aaaaa", "bba", -1),
                Arguments.of("", "", 0),
                Arguments.of("hello", "", 0),
                Arguments.of("a", "a", 0),
                Arguments.of("abc", "abc", 0),
                Arguments.of("mississippi", "issip", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRemoveElement(String input, String dataToSearch, int expected) {
        assertEquals(expected, stringInString.strStr(input, dataToSearch));
    }
}