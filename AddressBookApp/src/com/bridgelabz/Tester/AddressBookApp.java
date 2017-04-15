package com.bridgelabz.Tester;

import java.util.Scanner;

import com.bridgelabz.controller.AddressBookController;

public class AddressBookApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		AddressBookController addressBookConroller=new AddressBookController();
		char choice;
		do{
			System.out.println("Enter Adress Book name");
			String adressBookName=scanner.next();
			System.out.println("what do you want to perform");
			System.out.println("1.Add Person");
			System.out.println("2.Delete Person");
			System.out.println("3.Search Person");
			System.out.println("4.edit Person");
			System.out.println("5.sort By Last Name");
			System.out.println("6.sort By Pin code");
			System.out.println("7.Display");
			int number=scanner.nextInt();
			switch(number){
			
			case 1:
				addressBookConroller.addPerson(adressBookName);
			
			break;
			
			case 2:
			addressBookConroller.deletePerson(adressBookName);
			
			break;
			
			case 3:
				addressBookConroller.searchPerson(adressBookName);
			break;	
				
			case 4:
				addressBookConroller.editPersonInfo(adressBookName);
			break;
			
			case 5:
				addressBookConroller.sortByName(adressBookName);
			break;
			
			case 6:
				addressBookConroller.sortByPinCode(adressBookName);
				break;
				
			case 7:
				addressBookConroller.display(adressBookName);
			}
			System.out.println("do you want continue the operation....");
			choice=scanner.next().charAt(0);
			
		}while(choice=='Y'||choice=='y');
			
			
		
		
		scanner.close();
		
	}

}
