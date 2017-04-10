package com.bridgeit.javaprogarms;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Excpresion");
		String excpr=sc.nextLine();
		sc.close();
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<excpr.length();i++){
			char ch=excpr.charAt(i);
			if(ch=='('){
				stack.push(ch);	
			}else if(ch==')'){
				if(stack.isEmpty()){
					System.out.println("stack is underflow");
				}
				stack.pop();
			}
		}
		if(stack.isEmpty()){
			System.out.println("Enter Excpression in balance");
		}
		else
			System.out.println("Enter Excpression is not balance");
		
		
	}

}
