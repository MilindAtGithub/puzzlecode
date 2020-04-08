package com.milind.binarytree.api;

import com.milind.binarytree.node.Node;

import java.util.Stack;

/**
 * Created by deobhank on 6/9/2015.
 */
public class DisplayTreeApi {

    public void displayTree(Node root)
    {
        Stack <Node> globalStack = new Stack();
        globalStack.push(root);
        int emptyLeaf = 32;
        boolean isRowEmpty = false;
        System.out.println("****......................................................****");
        while(isRowEmpty==false)
        {

            Stack <Node> localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<emptyLeaf; j++)
                System.out.print(' ');
            while(globalStack.isEmpty()==false)
            {
                Node temp = globalStack.pop();
                if(temp != null)
                {
                    System.out.print(temp.getValue());
                    localStack.push(temp.getLeft());
                    localStack.push(temp.getRight());
                    if(temp.getLeft() != null ||temp.getRight() != null)
                        isRowEmpty = false;
                }
                else
                {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<emptyLeaf*2-2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            emptyLeaf /= 2;
            while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() );
        }
        System.out.println("****......................................................****");
    }
}
