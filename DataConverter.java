package driver;

import entities.*;

import reader.*;
import writer.JSONWriter;
import writer.XMLWriter;

import java.io.FileNotFoundException;
import java.util.*;


public class DataConverter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Create a FileReader object
		FlatFileReader ffr = new FlatFileReader();
		ArrayList<Person> arrPerson = ffr.readInPersons();

	ArrayList<Customer> arrCustomer = ffr.readInCustomers();

	  
	
	XMLWriter writer = new XMLWriter();
	   writer.xmlConverter(arrPerson);
	   writer.xmlConverterCustomers(arrCustomer);
	   JSONWriter Jsonwriter = new JSONWriter();
	   Jsonwriter.jsonConverter(arrPerson);
	   Jsonwriter.jsonConverterCustomer(arrCustomer);
	   
	}

}
