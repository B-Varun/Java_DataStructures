package com.java.learn.ds.stack.examples;

public class BalancedParenthesis_Stack_Arr{
public static void main(String... ar){
String str = "[a+{b-(c/d)+e*f}/g]";
System.out.println(str);
System.out.println("The above string is Balanced : "+checkIfBalanced(str));
}

public static boolean checkIfBalanced(String s){
boolean isbalanced = true;
StackArr stack = new StackArr();

for(int i=0; i<s.length(); i++){
 if(isParenthesis(s.charAt(i))){
   char ch = s.charAt(i);
    if(isOpeningParenthesis(ch))
	stack.push(ch);
    if(isClosingParenthesis(ch)){
	char matchingParameter = getMatchingParanthesis(ch);
	if(stack.peek() == matchingParameter)
		stack.pop();
	else
		return false;
    }
 }
}
return true;
}

public static char getMatchingParanthesis(char ch){
 if(ch == ')') return '(';
 else if(ch == '}') return '{';
 else return '[';
}

public static boolean isParenthesis(char ch){
 if(ch == '(' || ch=='{' || ch=='[' || ch == ')' || ch=='}' || ch==']')
	return true;
return false;
}

public static boolean isOpeningParenthesis(char ch){
 if(ch == '(' || ch=='{' || ch=='[')
	return true;
return false;
}

public static boolean isClosingParenthesis(char ch){
 if(ch == ')' || ch=='}' || ch==']')
	return true;
return false; 
}
}