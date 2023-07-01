package com.java.practise.ds.queue;

import com.java.practise.ds.node.queue.NodeLL;
import com.java.practise.ds.node.Node;

public class QueueLL{
public NodeLL head = null;
NodeLL front, rear;

public QueueLL(){
 front = rear = null;
}

public void enqueue(NodeLL node){
if(isEmpty())
	rear = front = node;
else{
	rear.next = node;
	rear = node;
 }
}

public void dequeue(){
if(isEmpty())
	System.out.println("Queue is empty");
else if(front == rear)
	front = rear = null;	
else
	front = front.next;
}

public boolean isEmpty(){
 return (front == null) ? true : false;
}

public NodeLL front(){
 return isEmpty() ? null : front;
}

public NodeLL rear(){
 return (rear == null) ? null : rear;
}

}