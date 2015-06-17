package com.milind.puzzler.LRU;

/**
 * Created by deobhank on 3/12/2015.
 */
public class DoubleLinkedListNode {

    private  int value;
    private  int key;
    private DoubleLinkedListNode next;
    private DoubleLinkedListNode prev;

    public DoubleLinkedListNode(int key, int value) {
        this.value = value;
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public DoubleLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }

    public DoubleLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedListNode prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
