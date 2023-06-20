package com.java.learn.ds.stack.examples;

class Node{
int data;
Node next;

public Node(int ele){
this.data = ele;
this.next = null;
}
}

public class StackLL{

//Head pointer 
public Node top = null;

public void push(int ele){
Node temp = new Node(ele);
temp.next = top;
top = temp;
}

public int pop(){
if(isUnderFlow()){
 System.out.println("Stack UnderFlow");
 return -1;
}
int ch = top.data;
top = top.next;
return ch;
}

public boolean isUnderFlow(){
if(top == null)
 return true;
return false;
}

// For a stack implementation of Linked list I guess there will be no size. It should be dynamic. Hence OverFlow can't be appliess
//public boolean isOverFlow(){}

public int peek(){
if(top == null)
 return -1;
return top.data;
}
}