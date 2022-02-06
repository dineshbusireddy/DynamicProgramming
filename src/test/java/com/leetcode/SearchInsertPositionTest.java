package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SearchInsertPositionTest {

    @InjectMocks
    private SearchInsertPosition searchInsertPosition;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, 1, 0),
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
                Arguments.of(new int[]{2}, 1, 0),
                Arguments.of(new int[]{2}, 3, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testSearchInsert(int[] input, int elementToSearch, int expected) {
        assertEquals(expected, searchInsertPosition.searchInsert(input, elementToSearch));
    }

}