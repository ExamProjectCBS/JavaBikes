package Model;

import data.ReadandWrite;

import java.util.*;

import View.LoginView;

public class BikeDatabaseModel {

	ReadandWrite myReadandWrite = new ReadandWrite();
	
	public ArrayList <BikeModel> productList = myReadandWrite.importAllProductDetails();

	public ArrayList <BikeModel> normalbikes = new ArrayList<BikeModel>();
	public ArrayList <BikeModel> ebikes = new ArrayList<BikeModel>();
	public ArrayList <BikeModel> bikeoffers = new ArrayList<BikeModel>();


	public BikeDatabaseModel() { 	
	}

	public void fillEbikes(){
		//add electric bikes to database
		ebikes.add(new EbikeModel ("Ebike","eBMX", 101, 500, 10, 50, 3));
		ebikes.add(new EbikeModel ("Ebike","Pegasus", 102, 500, 10, 100, 2));
		ebikes.add(new EbikeModel ("Ebike","Nimbus", 103, 500, 10, 100,3));
		ebikes.add(new EbikeModel ("Ebike","Bony", 104, 200, 10, 25, 12));
		ebikes.add(new EbikeModel ("Ebike","Racer", 105, 1000, 10, 100, 2));
	}

	//add normal bikes to database	
	public void fillNormalBikes(){
		normalbikes.add(new NormalBikeModel ("NormalBike", "BMX", 201, 500, 10, 6));
		normalbikes.add(new NormalBikeModel ("NormalBike", "City", 202, 400, 10, 5));
		normalbikes.add(new NormalBikeModel ("NormalBike", "Roader", 203, 300, 10, 12));
		normalbikes.add(new NormalBikeModel ("NormalBike", "GHL", 204, 200, 10, 21));
		normalbikes.add(new NormalBikeModel ("NormalBike", "Basil", 205, 500, 10, 21));	
	}

	//add bike offers to database
	public void fillBikeOffers(){
		bikeoffers.add(new BikeOfferModel ("BikeOffer","GreatBrand", 301, 300, 10, "31-June-2017"));
		bikeoffers.add(new BikeOfferModel ("BikeOffer","AmazingBike", 302, 250, 10, "31-July-2017"));
	}


	public void fillDatabase(){
		fillNormalBikes();
		fillEbikes();
		fillBikeOffers();

//		productList.addAll(normalbikes);
//		productList.addAll(ebikes);
//		productList.addAll(bikeoffers);
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
			System.out.print("1. Ebikes.\n2. Normal Bikes.\n3. Bike offers.\n4. Log Out\nPlease select which type of bikes you want to rent (1-3): ");
			switch (input.nextLine()) {
			case "1":
				printEbikeModels();
				quit = true;
				break;

			case "2":
				printNormalBikeModels();
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

	public void deleteBikes (){
		Scanner input = new Scanner (System.in);

		System.out.println("Please write the ID of the bike you want to delete");
		String pattern3 = "\\d\\d\\d";
		String idBike = null;
		boolean idBikeCorrect = false;
		while(!idBikeCorrect) {
			System.out.println("\n Please enter the Bike in the following format XXX :");
			idBike = input.next();
			if(idBike.matches(pattern3)) {
				idBikeCorrect = true;
			}
			else
				System.out.println("Invalid BikeID, please enter the Bike in the following format XXX");

			int index = 100;
			BikeModel bikeDelete = null;
			boolean bikeidFound = false;
			int integerIdBike = Integer.parseInt(idBike);
			for (int i=0; i < productList.size(); i++){
				BikeModel bike = productList.get(i);
				int actualbikeid = bike.getId();
				if (integerIdBike == actualbikeid){
					index = i;	
					bikeDelete = bike;
					bikeidFound = true;
				}	

			}

			if (bikeidFound){
				productList.remove(index);
				System.out.println("\n Bike " + bikeDelete.getId() + " was deleted from our database");	

			}
			else {
				System.out.println("BikeID was not found. Please enter the ID of an existing user");
			}

			ReadandWrite.ExportNewBikes("newBikes.txt", productList);

		}
	}

	public void addBikes () {
		Scanner input = new Scanner (System.in);

		boolean biketypeCorrect = false;
		String biketype = null;
		while (!biketypeCorrect){
			System.out.println("\n Please enter the type of the bike you want to add, chose between Ebike,NormalBike and BikeOffer");
			biketype = input.nextLine();
			if ((biketype.equals("Ebike")) || (biketype.equals("NormalBike")) || !biketype.equals("BikeOffer")) {
				biketypeCorrect = true;
			}
			else {
				System.out.println("\n Please enter a valid BikeType, chose between Ebike, NormalBike and BikeOffer: " + "You have entered " + biketype);
			}
		}

		System.out.println("\n Chose the name of the model");
		String modelName = input.nextLine();

		String pattern ="\\d\\d\\d";
		boolean idCorrect = false;
		String id = null;
		while (!idCorrect) {
			System.out.println("\n Chose an ID > 105 for Ebike,  > 205 for NormalBike and > 302 for BikeOffer");
			id = input.next();
			 if(id.matches(pattern)) /*&& (Integer.parseInt(id) >= 105 && Integer.parseInt(id) <= 200) || (Integer.parseInt(id) >= 205 && Integer.parseInt(id)  <= 300) || Integer.parseInt(id) >= 302) */{
				idCorrect = true;
			}
			else
				System.out.print("\n The ID must consist of 3 digits. "
						+ "You have entered: " + id); 
		}

		String pattern2 = "\\d\\d\\d\\d\\d\\d";
		String price = null;
		boolean priceCorrect = false;
		while(!priceCorrect) {
			System.out.println("\n Chose a price for the bike you want to add");
			price = input.nextLine();
			if(price.matches(pattern2)) {
				priceCorrect = true;
				}
			else
				System.out.println("Invalid Price, please type in a price less then 100.000 kr");
		}
			
		
		System.out.println("\n Chose the amount of bikes available of this type");
		String stockAvailable = input.nextLine();

		bikesExportToFile(biketype, modelName, id, price, stockAvailable);

	}	

	public void bikesExportToFile (String biketype, String modelName, String id, String price, String stockAvailable){
		String details = biketype + ";" + modelName + ";" + id + ";" + stockAvailable;
		ReadandWrite.ExportDetails("bikes.txt", details);
		System.out.println("\n Bike was added to our database");	
	}
	
	


}