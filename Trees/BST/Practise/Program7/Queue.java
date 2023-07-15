package com.java.practise.ds.queue;
import com.java.practise.node.Node; 
public class Queue{
public int rear, front;
private int size=10;
public Node[] arr;

public Queue(){
arr = new Node[size];
front = rear = -1;
}

public void enqueue(Node node){
 if(isFull())
    return;
 else if(isEmpty()){
   front = rear = 0;
   arr[rear] = node;
  }
else
 arr[++rear] = node; 
}

public Node dequeue(){
 if(isEmpty())
    return null;
 if(front == rear){
    Node temp = arr[front];
    front = rear = -1;
    return temp;
  }
 Node node = arr[front++];
 return node;
}

public boolean isFull(){
 return ((rear+1) == size) ? true : false;
}

public boolean isEmpty(){
 return (rear == -1 && front == -1) ? true : false;
}

public Node front(){
 return isEmpty() ? null : arr[front];
}

public Node rear(){
 return isEmpty() ? null : arr[rear];
}
}