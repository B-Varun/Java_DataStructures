package com.java.learn.ds.stack;

import com.java.learn.ds.list.LinkedList;

class Node{
Object data;
Node next;

Node(Object data){
 this.data = data;
 this.next = null;
}
}

public class StackLinkedList{

public Node top = null;

public void push(Object ele){
 Node newNode = new Node(ele); 
 newNode.next = top;
 top = newNode;
}

public Object pop(){
if(isUnderFlow()){
System.out.println("Stack Underflow!");
 return null;
}
 Object ch = top.data;
 top = top.next;
 return ch;
}

public boolean isUnderFlow(){
 return (top==null) ? true : false;
}

public Object peek(){ 
 return top;
}

}