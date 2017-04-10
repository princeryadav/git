package com.bridgeit.javaprogarms;
import java.util.*;


 class InsertionSort {
	
	public static void sort(String[] str){
		
		for(int i=1;i<str.length;i++){
			
			int j=i;
			String str1=str[i];
			
			while(j>0 && str1.compareTo(str[j-1])<0){
				
				str[j]=str[j-1];
				j--;
				
			}
			str[j]=str1;
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of string array");
		int length=sc.nextInt();
		String [] str=new String[length];
		System.out.println("Enter string elememt:");
		
		for(int i=0;i<length;i++){
			
			str[i]=sc.next();
			
		}
		sort(str);
		for(int i=0;i<length;i++){
			
			System.out.println(str[i]+" ");
		}
		System.out.println();
	}

}
