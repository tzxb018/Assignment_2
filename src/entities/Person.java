package entities;

import java.util.*;

public class Person {
	
	private String code;
	private String name; //formatted last, first
	private String firstName;
	private String lastName;
	private Address address;
	private ArrayList<String> emails;
	
	//generating constructor with all the attributes (with email)
	public Person(String code, String name, Address address, ArrayList<String> emails) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.emails = emails;
	}
	
	//constructor without an email attriubte (set it to null)
	public Person(String code, String name, Address address)
	{
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.emails = null;
	}

	//generating getter and setter methods
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fullName) {
		//formatting the first name from the full name
		this.firstName = fullName.substring(fullName.indexOf((",") + 1));
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String fullName) {
		//formatting the last name from the full name
		this.lastName = fullName.substring(0,fullName.indexOf(","));
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<String> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<String> emails) {
		this.emails = emails;
	}
	
	
	
	
	
}
