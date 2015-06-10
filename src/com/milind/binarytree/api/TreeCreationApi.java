package com.milind.binarytree.api;

import com.milind.binarytree.node.Node;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by deobhank on 6/9/2015.
 */
public class TreeCreationApi {

    private boolean insertedInLeft;
    private Node root;
    private Node next;
    private LinkedList<Node> leftStack;
    private LinkedList<Node> rightStack;

    public TreeCreationApi(Node root) {
        this.root = root;
        this.next = root;
        this.leftStack = new LinkedList<Node>();
        this.rightStack = new LinkedList<Node>();
    }

    public void insertNode(Node node) {
        if (!insertedInLeft) {
            if (!leftStack.isEmpty()) {
                next = leftStack.removeFirst();
            }
            insertedInLeft = true;
            boolean inserted = false;
            if (next.getLeft() == null) {
                next.setLeft(node);
                inserted=true;
            } else if (next.getRight() == null) {
                next.setRight(node);
                inserted=true;

            }
            if(!inserted) {
                next = next.getLeft();
                insertNode(node);
            }
            if(next.getLeft()!=null && next.getRight()!=null){
                if(!next.equals(root))
                leftStack.addLast(next.getLeft());
                leftStack.addLast(next.getRight());
            }else{
                if(next.equals(root)){
                    leftStack.push(node);
                }else{
                    leftStack.push(next);
                }

            }

        } else {
            if (!rightStack.isEmpty()) {
                next = rightStack.removeFirst();
            }
            insertedInLeft = false;
            boolean inserted = false;
            if (next.getRight() == null) {
                 next.setRight(node);
                inserted=true;

            } else if (next.getLeft() == null) {
                next.setLeft(node);
                inserted=true;

            }
            if(!inserted){
                next = next.getRight();
                insertNode(node);
            }
            if(next.getLeft()!=null && next.getRight()!=null){
                if(!next.equals(root))
                rightStack.addLast(next.getLeft());
                rightStack.addLast(next.getRight());
            }else{
                if(next.equals(root)){
                    rightStack.push(node);
                }else{
                    rightStack.push(next);
                }

            }

        }

    }
}
