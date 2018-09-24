package entities;

import java.util.*;

public class Person {
	
	private String code;
	private String firstName;
	private String lastName;
	private Address address;
	private String emails;
	
	//generating constructor with all the attributes (with email)
	public Person(String code, String lastName,String firstName, Address address, String emailAddress) {
		super();
		this.code = code;

	this.lastName = lastName;
	this.firstName = firstName;
		this.address = address;
		this.emails = emailAddress;
	}
	
	@Override
	public String toString() {
		return "Person [code=" + code + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", emails=" + emails + ", getCode()=" + getCode() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getAddress()=" + getAddress() + ", getEmails()=" + getEmails()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	//constructor without an email attriubte (set it to null)


	//generating getter and setter methods
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getEmails() {
		
		return emails;
	}

	public void setEmails(String emails) {
			this.emails = emails;
	}

	
	
}
