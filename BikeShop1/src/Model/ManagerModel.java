package Model;

import java.util.ArrayList;
import java.util.Scanner;

import View.ManagerView;
import data.ReadandWrite;
public class ManagerModel {

	ManagerView myManagerView = new ManagerView(); //also prints out customerList
	BikeDatabaseModel myDb = new BikeDatabaseModel ();
	Scanner input = new Scanner(System.in);

	public void editingCustomerDb () {

		boolean continuing = false;

		while (!continuing){
			System.out.println("=================================================================\n");
			System.out.println("\n Press 1 if you want to add a customer to your database or 2 to delete");
			System.out.println("=================================================================\n");
			String editingChoice = input.next();

			switch (editingChoice) {

			case"1": myManagerView.addCustomer();
			continuing = true;
			break;
			case "2": 
				myManagerView.managerExportDeleteCustomerFromFile();
				break;
			}
		}
	}

	public void editingBikeDb () {

		BikeDatabaseModel myBike = new BikeDatabaseModel(); //also prints out customerList

		boolean continuing = false;

		while (!continuing){
			System.out.println("=================================================================\n");
			System.out.println("\n Press 1 if you want to add a bike to your database or 2 to delete or 3 if you want to end the process");
			System.out.println("=================================================================\n");
			String editingChoice = input.next();

			switch (editingChoice) {

			case"1": 
				myDb.addBikes();
				continuing = true;
				break;
			case "2": 
				myBike.deleteBikes();
				break;
			case "3": System.out.println("You ended the editing process");
			continuing = false;
			}
		}
	}
}
