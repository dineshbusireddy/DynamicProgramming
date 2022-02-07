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
class RemoveNthNodeFromEndOfListTest {

    @InjectMocks
    private RemoveNthNodeFromEndOfList nthNodeFromEndOfList;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(ListNode.of(1, 2, 3, 4, 5), 2,
                        ListNode.of(1, 2, 3, 5)),
                Arguments.of(ListNode.of(1), 1, null),
                Arguments.of(ListNode.of(1, 2), 1, ListNode.of(1))
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRemoveNthFromEnd(ListNode listNode, int nodePosition, ListNode expected) {
        assertEquals(ListNode.getAsString(expected), ListNode.getAsString(nthNodeFromEndOfList.removeNthFromEnd(listNode, nodePosition)));
    }

}