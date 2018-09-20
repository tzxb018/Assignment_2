package writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entities.*;

public class JSONWriter {

	public void jsonPersonConverter(ArrayList<Person> Persons) throws FileNotFoundException
	{
		
	}
	
	public void jsonProductConverter(ArrayList<Product> products) throws FileNotFoundException
	{
		//creating json converter
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File file = new File("data/products.json");
		PrintWriter printWriter = new PrintWriter(file);
		
		String jsonString = "";
		
		//finding each element in the product array
		for (int i = 0; i < products.size(); i++)
		{
			//obtaining product from arraylist
			Product product = products.get(i);
			
			//adding to json string 
		     jsonString = gson.toJson(product);
		     
			//Writing to file
			printWriter.write(jsonString + "\n");
		}

		printWriter.close();
	}
	
}
