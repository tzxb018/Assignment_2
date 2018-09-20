package reader;

import java.util.*;

import entities.Address;
import entities.Person;

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
		//using a while loop to make sure all are read and Scanner doesn't read over
		while (times > 0)
		{
			times--;
			String readIn = scanner.nextLine();
			
			//using a tokenizer to seperate the attributes
			String[] elements = readIn.split(";");
			
			//creating an instance of a new person
			//checking to see if emails are listed
			if (elements.length == 4)
			{
				String addressText = elements[2]; //tokenizing the address to make an address object
				
				String[] elementsForAddress = addressText.split(","); //splitting up parts for each part of the address (street, city, state, zip, country)
				
				//instaniating address object after trimming white space of each element of the address
				Address address = new Address(elementsForAddress[0].trim(),elementsForAddress[1].trim(),elementsForAddress[2].trim(),(elementsForAddress[3].trim()), elementsForAddress[4].trim());
				
				//instaniating person object with code, name, and address
				Person p = new Person(elements[0],elements[1],address);  
				
				//adding the person to the persons arrayList
				arrPersons.add(p);
			}
			else if (elements.length > 4)
			{
				String addressText = elements[2]; //tokenizing the address to make an address object
				
				String[] elementsForAddress = addressText.split(","); //splitting up parts for each part of the address (street, city, state, zip, country)
				//instaniating address object after trimming white space of each element of the address
				Address address = new Address(elementsForAddress[0].trim(),elementsForAddress[1].trim(),elementsForAddress[2].trim(),(elementsForAddress[3].trim()), elementsForAddress[4].trim());
				
				//adding remaining tokened string, which are emails, into an arraylist for an email address
				ArrayList<String> emails = new ArrayList<String>();
				
				//using a for loop to find the rest of the elements
				for (int i = 3; i < elements.length; i++)
				{
					emails.add(elements[i]);
				}
				
				//instaniating person object with code, name, address, email
				Person p = new Person(elements[0],elements[1],address, emails);  
				
				//adding the person to the persons arrayList
				arrPersons.add(p);
			}
			

		}
		return arrPersons;
		
	}
	
	//method for reading in Customers.dat
	public void readInCustomers()
	{
		File file = new File("data/Customers.dat");
		
		
	}
	
	//method for reading in Products.dat
	public void readInProducts()
	{
		File file = new File("data/Products.dat");
	}
}
