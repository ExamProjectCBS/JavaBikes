package Model;

public class CreditCardModel {

	private String cardNumber;
	private String cardHolder;
	private String cardExpiryMonth;
	private String cardExpiryYear;
	private String cardCVV;
	
	//Creating default CreditCardModel object
	public CreditCardModel (){
		
	}
	//Creating CreditCardModel object with specific variables
	public CreditCardModel (String cardNumber, String cardHolder, String cardExpiryMonth, String cardExpiryYear, String cardCVV){
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.cardExpiryMonth = cardExpiryMonth;
		this.cardExpiryYear = cardExpiryYear;
		this.cardCVV = cardCVV;
	}
	
		public String getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public String getCardHolder() {
			return cardHolder;
		}
		public void setCardHolder(String cardHolder) {
			this.cardHolder = cardHolder;
		}
		public String getCardExpiryMonth() {
			return cardExpiryMonth;
		}
		public void setCardExpiryMonth(String cardExpiryMonth) {
			this.cardExpiryMonth = cardExpiryMonth;
		}
		public String getCardExpiryYear() {
			return cardExpiryYear;
		}
		public void setCardExpiryYear(String cardExpiryYear) {
			this.cardExpiryYear = cardExpiryYear;
		}
		public String getCardCVV() {
			return cardCVV;
		}
		public void setCardCVV(String cardCVV) {
			this.cardCVV = cardCVV;
		}
	
}