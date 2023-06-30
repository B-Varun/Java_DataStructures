package com.java.practise.ds.queue;

import com.java.practise.ds.node.Node;

public class Queue{
int size = 20;
Node[] arr = new Node[size];
int front, rear;

public Queue(){
 front = rear = -1;
}

public void enqueue(Node ele){
 if(isEmpty()){
	front = rear = 0;
	arr[rear] = ele;
 }
 else if(isFull()){
	System.out.println("Queue is full");
	return;
 }	
 else
	arr[++rear] = ele;
}

public Node dequeue(){
 if(isEmpty()){
	System.out.println("Queue is Empty");
	return null;
 }
 else if(front == rear){
	Node ele = arr[front];
	front = rear = -1;
	return ele;
 }
 else
	return arr[front++];	
}

public boolean isEmpty(){
 return (front == -1) ? true : false;
}

public boolean isFull(){
 return ((rear+1) == size) ? true : false;
}

public Node front(){
 return isEmpty() ? null : arr[front];
}

public Node rear(){
 return isEmpty() ? null : arr[rear];
}

public void print(){

 if(front == -1){
	System.out.println("Queue is empty");
	return;}
 int f = front, r = rear;
 while((f!=-1) &&(f!=r))
	System.out.print(arr[f++].data+"\t");
 if(f!=-1)
 System.out.print(arr[f].data);
System.out.println("\n_______________________________\n");
}
}