package com.java.learn.ds.stack.examples;

class Node{
char data;
Node next;
public Node(char data){
this.data = data;
this.next = null;
}
}

class StackLL{
public Node head = null;
public int top = 0, size = 5;

public void push(char ch){
 if(isOverFlow()){
    System.out.println("Stack Overflow");
    return;
 }
 Node new_Node = new Node(ch);
 new_Node.next = head;
 head = new_Node;
 top++;
}

public char pop(){
 if(isUnderFlow()){
    System.out.println("Stack Underflow");
    return ' ';
 }
 char ch = head.data;
 head = head.next;
 top--;
 return ch;
}

public boolean isOverFlow(){
 if(top == size)
  return true;
 return false;
}

public boolean isUnderFlow(){
 if(top == 0)
  return true;
 return false;
}

public char peek(){
 if(top == 0)
  return ' ';
 return head.data;
}
}