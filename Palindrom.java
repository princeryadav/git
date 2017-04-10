package com.bridgeit.javaprogarms;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindrom {

	
	public static void main(String[] args) {
		String str1="";
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner (System.in);
		
		System.out.println("Enter your String:");
		String str= scanner.next();
		
		Deque<Character> deque=  new LinkedList<Character>();
		
		for(int i=0;i<str.length();i++){
			char element=str.charAt(i);
			deque.add(element);
		}
		//System.out.println(deque);
		while(!deque.isEmpty()){
			str1=str1+deque.removeLast();
			//System.out.println(str1);
		}
		if(str.equals(str1)){
			System.out.println("your string is palindrom");
		}
		else
			System.out.println("your string is not palindrom");
	}

	

}
