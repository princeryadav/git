package com.bridgeit.javaprogarms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;


public class Unorderlist {

	public static void main(String[] args) throws IOException {
		int j;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		File file=new File("/home/bridgeit/workspace/30Problem/src/any");
		
		@SuppressWarnings("resource")
		FileInputStream obj=new FileInputStream(file);
		
		String str="";
		int n=0;
		while((n=obj.read())!=-1){
			
			str +=(char) n;
		}
		String[] str1=str.split(" ");
		
		for(int i =0;i<str1.length;i++)
			System.out.println(str1[i]+" ");
		LinkedList<String> l=new LinkedList<String>();
		
		for(j=0;j<str1.length;j++){
			l.add(j,new String(str1[j]));
		}

			
		System.out.println("linkedlist:"+l);
		
		
		System.out.println("Enter your word to be search");
		String str2=sc.next();
		if(l.contains(str2)){
			System.out.println("your word is found ");
		
			l.remove(str2);
			@SuppressWarnings("resource")
			FileWriter out=new FileWriter(file);
			for(int i=0;i<l.size();i++){
				out.write(l.get(i)+" ");	
				out.flush();
			}
			System.out.println("After removing list is"+l);
		}
		else{
			l.add(str2);
			@SuppressWarnings("resource")
			FileWriter out=new FileWriter(file);
			for(int i=0;i<l.size();i++){
				out.write(l.get(i)+" ");	
				out.flush();
			}
			
			
			System.out.println("linkedlist"+l);
			
			
		}
		
		
		
	}

}
