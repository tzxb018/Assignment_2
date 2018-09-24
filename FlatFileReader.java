package reader;

import java.util.*;

import java.util.jar.Attributes.Name;

import entities.Address;
import entities.General;
import entities.Person;
import entities.Student;

import java.io.*;

public class FlatFileReader {

	//method for reading in Persons.dat
	public ArrayList<Person> readInPersons() throws FileNotFoundException
	{
		//reading in the file using a Scanner
		File file = new File("data/Persons.dat");
		Scanner scanner = new Scanner(file);
		
		//Initializing the ArrayList that will be returned with Persons objects
		ArrayList<Person> arrPersons = new ArrayList<Person>();
		
		//getting first line to see how many cases there are
		int times = scanner.nextInt();
		scanner.nextLine();
		//using a while loop to make sure all are read and Scanner doesn't read over
		while (scanner.hasNext())
		{
			
			
			String readIn = scanner.nextLine();
			
			//using a tokenizer to seperate the attributes
			String[] elements = readIn.split(";");
			String personCode =  elements[0];  
		    String[] nameSplit = elements[1].split(",");
		    String lastName = nameSplit[0];
		    String firstName = nameSplit[1];
		    String[] addressSplit = elements[2].split(",");
		    String street = addressSplit[0];
		    String city = addressSplit[1];
		    String state = addressSplit[2];
		    String zipcode = addressSplit[3];
		    String country = addressSplit[4];
		    String emailAddress = null;
      		if (elements.length == 4)
			{
      			
      	emailAddress = elements[3];
      				String[] formattedEmailAddress = elements[3].split(",");
      		
      			
//      		for(int i=0; i<= formattedEmailAddress.length;i++){
//      			if(formattedEmailAddress[i].length()==1){
//      				String email1 = formattedEmailAddress[i];
//      			}
      		}
      
		//tokenizing the address to make an address object
     		
		
			//creating an instance of a new person
			//checking to see if emails are listed
	
			Address address = new Address(street,city,state,zipcode,country);
		      Person p = new Person(personCode,lastName,firstName,address,emailAddress);
				arrPersons.add(p);
		//return arrPersons;
		}
		return arrPersons;	
	}
	
	//method for reading in Customers.dat
	public  <Customer> ArrayList<Customer> readInCustomers() throws FileNotFoundException
	{
		File file = new File("data/Customers.dat");
		Scanner scanner = new Scanner(file);
		ArrayList<Customer> arrCustomers = new ArrayList<Customer>();

		scanner.nextLine();
		while (scanner.hasNext())
		{
			String readIn2 = scanner.nextLine();
			String[] elements = readIn2.split(";");
			 String customerCode = elements[0];
	        	String type = elements[1];
	        	String personCode = elements[2];
	        	String companyName = elements[3];
			 String[] addressSplit = elements[4].split(",");
			    String street = addressSplit[0];
			    String city = addressSplit[1];
			    String state = addressSplit[2];
			    String zipcode = addressSplit[3];
			    String country = addressSplit[4];
			    Address address = new Address(street,city,state,zipcode,country);

				Customer s = null;
				if(elements[1].equals("S")) {
					type = "Students";
					s = (Customer) new Student(customerCode,address,type,personCode,companyName); 
                arrCustomers.add(s);
				} 
				General g = null;
				 if(elements[1].equals("G")) {
					 type = "General";
				g = new General( customerCode, address,type,personCode,companyName); 
				  arrCustomers.add((Customer) g);
				} 
				
		}
	return arrCustomers;
	}
	
	//method for reading in Products.dat
	public void readInProducts() throws FileNotFoundException
	{
		File file = new File("data/Products.dat");
		Scanner scan = new Scanner(file);
		
	}
}
