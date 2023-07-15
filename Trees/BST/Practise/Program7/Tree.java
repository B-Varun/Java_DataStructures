package com.java.practise.ds.tree.traversal.bfs;
import com.java.practise.node.Node;
public class Tree{
public Node rootP = null;

public Node insert(Node root, int data){
if(root == null){
 Node node = new Node(data);
 root = node;
}
else if(root.data >= data)
 root.left = insert(root.left, data);
else
 root.right = insert(root.right, data);
return root;
}

public boolean isEmpty(){
 return (rootP == null) ? true : false;
}
}