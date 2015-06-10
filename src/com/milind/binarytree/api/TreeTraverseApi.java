package com.milind.binarytree.api;

import com.milind.binarytree.node.Node;

import java.util.LinkedList;

/**
 * Created by deobhank on 6/10/2015.
 */
public class TreeTraverseApi {

    /**
     * This is pre order traverse
     * Root, Left, Right
     * @param root
     */
    public void traversePreOrder(Node root){

        if(root == null) return;
        System.out.print(root + " -->");
        if(root.getLeft() !=null){
            traversePreOrder(root.getLeft());
        }
        if( root.getRight()!=null){
            traversePreOrder(root.getRight());
        }

    }

    /**
     * This is in order traverse
     * Left, Root, Right
     * @param root
     */
    public void traverseInOrder(Node root) {
        if(root == null) return;
        if(root.getLeft() !=null){
            traverseInOrder(root.getLeft());
        }
        System.out.print(root + " -->");
        if( root.getRight()!=null){
            traverseInOrder(root.getRight());
        }
    }

    /**
     * Post Order traverse
     * Left, Right, Root
     * @param root
     */
    public void traversePostOrder(Node root){
        if(root == null) return;
        if(root.getLeft() !=null){
            traversePostOrder(root.getLeft());
        }

        if( root.getRight()!=null){
            traversePostOrder(root.getRight());
        }
        System.out.print(root + " -->");
    }

    /**
     * This will traverse breadth wise
     * Root and then each level/depth
     * @param root
     */
    public void traverseBreadthWise(Node root){

        if(root == null) return;
        LinkedList<Node> list = new LinkedList<Node>();
        list.addLast(root);
        //Now Looping till list is empty
        while (!list.isEmpty()){
            Node node = list.remove();
            System.out.print(node + " -->");
            if(node.getLeft() !=null){
                list.addLast(node.getLeft());
            }
            if(node.getRight() !=null){
                list.addLast(node.getRight());

            }
        }
    }
}
