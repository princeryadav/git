package com.bridgelabz.Service;

public interface AddressbookService {
	
	public void addPerson(String adressBookName);
//	public void searchPerson(String adressBookName);
//	public void editPersonInfo(String adressBookName);
//	public void sortByName(String adressBookName);
//	public void sortByPinCode(String adressBookName);
//	public void display(String adressBookName);


	public void deletePerson(String adressBookName);


	public void searchPerson(String adressBookName);


	public void editPersonInfo(String adressBookName);


	public void sortByName(String adressBookName);


	public void sortByPinCode(String adressBookName);


	public void display(String adressBookName);
}
