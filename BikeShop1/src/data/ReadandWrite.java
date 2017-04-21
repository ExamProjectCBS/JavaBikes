package data;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

import Model.CustomerModel;
import Model.NormalBikeModel;
import Model.EbikeModel;
import Model.BikeOfferModel;
import Model.BikeModel;

public class ReadandWrite {

	
	public static Scanner readDetails( String file){
		Scanner input = new Scanner(System.in);
		
		try {
		File ReadFile = new java.io.File(file);
		
		input = new Scanner(ReadFile);
		
	    // Close the file
	   
		}
	    catch (FileNotFoundException ex){
	    	System.out.println("Error reading the file'" + file + "'");
	    }
		return input;
	}//readDetails

	public static CustomerModel getCustomer(String line){
		CustomerModel customerFromFile = new CustomerModel();
		
		// Look for every ";" and turns the values into strings
			    String[] values = line.split(";");
			   	    	   
			// Change the String type into the correct format
				customerFromFile.setLastName(values[0]);
				customerFromFile.setFirstName(values[1]);
				customerFromFile.setUsername(values[2]);
				customerFromFile.setPassword(values[3]);
				customerFromFile.setAddress(values[4]);
				customerFromFile.setCpr(values[5]);
				customerFromFile.setPhoneNumber(values[6]);
				
	     return customerFromFile;

	}
	public static BikeModel getBikes(String line){
		
		String[] values = line.split(";"); 
		if (values[0].equals("NormalBike")){
			int id = Integer.parseInt(values[1]);
			double price = Double.parseDouble(values[2]);
			int stockAvailable = Integer.parseInt(values[3]);
			int gears = Integer.parseInt(values[4]);
			NormalBikeModel NormalBikeModelFromFile = new NormalBikeModel(values[0], id, price, stockAvailable, gears);
			
			return NormalBikeModelFromFile;
		}
		else if (values[0].equals("Ebike")){
			int id = Integer.parseInt(values[1]);
			double price = Double.parseDouble(values[2]);
			int stockAvailable = Integer.parseInt(values[3]);
			int batteryRange = Integer.parseInt(values[4]);
			int chargingTime = Integer.parseInt(values[5]);
			EbikeModel EbikeModelFromFile = new EbikeModel(values[0], id, price, stockAvailable, batteryRange, chargingTime);
			
			return 	EbikeModelFromFile;	
		}
		
		else {
			int id = Integer.parseInt(values[1]);
			double price = Double.parseDouble(values[2]);
			int stockAvailable = Integer.parseInt(values[3]);
			BikeOfferModel BikeOfferModelFromFile = new BikeOfferModel(values[0], id, price, stockAvailable, values[5]);
			
			return BikeOfferModelFromFile;
		}	
		
	}


	public static ArrayList<CustomerModel> getAllCustomerDetails(){
		ArrayList<CustomerModel> customerList = new ArrayList<CustomerModel>();
		Scanner input = readDetails("customer.txt");
		

		// checking each line 
		while (input.hasNextLine()) {
			customerList.add(getCustomer(input.nextLine()));//passing each line to the method getCustomer which returns a customer
			} 								//then added to a ArrayList
		
		return customerList;
	}

	public static ArrayList<BikeModel> getAllProductDetails(){
		ArrayList<BikeModel> productList = new ArrayList<BikeModel>();
		Scanner input = readDetails("product.txt");

		// checking each line 
		while (input.hasNextLine()) {
			
			productList.add(getBikes(input.nextLine()));//passing each line to the method getBikes which returns a Bike
				} 								//then added to a ArrayList
		
		return productList;
	}



	public static void WriteDetails(String file, String input){
		try{
		FileWriter fwriter = new FileWriter(file,true);
		PrintWriter output = new java.io.PrintWriter(fwriter);
		 // Write formatted output to the file
	    output.println(input);
	    output.close();
		}
		catch (IOException ex) {
			// if the file is not accessible, print this message
			System.out.println("Error writing to file '" + file + "'");
		}
	}//WriteDetails	
}
