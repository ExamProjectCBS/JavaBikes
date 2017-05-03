package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.CustomerModel;
import data.ReadandWrite;

public class ManagerView {

	private String username, password;

	
	ReadandWrite myReadandWrite = new ReadandWrite();
//	CustomerView myCustomerView = new CustomerView();
	ArrayList<CustomerModel> customerList = myReadandWrite.importAllCustomerDetails();

	public void ManagerLogin(){
	Scanner input = new Scanner(System.in); 
	

	System.out.print("\n Type in the users username: ");
	String username = input.nextLine();
	this.username = username;
	
	System.out.print("\n Type in the users password: ");
	String password = input.nextLine();
	this.password = password;

	}
	

	
	
	public CustomerModel addCustomer () {
		 String firstName, lastName, phoneNumber, address, postCode, dob, cpr, username, password;
		
		CustomerModel addedCustomer = new CustomerModel();
		Scanner input = new Scanner(System.in); 
		
		System.out.print("\n Type in the users forename: ");
		firstName = input.nextLine();
		
		System.out.print("\n Type in the users lastname: ");
		lastName = input.nextLine();
		
		boolean phoneCorrect = false;
		phoneNumber = null;
		while(!phoneCorrect) {
			System.out.println("\n Please enter the users phone number consisting of 8 digits:");
			phoneNumber = input.nextLine();
			if((phoneNumber.matches(("[0-9]+")) && phoneNumber.length()==8)) {

				phoneCorrect = true;}
			else
				System.out.println("\n Invalid number, please type the users phone number consisting of 8 digits " + phoneNumber);
		}
		
		System.out.println("\n Please type in the users valid street address with a house number");
		address = input.nextLine();
		
	
			String pattern ="\\d\\d\\d\\d";
			boolean postCodeCorrect = false;
			while (!postCodeCorrect) {
				System.out.print("\n Please enter the users post code within (we only ship to Copenhagen area): "); 
				postCode = input.next();
				if(postCode.matches(pattern) && Integer.parseInt(postCode) <= 2500) {
					postCodeCorrect = true;
				}
				else
					System.out.print("\n The post code must consist of 4 digits and belong to CPH area. "
							+ "You have entered: " + postCode); 
			}
			
			String pattern2 = "\\d\\d\\-\\d\\d\\-\\d\\d";
			boolean dobCorrect = false;
			while(!dobCorrect) {
				System.out.println("\n Please enter the users Date of Birth XX-XX-XX");
				dob = input.next();
				if(dob.matches(pattern2)) {
					dobCorrect = true; 
					}
				else
					System.out.println("Invalid DOB, please type in the users DOB in the format XX-XX-XX");
				
			}
			
			String pattern3 = "\\d\\d\\d\\d\\d\\d\\-\\d\\d\\d\\d";
			cpr = null;
			boolean cprCorrect = false;
			while(!cprCorrect) {
				System.out.println("\n Please enter the users CPR in the following format 123456-1234 :");
				cpr = input.next();
				if(cpr.matches(pattern3)) {
					cprCorrect = true;
					}
				else
					System.out.println("Invalid CPR, please type in your CPR in the following format: 123456-1234");
			
			}

			//Generating userName
			username = firstName.charAt(0) + lastName.substring(0, 3);
			System.out.println("=================================================================");
			System.out.println("\n Your username is " + username);

			
			//Generating password
			password = lastName.substring(0, 3) + cpr.substring(7, 10);
			System.out.println("\n The users password is " + password + "\n");
			System.out.println("=================================================================");

		
			managerExportCustomerToFile(lastName, firstName, username, password, address, cpr, phoneNumber);
		return addedCustomer;
	}
	
	public void managerExportCustomerToFile (String lastname, String firstname, String username, String password, String address, String cpr, String phoneNumber){
		String details = lastname + ";" + firstname + ";" + username + ";" + password + ";" + address +";" + cpr + ";"+ phoneNumber+ ";";
		ReadandWrite.ExportDetails("customer.txt", details);
		System.out.println("\n Customer was added to our database");	
	}
	
	public void managerExportDeleteCustomerFromFile (){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please write the CPR of the user you want to delete");
		String pattern3 = "\\d\\d\\d\\d\\d\\d\\-\\d\\d\\d\\d";
		String ManagerCpr = null;
		boolean cprCorrect = false;
		while(!cprCorrect) {
			System.out.println("\n Please enter the users CPR in the following format 123456-1234 :");
			ManagerCpr = input.next();
			if(ManagerCpr.matches(pattern3)) {
				cprCorrect = true;
				}
			else
				System.out.println("Invalid CPR, please type in your CPR in the following format: 123456-1234");
		
		int index = 100;
		CustomerModel userDelete = null;
		boolean cprFound = false;
		for (int i=0; i < customerList.size(); i++){
			CustomerModel customer = customerList.get(i);
			String userCpr = customer.getCPR();
			if (ManagerCpr.equals(userCpr)){
				index = i;	
				userDelete = customer;
				cprFound = true;
			}	
			
		}
		

		if (cprFound){
			customerList.remove(index);
			System.out.println("\n Customer " + userDelete.getFirstName() + " " + userDelete.getLastName() + " was deleted from our database");	

		}
			else {
				System.out.println("CPR was not found. Please enter the CPR of an existing user");
			}
		
		
	
		ReadandWrite.ExportNewFile("newCustomerList.txt", customerList);

	}
}
}