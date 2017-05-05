package Model;

import View.CustomerView;
import View.Receipt;
import View.ShoppingCartView;
import Model.CustomerModel;

import java.util.ArrayList;

import Model.BikeModel;
import Model.NormalBikeModel;

public class ReceiptModel {
	


	CustomerView myCustomerView = new CustomerView();
	Receipt myReceiptView = new Receipt();
	
	
	
public void printReceipt(ShoppingCartView myShoppingView){
		
		ArrayList<ShoppingProductModel> basketContent = myShoppingView.basket;
		

		
		System.out.println("+++ Receipt provider's authorization successful. +++"); 
		System.out.println("         Order Confirmation");
		System.out.println("--------------------------------------------" );
		System.out.println("You chose the following products\n" );
	//	System.out.println("ID:\t" + "Product Name\t" + "Price\t" + "Quantity");
		
		double sum = 0;
		double finalPrice = sum + 50.00;
		for(int i=0; i<basketContent.size(); i++){
			sum += basketContent.get(i).getPrice() * basketContent.get(i).getQuantity();
			System.out.println("ID:\t" + basketContent.get(i).getId() + "\t" + "Product Name\t" + basketContent.get(i).getName() + "\t" + "Price\t" + basketContent.get(i).getPrice()  + "Quantity\t" + basketContent.get(i).getQuantity());
		}
		
		
		System.out.println("--------------------------------------------" );
		System.out.println("The total amount is: " + sum + "Kr.");
		System.out.println("The final price (including shipping) is: " + finalPrice +  "Kr.");
		System.out.println("+++ Confirmed! +++");
		

		
	}


}
