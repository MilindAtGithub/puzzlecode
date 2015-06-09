package com.milind.binarytree.node;

/**
 * Created by deobhank
 * Node Class which can be used to create the tree
 */
public class Node {

    private Node left;
    private Node right;
    private Object value;

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

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node(Object value) {
        this.value = value;
    }

    public Node() {
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
