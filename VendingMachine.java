package com.bridgeit.javaprogarms;

import java.util.Scanner;

public class VendingMachine {

	static int r1000;
	static int r500;
	static int r100;
	static int r50;
	static int r20;
	static int r10;
	static int r5;
	static int r2;
	static int r1;

	public static void main(String[] args) {
		
		VendingMachine machin=new VendingMachine();
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter your Amount:");
		int amount=scanner.nextInt();
		
		if(amount>1000){
			 machin.count1000(amount);
		}
		else if(amount>500){
			 machin.count500(amount);
		}
		else if(amount>100){
			 machin.count100(amount);
		}
		else if(amount>50){
			 machin.count50(amount);
		}
		else if(amount>20){
			 machin.count20(amount);
		}
		else if(amount>10){
			 machin.count10(amount);
		}
		else if(amount>5){
			 machin.count5(amount);
		}
		else if(amount>2){
			 machin.count2(amount);
		}
		else if(amount>1){
			 machin.count1(amount);
		}
	
		
		 int numberOfNotes = VendingMachine.r1000+VendingMachine.r500+VendingMachine.r100+VendingMachine.r50+VendingMachine.r20+VendingMachine.r10+VendingMachine.r5+VendingMachine.r2+VendingMachine.r1;
		    System.out.println("Minimum notes required "+numberOfNotes+"\n");
		    System.out.println("No. of notes of 1000 : "+ r1000);
		    System.out.println("No. of notes of 500 : "+ r500);
		    System.out.println("No. of notes of 100 : "+ r100);
		    System.out.println("No. of notes of 50 : "+ r50);
		    System.out.println("No. of notes of 20 : "+ r20); 
		    System.out.println("No. of notes of 10 : "+ r10);
		    System.out.println("No. of notes of 5 : "+ r5);
		    System.out.println("No. of notes of 2 : "+ r2);
		    System.out.println("No. of notes of 1 : "+ r1);
	}

	

	private void count1000(int amount) {
		
		r1000=amount/1000;
		amount=amount%1000;
		count500(amount);
	}

	private void count500(int amount) {
		
		r500=amount/500;
		amount=amount%500;
		count100(amount);
	}

	private void count100(int amount) {
		
		r100=amount/100;
		amount=amount%100;
		count50(amount);
		
	}

	private void count50(int amount) {
		
		r50=amount/50;
		amount=amount%50;
		count20(amount);
		
	}

	private void count20(int amount) {
		
		r20=amount/20;
		amount=amount%20;
		count10(amount);
		
	}

	private void count10(int amount) {
		
		r10=amount/10;
		amount=amount%10;
		count5(amount);
		
	}

	private void count5(int amount) {
		
		r5=amount/5;
		amount=amount%5;
		count2(amount);
	}

	private void count2(int amount) {
		
		r2=amount/2;
		amount=amount%2;
		count1(amount);
		
	}
	
	private void count1(int amount){
		
		r1=amount/1;
		amount=amount%1;
		
	}

}
