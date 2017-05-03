package View;
import View.CustomerView;
import View.ShoppingCartView;
import Model.CustomerModel;
import Model.BikeModel;
import Model.NormalBikeModel;


public class Receipt {
	
	private String invoice;

Receipt(BikeModel currentBike){
	invoice= "";
	
	invoice += String.format("Get Bike id", currentBike.getId()); 
	


			
			
}
	
	
}
