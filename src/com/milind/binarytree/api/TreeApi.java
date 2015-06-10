package com.milind.binarytree.api;

import com.milind.binarytree.node.Node;

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
}
