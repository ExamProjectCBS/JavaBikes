package View;
import java.util.*;
import Model.CreditCardModel;
public class CreditCardView {

	//Creating default CreditCardView
	public CreditCardView(){

	}

	public CreditCardModel CreditCardRegistration(){
		Scanner input = new Scanner (System.in);
		CreditCardModel creditCard1 = new CreditCardModel ();

		//Prompting user to type in credit card number
		String pattern = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
		boolean cardNumberCorrect = false;
		while (!cardNumberCorrect) {
			System.out.println("\n Please enter your credit card number consisting of 16 digits:");
			String cardNumber = input.nextLine();

			if((cardNumber.matches(pattern) && cardNumber.length() == 16)){
				creditCard1.setCardNumber(cardNumber);
				cardNumberCorrect = true;
			}
			else {
				System.out.println("\n Invalid card number, please type a card number consisting of 16 digits "); 
			}
		}
		//Prompting user to type in credit card holder
		System.out.print("Please insert the name of the card holder: ");
		String cardHolder = input.nextLine();
		creditCard1.setCardHolder(cardHolder);


		// Prompting the user to type in card expiry month   
		String pattern2 = "\\d\\d";
		boolean cardExpiryMonthCorrect = false;
		while (!cardExpiryMonthCorrect){
			System.out.print("Please insert the expiry month of your card in the following format XX: ");
			String cardExpiryMonth = input.nextLine();	

			if((cardExpiryMonth.matches(pattern2) && cardExpiryMonth.length() == 2)) {
				cardExpiryMonthCorrect = true;
				//			creditCard1.setCardExpiryMonth(cardExpiryMonth);
			}
			else{
				System.out.println("\n Invalid card expiry month, please type an expiry month consisting of 2 digits "); 
			}

		}

		//Prompting user to type in card expiry year	
		boolean cardExpiryYearCorrect = false;
		while (!cardExpiryYearCorrect){
			System.out.print("Please insert the expiry year of your card in the following format XX: ");
			String cardExpiryYear = input.nextLine();	
			if((cardExpiryYear.matches(pattern2) && cardExpiryYear.length() == 2)) {
				creditCard1.setCardExpiryYear(cardExpiryYear);
				cardExpiryYearCorrect = true;
			}
			else{
				System.out.println("\n Invalid card expiry Year, please type an expiry Year consisting of 2 digits "); 
			}

		}
		//Prompting the user to type in his CVV
		String pattern3 = "\\d\\d\\d";
		boolean CardCVVCorrect = false;
		while (!CardCVVCorrect){
			System.out.println("\n Please enter your card CVV consisting of 3 digits:");
			String cardCVV = input.nextLine();	
			if((cardCVV.matches(pattern3) && cardCVV.length() == 3)) {
				creditCard1.setCardCVV(cardCVV);
				CardCVVCorrect = true;
			}
			else{
				System.out.println("\n Invalid card CVV, please type a card CVV consisting of 3 digits "); 
			}

		}
		System.out.println("=================================================================");
		System.out.println("Your credit card was accepted!");
		System.out.println("=================================================================");
		return creditCard1;
	}
}