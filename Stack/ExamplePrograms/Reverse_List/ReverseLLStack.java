package com.java.learn.ds.stack.examples;

import com.java.learn.ds.stack.StackLinkedList;
import com.java.learn.ds.list.LinkedList;
import com.java.learn.ds.list.Node;

public class ReverseLLStack{

public static void main(String... args){
 LinkedList list = new LinkedList();
 list.print();

 list.add(1);
 list.add(2);
 list.add(3);
 list.add(4);
 list.add(5);

System.out.println("\n\nBefore reversing the list");
 list.print();

 reverse(list);
System.out.println("\n\nAfter reversing the list");
 list.print();
}

public static void reverse(LinkedList list){
 StackLinkedList stack = new StackLinkedList();
 
// LinkedList l = new LinkedList();
 Node l = list.head;
// l.head = li;
 while(l!=null){
    stack.push(l);    
    l = l.next;
 }

 list.head = (Node)stack.pop();
 l = list.head;
 Node ch=null;
 while((ch = (Node)stack.pop())!= null){
  l.next = ch;
  l = l.next;
}
 l.next = null;
}
}