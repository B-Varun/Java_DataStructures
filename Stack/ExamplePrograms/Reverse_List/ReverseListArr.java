package com.java.learn.ds.stack.examples;

public class ReverseListArr{
public static void main(String... arfs){
StackLL list = new StackLL();
list.push(1);
list.push(2);
list.push(3);
list.push(4);
list.push(5);

System.out.println("Stack elements before Reverse");
list.print();
reverse(list);
System.out.println("Stack elements after Reverse");
list.print();
}

public static void reverse(StackLL list){
Node temp = list.top;
StackLL stack = new StackLL();

while(temp != null){
 stack.push(temp.data); 
 temp = temp.next;
}

temp = list.top;
while(temp!=null){
 int ch = stack.pop();
 temp.data = ch;
 temp = temp.next;
}
}
}
