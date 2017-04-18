package com.bridgelabz.Service;
import com.bridgelabz.model.*;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class AddressBookImp implements AddressbookService{
	
	HashMap<String,LinkedList<Person>> hasMap=new HashMap<String,LinkedList<Person>>();
	LinkedList <Person> list=null;
	Scanner scanner=new Scanner(System.in);
	
	/*This method is used to add person into address book*/
	public void addPerson(String adressBookName) {
		Person person=new Person();
		System.out.println("Enter your first name:");
		String firstName=scanner.next();
		person.setFistName(firstName);
		System.out.println("Enter your last name:");
		String lastName=scanner.next();
		person.setLastName(lastName);
		System.out.println("Enter your address:");
		String address=scanner.next();
		person.setAddress(address);
		System.out.println("Enter your city name:");
		String cityName=scanner.next();
		person.setCity(cityName);
		System.out.println("Enter your state name");
		String state=scanner.next();
		person.setState(state);
		System.out.println("Enter your pin code:");
		String pinCode=scanner.next();
		person.setPinCode(pinCode);
		System.out.println("Enter your phone number:");
		String phoneNumber=scanner.next();
		person.setPhone(phoneNumber);
		if (hasMap.get(adressBookName) == null)
			hasMap.put(adressBookName, new LinkedList <Person>());
			hasMap.get(adressBookName).add(person);
			System.out.println(hasMap);
//		list.add(person);
//		hasMap.put(adressBookName,new LinkedList <Person>());
	
	}
	
	/*This method is used to delete person from particular address book*/
	public void deletePerson(String adressBookName){
		
		System.out.println("Enter phoneNumber to delete person");
		String phoneNumer=scanner.next();
		String value="";
		for(int i=0;i<list.size();i++){
			value=hasMap.get(adressBookName).get(i).getPhone();
			if(value.equals(phoneNumer)){
				list.remove(hasMap.get(adressBookName).get(i) );
				System.out.println(hasMap);
				return;
			}else
			System.out.println("such phone Number is not exists");
		}
	}
	
	/*This method is used to search person from particular address book*/
	public void searchPerson(String adressBookName){
		
		System.out.println("Enter person first name to search");
		String firstName=scanner.next();
		String value="";
		for(int i=0;i<list.size();i++){
			value=hasMap.get(adressBookName).get(i).getFistName();
			if(value.equals(firstName)){
				System.out.println("Person is found"+hasMap.get(adressBookName).get(i));
				return;
			}else
				System.out.println("such name is not exists");
			
		}
	}
	
	/*This method is used to edit person info from particular address book*/
	public void editPersonInfo(String adressBookName){
		char choice;
		System.out.println("Enter phoneNumber to edit person");
		String phoneNumer=scanner.next();
		String value="";
		for(int i=0;i<list.size();i++){
			value=hasMap.get(adressBookName).get(i).getPhone();
			if(value.equals(phoneNumer)){
				Person person=hasMap.get(adressBookName).get(i) ;
				do{
					System.out.println("What do you wnat to change");
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
						person.setAddress(newCity);
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
	
	/*This method is used to sort person by there lastName from particular address book*/
	public void sortByName(String adressBookName){
		int s=list.size();
		String[] object=new String[list.size()];
		for(int i=0;i<s;i++){
			object[i]=hasMap.get(adressBookName).get(i).getLastName();
		}
		Arrays.sort(object);
		System.out.println("Sort By LastName");
		for(int i=0;i<object.length;i++){
			for(int j=0;j<object.length;j++){
				if(object[i].equals(hasMap.get(adressBookName).get(j).getLastName())){			
					System.out.println(list.get(j));
				}
			}	
		}
	}
	
	/*This method is used to sort person by there pincode from particular address book*/
	public void sortByPinCode(String adressBookName){
		int s=list.size();
		String[] object=new String[list.size()];
		for(int i=0;i<s;i++){
			object[i]=hasMap.get(adressBookName).get(i).getPinCode();
		}
		Arrays.sort(object);
		System.out.println("Sort By PinCode");
		for(int i=0;i<object.length;i++){
			for(int j=0;j<object.length;j++){
				if(object[i].equals(hasMap.get(adressBookName).get(j).getPinCode())){			
					System.out.println(list.get(j));
				}
			}	
		}
		
	}
	
	/*This method is used to display person by there lastName from particular address book*/
	public void display(String adressBookName){
		
		System.out.println("Enter the addressBook name");
		String name=scanner.next();
		System.out.println("_____________________________________________________________________________");
		System.out.println("\t\t\t\t"+name);
		System.out.println("_____________________________________________________________________________");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n","FirstName", "LastName", "Address", "City", "State", "Zip", "MobNO");
		list=hasMap.get(name);
		for(int i=0;i<list.size();i++)
		{
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",list.get(i).getFistName(),list.get(i).getLastName(),list.get(i).getAddress(),list.get(i).getCity(),list.get(i).getState(),list.get(i).getPinCode(),list.get(i).getPhone());
		System.out.println("..............................................................................");
		}
		}
	}
	



	
