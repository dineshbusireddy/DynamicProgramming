package com.leetcode;

import com.domain.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RemoveDuplicatesFromSortedListTest {

    @InjectMocks
    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    private static Stream<Arguments> testRemoveNthFromEnd() {
        return Stream.of(
                Arguments.of(ListNode.of(1, 1, 2), ListNode.of(1, 2)),
                Arguments.of(ListNode.of(1, 1, 2, 3, 3), ListNode.of(1, 2, 3)),
                Arguments.of(null, null),
                Arguments.of(ListNode.of(1, 1, 2, 3, 3), ListNode.of(1, 2, 3)),
                Arguments.of(ListNode.of(1, 1, 1), ListNode.of(1))
        );
    }

    @ParameterizedTest
    @MethodSource("testRemoveNthFromEnd")
    void testDeleteDuplicates(ListNode listNode, ListNode expected) {
        assertEquals(ListNode.getAsString(expected), ListNode.getAsString(removeDuplicatesFromSortedList.deleteDuplicates(listNode)));
    }

}