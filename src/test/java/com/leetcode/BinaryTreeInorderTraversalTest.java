package com.leetcode;

import com.domain.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BinaryTreeInorderTraversalTest {

    @InjectMocks
    private BinaryTreeInorderTraversal binaryTreeInorderTraversal;

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(TreeNode.of(1, 3, 2), Arrays.asList(1, 2, 3)),
                Arguments.of(null, Collections.emptyList()),
                Arguments.of(TreeNode.of(1), Collections.singletonList(1)),
                Arguments.of(TreeNode.of(5, 2, 4, 6, 8, 6, 8, 9, 1, 10), Arrays.asList(1, 2, 4, 5, 6, 6, 8, 8, 9, 10))
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void inorderTraversal(TreeNode input, List<Integer> expected) {
        assertEquals(expected.toString(),
                binaryTreeInorderTraversal.inorderTraversal(input).toString());
    }
}