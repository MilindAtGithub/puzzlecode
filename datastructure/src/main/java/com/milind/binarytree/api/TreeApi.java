package com.milind.binarytree.api;

import com.milind.binarytree.node.Node;
import com.milind.com.milind.puzzler.Linklist.LinkedList;

import java.util.Stack;

/**
 * Created by deobhank on 6/10/2015.
 */
public class TreeApi {

    /**
     * This will find out the depth of the tree
     * @param root
     * @param depth
     * @return
     */
    public int depthOfTree(Node root, int depth){

        int leftdepth = depth;
        int rightdepth = depth;
        if(root.getLeft() !=null){
            leftdepth = depthOfTree(root.getLeft(),depth+1);
        }
        else if(root.getRight() !=null){

            rightdepth = depthOfTree(root.getRight(), depth+1);
        }
        return (leftdepth > rightdepth) ? leftdepth : rightdepth;
    }

    /**
     * This will count the number of nodes
     * @param root
     * @return
     */
    public int countNode(Node root){

        if(root == null){
            return 0;
        } else {
            return countNode(root.getLeft())+1+ countNode(root.getRight());
        }
    }

    Stack<Integer> localStack = new Stack<Integer>();
    public int getMinValue(Node root){
        if(root == null){
            return 0;
        }
        traverseForMinVal(root);
        return localStack.pop();
    }

    private void traverseForMinVal(Node root){
        if(root.getRight()!=null){
            traverseForMinVal(root.getRight());
        }
        if(root.getLeft()!=null){
            traverseForMinVal(root.getLeft());
        }
        Node n = root;
        if(localStack.isEmpty()){
            localStack.push(new Integer(n.getValue().toString()));
        } else{
            int temp = Integer.parseInt(localStack.pop().toString());
            if(temp <Integer.parseInt(n.getValue().toString())){
                localStack.push(temp);
            }else{
                localStack.push(Integer.parseInt(n.getValue().toString()));
            }
        }
    }

    /**
     * This will check if the binary tree is BST or not
     * @param root
     * @return
     */
    public boolean isBST(Node root){

        if(root == null){
            return true;
        }
        if(root.getLeft()!=null && Integer.parseInt(root.getLeft().getValue().toString())> Integer.parseInt(root.getValue().toString())){
            return false;
        }
        if(root.getRight()!=null && Integer.parseInt(root.getRight().getValue().toString())< Integer.parseInt(root.getValue().toString())){
            return false;
        }
        return (isBST(root.getLeft())&& isBST(root.getRight()));
    }

    public Node mirrorTree(Node root){

        if(root == null){
            return null;
        }

        Node temp = new Node(root.getValue());
        temp.setLeft(mirrorTree(root.getRight()));
        temp.setRight(mirrorTree(root.getLeft()));
        return temp;
    }

    public void nodeAtEachLevel(Node root){

        if(root == null){
            return;
        }
        java.util.LinkedList <Node> linkedList = new java.util.LinkedList<Node>();
        linkedList.addLast(root);
        Node marker = new Node();
        linkedList.addLast(marker);
        int level =1;
        while ( !linkedList.isEmpty()){

            Node n = linkedList.remove();
            if(n== marker){
                if(linkedList.isEmpty()){
                    break;
                }
                level++;
                linkedList.addLast(marker);
                continue;
            }
            System.out.println(" Level :"+level+" Node :"+n.getValue());
            if(n.getLeft()!=null){
                linkedList.addLast(n.getLeft());
            }
            if(n.getRight() !=null){
                linkedList.addLast(n.getRight());
            }
        }

    }

}
