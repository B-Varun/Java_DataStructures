package com.java.learn.ds.tree.bst;

public class BSTDemo{
public static void main(String... tree){
BST bst = new BST();
int[] array = new int[]{100,20,300,4,50,200,700,1,9,30,90,0};
for(int i=0; i<array.length ;i++)
bst.rootPtr = bst.insert(bst.rootPtr, new Node(array[i]));

System.out.println("Height of the BST is : "+BST.height(bst.rootPtr));
}

}