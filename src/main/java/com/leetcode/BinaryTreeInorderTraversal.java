package com.leetcode;

import com.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

// left-root-right
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            inorderTraversal(root, result);
        }
        return result;
    }

    private void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root.left != null) {
            inorderTraversal(root.left, result);
        }

        result.add(root.val);

        if (root.right != null) {
            inorderTraversal(root.right, result);
        }
    }

}
