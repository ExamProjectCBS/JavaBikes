package Model;

public class BikeOfferModel extends BikeModel{
	

	private String offerValidityDate;

public BikeOfferModel () {

	}
	

public BikeOfferModel(String bikeType, String name, int id, double price, int stockAvailable, String offerValidityDate){
super (bikeType, name, id, price, stockAvailable);
this.offerValidityDate = offerValidityDate;
}


public String getofferValidityDate() {
return offerValidityDate;
}

public void setOfferValidityDate(String offerValidityDate) {
this.offerValidityDate = offerValidityDate;
}

}
