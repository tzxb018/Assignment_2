package reader;

import java.util.*;

import entities.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		
		scanner.close();
		return arrPersons;
		
	}
	
	//method for reading in Customers.dat
	public void readInCustomers()
	{
		//File file = new File("data/Customers.dat");
		
		
	}
	
	//method for reading in Products.dat
	public ArrayList readInProducts() throws FileNotFoundException, ParseException
	{
		//ArrayList for products
		ArrayList<Product> products = new ArrayList<Product>();
		//File and scanner objects
		File file = new File("data/Products.dat");
		Scanner scanner1 = new Scanner(file);
		
		//fiding number of products being read in 
		int times = scanner1. nextInt();

		//reading in and finding which type of product they are and instantiating them respectivly 
		while (times > 0)
		{
			times--;
			String readIn = scanner1.nextLine();
			
			if (!readIn.isEmpty()) { //prevent empty lines from being read in
				//tokenize each part of the stuff read in
				String[] productElements = readIn.split(";");

				//using the product type to instantiate different products
				//productElements hold all the attributes; however, some need to be converted to be used
				String type = productElements[1];
				if (type.equals("S")) //season pass
				{
					//converting to dates
					Date start = new SimpleDateFormat("yyyy-MM-dd").parse(productElements[3]);
					Date end = new SimpleDateFormat("yyyy-MM-dd").parse(productElements[4]);
					
					//instantiate seasonpass object
					SeasonPass seasonPass = new SeasonPass(productElements[0],productElements[2],start,end,Double.parseDouble(productElements[5]));
					
					//add to arraylist
					products.add(seasonPass);
				}
				else if (type.equals("R")) //refreshments 
				{
					Refreshments refreshments = new Refreshments(productElements[0],productElements[2],Double.parseDouble(productElements[3]));
					
					//add to arraylist
					products.add(refreshments);
				}
				else if (type.equals("M")) //movie tickets
				{
					//converting to dates
					Date movieTime = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse(productElements[2]);

					//Creating the address object
					String addressText = productElements[4]; //tokenizing the address to make an address object
					
					String[] elementsForAddress = addressText.split(","); //splitting up parts for each part of the address (street, city, state, zip, country)
					
					//instaniating address object after trimming white space of each element of the address
					Address address = new Address(elementsForAddress[0].trim(),elementsForAddress[1].trim(),elementsForAddress[2].trim(),(elementsForAddress[3].trim()), elementsForAddress[4].trim());
					
					//instantiating movieTicket object
					MovieTicket movieTicket = new MovieTicket(productElements[0],movieTime,productElements[3],address,productElements[5],Double.parseDouble(productElements[6]));
					
					//adding to arrayList
					products.add(movieTicket);
				}
				else if (type.equals("P")) //parking pass
				{
					//instatiating parking pass class
					ParkingPass parkingPass = new ParkingPass(productElements[0],Double.parseDouble(productElements[2]));
					
					//adding to arraylist
					products.add(parkingPass);
				}

			}
			
		}
		
		scanner1.close();
		return products; 
	}
}
