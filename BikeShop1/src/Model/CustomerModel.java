package Model;
import data.ReadandWrite;

import java.util.ArrayList;
import java.util.Scanner;;

public class CustomerModel {
	private String firstName;
	private String lastName;
	private String postCode;
	private String address;
	private String phoneNumber;
	private String dob;
	private String cpr;
	private String username;
	private String password;


	//Creating a customer object
	public CustomerModel (){

	}
	CustomerModel  (String firstName, String lastName, String postCode, String address, String phoneNumber, String DOB, String CPR, String userName, String password){
		this.firstName = firstName;
		this.lastName = lastName;
		this.postCode = postCode;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
		this.cpr = cpr;
		this.username = username;
		this.password = password;
	}

	public String toString(){
		return (firstName+ " " + lastName + " " + address + " " + cpr + " " + phoneNumber);

	}



	public void exportToFile(){
		String details = lastName+ "; " + firstName + ";" + getUsername() + ";" + getPassword() + ";" + address +";" + cpr + ";"+ phoneNumber+ ";";
		ReadandWrite.ExportDetails("customer.txt", details);
		System.out.println("Customer added to database");
	}

	public void loginCheck(){
		ReadandWrite myReadandWrite = new ReadandWrite();
		ArrayList <CustomerModel> customerList = myReadandWrite.importAllCustomerDetails();
		Scanner input = new Scanner(System.in);

		System.out.println("\n=================================================================");
		System.out.println("You want to log in as an existing customer ");
		System.out.println("=================================================================\n");

		String username = null;
		boolean usernameCorrect = false;
		while(!usernameCorrect) {


			System.out.println("Please type in your username ");
			username = input.next();

			for (int i = 0; i< customerList.size(); i++) {
				CustomerModel customer = customerList.get(i);
				String userUsername = customer.getUsername();
				if(username.equals(userUsername)) {
					System.out.println("Username correct");
					usernameCorrect = true;
					//					this.username = username; 
				}
				else
					System.out.println("Username was not found in database, please try again");
			}


		}


		String password = null;
		boolean passwordCorrect = false;
		while(!passwordCorrect) {
			System.out.println("Please type in your password ");
			password = input.next();

			for (int i = 0; i < customerList.size(); i++){
				CustomerModel customer = customerList.get(i);
				String userPassword = customer.getPassword();
				if(password.equals(userPassword)) {
					passwordCorrect = true;
					System.out.println("Password correct");

					this.password = password; 
				}
				else
					System.out.println("Password was not found in database, please try again");
			}


		}
		System.out.println("\n=================================================================");
		System.out.println("You are now logged in as a registered user!");
		System.out.println("=================================================================\n");

	}

	public void welcomeView() {
		System.out.println("       Welcome to our Javabikes Webshop \n");
		System.out.println("************************************************");
		System.out.println ("\n    SSSSS    HH  HH    OOO      PPPPP");
		System.out.println ("    SS       HH  HH  OO    OO   P    P");
		System.out.println ("    SS       HH  HH  O      O   P    P");
		System.out.println ("    SSSS     HHHHHH  O      O   PPPPP");
		System.out.println ("      SS     HH  HH  O      O   P");
		System.out.println ("      SS     HH  HH  OO   OO    P");
		System.out.println ("   SSSSS     HH  HH    OOO      P");
		System.out.println ("                                      ");
		System.out.println ("                                      ");
		System.out.println("************************************************");

	}

	 
	//Generating getters and setters of the variables
	public String getFirstName() {
		return firstName;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCPR() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}