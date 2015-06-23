package com.milind.sorted_double_link_list;

import com.milind.stack.Node;

/**
 * Created by deobhank on 6/20/2015.
 */
public class TestSortedDoubleList {

    public static void main(String args[]){

        Node head = new Node(5);
        SortedDoubleLinkList sortedDoubleLinkList = new SortedDoubleLinkList();
        sortedDoubleLinkList.insert(5,null);
        sortedDoubleLinkList.insert(8,sortedDoubleLinkList.getHeadNode());
        sortedDoubleLinkList.insert(7,sortedDoubleLinkList.getHeadNode());
        sortedDoubleLinkList.insert(6,sortedDoubleLinkList.getHeadNode());
        sortedDoubleLinkList.insert(4,sortedDoubleLinkList.getHeadNode());
        sortedDoubleLinkList.insert(40,sortedDoubleLinkList.getHeadNode());
        sortedDoubleLinkList.insert(4,sortedDoubleLinkList.getHeadNode());
        sortedDoubleLinkList.displayList(sortedDoubleLinkList.getHeadNode());


    }
}
