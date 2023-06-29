/**
Deletion with inorder successor fails in this program
*/

package com.java.practise.ds.tree.bst.demo;

import com.java.practise.ds.tree.bst.BST;
import com.java.practise.ds.node.Node;
import com.java.practise.ds.queue.Queue;

public class BSTDemo{

public static void main(String... tree){
 BST bst = new BST();
 int[] arr = new int[]{100,50,25,10,75,90,99,200,150,300};

 for(int i=0; i<arr.length; i++)
	bst.rootPtr = bst.insert(bst.rootPtr, new Node(arr[i]));

 levelOrder(bst.rootPtr);

 System.out.println("\n\nPreOrder Traversal of BST is : ");
 preOrder(bst.rootPtr);
 
 System.out.println("\n\nInOrder Traversal of BST is : ");
 inOrder(bst.rootPtr);

 System.out.println("\n\nPostOrder Traversal of BST is : ");
 postOrder(bst.rootPtr);

 System.out.println("\nMinimum value of the BST is "+bst.findMin(bst.rootPtr));

 System.out.println("\nMaximum value of the BST is "+bst.findMax(bst.rootPtr)); 

 System.out.println("\nDepth of the node 99 is : "+depth(bst.rootPtr, 99)); 
 
 System.out.println("\nDepth of 300 is : "+depth(bst.rootPtr, 300));

 System.out.println("\nHeight of BST is : "+height(bst.rootPtr));

 System.out.println("\nFound node 200 in BST : "+bst.search(200));

 System.out.println("\nFound node 100 in BST : "+bst.search(100));

 System.out.println("\nFound node 500 in BST : "+bst.search(500));

 System.out.println("\nFound node 99 in BST : "+bst.search(99));

System.out.println("Is the tree a BST : "+isBST(bst.rootPtr));

System.out.println("Is the tree a BST using other method : "+isBinaryST(bst.rootPtr));

 levelOrder(bst.rootPtr);
 bst.rootPtr = bst.delete(bst.rootPtr, 99);
 levelOrder(bst.rootPtr);
 bst.rootPtr = bst.delete(bst.rootPtr, 10);
 levelOrder(bst.rootPtr);
}

public static int height(Node root){
 if(root == null)
	return -1;
 else
	return max(height(root.left), height(root.right))+1;
}

public static int max(int a, int b){
 return (a>b) ? a : b;
}

public static int depth(Node root,int data){
 Node temp = root;
 int depth=0;
 while((temp.data != data) && (temp != null)){
	if(temp.data > data)
		temp = temp.left;
	else if(temp.data < data)
		temp = temp.right;
	depth++;
 }
 return depth;
}


public static boolean isBST(Node root){
 if((root == null) || (root.left == null && root.right == null))
	return true;
 else if((root.left==null) && (root.right.data > root.data))
	return isBST(root.right);
 else if((root.right == null) && (root.left.data <= root.data))
	return isBST(root.left);
 else if((root.right.data > root.data) && (root.left.data <= root.data))
	return isBST(root.left) && isBST(root.right);
 else
	return false;
}

public static boolean isBinaryST(Node root){
 if(root == null)
	return true;
 else
	return isBLeftSubTreeLess(root.left, root.data) && isBRightSubTreeGreat(root.right, root.data);
}

public static boolean isBLeftSubTreeLess(Node root, int rootVal){
 if(root == null)
	return true;
 else if(root.data <= rootVal)
	return isBLeftSubTreeLess(root.left, root.data) && isBRightSubTreeGreat(root.right, root.data);
 else 
	return false;
}

public static boolean isBRightSubTreeGreat(Node root, int rootVal){
 if(root == null)
	return true;
 else if(root.data > rootVal)
	return isBLeftSubTreeLess(root.left, root.data) && isBRightSubTreeGreat(root.right, root.data);
 else
	return false;
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

public static void postOrder(Node root){
 if(root == null)
	return;
 else{
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.data+"\t");
 }
}

public static void inOrder(Node root){
 if(root == null)
	return;
 else{
	inOrder(root.left);
	System.out.print(root.data+"\t");
	inOrder(root.right);
 }
}

public static void levelOrder(Node root){
 Queue queue = new Queue();
 System.out.println("Breadth First Traversal of the BST is : ");
 queue.enqueue(root);

 while(!queue.isEmpty()){
	Node temp = queue.front();
	if(temp.left != null)
		queue.enqueue(temp.left);
	if(temp.right!=null)
		queue.enqueue(temp.right);
	System.out.print(queue.dequeue().data+"\t");
 }
 System.out.println();
}
}