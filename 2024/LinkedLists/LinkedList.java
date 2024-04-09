package com.learn.ds.list;

class Node{
public int data;
public Node next;

public Node(int data, Node next){
this.data = data;
this.next = next;
}

}

public class LinkedList{
Node node=null, head = null;

public LinkedList(int d, Node n){
 node = new Node(d, n);
}

public void insert(){}

public void delete(){}

public void setHead(){}

public Node head(){
 return head;
}

public static void main(String... args){
System.out.println("Linked List");
}

}