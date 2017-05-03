package Model;

public class EbikeModel extends BikeModel {


	private int batteryRange, chargingTime;
	
//creates default ebikemodel
public EbikeModel(){
}


//creates ebikemodel with specific variables
public EbikeModel(String bikeType, String name, int id, double price, int stockAvailable, int batteryRange, int chargingTime){
super(bikeType, name, id, price, stockAvailable);

this.batteryRange = batteryRange;
this.chargingTime = chargingTime;
	
}

//Getters and Setters for the class-specific variables
public int getBatteryRange() {
	return batteryRange;
}

public void setBatteryRange(int batteryRange) {
	this.batteryRange = batteryRange;
}

public int getChargingTime() {
	return chargingTime;
}

public void setChargingTime(int chargingTime) {
	this.chargingTime = chargingTime;
}


//Overriding
@Override
public String toString(){
	return ("Name " + this.getName() + " ID " + this.getId() + " DKK " + this.getPrice() + " BatteryRange " + this.getBatteryRange() + " Charging Time "+ this.getChargingTime());
}



}