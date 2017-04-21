package View;
import java.util.Scanner;
import Model.CustomerModel;

public class CustomerView {

	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String postCode;
	private String dob;
	private String cpr;
	private String username;
	private String password;
	
	public CustomerView () {
		
	}
	
	CustomerModel myCustomer = new CustomerModel();
//getting all customer details for one customer and checking the correctness of the input

	public void CustomerRegistration(){
		

		Scanner input = new Scanner(System.in); 
		

		System.out.print("Type in your forename: ");
		String firstName = input.nextLine();
		this.firstName = firstName;
		
		System.out.print("Type in your lastname: ");
		String lastName = input.nextLine();
		this.lastName = lastName;
		
		boolean phoneCorrect = false;
		while(!phoneCorrect) {
			System.out.println("\n Please enter your phone number consisting of 8 digits:");
			String phone = input.nextLine();
			if((phone.matches(("[0-9]+")) && phone.length()==8)) {
				this.phone = phone; 
				phoneCorrect = true;}
			else
				System.out.println("\n Invalid number, please type a phone number consisting of 8 digits " + phone);
		}
		
		System.out.println("Please type in a valid street address with a house number");
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
				System.out.println("Please enter the Date of Birth XX-XX-XX");
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
				System.out.println("Please enter the CPR in the following format 123456-1234 :");
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
			System.out.println("Your username is " + username);
			this.username = username;

			
			//Generating password
			String password = lastName.substring(0, 3) + cpr.substring(7, 10);
			System.out.println("Your password is " + password);
			this.password = password;
		
		
	}
	
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

//	System.out.println(myCustomer.toString());
	
}