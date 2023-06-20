package com.java.learn.ds.stack.examples;

public class StackArr{
int size = 5;
int[] arr = new int[size];
int top = -1;

public void push(int ele){
if(isOverFlow()){
    System.out.println("Stack OverFlow");
    return;
}
    arr[++top] = ele;
}

public int pop(){
if(isUnderFlow()){
    System.out.println("Stack UnderFlow");
    return -1;
}
int ch = arr[top--];
return ch;
}

public boolean isOverFlow(){
if((top+1) == size)
return true;
return false;
}

public boolean isUnderFlow(){
if(top == -1) 
return true;
return false;
}

public int peek(){
if(top == -1)
 return -1;
return arr[top];
}
}
