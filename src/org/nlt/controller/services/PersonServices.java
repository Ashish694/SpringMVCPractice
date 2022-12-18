package org.nlt.controller.services;

import org.nlt.model.Persons;

public class PersonServices {

	public PersonServices() {
		System.out.println("Person Services Object Created");
	}
	
	public boolean submitPersonService(String name,int age,long phone)
	{
		System.out.println("Submit Person Method");
		Persons person = new Persons();
		
	}
}
