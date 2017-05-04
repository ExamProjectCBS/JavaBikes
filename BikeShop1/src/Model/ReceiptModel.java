package Model;

import View.CustomerView;
import View.Receipt;
import View.ShoppingCartView;
import Model.CustomerModel;
import Model.BikeModel;
import Model.NormalBikeModel;

public class ReceiptModel {
	


	CustomerView myCustomerView = new CustomerView();
	Receipt myReceiptView = new Receipt();
	
	
	
	public void printReceipt(){
		System.out.println("+++ Receipt provider's authorization successful. +++"); 
		System.out.println("         Order Confirmation");
		System.out.println("--------------------------------------------" );
		System.out.println("You chose the following products\n" );
		System.out.println("ID:\t"+ "Product Name\t" + "Price");
		System.out.println("The total amount is: " + "Kr.");
		System.out.println("The final price (including shipping) is: " + "Kr.");
		System.out.println("+++ Confirmed! +++");

	}

}
