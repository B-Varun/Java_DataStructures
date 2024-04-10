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

/*public void insert(int data){
Node h;
if( h == null)
  h = new Node(data);
else{
 while(h!=null){
   h = h.next;
 }
}
}
*/

public void delete(){}

public Node head(){
 return head;
}

public boolean isEmpty(){
return (head == null) ? true : false;
}

public void printList(){
 Node h = head;
 System.out.println("\n\nElements of the list are : ");
 while(h!=null){
  System.out.println(h.data);
  h = h.next;
 }
}

public static void main(String... args){
System.out.println("Linked List");
LinkedList list = new LinkedList();
System.out.println("Is the list empty : "+list.isEmpty());
list.printList();
/*
System.out.println(list.head());
list.insert(20);
list.insert(30);
list.insert(40);
list.insert(50);
list.insert(60);
list.insert(70);
list.printList();
*/
System.out.println("Is the list empty : "+list.isEmpty());

}

}