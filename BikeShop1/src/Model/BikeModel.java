package Model;

public class BikeModel {
	private String name;
	private int id;
	private double price;
	private int stockAvailable;
	
	public BikeModel() {
		
	}
	
	public BikeModel (String name, int id, double price, int stockAvailable) { //Constructor
		this.name = name;
		this.id = id;
		this.price = price;
		this.stockAvailable = stockAvailable;
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

	public void setPrice(double price) {
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