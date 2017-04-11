package com.bridgeit.javaprogarms;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Account {
	
	public String name;
	public int accountNO;
	
	public String getName() {
		return name;
	}
	public Account(String name,int accountNo){
		
		this.name=name;
		this.accountNO=accountNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Name:"+name+"AccountNo:"+accountNO;
	}
	
}

public class BankingCaseCounter {

	public static void main(String[] args) {
		char ch = 0 ;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Adding Into queue");
		System.out.println("Enter number of customer");
		int customer=scanner.nextInt();
		int n,amount,mainAmount=100000;
		Queue<Account> queue=new LinkedList<Account>();
		for(int i=0;i<customer;i++){

			System.out.println("Enter your name");
			String name=scanner.next();
			System.out.println("Enter your accountNo");
			int accountNo=scanner.nextInt();
			queue.add(new Account(name, accountNo));

			for (Account acc : queue) {
			     System.out.println(acc.toString());
		    }
			}
		System.out.println("Perform your operation");
		do{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Remove");
			System.out.println("Enter your choice..");
			n = scanner.nextInt();
	
			switch (n) {
	
				case 1:
					System.out.println("Enter your amount:");
					amount = scanner.nextInt();
					mainAmount = mainAmount + amount;
					System.out.println("mainAmount is" + mainAmount);
					mainAmount=100000;
		
					break;
		
				case 2:
					System.out.println("Enter your amount:");
					amount = scanner.nextInt();
					if (amount >= mainAmount) {
						System.out.println("Insufficient amount");
					} else
						mainAmount = mainAmount - amount;
					System.out.println("mainAmount is" + mainAmount);
					mainAmount=100000; 
					
					break;
					
				case 3:
					queue.remove(); 
					System.out.println(queue);
					
				break;
			}
            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scanner.next().charAt(0);
		
		}while ( ch== 'Y'|| ch== 'y'); 
			
	}

}
