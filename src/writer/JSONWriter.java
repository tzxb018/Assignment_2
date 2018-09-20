package writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;

import entities.*;

public class JSONWriter {

	public void jsonPersonConverter(ArrayList<Person> Persons) throws FileNotFoundException
	{
		//creating json and files to write to 
		/*
		Gson gson = new Gson();
		File file = new File("data/person.json");
		PrintWriter printWriter = new PrintWriter(file);
		
		//finding each element of the persons array (not finished)
		for (int i = 0; i < Persons.size(); i++) {
			Person readIn = Persons.get(i);
			String nameJson = "";
			nameJson = gson.toJson(readIn);
			printWriter.write(nameJson);
			
		}
		printWriter.close();*/
	}
	
	public void jsonProductConverter(ArrayList<Product> products) throws FileNotFoundException
	{
		//creating json converter
		Gson gson = new Gson();
		File file = new File("data/products.json");
		PrintWriter printWriter = new PrintWriter(file);
		
		//finding each element in the product array
		for (int i = 0; i < products.size(); i++)
		{
			//obtaining product from arraylist
			Product product = products.get(i);
			
			//converting to json
			String jsonString = gson.toJson(product);
			
			//Writing to file
			printWriter.write(jsonString);
			
		}
		
		printWriter.close();
	}
	
}
