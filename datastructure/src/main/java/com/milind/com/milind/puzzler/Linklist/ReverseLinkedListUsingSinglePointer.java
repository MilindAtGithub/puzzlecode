package com.milind.com.milind.puzzler.Linklist;

/**
 * Created by deobhank on 6/19/2015.
 */
public class ReverseLinkedListUsingSinglePointer {


    public static void main(String args[]){

        Integer arr[] = new Integer[]{1,2,5,7};
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkList(arr);
        linkedList.traverse(linkedList.getRoot());
       // new ReverseLinkedListUsingSinglePointer().reverseLinkedList(linkedList.getRoot());
        linkedList.traverse(new ReverseLinkedListUsingSinglePointer().reverseLinkedList(linkedList.getRoot()));
    }

    public Node reverseLinkedList(Node head){
        if(head == null){
            return null;
        } else if(head.getNext() == null){
            return head;
        }
        Node temp = reverseLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return temp;
    }
}
