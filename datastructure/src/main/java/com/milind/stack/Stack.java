package com.milind.stack;

import com.milind.puzzler.LRU.DoubleLinkedListNode;

/**
 * Created by deobhank on 6/20/2015.
 */
public class Stack {

    private Node tail;

    /**
     * Pushing the node into the stack
     * @param value
     */
    public void push (Object value){

        if(tail == null){
            tail = new Node(value);
        } else {
            Node temp = new Node(value);
            tail.setNext(temp);
            temp.setPrev(tail);
            tail = temp;
        }
    }

    public  Object pop (){
        if(tail == null){
            return null;
        }
        Node temp = tail;
        if(tail.getPrev() != null){
            tail.getPrev().setNext(null);
            temp = tail;
            tail= tail.getPrev();
        }else {
            tail = null;
        }
        return  temp.getValue();
    }
}
