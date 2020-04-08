package com.milind.com.milind.puzzler.Linklist;

/**
 * Created by deobhank on 3/9/2015.
 */
public class LinkedList {


    private Node root;
    int size =0;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public  void createLinkList(Object [] arr){
        if(arr.length>0){
            this.root= new Node(arr[0],null);
            size++;
        }
        Node temp = root;
        for(int i=1 ; i<arr.length; i++){
            Node current = new Node(arr[i],null);
            temp.setNext(current);
            temp = current;
            size++;
        }
    }

    public void traverse(Node root){
        if(root.getNext() !=null){
            System.out.print(root.getItem());
            System.out.print("-->");
            traverse(root.getNext());
        }else{
            System.out.print(root.getItem());
        }
    }
}
