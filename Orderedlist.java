package com.bridgeit.javaprogarms;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Orderedlist {

	public static void main(String[] args) throws IOException {
		
			int j;
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			File file=new File("/home/bridgeit/workspace/30Problem/orderedlist");
			@SuppressWarnings("resource")
			FileInputStream obj=new FileInputStream(file);
			
			String str="";
			int n;
			while(( n=obj.read())!=-1){
				str+=(char) n;
			}
			
			String[] str1=str.split(" ");
			Arrays.sort(str1);
			LinkedList<String> l=new LinkedList<String>();
			for(int i=0;i<str1.length;i++)
				System.out.print(str1[i]+" ");
			for(j=0;j<str1.length;j++){
				l.add(j,new String(str1[j]));
			}
			System.out.println('\n');
			System.out.println(l);
			System.out.print("Enter your integer to be search:");
			String x=sc.next();
			if(l.contains(x)){
				System.out.println("your integer is found...");
				l.remove(x);
				@SuppressWarnings("resource")
				FileWriter writer=new FileWriter(file);
				for(int i=0;i<l.size();i++){
					
					writer.write(l.get(i)+" ");
					writer.flush();
					
				}
				System.out.println("After removing your element list is"+l);
			}
			else
			{
				l.add(x);
				
				@SuppressWarnings("resource")
				FileWriter writer=new FileWriter(file);
				for(int i=0;i<l.size();i++){
				
				writer.write(l.get(i)+" ");
				writer.flush();	
				
				}
				System.out.println("linkedlist"+l);
			}
	}

}
