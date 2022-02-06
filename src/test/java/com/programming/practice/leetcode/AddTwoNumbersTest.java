package com.programming.practice.leetcode;

import com.programming.practice.domain.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.StringJoiner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AddTwoNumbersTest {

    @InjectMocks
    private AddTwoNumbers addTwoNumbers;

    private static Stream<Arguments> testAddTwoNumbers() {
        return Stream.of(
                Arguments.of(new ListNode(2).addLast(4).addLast(3),
                        new ListNode(5).addLast(6).addLast(4),
                        "[7, 0, 8]"),
                Arguments.of(new ListNode(2).addLast(4).addLast(3).addLast(3),
                        new ListNode(5).addLast(6).addLast(4),
                        "[7, 0, 8, 3]"),
                Arguments.of(new ListNode(9).addLast(9).addLast(9).addLast(9).
                                addLast(9).addLast(9).addLast(9).addLast(9).addLast(9),
                        new ListNode(9).addLast(9).addLast(9).addLast(9),
                        "[8, 9, 9, 9, 0, 0, 0, 0, 0, 1]"),
                Arguments.of(new ListNode(0), new ListNode(0), "[0]")
        );
    }

    @ParameterizedTest
    @MethodSource("testAddTwoNumbers")
    void executeTests(ListNode l1, ListNode l2, String expected) {
        assertEquals(expected, getActualAsString(addTwoNumbers.addTwoNumbers(l1, l2)));
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