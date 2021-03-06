package Model;
import data.ReadandWrite;

import java.util.ArrayList;
import java.util.Scanner;;

public class CustomerModel {
	private String firstName, lastName, postCode, address, phoneNumber, dob, cpr, username, password;


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