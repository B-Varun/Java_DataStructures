package com.java.learn.ds.tree.bst.traversal;

import com.java.learn.ds.tree.bst.BST;
import com.java.learn.ds.node.Node;

public class PostOrderTraversal{

public static void main(String... tree){
 BST bst = new BST();
 int[] arr = new int[]{100, 20, 300, 4, 50, 260, 700};

 for(int i=0; i<arr.length; i++)
      bst.rootPtr = bst.insert(bst.rootPtr, new Node(arr[i]));

 System.out.println("Post order of the BST is :");
 postOrder(bst.rootPtr);
}

public static void postOrder(Node root){
 if(root == null)
	return;
 else{
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.data+"\t"); 
 }
}

}
