package com.java.learn.ds.stack.examples;

public class ReverseList_Stack_Arr{
public static void main(String... arsf){
StackLL list = new StackLL();

list.push(1);
list.push(2);
list.push(3);
list.push(4);
list.push(5);

System.out.println("Element of list before Reversing : ");
list.print();

reverse(list);

System.out.println("Element of list after Reversing : ");
list.print();
}

public static void reverse(StackLL list){
StackArr stack = new StackArr();

Node temp = list.top;
while(temp!=null){
stack.push(temp.data);
temp = temp.next;
}

temp = list.top;
while(temp!=null){
temp.data = stack.pop();
temp = temp.next;
}

}
}