package driver;

import entities.*;
import reader.*;

import java.io.FileNotFoundException;
import java.util.*;

public class DataConverter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Create a FileReader object
		FlatFileReader ffr = new FlatFileReader();
		
		ArrayList arr = new ArrayList();
		ffr.readInPersons();
		
		for (int i = 0; i < arr.size(); i++)
		{
			System.out.println(arr.get(i).toString());
		}
	}

}
