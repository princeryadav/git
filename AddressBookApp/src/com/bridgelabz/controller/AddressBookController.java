package com.bridgelabz.controller;

import com.bridgelabz.Service.*;

public class AddressBookController {
	AddressbookService addressbookService=new AddressBookImp();
	
	
	public void addPerson(String adressBookName){
		addressbookService.addPerson(adressBookName);

	}

	public void deletePerson(String adressBookName) {
		// TODO Auto-generated method stub
		addressbookService.deletePerson(adressBookName);
	}

	public void searchPerson(String adressBookName) {
		// TODO Auto-generated method stub
		addressbookService.searchPerson(adressBookName);
	}

	public void editPersonInfo(String adressBookName) {
		// TODO Auto-generated method stub
		addressbookService.editPersonInfo(adressBookName);
	}

	public void sortByName(String adressBookName) {
		// TODO Auto-generated method stub
		addressbookService.sortByName(adressBookName);
	}

	public void sortByPinCode(String adressBookName) {
		// TODO Auto-generated method stub
		addressbookService.sortByPinCode(adressBookName);
	}

	public void display(String adressBookName) {
		// TODO Auto-generated method stub
		addressbookService.display(adressBookName);
	}
}	
