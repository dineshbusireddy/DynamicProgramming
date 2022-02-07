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
class MergeTwoSortedListsTest {

    @InjectMocks
    private MergeTwoSortedLists mergeTwoSortedLists;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(ListNode.of(1, 2, 4),
                        ListNode.of(1, 3, 4),
                        ListNode.of(1, 1, 2, 3, 4, 4)),
                Arguments.of(ListNode.of(1, 3, 6, 8),
                        ListNode.of(2, 4),
                        ListNode.of(1, 2, 3, 4, 6, 8)),
                Arguments.of(new ListNode(1),
                        ListNode.of(2, 3, 4, 5, 6),
                        ListNode.of(1, 2, 3, 4, 5, 6)),
                Arguments.of(null,
                        null, null),
                Arguments.of(null,
                        ListNode.of(0), ListNode.of(0))
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testMergeTwoLists(ListNode l1, ListNode l2, ListNode expected) {
        assertEquals(ListNode.getAsString(expected),
                ListNode.getAsString(mergeTwoSortedLists.mergeTwoLists(l1, l2)));
    }

}