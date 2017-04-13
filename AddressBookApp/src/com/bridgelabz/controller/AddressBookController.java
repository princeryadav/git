package com.bridgelabz.controller;

import com.bridgelabz.Service.*;

public class AddressBookController {
	AddressbookService abs=new AddressBookImp();
	public void addPerson(){
	abs.addPerson();
}
	
}	
