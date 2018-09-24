package writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import com.thoughtworks.xstream.XStream;

import entities.Address;
import entities.Customer;
import entities.Person;

public class XMLWriter {

private XStream xstream = null;
	
	public XMLWriter() {
		this.xstream = new XStream();
	
		xstream.alias("person", Person.class);
		xstream.alias("email", String.class);
	}


	public void xmlConverter(List<Person> persons) {
        File xmlOutput = new File("data/Persons.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		
		for(Person aPerson : persons) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(aPerson);
			xmlPrintWriter.write(personOutput);
		}
		xmlPrintWriter.close();	
	}



	public void xmlConverterCustomers(List<Customer> customer) {
        File xmlOutput = new File("data/Customer.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		
		for(Customer aCustomer : customer) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(aCustomer);
			xmlPrintWriter.write(personOutput);
		}
		xmlPrintWriter.close();	
	}

	
}
