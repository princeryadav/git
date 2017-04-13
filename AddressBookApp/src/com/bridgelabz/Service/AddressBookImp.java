package com.bridgelabz.Service;
import com.bridgelabz.model.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookImp implements AddressbookService{
	
	HashMap<String,LinkedList<Person>> hasMap=new HashMap<String,LinkedList<Person>>();
	LinkedList <Person> list=new LinkedList <Person>();
	
	public void addPerson() {
		Person person=new Person();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your first name:");
		String firstName=scanner.nextLine();
		person.setFistName(firstName);
		System.out.println("Enter your last name:");
		String lastName=scanner.nextLine();
		person.setLastName(lastName);
		System.out.println("Enter your address:");
		String address=scanner.nextLine();
		person.setAddress(address);
		System.out.println("Enter your city name:");
		String cityName=scanner.nextLine();
		person.setCity(cityName);
		System.out.println("Enter your pin code:");
		String pinCode=scanner.nextLine();
		person.setPinCode(pinCode);
		System.out.println("Enter your phone number:");
		String phoneNumber=scanner.nextLine();
		person.setPhone(phoneNumber);
		
		list.add(person);
		hasMap.put("friends",list);
		System.out.println(hasMap.toString());
		
		
		
		
	
		
		
		
		
		
	}

	
}