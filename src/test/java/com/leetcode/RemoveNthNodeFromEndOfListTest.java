package com.leetcode;

import com.domain.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.StringJoiner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RemoveNthNodeFromEndOfListTest {

    @InjectMocks
    private RemoveNthNodeFromEndOfList nthNodeFromEndOfList;

    private static Stream<Arguments> testRemoveNthFromEnd() {
        return Stream.of(
                Arguments.of(new ListNode(1).addLast(2).addLast(3).
                                addLast(4).addLast(5), 2,
                        "[1, 2, 3, 5]"),
                Arguments.of(new ListNode(1), 1, "[]"),
                Arguments.of(new ListNode(1).addLast(2), 1, "[1]")
        );
    }

    @ParameterizedTest
    @MethodSource("testRemoveNthFromEnd")
    void executeTests(ListNode listNode, int nodePosition, String expected) {
        assertEquals(expected, getActualAsString(nthNodeFromEndOfList.removeNthFromEnd(listNode, nodePosition)));
    }

    private String getActualAsString(ListNode output) {
        StringJoiner result = new StringJoiner(", ", "[", "]");
        ListNode current = output;
        while (current != null) {
            result.add(current.val + "");
            current = current.next;
        }
        return result.toString();
    }
}