package com.java.learn.ds.stack.examples;

public class StackArr{

int size = 10;
int top = -1;
int[] arr = new int[size];

public void push(int ele){
 if(isOverFlow())
	return;
 arr[++top] = ele;
}

public int pop(){
 if(isUnderFlow())
	return -1;
 return arr[top--];
}

public boolean isOverFlow(){
 if((top+1) == size){
	System.out.println("Stack Overflow");
	return true;
 }
 return false;
}

public boolean isUnderFlow(){
 if(top == -1){
	System.out.println("Stack Underflow");
	return true;
 }
return false;
}

public int peek(){
 if(top == -1)
	return -1;
 return arr[top];
}

}