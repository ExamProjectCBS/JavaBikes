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

	
	public static Scanner importDetails( String file){
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

	public static CustomerModel importCustomer(String line){
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
				
//				System.out.println(customerFromFile.toString());	
//				System.out.println("Customer imported");
				
	     return customerFromFile;

	}
	
	public ArrayList<CustomerModel> importAllCustomerDetails(){
		
		ArrayList<CustomerModel> customerList = new ArrayList<CustomerModel>();
		Scanner input = importDetails("customer.txt");
		

		// checking each line 
		while (input.hasNextLine()) {
			customerList.add(importCustomer(input.nextLine()));//passing each line to the method getCustomer which returns a customer
			} 								//then added to a ArrayList
		
		return customerList;
	}
	
	public void printCustomerDetails(){
		System.out.println("===================================================================================================================================================================================================");
		ArrayList<CustomerModel> customerList = new ArrayList<CustomerModel>();

		for(int i=0; i < customerList.size(); i++) 
		{
			CustomerModel customer = customerList.get(i);
			System.out.println("\t Last Name: " + customer.getLastName() + "\t First Name:  " + customer.getFirstName() +
					"\t Username:  " + customer.getUsername() +	"\t Password: " + customer.getPassword() + "\t Address: " + customer.getAddress() + "\t CPR " + customer.getCPR() + "\t Phonenumber: " + customer.getPhoneNumber()); 
		}
		System.out.println("===================================================================================================================================================================================================");

	}
//	public static BikeModel importBikes(String line){
//		
//		String[] values = line.split(";"); 
//		if (values[0].equals("NormalBike")){
//			int id = Integer.parseInt(values[2]);
//			double price = Double.parseDouble(values[3]);
//			int stockAvailable = Integer.parseInt(values[4]);
//			int gears = Integer.parseInt(values[5]);
//			NormalBikeModel NormalBikeModelFromFile = new NormalBikeModel(values[0], values[1], id, price, stockAvailable, gears);
//			
//			return NormalBikeModelFromFile;
//		}
//		else if (values[0].equals("Ebike")){
//			int id = Integer.parseInt(values[2]);
//			double price = Double.parseDouble(values[3]);
//			int stockAvailable = Integer.parseInt(values[4]);
//			int batteryRange = Integer.parseInt(values[5]);
//			int chargingTime = Integer.parseInt(values[6]);
//			EbikeModel EbikeModelFromFile = new EbikeModel(values[0], values[1], id, price, stockAvailable, batteryRange, chargingTime);
//			
//			return 	EbikeModelFromFile;	
//		}
//		
//		else {
//
//			int id = Integer.parseInt(values[2]);
//			double price = Double.parseDouble(values[3]);
//			int stockAvailable = Integer.parseInt(values[4]);
//			BikeOfferModel BikeOfferModelFromFile = new BikeOfferModel(values [0], values[1], id, price, stockAvailable, values[5]);
//			
//			return BikeOfferModelFromFile;
//		}	
//		
//	}



//	public  ArrayList<BikeModel> importAllProductDetails(){
//		ArrayList<BikeModel> productList = new ArrayList<BikeModel>();
//		Scanner input = importDetails("bikes.txt");
//
//		// checking each line 
//		while (input.hasNextLine()) {
//			
//			productList.add(importBikes(input.nextLine()));//passing each line to the method getBikes which returns a Bike
//				} 								//then added to a ArrayList
//		
//		return productList;
//	}


	

	public static void ExportDetails(String file, String input){
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
	
	public static void ExportNewFile(String file, ArrayList<CustomerModel> input){
		File myFile = new File(file);
		myFile.delete();
		
		for (int i = 0; i < input.size(); i++){
			CustomerModel myCust = input.get(i);
			String details = myCust.getLastName() + ";" + myCust.getFirstName() + ";" + myCust.getUsername() + ";" + myCust.getPassword() + ";" + myCust.getAddress() +";" + myCust.getCPR() + ";"+ myCust.getPhoneNumber() + ";";
			ExportDetails(file, details);
		}
	}
	
		public static void ExportNewBikes(String file, ArrayList<BikeModel> input){
			File myFile = new File(file);
			myFile.delete();
			
			for (int i = 0; i < input.size(); i++){
				BikeModel myBikes = input.get(i);
				String details = myBikes.getName() + ";" + myBikes.getId() + ";" + myBikes.getPrice() + ";" + myBikes.getStockAvailable() + ";";
				ExportDetails(file, details);
			}
		
	}

}
