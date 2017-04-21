package View;

import java.util.*;

import Model.BikeDatabaseModel;
import Model.CustomerModel;
import Model.ShoppingProductModel;


public class ShoppingCartView {
	
	public ArrayList<ShoppingProductModel> basket;


	public ShoppingCartView(){
		this.basket = new ArrayList<ShoppingProductModel>();
	}

	public void insertInBasket(int id, int quantity) {
		this.basket.add(new ShoppingProductModel(id,quantity));
	}

	public void printBasket() {
		System.out.println("=====================================");
		System.out.println("\n Products in your Shopping Basket : ");
		System.out.println("=====================================");
		for(int i=0; i < basket.size(); i++) { 

			if (this.basket.get(i).getId() > 100 && this.basket.get(i).getId()<200) 
				System.out.print("Ebikes in your shopping basket\n");
			else if (this.basket.get(i).getId() > 200 &&  this.basket.get(i).getId()<300)
				System.out.print("Normal bikes in your shopping basket \n");
			else
				System.out.print("Bike offers in your shopping basket \n");

			System.out.println("\t ID: " + this.basket.get(i).getId() +"\t Quantity:  " +
					this.basket.get(i).getQuantity() );
		}
	}
	

}