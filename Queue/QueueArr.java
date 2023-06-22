package com.java.learn.ds.queue;

class Queue{
int size = 10;
int[] arr = new int[size];
int front, rear;

public Queue(){
 front = rear = -1;
}

public void enqueue(int num){
 if(isEmpty()){
	++front;
	arr[++rear] = num;
 }
 else if(!isFull())
	 arr[++rear] = num;	
 else
	System.out.println("Queue is Full");
}

public int dequeue(){
 if(isEmpty()){
	System.out.println("Queue is empty");
 	return -1;
 }
 else{
	int ele = arr[front++];
	return ele;
 }
}

public boolean isEmpty(){
 return (front == -1 && rear == -1) ? true : false;
}

public boolean isFull(){
 return (rear+1 == size) ? true : false;
}

public int front(){
 return (front != -1) ? arr[front] : -1;
}

public int rear(){
 return (rear != -1) ? arr[rear] : -1;
}

public void print(){
 int pointer = front;
 if(isEmpty()){
	 System.out.println("Queue is empty");
	 return;
 }
 else{
	System.out.print("Elements of the queue are : ");
 	while(pointer <= rear)
		System.out.print(arr[pointer++]+"\t");
	System.out.println();
 }
}

}

public class QueueArr{

public static void main(String... prog){
 Queue queue = new Queue();
 queue.print();
 queue.enqueue(1);
 queue.enqueue(2);
 queue.enqueue(3);
 queue.enqueue(4);
 queue.enqueue(5);
 queue.print();
}

}