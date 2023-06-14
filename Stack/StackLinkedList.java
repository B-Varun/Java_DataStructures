package com.java.learning.data.structures.stack;

import com.java.learning.data.structures.Node;

public class StackLinkedList{

public Node head = null;

public int peek(){
return head.data;
}

public void push(int data){
Node temp = new Node(data);
temp.next = head;
head = temp;
}

public int pop(){
int deleted = head.data;
head = head.next;
return deleted;
}

public static void main(String... args){
StackLinkedList list = new StackLinkedList();
list.push(1);
System.out.println("The peek element of the list is : "+list.peek());
list.push(2);
list.push(3);
list.push(4);
list.push(5);
System.out.println("The peek element of the list is : "+list.peek());
System.out.println("The deleted element is : "+list.pop());
System.out.println("The peek element of the list is : "+list.peek());

System.out.println("The deleted element is : "+list.pop());
System.out.println("The peek element of the list is : "+list.peek());


System.out.println("The deleted element is : "+list.pop());
System.out.println("The peek element of the list is : "+list.peek());

}
}