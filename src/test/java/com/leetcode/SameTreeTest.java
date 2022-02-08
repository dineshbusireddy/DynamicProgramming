package com.leetcode;

import com.domain.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class SameTreeTest {

    @InjectMocks
    private SameTree sameTree;

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(TreeNode.of(1, 3, 2), TreeNode.of(1, 2, 3), false),
                Arguments.of(TreeNode.of(1, 3, 2), null, false),
                Arguments.of(null, null, true),
                Arguments.of(TreeNode.of(1, 3, 2), TreeNode.of(1, 3, 2), true),
                Arguments.of(TreeNode.of(1, 2, 1), TreeNode.of(1, 1, 2), false),
                Arguments.of(TreeNode.of(1, 2, 1), TreeNode.of(1, 1, 2, 5, 6), false),
                Arguments.of(TreeNode.of(1, 2, 4, 5, 6, 6, 8, 8, 9, 10),
                        TreeNode.of(1, 2, 4, 5, 6, 6, 8, 8, 9, 10), true),
                Arguments.of(TreeNode.of(1, 2, 4, 5, 6, 6, 8, 8, 9, 10),
                        TreeNode.of(2, 2, 4, 5, 6, 6, 8, 8, 9, 10), false)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testSsSameTree(TreeNode firstTree, TreeNode secondTree, boolean expected) {
        Assertions.assertEquals(expected, sameTree.isSameTree(firstTree, secondTree));
    }

}