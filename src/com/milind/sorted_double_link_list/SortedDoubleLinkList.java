package com.milind.sorted_double_link_list;

import com.milind.stack.Node;

/**
 * Created by deobhank on 6/20/2015.
 */
public class SortedDoubleLinkList {

    private Node headNode;

    /** This will insert the value in sorted order
     *
     * @param value
     */
    public void insert(Integer value, Node head){


        if(head == null) {
            head = new Node(value);
            this.headNode =head;
            return;
        }
        if (value <= (Integer)head.getValue()) {
            head = new Node(value);
            this.headNode.setPrev(head);
            head.setNext(this.headNode);
            this.headNode= head;
            return;
        }

        if(head.getNext()!=null) {
            Node tempNode = head.getNext();
            if(value <= (Integer) head.getNext().getValue()&& value > (Integer) tempNode.getPrev().getValue()) {
                Node temp = new Node(value);
                head.setNext(temp);
                temp.setPrev(head);
                temp.setNext(tempNode);
                tempNode.setPrev(temp);

            } else {
                insert(value,head.getNext());
            }

        }
        if(head.getNext()== null){
            Node temp = new Node(value);
            head.setNext(temp);
            temp.setPrev(head);
        }
    }

    /**
     * Display Node
     * @param head
     */
    public void  displayList(Node head){

        if(head == null ){
            return;
        } else {
            System.out.print(head.getValue() + " -->");
            displayList(head.getNext());
        }
    }

    public Node getHeadNode(){
        return  this.headNode;
    }
}
