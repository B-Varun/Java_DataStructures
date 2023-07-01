package com.java.practise.ds.tree.bst.demo;

import com.java.practise.ds.node.Node;
import com.java.practise.ds.tree.bst.BST;
import com.java.practise.ds.queue.QueueLL;
import com.java.practise.ds.node.queue.NodeLL;

public class BSTDemo{
public static void main(String... tree){
BST bst = new BST();
int[] arr = new int[]{100,50,200,25,75,150,35,5,90,99,300};

for(int i=0; i<arr.length; i++)
 bst.rootP = bst.insert(bst.rootP, new Node(arr[i]));

breathFirstSearch(bst.rootP);
System.out.println("\nPreOrder of the bst is :");
preOrder(bst.rootP);
System.out.println("\nPostOrder of the bst is :");
postOrder(bst.rootP);
System.out.println("\nInOrder of the bst is :");
inOrder(bst.rootP);

System.out.println("\nHeight of bst is :"+height(bst.rootP));
System.out.println("\nDepth of 200 is :"+depth(bst.rootP, 200));
System.out.println("\nDepth of 300 is :"+depth(bst.rootP, 300));
System.out.println("\nDepth of 99 is :"+depth(bst.rootP, 99));

System.out.println("\nIs it a bst :"+isBst(bst.rootP));
System.out.println("\nIs it a bst :"+isBST(bst.rootP));

System.out.println("Inorder successor of the node 99 is : "+inOrderSucccessor(bst.rootP, bst.rootP, 99));
System.out.println("Inorder successor of the node 25 is : "+inOrderSucccessor(bst.rootP, bst.rootP, 25));
System.out.println("Inorder successor of the node 5 is : "+inOrderSucccessor(bst.rootP, bst.rootP, 5));
System.out.println("Inorder successor of the node 150 is : "+inOrderSucccessor(bst.rootP, bst.rootP, 150));

}

public static int inOrderSucccessor(Node root, Node temp, int data){
if(temp == null)
	return -1;
else if(temp.data > data)
	return inOrderSucccessor(root, temp.left, data);
else if(temp.data < data)
	return inOrderSucccessor(root, temp.right, data);
else{
	if(temp.right == null)
		return ancestor(root, temp);
	else
		return successor(temp.right);
}
}

public static int ancestor(Node root, Node curr){
 Node successor = null;
 Node temp = root;
 
 while(temp != curr){
	if(temp.data > curr.data){
		successor = temp;
		temp = temp.left;
	}
	else
		temp = temp.right;
}
return successor.data;
}


public static int successor(Node root){
if(root.left == null)
	return root.data;
else 
	return successor(root.left);
}

public static boolean isBst(Node root){
if((root == null) || (root.left == null && root.right == null))
	return true;
else if((root.left == null) && (root.right.data > root.data))
	return isBst(root.right);
else if((root.right == null) && (root.left.data < root.data))
	return isBst(root.left);
else if((root.left.data < root.data) && (root.right.data > root.data))
	return isBst(root.left) && isBst(root.right);
else 
	return false;
}

public static boolean isBST(Node root){
if(root == null)
	return true;
else 
	return isLeftLess(root.left, root.data) && isRightGreat(root.right, root.data);
}

public static boolean isLeftLess(Node root, int data){
if(root == null)
	return true;
else if(root.data < data)
	return isLeftLess(root.left, root.data) && isRightGreat(root.right, root.data);
else
	return false;
}

public static boolean isRightGreat(Node root, int data){
if(root == null)
	return true;
else if(root.data > data)
	return isLeftLess(root.left, root.data) && isRightGreat(root.right, root.data);
else 
	return false;
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

public static int depth(Node root, int data){
if(root == null)
	return -1;
else if(root.data == data)
	return 0;
else if(root.data > data)
	return depth(root.left, data)+1;
else 
	return depth(root.right, data)+1;
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

public static void inOrder(Node root){
if(root == null)
	return;
else{
 preOrder(root.left);
 System.out.print(root.data+"\t");
 preOrder(root.right);
}
}

public static void postOrder(Node root){
if(root == null)
	return;
else{
 preOrder(root.left);
 preOrder(root.right);
 System.out.print(root.data+"\t");
}
}

public static void breathFirstSearch(Node root){
if(root == null){
 System.out.println("Tree is empty");
 return;
}

System.out.println("\nBreadth First Traversal of bst is : ");

QueueLL queue = new QueueLL();
NodeLL node = new NodeLL(root);
queue.enqueue(node);

while(!queue.isEmpty()){
node = queue.front();
Node n = node.node;
if(n.left != null)
	queue.enqueue(new NodeLL(n.left));
if(n.right != null)
	queue.enqueue(new NodeLL(n.right));
System.out.print(node.node.data+"\t");
queue.dequeue();
}

}


}
