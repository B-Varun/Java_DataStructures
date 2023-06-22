package com.java.learn.ds.stack.examples;

public class StackArr{

int size = 10;
char[] arr = new char[size];
int top = -1;

public void push(char ch){
 if(isOverFlow()){
	System.out.println("Stack OverFlow");
	return;
 }
 arr[++top] = ch;
}

public char pop(){
 if(isUnderFlow()){
	System.out.println("Stack UnderFlow!");
	return ' ';
 }
 char ch = arr[top--];
 return ch;
}

public boolean isOverFlow(){
 return top+1 == size ? true : false;
}

public boolean isUnderFlow(){
 return top == -1 ? true : false;
}

public char peek(){
 return top == -1 ? ' ' : arr[top];
}
}