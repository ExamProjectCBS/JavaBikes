package Model;

public class NormalBikeModel extends BikeModel {
	
	
	private int gears;
	
	//creates default normalbikemodel
	public NormalBikeModel (){
		
	}

	//creates normalbikemodel with specific variables
public NormalBikeModel(String bikeType, String name, int id, double price, int stockAvailable, int gears){
	super(bikeType, name, id, price, stockAvailable);
	
	this.gears = gears;
}


public int getGears() {
	return gears;
}

public void setGears(int gears) {
	this.gears = gears;
}

}
