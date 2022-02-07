package com.domain;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode of(int... nodeValues) {
        TreeNode result = null;
        if (nodeValues != null) {
            result = new TreeNode(nodeValues[0]);
            for (int i = 1; i < nodeValues.length; i++) {
                result.insert(nodeValues[i]);
            }
        }
        return result;
    }

    public void insert(int val) {
        if (this.val > val) {
            if (this.left == null) {
                this.left = new TreeNode(val);
            } else {
                this.left.insert(val);
            }
        } else {
            if (this.right == null) {
                this.right = new TreeNode(val);
            } else {
                this.right.insert(val);
            }
        }
    }
}
