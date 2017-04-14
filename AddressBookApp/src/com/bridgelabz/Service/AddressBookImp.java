package com.bridgelabz.Service;
import com.bridgelabz.model.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class AddressBookImp implements AddressbookService{
	
	HashMap<String,LinkedList<Person>> hasMap=new HashMap<String,LinkedList<Person>>();
	LinkedList <Person> list=new LinkedList <Person>();
	Scanner scanner=new Scanner(System.in);
	
	public void addPerson() {
		Person person=new Person();
		
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
		System.out.println("Enter your state name");
		String state=scanner.nextLine();
		person.setState(state);
		System.out.println("Enter your pin code:");
		String pinCode=scanner.nextLine();
		person.setPinCode(pinCode);
		System.out.println("Enter your phone number:");
		String phoneNumber=scanner.nextLine();
		person.setPhone(phoneNumber);
		
		list.add(person);
		hasMap.put("friends",list);
		System.out.println(hasMap);
		
		
		//scanner.close();	
	}
	public void deletePerson(){
		
		System.out.println("Enter phoneNumber to delete person");
		String phoneNumer=scanner.nextLine();
		String value="";
		for(int i=0;i<list.size();i++){
			value=hasMap.get("friends").get(i).getPhone();
			if(value.equals(phoneNumer)){
				list.remove(hasMap.get("friends").get(i) );
				System.out.println(hasMap);
				return;
			}else
			System.out.println("such phone Number is not exists");
		}
	}
	public void searchPerson(){
		
		System.out.println("Enter person first name to search");
		String firstName=scanner.next();
		String value="";
		for(int i=0;i<list.size();i++){
			value=hasMap.get("friends").get(i).getFistName();
			if(value.equals(firstName)){
				System.out.println("Person is found"+hasMap.get("friends").get(i));
				return;
			}else
				System.out.println("such name is not exists");
			
		}
	}
	public void editPersonInfo(){
		char choice;
		System.out.println("Enter phoneNumber to edit person");
		String phoneNumer=scanner.nextLine();
		String value="";
		for(int i=0;i<list.size();i++){
			value=hasMap.get("friends").get(i).getPhone();
			if(value.equals(phoneNumer)){
				Person person=hasMap.get("friends").get(i) ;
				do{
					System.out.println("What do you wnat to chang");
					System.out.println("1.Change Address");
					System.out.println("2.Change city");
					System.out.println("3.Change State");
					System.out.println("4.Change pincode");
					System.out.println("5.Change phoneNumber");
					int n=scanner.nextInt();
					switch(n){
					
					case 1:
						System.out.println("Enter your new address");
						String newAddress=scanner.next();
						person.setAddress(newAddress);
					break;
					
					case 2:
						System.out.println("Enter your new city");
						String newCity=scanner.next();
						person.setAddress( newCity);
					break;
					
					case 3:
						System.out.println("Enter your new state");
						String newState=scanner.next();
						person.setAddress(newState);
					break;
					
					case 4:
						System.out.println("Enter your new pincode");
						String newPinCode=scanner.next();
						person.setAddress( newPinCode);
					break;
					
					case 5:
						System.out.println("Enter your new phoneNumber");
						String newphoneNumber=scanner.next();
						person.setAddress(newphoneNumber);
					break;
					
					
					
					
					}
					System.out.println("do you want to continue to edit (type Y or y)");
					choice=scanner.next().charAt(0);
					
				}while(choice=='Y'|| choice=='y');
				System.out.println(hasMap);
				return;
			}else
			System.out.println("such phone Number is not exists");
		}
	}
	public void sortByName(){
		int s=list.size();
		String[] object=new String[list.size()];
		for(int i=0;i<s;i++){
			
		//System.out.println(hasMap.get("friends").get(i).getFistName());
		object[i]=hasMap.get("friends").get(i).getFistName();
		}
		Arrays.sort(object);
		for(int i=0;i<object.length;i++)
		{
			System.out.println(object[i]);
		System.out.println(list.get(i));
		}
		System.out.println(hasMap);
	}
		
}

	
