package Control;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import Model.BikeDatabaseModel;
import Model.CustomerModel;
import Model.PaymentModel;
import View.CreditCardView;
import View.CustomerView;
import View.LoginView;
import View.ShoppingCartView;
import data.ReadandWrite;

public class BookingControl {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
//testbyremus hghfhfh
		// Creating objects
		LoginView myLogin = new LoginView();
		CustomerView myCustomerView = new CustomerView();
		CustomerModel myCustomerModel = new CustomerModel();
		ShoppingCartView myShoppingView = new ShoppingCartView();
		BikeDatabaseModel db = new BikeDatabaseModel();
		CreditCardView myCreditCardView = new CreditCardView();
		PaymentModel myPaymentModel = new PaymentModel();
		//		ReadandWrite myReadandWrite = new ReadandWrite();

		//		myReadandWrite.importAllCustomerDetails();

		// Calling methods

		myCustomerView.welcomeView();
		myLogin.customerScreen();
		//		System.out.println(ReadandWrite.customerList.toString());	
		//		myCustomerView.exportCustomerToFile();
		db.fillDatabase();
		db.browseCatalogue();
		myShoppingView.selectingBikes();
		myShoppingView.printBasket();
		myCreditCardView.CreditCardRegistration();
		myCustomerView.pickUp();
		myPaymentModel.printReceipt();
	}
}
