package com.dynamicprogramming.remove_element_from_array;

import com.dynamicprogramming.remove_element_from_array.RemoveElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RemoveElementTest {

    @InjectMocks
    private RemoveElement removeElement;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 1, new int[]{2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 2, new int[]{0, 0, 1, 1, 1, 3, 3, 4}),
                Arguments.of(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 3, 0, 4}),
                Arguments.of(new int[]{0}, 0, new int[]{}),
                Arguments.of(new int[]{0, 1}, 0, new int[]{1}),
                Arguments.of(new int[]{0, 0}, 0, new int[]{}),
                Arguments.of(new int[]{1, 2, 3}, 4, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRemoveElement(int[] input, int elementToRemove, int[] expected) {
        assertEquals(expected.length, removeElement.removeElement(input, elementToRemove));
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], input[i]);
        }
    }

}