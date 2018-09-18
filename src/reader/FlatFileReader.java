package reader;

import java.util.*;

import entities.Address;
import entities.Person;

import java.io.*;

public class FlatFileReader {

	//method for reading in Persons.dat
	public void readInPersons() throws FileNotFoundException
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
				String addressText = elements[3]; //tokenizing the address to make an address object
				String[] elementsForAddress = addressText.split(",");
				Address address = new Address(elementsForAddress[0],elementsForAddress[1],elementsForAddress[2],Integer.parseInt(elementsForAddress[3]), elementsForAddress[4]);
				Person p = new Person(elements[0],elements[1],address);
			}
			else
			{
				
			}
		}
		//return arrPersons;
		
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
