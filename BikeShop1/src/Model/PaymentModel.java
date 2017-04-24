package Model;

import View.CustomerView;

public class PaymentModel {

	CustomerView myCustomerView = new CustomerView();
	
	public void printReceipt(){
		System.out.println("+++ Payment provider's authorization successful. +++");
		System.out.println("         Order Confirmation");
		System.out.println("--------------------------------------------");
		System.out.println("You chose the following products\n");
		System.out.println("ID:\t"+ "Product Name\t" + "Price");
		System.out.println("The total amount is: " + "Kr.");
		System.out.println("The final price (including shipping) is: " + "Kr.");
		System.out.println("+++ Confirmed! +++");


	}

}
