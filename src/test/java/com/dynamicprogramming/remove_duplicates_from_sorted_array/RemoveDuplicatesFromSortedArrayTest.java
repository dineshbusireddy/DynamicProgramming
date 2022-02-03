package com.dynamicprogramming.remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RemoveDuplicatesFromSortedArrayTest {

    @InjectMocks
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 1, 2, 3, 4, 5}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{0, 1}, new int[]{0, 1}),
                Arguments.of(new int[]{0, 0}, new int[]{0}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRemoveDuplicates(int[] input, int[] expected) {
        assertEquals(expected.length, removeDuplicatesFromSortedArray.removeDuplicates(input));
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], input[i]);
        }
    }
}