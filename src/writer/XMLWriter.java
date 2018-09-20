package writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import entities.*;
import java.util.*;

public class XMLWriter {
	
	public void XMLProductWriter(ArrayList<Product> products) throws FileNotFoundException
	{
		//creating xstream object for parsing
		XStream xstream = new XStream();
		
		//locating the file and creating print writer object for writing onto it
		File file = new File("data/products.xml");
		PrintWriter printWriter = new PrintWriter(file);
		
		//using a loop to get all elements of the arraylist
		for (int i = 0; i < products.size(); i++)
		{
			//reading in the product object and instantiating it
			Product readIn = products.get(i);
			
			//determining what type of product it is, and then changing the title of it on the xml document with an alias
			if (readIn instanceof entities.SeasonPass)
			{
				xstream.alias("Season_Pass", SeasonPass.class);
			}
			else if (readIn instanceof entities.MovieTicket)
			{
				xstream.alias("Movie_Ticket", MovieTicket.class);
			}
			else if (readIn instanceof entities.ParkingPass)
			{
				xstream.alias("Parking_Pass", ParkingPass.class);
			}
			else if (readIn instanceof entities.Refreshments)
			{
				xstream.alias("Refreshments", Refreshments.class);
			}
			
			//converting from string to xml then writing
			String nameNew = xstream.toXML(readIn);
			printWriter.write(nameNew);
			
		}
		printWriter.close();
			
	}


	
}
