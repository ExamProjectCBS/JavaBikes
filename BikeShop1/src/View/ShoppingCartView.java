package View;

import java.util.*;
import java.util.jar.Attributes.Name;

import Model.BikeDatabaseModel;
import Model.CustomerModel;
import Model.ShoppingProductModel;


public class ShoppingCartView {
	BikeDatabaseModel db = new BikeDatabaseModel();

	public ArrayList<ShoppingProductModel> basket;

	public void selectingBikes(){
		// Selection of products by customer and placing them to basket
		Scanner input = new Scanner (System.in);
		db.fillDatabase();
		boolean shopping = false;
		int productSelect;
		int quantitySelect;
		

		while (!shopping) {
			System.out.println("\n=====================================");
			System.out.print("\n Please enter the ID of the bike you want to rent: ");
			System.out.println("=====================================");

			productSelect = input.nextInt();

			if (db.isProduct(productSelect)) {
				db.printProduct(productSelect);
				

				System.out.println("=====================================");
				System.out.print("\n Please enter the amount of of bikes of this model: ");
				System.out.println("=====================================");

				quantitySelect = input.nextInt();
				insertInBasket(productSelect, quantitySelect);

				System.out.println("\n Would you like to continue shopping? Press 1 to continue and 2 for exiting ");
				int continueShopping = input.nextInt();
				switch (continueShopping) {
				case 1:
					db.browseCatalogue();
					break;
				case 2:
					shopping = true;
					break;

				}
			} else
				System.out.print("Product was not found");

		}
	}

	public ShoppingCartView(){
		this.basket = new ArrayList<ShoppingProductModel>();
	}

	public void insertInBasket(int id, int quantity) {
		String name = null;
		this.basket.add(new ShoppingProductModel(name,id,quantity));
	}

	public void printBasket() {
		System.out.println("=====================================");
		System.out.println("\n Products in your Shopping Basket : ");
		System.out.println("=====================================\n");
		for(int i=0; i < basket.size(); i++) { 

			if (this.basket.get(i).getId() > 100 && this.basket.get(i).getId()<200) 
				System.out.print("Ebikes in your shopping basket\n" +"\t Name" + this.basket.get(i).getBikeType() + "\t IDtest: " + this.basket.get(i).getId() +"\t Quantity:  " +
						this.basket.get(i).getQuantity()  + this.basket.get(i).getPrice() + "\n" );
			else if (this.basket.get(i).getId()  > 200 &&	  this.basket.get(i).getId()<300)
				System.out.print("Normal bikes in your shopping basket \n");
			else
				System.out.print("Bike offers in your shopping basket \n");
			System.out.println(this.basket.get(i).getName());
			System.out.println("\t Name" + this.basket.get(i).getName() + this.basket.get(i).getName() + "\t IDtest: " + this.basket.get(i).getId() +"\t Quantity:  " +
					this.basket.get(i).getQuantity() + "\n");
System.out.println("=================test====================");
		//	System.out.println("The total sum of your orders is " + this.basket.get(i).getPrice()*this.basket.get(i).getQuantity() );
		//  System.out.println("Price is " + this.basket.get(i).getPrice());
		
					
					
		}

	}


}