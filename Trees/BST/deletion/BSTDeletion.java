package com.java.learn.ds.tree.bst.deletion;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.deletion.BST;

public class BSTDeletion{
public static void main(String... tree){
 BST bst = new BST();
 int[] arr = new int[]{100,50,200,25,10,75,90,99,150,300};

 for(int i=0; i<arr.length; i++)
     bst.rootPtr = bst.insert(bst.rootPtr, new Node(arr[i]));

 System.out.println("\n\nPreorder of tree : ");
 preOrder(bst.rootPtr);

 bst.rootPtr = bst.delete(bst.rootPtr, 99);
 System.out.println("\n\nPreorder of tree : ");
 preOrder(bst.rootPtr);

 bst.rootPtr = bst.delete(bst.rootPtr, 75);
 System.out.println("\n\nPreorder of tree : ");
 preOrder(bst.rootPtr);

 bst.rootPtr = bst.delete(bst.rootPtr, 25);
 System.out.println("\n\nPreorder of tree : ");
 preOrder(bst.rootPtr);


 bst.rootPtr = bst.delete(bst.rootPtr, 100);
 System.out.println("\n\nPreorder of tree : ");
 preOrder(bst.rootPtr);
}

public static void preOrder(Node root){
 if(root == null)
	return;
 else{
	System.out.print(root.data+"\t");
	preOrder(root.left);
 	preOrder(root.right);
 }
}

}