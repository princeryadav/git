package com.bridgeit.javaprogarms;
import java.util.Scanner;

public class FindYourNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int commandLine=Integer.parseInt(args[0]);
		System.out.println("this is limit"+commandLine);
		double N=Math.pow(2, commandLine);
		double low=0;
		double heigh=N-1;
		double mid=(low+heigh)/2;
		
		System.out.println("Think a number between 0 to"+(N-1));
		for(int i=1;i<commandLine;i++){
			
			System.out.println("is number is greater than"+mid);
			
			int flag=1;
			sc.nextInt();
			if(flag==1){
				low=mid+1;
				mid=(low+heigh);
			}
			else if(flag==0){
				heigh=mid+1;
				mid=low+heigh;
			}
		}
	}

}
