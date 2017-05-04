package View;

import Model.BikeModel;
import Model.CustomerModel;

public class TestofReceipt {
	
	private String invoice;
	
	private CustomerModel myCustomer; 

	
	void Invoice(BikeModel currentBike, CustomerModel currentCustomer){
		myCustomer = currentCustomer;
		invoice = "";
		
		
		
		nvoice += "         ---------------------------------------------\n";
		invoice += "                    >  WELCOME TO JAVABIKES  <  \n";
		invoice += "         ---------------------------------------------\n\n";
		invoice += "                        ~~ BIKE INFO ~~\n";
		invoice += String.format("                Bike Type:            %9s\n", currentBike.getBikeTypeString());
		invoice += String.format("                Color:                   %6s\n", currentBike.getColor());
		invoice += String.format("                Electric:                   %3s\n\n", electricText);
		invoice += "                        ~~ YOUR INFO ~~\n";
		invoice += String.format("          Name:        %30s\n", currentCustomer.getName());
		invoice += String.format("          Surname:     %30s\n", currentCustomer.getSurname());
		invoice += String.format("          e-mail:%36s\n", currentCustomer.getEmail());
		invoice += String.format("          Document:              %20s\n\n", currentCustomer.getDocument());
		invoice += "                        ~ PAYMENT INFO ~\n";
		invoice += String.format("                %10s                %5s\n", DateString, TimeString);
		invoice += String.format("                Credit Card:   **** **** **** %4s\n", currentCard.getHiddenNumber());
		invoice += String.format("                Subtotal:                %.2f DKK\n", (currentBike.getPrice() * 0.75));		
		invoice += String.format("                VAT - 25%%:               %.2f DKK\n\n", (currentBike.getPrice() * 0.25));		
		invoice += String.format("                Total:                   %.2f DKK\n\n", ((double)currentBike.getPrice()));		
		invoice += "                          THANK YOU!\n\n";
		invoice += "                         -------- __@\n" ;

		
		
	
	}
	
	public String getInvoice() {
		return invoice;
	}
	
	public void printInvoice() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(invoice);
	}
	
}
