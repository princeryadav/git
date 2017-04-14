package com.bridgelabz.controller;

import com.bridgelabz.Service.*;

public class AddressBookController {
	AddressbookService abs=new AddressBookImp();
	public int addPerson(){
	abs.addPerson();
	return 0;
	}
	public void deletePerson() {
		abs.deletePerson();
		
	}
	public void searchPerson(){
		abs.searchPerson();
	}
	public void editPersonInfo() {
		
		abs.editPersonInfo();
	}
	public void sortByName(){
		 abs.sortByName();
	 }
}	
