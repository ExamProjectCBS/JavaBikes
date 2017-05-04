package Model;



public class ShoppingProductModel extends BikeModel {
	
	private int quantity;
	
	
	

	
	//getters and setters
	public ShoppingProductModel(String currentProductName, int id, int quantity) {
		setId(id);
	
		this.quantity = quantity;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void getcurrentProductName(int id) { 
		
		
		
	}
	
	@Override
	public String toString(){
		return ( " ID " + this.getId() + " Quantity " + this.getQuantity());
	}	
}
