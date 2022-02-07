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
class AddTwoNumbersTest {

    @InjectMocks
    private AddTwoNumbers addTwoNumbers;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(ListNode.of(2, 4, 3),
                        ListNode.of(5, 6, 4),
                        ListNode.of(7, 0, 8)),
                Arguments.of(ListNode.of(2, 4, 3, 3),
                        ListNode.of(5, 6, 4),
                        ListNode.of(7, 0, 8, 3)),
                Arguments.of(ListNode.of(9, 9, 9, 9, 9, 9, 9, 9, 9),
                        ListNode.of(9, 9, 9, 9),
                        ListNode.of(8, 9, 9, 9, 0, 0, 0, 0, 0, 1)),
                Arguments.of(ListNode.of(0), ListNode.of(0), ListNode.of(0))
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testAddTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
        assertEquals(ListNode.getAsString(expected), ListNode.getAsString(addTwoNumbers.addTwoNumbers(l1, l2)));
    }

}