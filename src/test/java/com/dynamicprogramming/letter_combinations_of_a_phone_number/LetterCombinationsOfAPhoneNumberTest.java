package com.dynamicprogramming.letter_combinations_of_a_phone_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LetterCombinationsOfAPhoneNumberTest {

    @InjectMocks
    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;

    private static Stream<Arguments> testLetterCombinations() {
        return Stream.of(
                Arguments.of("23", Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                Arguments.of("234", Arrays.asList("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg",
                        "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi")),
                Arguments.of("", new ArrayList<>()),
                Arguments.of("2", Arrays.asList("a", "b", "c"))
        );
    }

    @ParameterizedTest
    @MethodSource("testLetterCombinations")
    void executeTests(String inputDigits, List<String> expected) {
        assertEquals(expected.toString(), letterCombinationsOfAPhoneNumber.
                letterCombinations(inputDigits).toString());
    }
}