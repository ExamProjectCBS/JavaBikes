package View;
import java.util.ArrayList;
import java.util.Scanner;
import Model.CustomerModel;
import Model.ManagerModel;
import data.ReadandWrite;

public class LoginView {
	CustomerView myCustomerView = new CustomerView();
	CustomerModel myCustomerModel = new CustomerModel();
	ReadandWrite myReadandWrite = new ReadandWrite();
	ManagerModel myManagerModel = new ManagerModel();

	Scanner input = new Scanner(System.in);

	public void customerScreen() {  // Login method

		boolean correct = false;

		while (!correct) { // check to make sure the input is one of the options
			System.out.println("\n Please select one of the options by typing '1', '2', '3' or '4'.");
			System.out.println("\n1. I would like to register as a new customer.");
			System.out.println("\n2. I would like to sign-in as a registered customer.");
			System.out.println("\n3. I would like to sign-in as a store manager");
			System.out.println("\n4. I would like to quit.\n");

			String login = input.next();

			switch (login) {
			case "1": 
				System.out.println("\n WELCOME TO THE BIKESHOP - Please register using the instructions below \n");
				myCustomerView.CustomerRegistration();
				loginVerification();
				correct = true;
				break;

			case "2":

				myCustomerView.loginCheck();
				correct = true;
				break;

			case "3":
				//				loginVerification();
				//								myManagerModel.editingCustomerDb();
				myReadandWrite.importAllProductDetails();
				myManagerModel.editingBikeDb();
				correct =true;
				break;
			case "4": 
				System.out.println("\n See you next time! ;) ");
				correct = true;
				System.exit(1);
			default: 
				System.out.println(" * Error: invalid status. Please try again. *");
				correct = false;
			}

		}

	}

	public void loginVerification() { //Verification of customer input
		boolean loginCorrect;
		int i = 0;
		String adminUser = "admin";
		String adminPassword = "1234";

		do {

			System.out.println("\n Please enter your user name to log in: ");  
			String user = input.next();
			System.out.println("Please enter your password to log in: ");  
			String pass = input.next();


			if (user.equals(myCustomerView.getUsername()) && pass.equals(myCustomerView.getPassword()) && i < 4) {
				System.out.println("=================================================================");
				System.out.print("\n Thank you! You are now logged in...\n");
				System.out.println("=================================================================\n");

				loginCorrect = true;
			}
			else if ((user.equals(adminUser)) && (pass.equals(adminPassword)) && i< 4) {
				System.out.print("\n Welcome, admin! You are now logged in...\n");
				loginCorrect = true;
			}

			else {
				System.out.println("You've entered wrong password and/or username. ");
				loginCorrect = false; 
				i++; 
			}
			if (i>2) {
				System.out.println("\n Sorry you have exceeded the number of tries. Please try again after a few hours. :) ");
				loginCorrect = true; 
				System.exit(1);
			}

		}
		while (!loginCorrect);
	}

}

