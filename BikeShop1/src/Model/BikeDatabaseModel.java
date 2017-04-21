package Model;

import java.util.ArrayList;
import java.util.*;

public class BikeDatabaseModel {


	public ArrayList <BikeModel> productList = new ArrayList<BikeModel>();
	public ArrayList <NormalBikeModel> normalbikes = new ArrayList<NormalBikeModel>();
	public ArrayList <EbikeModel> ebikes = new ArrayList<EbikeModel>();
	public ArrayList <BikeOfferModel> bikeoffers = new ArrayList<BikeOfferModel>();


	public BikeDatabaseModel() { 	
	}


	//add normal bikes to database	
	public void fillNormalBikes(){
		normalbikes.add(new NormalBikeModel ("BMX", 201, 500, 10, 6));
		normalbikes.add(new NormalBikeModel ("City", 202, 400, 10, 5));
		normalbikes.add(new NormalBikeModel ("Roader", 203, 300, 10, 12));
		normalbikes.add(new NormalBikeModel ("GHL", 204, 200, 10, 21));
		normalbikes.add(new NormalBikeModel ("Basil", 205, 500, 10, 21));	
	}

	public void fillEbikes(){
		//add electric bikes to database
		ebikes.add(new EbikeModel ("eBMX", 101, 500, 10, 50, 3));
		ebikes.add(new EbikeModel ("Pegasus", 102, 500, 10, 100, 2));
		ebikes.add(new EbikeModel ("Nimbus", 103, 500, 10, 100,3));
		ebikes.add(new EbikeModel ("Bony", 104, 200, 10, 25, 12));
		ebikes.add(new EbikeModel ("Racer", 105, 1000, 10, 100, 2));
	}
	
	//add bike offers to database
	public void fillBikeOffers(){
		bikeoffers.add(new BikeOfferModel ("GreatBrand", 301, 300, 10, "31-June-2017"));
		bikeoffers.add(new BikeOfferModel ("AmazingBike", 302, 250, 10, "31-July-2017"));
	}
	
//public void fillAllBikes (){
//	productList.add(new NormalBikeModel ("BMX", 201, 500, 10, 6));
//	productList.add(new NormalBikeModel ("City", 202, 400, 10, 5));
//	productList.add(new NormalBikeModel ("Roader", 203, 300, 10, 12));
//	productList.add(new NormalBikeModel ("GHL", 204, 200, 10, 21));
//	productList.add(new NormalBikeModel ("Basil", 205, 500, 10, 21));	
//	productList.add(new EbikeModel ("eBMX", 101, 500, 10, 50, 3));
//	productList.add(new EbikeModel ("Pegasus", 102, 500, 10, 100, 2));
//	productList.add(new EbikeModel ("Nimbus", 103, 500, 10, 100,3));
//	productList.add(new EbikeModel ("Bony", 104, 200, 10, 25, 12));
//	productList.add(new EbikeModel ("Racer", 105, 1000, 10, 100, 2));
//	productList.add(new BikeOfferModel ("GreatBrand", 301, 300, 10, "31-June-2017"));
//	productList.add(new BikeOfferModel ("AmazingBike", 302, 250, 10, "31-July-2017"));
//}
//
//public void printAllBikes (){
//	System.out.println("=================================================================");
//	System.out.println("             Chose one of all of our bikes to rent ");
//	System.out.println("================================================================= \n");
//	for(int i=0; i < this.productList.size(); i++) 
//	{
//		System.out.println(this.productList.get(i).getName() +"\t ID: " + this.productList.get(i).getId() +"\t Price:  " +
//				this.productList.get(i).getPrice() +  "\t Stock:  " +	this.productList.get(i).getStockAvailable() ); 
//	}
//}

	public void fillDatabase(){
		fillNormalBikes();
		fillEbikes();
		fillBikeOffers();
	}
	
	//print normalbikemodels
		public void printNormalBikeModels() {
			System.out.println("=================================================================");
			System.out.println("             Chose one of our normal bikes to rent ");
			System.out.println("================================================================= \n");
			
			for(int i=0; i < this.normalbikes.size(); i++) 
			{
				System.out.println(this.normalbikes.get(i).getName() +"\t ID: " + this.normalbikes.get(i).getId() +"\t Price:  " +
						this.normalbikes.get(i).getPrice() +  "\t Stock:  " +	this.normalbikes.get(i).getStockAvailable() ); 
			}

		}	

