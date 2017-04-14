package com.bridgelabz.Tester;

import java.util.Scanner;

import com.bridgelabz.controller.AddressBookController;

public class AddressBookApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		AddressBookController abc=new AddressBookController();
		char ch;
		do{
			System.out.println("what do you want to perform");
			System.out.println("1.create Addressbook");
			System.out.println("2.Add Person");
			System.out.println("3.Delete Person");
			System.out.println("4.Search Person");
			System.out.println("5.edit Person");
			System.out.println("6.sort Person");
			int n=scanner.nextInt();
			switch(n){
			
		/*	case 1:
				
				abc.createAddressBook();*/
			
			case 2:
			
				abc.addPerson();
			
			break;
			
			case 3:
				abc.deletePerson();
			
			break;
			
			case 4:
				abc.searchPerson();
			break;	
				
			case 5:
				abc.editPersonInfo();
			break;	
			case 6:
				abc.sortByName();
			break;
			}
			System.out.println("do you want continue the operation....");
			ch=scanner.next().charAt(0);
		}while(ch=='Y'||ch=='y');
			
			
		
		
		//scanner.close();
		
	}

}
