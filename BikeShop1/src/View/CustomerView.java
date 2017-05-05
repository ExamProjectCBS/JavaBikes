package View;
import java.util.ArrayList;
import java.util.Scanner;
import Model.CustomerModel;
import data.ReadandWrite;

public class CustomerView {

	private String firstName, lastName, phoneNumber, address, postCode, dob, cpr, username, password;

	public CustomerView () {

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
	//getting all customer details for one customer and checking the correctness of the input
	public void CustomerRegistration(){

		Scanner input = new Scanner(System.in); 


		System.out.print("\n Type in your forename: ");
		String firstName = input.nextLine();
		this.firstName = firstName;

		System.out.print("\n Type in your lastname: ");
		String lastName = input.nextLine();
		this.lastName = lastName;

		boolean phoneCorrect = false;
		while(!phoneCorrect) {
			System.out.println("\n Please enter your phone number consisting of 8 digits:");
			String phoneNumber = input.nextLine();
			if((phoneNumber.matches(("[0-9]+")) && phoneNumber.length()==8)) {
				this.phoneNumber = phoneNumber; 
				phoneCorrect = true;
			}
			else
				System.out.println("\n Invalid number, please type a phone number consisting of 8 digits " + phoneNumber);
		}

		System.out.println("\n Please type in a valid street address with a house number");
		String address = input.nextLine();
		this.address = address;


		String pattern ="\\d\\d\\d\\d";
		String postCode;
		boolean postCodeCorrect = false;
		while (!postCodeCorrect) {
			System.out.print("\n Please enter your post code within (we only ship to Copenhagen area): "); 
			postCode = input.next();
			if(postCode.matches(pattern) && Integer.parseInt(postCode) <= 2500) {
				postCodeCorrect = true;
				this.postCode = postCode;
			}
			else
				System.out.print("\n The post code must consist of 4 digits and belong to CPH area. "
						+ "You have entered: " + postCode); 
		}

		String pattern2 = "\\d\\d\\-\\d\\d\\-\\d\\d";
		String dob;
		boolean dobCorrect = false;
		while(!dobCorrect) {
			System.out.println("\n Please enter the Date of Birth XX-XX-XX");
			dob = input.next();
			if(dob.matches(pattern2)) {
				dobCorrect = true;
				this.dob = dob; 
			}
			else
				System.out.println("Invalid DOB, please type in your DOB in the format XX-XX-XX");

		}

		String pattern3 = "\\d\\d\\d\\d\\d\\d\\-\\d\\d\\d\\d";
		String cpr = null;
		boolean cprCorrect = false;
		while(!cprCorrect) {
			System.out.println("\n Please enter the CPR in the following format 123456-1234 :");
			cpr = input.next();
			if(cpr.matches(pattern3)) {
				cprCorrect = true;
				this.cpr = cpr; 
			}
			else
				System.out.println("Invalid CPR, please type in your CPR in the following format: 123456-1234");

		}

		//Generating userName
		String username = firstName.charAt(0) + lastName.substring(0, 3);
		System.out.println("=================================================================");
		System.out.println("\n Your username is " + username);
		this.username = username;


		//Generating password
		String password = lastName.substring(0, 3) + cpr.substring(7, 10);
		System.out.println("\n Your password is " + password + "\n");
		System.out.println("=================================================================");
		this.password = password;

		exportCustomerToFile();

	}

	public void loginCheck(){
		ReadandWrite myReadandWrite = new ReadandWrite();
		ArrayList <CustomerModel> customerList = myReadandWrite.importAllCustomerDetails();
		Scanner input = new Scanner(System.in);

		System.out.println("\n=================================================================");
		System.out.println("You want to log in as an existing customer ");
		System.out.println("=================================================================\n");

		String username = null;
		

			System.out.println("Please type in your username ");
			username = input.next();
			boolean usernameCorrect = false;
			this.username = username;
			while(!usernameCorrect) {


			for (int i = 0; i< customerList.size(); i++) {
				CustomerModel customer = customerList.get(i);
				String userUsername = customer.getUsername();
				if(username.equals(userUsername)) {
					System.out.println("Username correct");
					usernameCorrect = true;
					break;
					//this.username = username; 
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
					System.out.println("Password correct");
					passwordCorrect = true;
					break;
				}
				else
					System.out.println("Password was not found in database, please try again");
			}


		}
		System.out.println("\n=================================================================");
		System.out.println("You are now logged in as a registered user!");
		System.out.println("=================================================================\n");

	}


	public void exportCustomerToFile(){
		String details = lastName + ";" + firstName + ";" + getUsername() + ";" + getPassword() + ";" + address +";" + cpr + ";"+ phoneNumber+ ";";
		ReadandWrite.ExportDetails("customer.txt", details);
		System.out.println("\n You were added to our database");	
	}

	public void pickUp (){
		Scanner input = new Scanner(System.in);
		System.out.println("At which branch would you like to pick up your bikes? Chose 1 for CBS HQ Frederiksberg or 2 for Aarhus Campus");
		String pickUpChoice = input.nextLine();
		switch(pickUpChoice){
		case "1":
			System.out.println(" * Your ordered bike(s) will await you at CBS HQ Frederiksberg, Solbjerg Pl. 3, 2000 Frederiksberg *");
			pickUpChoice = "CBS HQ Frederiksberg, Solbjerg Pl. 3, 2000 Frederiksberg ";
			break;
		case "2":
			System.out.println(" * Your ordered bike(s) will await you at Arhus Campus, Nordre Ringgade 1, 8000 Aarhus C");
			pickUpChoice = "Arhus Campus, Nordre Ringgade 1, 8000 Aarhus C";
			break;
		default: 				System.out.println(" * Thank you for shopping with *");

		}
	}
	//	public void printCustomerRegistration(CustomerModel myCustomer) {
	//		System.out.println(myCustomer.toString());
	//	
	//	}
	//	


	//Getters and setters
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}