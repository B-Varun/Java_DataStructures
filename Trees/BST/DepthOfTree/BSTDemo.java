package com.java.learn.ds.tree.bst;

public class BSTDemo{
public static void main(String... bST){
BST bst = new BST();
int[] array = new int[]{100,20,300,4,50,260,700};

for(int i=0; i<array.length; i++)
      bst.rootPtr = bst.insert(bst.rootPtr, new Node(array[i]));

System.out.println("Depth of the node 260 is : "+BST.depth(bst.rootPtr, 260));

System.out.println("Height of the tree is : "+BST.height(bst.rootPtr));

}

}