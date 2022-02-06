package com.datastructures.algorithms.trees;

public class BinarySearchTree {

    private Node root;

    public void insert(int... data) {
        for (int input: data) {
            insert(input);
        }
    }

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            root.insert(data);
        }
    }

    public Node find(int data) {
        Node result = null;
        if (root != null) {
            result = root.find(data);
        }

        return result;
    }

    public void softDelete(int input) {
        // Soft delete
        Node nodeToDelete = find(input);
        nodeToDelete.setDeleted(true);
    }

    public void delete(int input) {

        Node current = root;
        Node parent = root;
        boolean isLeft = true;
        while (current != null && current.data != input) {
            parent = current;
            if (current.data > input) {
                current = current.left;
            } else {
                current = current.right;
                isLeft = false;
            }
        }

        if (current != null) {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeft) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left != null && current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    parent.left = current.left;
                }
            } else if (current.right != null && current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    parent.right = current.right;
                }
            } else {
                Node successor = current.right;
                Node successorParent = current;
                while (successor.left != null && successor.right != null) {
                    successorParent = successor;
                    successor = successor.left;
                }

                successorParent.left = null;
                if (successor.right != null) {
                    successorParent.left = successor.right;
                    successor.right = null;
                }
                successor.left = current.left;
                successor.right = current.right;


                if (current == root) {
                    root = successor;
                } else {
                    if (isLeft) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }

            }
        }

    }

    @Override
    public String toString() {
        return toStringOrder(Order.IN_ORDER);
    }

    public String toStringPreOrder() {
        return toStringOrder(Order.PRE_ORDER);
    }

    public String toStringPostOrder() {
        return toStringOrder(Order.POST_ORDER);
    }

    public String toStringOrder(Order order) {
        StringBuilder toStringBuilder = new StringBuilder("[");
        if (root != null) {
            StringBuilder innerStringBuilder = new StringBuilder();
            switch (order) {
                case IN_ORDER:
                    inOrder(root, innerStringBuilder);
                    break;
                case PRE_ORDER:
                    preOrder(root, innerStringBuilder);
                    break;
                case POST_ORDER:
                    postOrder(root, innerStringBuilder);
                    break;
            }
            toStringBuilder.append(innerStringBuilder.substring(0, innerStringBuilder.length() - 2));
        }
        toStringBuilder.append("]");
        return toStringBuilder.toString();
    }

    private void inOrder(Node current, StringBuilder toStringBuilder) {
        if (current.left != null) {
            inOrder(current.left, toStringBuilder);
        }
        if (!current.isDeleted) {
            toStringBuilder.append(current.data).append(", ");
        }
        if (current.right != null) {
            inOrder(current.right, toStringBuilder);
        }
    }

    private void preOrder(Node current, StringBuilder toStringBuilder) {
        toStringBuilder.append(current.data).append(", ");
        if (current.left != null) {
            preOrder(current.left, toStringBuilder);
        }
        if (current.right != null) {
            preOrder(current.right, toStringBuilder);
        }
    }


    private void postOrder(Node current, StringBuilder toStringBuilder) {
        if (current.left != null) {
            postOrder(current.left, toStringBuilder);
        }
        if (current.right != null) {
            postOrder(current.right, toStringBuilder);
        }
        toStringBuilder.append(current.data).append(", ");
    }

    private enum Order {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }


    public class Node {
        public int data;
        public Node left;
        public Node right;
        private boolean isDeleted;

        public Node(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public boolean isDeleted() {
            return isDeleted;
        }

        public void setDeleted(boolean deleted) {
            isDeleted = deleted;
        }

        public Node find(int input) {
            Node result = null;
            if (this.data == input && !this.isDeleted()) {
                result = this;
            } else {
                if (input < this.data && this.left != null) {
                    result = this.left.find(input);
                } else if (this.right != null){
                    result = this.right.find(input);
                }
            }
            return result;
        }

        public void insert(int input) {

            if (input < this.data) {
                if (this.left == null) {
                    this.left = new Node(input);
                } else {
                    this.left.insert(input);
                }
            } else {
                if (this.right == null) {
                    this.right = new Node(input);
                } else {
                    this.right.insert(input);
                }
            }
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

}
