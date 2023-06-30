package com.java.practise.ds.tree.bst.demo;

import com.java.practise.ds.node.Node;
import com.java.practise.ds.tree.bst.BST;
import com.java.practise.ds.queue.Queue;

public class BSTDemo{

public static void main(String... tree){
BST bst = new BST();
int[] arr = new int[]{100,50,75,25,35,5,200,150,300,90,99};

for(int i=0; i<arr.length; i++)
 bst.rootPtr = bst.insert(bst.rootPtr, new Node(arr[i]));

System.out.print("\nPreOrder of the bst is : ");
preOrder(bst.rootPtr);

System.out.print("\nPostOrder of the bst is : ");
postOrder(bst.rootPtr);

System.out.print("\nInOrder of the bst is : ");
inOrder(bst.rootPtr);
System.out.println();

breadthFirstTraversal(bst.rootPtr);

System.out.println();
System.out.println();

System.out.println("Height of the tree is : "+height(bst.rootPtr));

System.out.println("Depth of the node 99 is : "+depth(bst.rootPtr, 99));

System.out.println("Deleting 99");
breadthFirstTraversal(bst.rootPtr);


System.out.println("\nIS tree a BST : "+isBST(bst.rootPtr));

System.out.println("InOrderSuccessor for 35 is : "+inOrderSuccessor(bst.rootPtr,bst.rootPtr,  35));

System.out.println("InOrderSuccessor for 150 is : "+inOrderSuccessor(bst.rootPtr,bst.rootPtr, 150));

System.out.println("InOrderSuccessor for 90 is : "+inOrderSuccessor(bst.rootPtr,bst.rootPtr, 90));
}

public static int max(int a, int b){
return (a>b) ? a : b;
}

public static int height(Node root){
if(root == null)
	return -1;
return max(height(root.left), height(root.right))+1;
}

public static int depth(Node root, int data){
if(root == null)
	return -1;
else if(root.data > data)
	return 1+depth(root.left, data);
else if(root.data < data)
	return 1+depth(root.right, data);
else
	return 0;
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

public static void breadthFirstTraversal(Node root){
Queue queue = new Queue();
queue.enqueue(root);

System.out.println("Level Order Traversal of BST is :");

while(!queue.isEmpty()){
 Node node = queue.front(); 
 if(node.left != null)
	queue.enqueue(node.left);
 if(node.right != null)
	queue.enqueue(node.right);
 System.out.print(queue.dequeue().data+"\t");
}
}

public static boolean isBST(Node root){
if((root == null) || (root.left == null && root.right == null))
	return true;
else if((root.right == null) && (root.data >= root.left.data))
	return isBST(root.left);
else if((root.left == null) && (root.data < root.right.data))
	return isBST(root.right);
else if((root.data < root.right.data) && (root.data >= root.left.data))
 return isBST(root.left) && isBST(root.right);
else 
	return false;
}

public static boolean isBSTRec(Node root){
if(root == null)
	return false;
else
	return isLeftSubTreeLess(root.left, root.data) && isRightSubTreeGreat(root.right, root.data);
}

public static boolean isLeftSubTreeLess(Node root, int data){
if(root == null)
	return true;
else if(root.data <= data)
	return isLeftSubTreeLess(root.left, root.data) && isRightSubTreeGreat(root.right, root.data);
else 
	return false;
}

public static boolean isRightSubTreeGreat(Node root, int data){
if(root == null)
	return true;
else if(root.data > data)
	return isLeftSubTreeLess(root.left, root.data) && isRightSubTreeGreat(root.right, root.data);
else 
	return false;
}

public static int inOrderSuccessor(Node root, Node temp, int data){
if(root == null)
	return -1;
else if(temp.data > data)
	return inOrderSuccessor(root, temp.left, data);
else if(temp.data < data)
	return inOrderSuccessor(root, temp.right, data);
else{
	if(temp.right != null)
		return leftChildAsSuccessor(temp.right);
	else
		return nearestAnchestor(root, temp);
}
}

public static int leftChildAsSuccessor(Node root){
while(root.left != null)
	root = root.left;
return root.data;
}

public static int nearestAnchestor(Node root, Node curr){
Node path = root;
Node successor = null;

while(path != curr){
 if(path.data > curr.data){
	successor = path;
	path = path.left;
 } else if(path.data < curr.data)
	path = path.right;
 
}
return successor.data;
}

}