package com.java.learn.ds.stack.examples;

public class Infix_Postfix{
public static void main(String... cse){
String infixForm1 = "A + B * C - D * E";
String infixForm2 = "A * B + C";
String convertedString1 = infixToPostfix(infixForm1);
String convertedString2 = infixToPostfix(infixForm2);
System.out.println("PostFix notation of the infix string "+infixForm1+", is : "+convertedString1);
System.out.println("PostFix notation of the infix string "+infixForm2+", is : "+convertedString2);
}

public static String infixToPostfix(String str){
StackArr stack = new StackArr();
String postFixString = "";
int firstSpace = -1;
while(!str.isEmpty()){
 firstSpace = str.indexOf(' ');
 if(firstSpace == -1){
	postFixString+=str;
	break;
 }
 String s = str.substring(0, firstSpace);

 if(isOperator(s)){
		// If higher precedence then pop till no higer precedence are found and print them.
	while(are_Higher_Operators_On_Stack(stack.peek()+"", s))
		postFixString+=stack.pop();
	// If no higher precedence then push
	stack.push(s.charAt(0));
 }
 else
	postFixString+=s;
 str = str.substring(firstSpace+1, str.length());
}

// if firstSpace =-1, then it is the last char of the string, so pop all the operators from stack and print them.

char ope=' ';
while((ope = stack.pop())!= ' ')
	postFixString+=ope;

return postFixString;
}

public static boolean isOperator(String s){
 if(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) 
	return true;
return false;
}

public static boolean are_Higher_Operators_On_Stack(String topEle, String op){
 if(op.equals("+")){
	if(topEle.equals("*") || topEle.equals("/") || topEle.equals("-"))
		return true;	
	return false;
 }
 else if(op.equals("-")){
	if(topEle.equals("*") || topEle.equals("/") || topEle.equals("+"))
		return true;	
	return false;
 }
 else if(op.equals("*")){
	if(topEle.equals("/"))
		return true;	
	return false;
 }
 else if(op.equals("/")){
	if(topEle.equals("*"))
		return true;	
	return false;
 }
 else { //if(topEle.equals(" ") || '(' || ')')
	return false;
 }
}


}