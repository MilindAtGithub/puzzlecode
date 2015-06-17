package com.milind.puzzler.LRU;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by deobhank on 3/12/2015.
 *  This is the least recently used cache code based on the double linked list
 */
public class LRUCache {

    private Map<Integer, DoubleLinkedListNode> map = new HashMap<Integer, DoubleLinkedListNode>();
    private int capacity;
    private int len;
    private DoubleLinkedListNode head;
    private  DoubleLinkedListNode end;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        len =0;
    }

    /**
     * This will add the value
     * @param key
     * @param value
     */
    public void add(int key, int value){

        //First check if it is present in Map
        if(map.containsKey(key)){

            DoubleLinkedListNode oldNode = map.get(key);
            // Assign the value to this node
            oldNode.setValue(value);
            // Make this node first in the double linked list
            // Remove and set it as head.
            rearrange(oldNode);
        } else{
            //If it is not present in Map
            // First create the node
            DoubleLinkedListNode newNode = new DoubleLinkedListNode(key,value);
            // Check for capacity
            if(len < capacity){
                // Every thing fine insert in map after setting it as head
                setHead(newNode);
                map.put(key,newNode);
                len++;
            } else{
                // Needs to remove the least one
                map.remove(end.getKey());
                // Make the pre as end
                end = end.getPrev();
                if(end !=null){
                    end.setNext(null);
                }
                setHead(newNode);
                map.put(key,newNode);
            }

        }
    }


    private void rearrange(DoubleLinkedListNode node){

        //First Remove the node from the list.
        DoubleLinkedListNode next = node.getNext();
        DoubleLinkedListNode prev = node.getPrev();

        if(prev !=null){

            prev.setNext(next);
        }else{
            head = next;
        }

        if(next !=null){

            next.setPrev(prev);
        }else{
            end=next;
        }

        // Setting the node as head
        setHead(node);
    }

    private  void setHead( DoubleLinkedListNode node){

        node.setNext(head);
        node.setPrev(null);
        if(head !=null){
            head.setPrev(node);
        }
        head=node;
        if(end == null){
            end = node;
        }
    }

    /**
     * Getting the key
     * @param key
     * @return
     */
    public int get(int key){

        DoubleLinkedListNode node = map.get(key);
        if(node == null){
            return -1;
        } else{
            rearrange(node);
            return node.getValue();
        }
    }
}