		//print ebikemodels
	public void printEbikeModels() {
		System.out.println("=================================================================");
		System.out.println("             Chose one of our beautiful ebikes to rent ");
		System.out.println("================================================================= \n");
		for(int i=0; i < this.ebikes.size(); i++) 
		{
			System.out.println(this.ebikes.get(i).getName() +"\t ID: " + this.ebikes.get(i).getId() +"\t Price:  " +
					this.ebikes.get(i).getPrice() +  "\t Stock:  " +	this.ebikes.get(i).getStockAvailable() ); 
		}

	}
		

//print bikeoffers
	public void printBikeOffersModel() {
		System.out.println("=================================================================");
		System.out.println("             Chose one of our special offers ");
		System.out.println("=================================================================");
		System.out.println("These are our bike offers: \n"); 
		for(int i=0; i < this.bikeoffers.size(); i++) 
		{
			System.out.println(this.bikeoffers.get(i).getName() +"\t ID: " + this.bikeoffers.get(i).getId() +"\t Price:  " +
					this.bikeoffers.get(i).getPrice() +  "\t Stock:  " +	this.bikeoffers.get(i).getStockAvailable() ); 
		}
	}

	public void printDatabase(){
		System.out.println("=================================================================");
		System.out.println("             Chose one of our beautiful bikes to rent ");
		System.out.println("=================================================================");
		printNormalBikeModels();
		printEbikeModels();
		printBikeOffersModel();
	}


	public boolean isProduct(int product) {
		for(int i=0; i < this.normalbikes.size(); i++) { 	
			if (product == this.normalbikes.get(i).getId())
				return true;
		}
		for(int i=0; i < this.ebikes.size(); i++) { 	
			if (product == this.ebikes.get(i).getId())
				return true;
		}
		for(int i=0; i < this.bikeoffers.size(); i++) { 	
			if (product == this.bikeoffers.get(i).getId())
				return true;
		}
		return false;
	}
	

	public void findNormalBikes(int i) {
		System.out.println("You have chosen the following product: "  );		
		System.out.println(this.normalbikes.get(i).getName() +"\t ID: " + this.normalbikes.get(i).getId() +"\t Price:  " +
				this.normalbikes.get(i).getPrice() +  "\t Stock:  " +	this.normalbikes.get(i).getStockAvailable() ); 
	}
	
	public void findEbikes (int i) {
		System.out.println("You have chosen the following product: "  );		
		System.out.println(this.ebikes.get(i).getName() +"\t ID: " + this.ebikes.get(i).getId() +"\t Price:  " +
				this.ebikes.get(i).getPrice() +  "\t Stock:  " +	this.ebikes.get(i).getStockAvailable() ); 
	}
	
	public void findBikeOffers(int i){
		System.out.println("You have chosen the following product: "  );		
		System.out.println(this.bikeoffers.get(i).getName() +"\t ID: " + this.bikeoffers.get(i).getId() +"\t Price:  " +
				this.bikeoffers.get(i).getPrice() +  "\t Stock:  " +	this.bikeoffers.get(i).getStockAvailable() ); 
	}
	
	public void printProduct(int id) {
		
		for(int i=0; i < this.normalbikes.size(); i++) { 	
			if (id == this.normalbikes.get(i).getId()) {
				findNormalBikes(i);
				return;
			}
		}

		for(int i=0; i < this.ebikes.size(); i++) { 	
			if (id == this.ebikes.get(i).getId()) {
				findEbikes (i);
				return;
			}
		}
		for(int i=0; i < this.bikeoffers.size(); i++) { 	
			if (id == this.bikeoffers.get(i).getId()) {
				findBikeOffers(i);
				return;
			}
		}			
}
	
	public void browseCatalogue () {
	boolean quit = false;
	while (!quit) {
		Scanner input = new Scanner (System.in);
		System.out.println("=================================================================");
		System.out.println("             Chose one of our beautiful bikes to rent ");
		System.out.println("=================================================================");
		System.out.print("1. Normal Bikes.\n2. Ebikes.\n3. Bike offers.\n4. Log Out\nPlease select which type of bikes you want to rent (1-3): ");
		switch (input.nextLine()) {
		case "1":
			printNormalBikeModels();
			quit = true;
			break;

		case "2":
			printEbikeModels();
			quit = true;
			break;

		case "3":

			printBikeOffersModel();
			quit = true;
			break;
			
		case "4":
			System.out.println("You are quiting the bike rental catalogue now");
			quit = true;
			break;	

		}

	}
	}
	
	//getters and setters 
	public ArrayList<BikeModel> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<BikeModel> productList) {
		this.productList = productList;
	}

	public ArrayList<NormalBikeModel> getNormalbikes() {
		return normalbikes;
	}

	public void setNormalbikes(ArrayList<NormalBikeModel> normalbikes) {
		this.normalbikes = normalbikes;
	}

	public ArrayList<EbikeModel> getEbikes() {
		return ebikes;
	}

	public void setEbikes(ArrayList<EbikeModel> ebikes) {
		this.ebikes = ebikes;
	}

	public ArrayList<BikeOfferModel> getBikeoffers() {
		return bikeoffers;
	}

	public void setBikeoffers(ArrayList<BikeOfferModel> bikeoffers) {
		this.bikeoffers = bikeoffers;
	}


}