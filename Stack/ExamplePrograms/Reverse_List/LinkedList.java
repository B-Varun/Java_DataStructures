package com.java.learn.ds.list;

public class LinkedList{

public Node head = null;

public void add(int data){
Node temp = head;
Node newNode = new Node(data);
if(temp == null)
{
 head = newNode;
 return;
}
while(temp.next != null)
 temp = temp.next;

temp.next = newNode;
}

//public void delete(){}

public void print(){
Node temp = head;
System.out.print("The elements of the list are: ");
if(temp == null){
 System.out.println("The list is empty");
 return;
}
while(temp != null){
 System.out.print(temp.data+"\t");
 temp = temp.next;
}
System.out.println();
}
}