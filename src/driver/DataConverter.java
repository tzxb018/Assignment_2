package driver;

import entities.*;
import reader.*;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;
import writer.*;

public class DataConverter {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		
		//Create a FileReader object
		FlatFileReader ffr = new FlatFileReader();
		
		ArrayList<Product> arrProducts = new ArrayList<Product>();
		
		arrProducts = ffr.readInProducts();
		
		JSONWriter jsonWriter = new JSONWriter();
		jsonWriter.jsonProductConverter(arrProducts);
		XMLWriter xmlWriter = new XMLWriter();
		xmlWriter.XMLProductWriter(arrProducts);
	}

}
