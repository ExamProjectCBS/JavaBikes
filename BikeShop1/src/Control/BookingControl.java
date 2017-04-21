package Control;
import View.CustomerView;
import View.WelcomeView;
import View.LoginView;
import Model.BikeDatabaseModel;
import Model.BikeModel;
import Model.CustomerModel;
import Model.EbikeModel;
import Model.NormalBikeModel;
import Model.BikeOfferModel;
import View.ShoppingCartView;
import View.CreditCardView;
import java.util.ArrayList;
import java.util.Scanner;

import Control.CustomerControl;


public class BookingControl {

	public static void main(String[] args) {

//Tests get less annyoing
		Scanner input = new Scanner(System.in);

		//Creating objects
		LoginView myLogin = new LoginView();

		CustomerView myCustomerView = new CustomerView();

		ShoppingCartView myShoppingView1 = new ShoppingCartView();

		BikeDatabaseModel db = new BikeDatabaseModel();
		
		CreditCardView myCreditCardView = new CreditCardView();
		
		
		
		//Calling methods
//		myLogin.customerScreen();
		db.fillDatabase();
//		db.browseCatalogue();

//		myShoppingView1.insertInBasket(101, 10);
		
		
		// Selection of products by customer and placing them to basket
				boolean shopping = false; 
				int productSelect;
				int quantitySelect;
		
				
				while (!shopping) {
					System.out.println("=================================================================");
					System.out.print("\n Please enter the ID of the bike you want to rent: "); 
					System.out.println("=================================================================");

					productSelect= input.nextInt();
				

					if (db.isProduct(productSelect)){
						db.printProduct(productSelect);
						
						System.out.println("=================================================================");
						System.out.print("Please enter the amount of of bikes of this model: ");
						System.out.println("=================================================================");

						quantitySelect = input.nextInt();
						myShoppingView1.insertInBasket(productSelect,quantitySelect);
		
						System.out.println("\n Would you like to continue shopping? Press 1 to continue and 2 for exiting ");
						int continueShopping = input.nextInt();
						switch (continueShopping){
						case 1: 
							shopping = false;
							break;
						case 2:
							shopping = true;
							break;
		
					}
					}
					else
						System.out.print("Product was not found");
		

	}

				myShoppingView1.printBasket();
//				myCreditCardView.CreditCardRegistration();

}
}

