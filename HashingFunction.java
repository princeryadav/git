package com.bridgeit.javaprogarms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


public class HashingFunction {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		Map<Integer,LinkedList<Integer>> map=new HashMap<Integer,LinkedList<Integer>>();
		File file=new File("/home/bridgeit/workspace/30Problem/orderedlist");
		@SuppressWarnings("resource")
		FileInputStream fileinputstream = new FileInputStream(file);
		String string="";
		int a=0;
		int slot;
		//Integer[] integer=new Integer[10];
		@SuppressWarnings("unchecked")
		LinkedList<Integer>[] list=new LinkedList[10];
		while((a=fileinputstream.read())!=-1)
		{
		string +=(char) a;			
		}
		for(int i=0;i<10;i++)
		{
			
			list[i]=new LinkedList<Integer>();
			map.put(i, list[i]);
		}
		String[] string1=string.split("\\s");
		int [] arr=new int[string1.length];
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=Integer.parseInt(string1[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			//System.out.print(string1[i]+ " ");
		
			slot=arr[i]%11;
			
			
			
			 list[slot].add(arr[i]);
			 
		}
		System.out.println(map);
		
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		
		int k=num%11;
		
		if(list[k].contains(num))
		{
			list[k].removeFirstOccurrence(num);
			
		}
		else
		{	
			
			list[k].add(num);
		}
		
		
		
		System.out.println("Hash Map:"+map);
		File f2=new File("/home/bridgeit/workspace/30Problem/src/HashMap");
		
		@SuppressWarnings("resource")
		FileWriter writer = new FileWriter(f2);
		for (int i = 0; i <map.size(); i++) 
		{
			writer.write(map.get(i) + " ");
			writer.flush();
}
		
		
		
	
				
	}

}
