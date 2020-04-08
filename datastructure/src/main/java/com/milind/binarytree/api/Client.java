package com.milind.binarytree.api;

import com.milind.binarytree.node.Node;

/**
 * Created by deobhank on 6/9/2015.
 */
public class Client {

    public static  void  main(String args[]){

        Node root = new Node("A");
        TreeCreationApi crApi = new TreeCreationApi(root);
        crApi.insertNode(new Node("B"));
        crApi.insertNode(new Node("C"));
        crApi.insertNode(new Node("D"));
        crApi.insertNode(new Node("E"));
        crApi.insertNode(new Node("F"));
        crApi.insertNode(new Node("G"));
        crApi.insertNode(new Node("H"));
        crApi.insertNode(new Node("I"));
        crApi.insertNode(new Node("J"));
        crApi.insertNode(new Node("K"));
        crApi.insertNode(new Node("L"));
        crApi.insertNode(new Node("M"));
        crApi.insertNode(new Node("N"));
        crApi.insertNode(new Node("O"));
        crApi.insertNode(new Node("P"));
        crApi.insertNode(new Node("Q"));
        crApi.insertNode(new Node("R"));
        crApi.insertNode(new Node("S"));
        crApi.insertNode(new Node("T"));
        crApi.insertNode(new Node("U"));
        crApi.insertNode(new Node("V"));
        crApi.insertNode(new Node("W"));
        crApi.insertNode(new Node("X"));
        crApi.insertNode(new Node("Y"));
        crApi.insertNode(new Node("Z"));
        crApi.insertNode(new Node("A1"));
        crApi.insertNode(new Node("A2"));
        crApi.insertNode(new Node("A3"));
        crApi.insertNode(new Node("A4"));
        crApi.insertNode(new Node("A5"));
        //crApi.insertNode(new Node("A6"));

        new DisplayTreeApi().displayTree(root);
        TreeApi treeApi = new TreeApi();
        int treedepth = treeApi.depthOfTree(root,0);
        System.out.println("Depth of Tree: "+treedepth);


        TreeTraverseApi treeTraverseApi = new TreeTraverseApi();
        System.out.print("Pre-Order Traverse: ");
        treeTraverseApi.traversePreOrder(root);
        System.out.println("");
        System.out.print("In-Order Traverse: ");
        treeTraverseApi.traverseInOrder(root);
        System.out.println("");
        System.out.print("Post-Order Traverse: ");
        treeTraverseApi.traversePostOrder(root);
        System.out.println("");
        System.out.print("Traverse Breadth Wise: ");
        treeTraverseApi.traverseBreadthWise(root);
        System.out.println("");
        System.out.println(" Number of Nodes: "+treeApi.countNode(root));

       root= treeApi.mirrorTree(root);
        new DisplayTreeApi().displayTree(root);

        Node introot = new Node(new Integer(5));
        crApi = new TreeCreationApi(introot);
        crApi.insertNode(new Node(new Integer(9)));
        crApi.insertNode(new Node(new Integer(19)));
        crApi.insertNode(new Node(new Integer(90)));
        crApi.insertNode(new Node(new Integer(94)));
        crApi.insertNode(new Node(new Integer(97)));
        crApi.insertNode(new Node(new Integer(99)));
        crApi.insertNode(new Node(new Integer(2)));
        crApi.insertNode(new Node(new Integer(1000)));
        new DisplayTreeApi().displayTree(introot);

        System.out.println("Minimum Value: " + treeApi.getMinValue(introot));
        System.out.println("Is BST: "+ treeApi.isBST(introot));
        treeApi.nodeAtEachLevel(introot);

    }
}
