package Model;

public class BikeModel {

	private String bikeType, name;
	private int id, stockAvailable;
	private double price;

	
	public BikeModel() {
		
	}
	
	public BikeModel (String bikeType, String name, int id, double price, int stockAvailable) { //Constructor
		this.bikeType = bikeType;
		this.name = name;
		this.id = id;
		this.price = price;
		this.stockAvailable = stockAvailable;
	}

	

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStockAvailable() {
		return stockAvailable;
	}

	public void setStockAvailable(int stockAvailable) {
		this.stockAvailable = stockAvailable;
	}
	
	
	public String toString(){
		return ("Name " + this.getName() + " ID " + this.getId() + " DKK " + this.getPrice()  + "StockAvailable " + this.getStockAvailable());
	}	
	
}