/**
 * 
 */
package topGear;

import topGear.F1;

/**
 * Class to test the car classes
 * 
 * @author Ciaran
 *
 */
public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("All cars");
		// creating instances of the car classes
		FamilySaloon Audi = new FamilySaloon("Audi", "A3", 130, true);
		F1 Ferrari = new F1("Ferrari", "Maranello", 2330, 1.24);
		F1 McLaren = new F1("McLaren", "MCL2016", 2320, 1.24);
		RallyCar Subaru = new RallyCar("Subaru", "Impreza", 143, 1.98);
		FamilySaloon Legacy = new FamilySaloon("Subaru", "Legacy", 123, false);

		// array of object references (cars)
		Car[] cars = { Audi, Ferrari, McLaren, Subaru, Legacy };

		//invoking method to display all car details
		displayAllDetails(cars);
		horsePower(cars);
		displayAllSubaruData(cars);
		averageHorsePower(cars);
		maxSpeed(cars, Ferrari, McLaren);

	}

	/**
	 * Method to output car data
	 * 
	 * @param cars
	 */
	public static void displayAllDetails(Car[] cars) {

		for (int loop = 0; loop < cars.length; loop++) {
			cars[loop].displayAll();
		}

	}

	/**
	 * Method to find the car with (Make and model) with the greatest Horse Power
	 * 
	 * @param cars
	 */
	public static void horsePower(Car[] cars) {
		// assigning the first element in the array as the greatest horse power
		int greatest = cars[0].getHorsePower();
		String MostHPMake = cars[0].getMake();
		String MostHPModel = cars[0].getModel();

		for (int loop = 0; loop < cars.length; loop++) {
			if (cars[loop].getHorsePower() > greatest) {
				greatest = cars[loop].getHorsePower();
				MostHPMake = cars[loop].getMake();
				MostHPModel = cars[loop].getModel();
			}

		}
		System.out.println("The make and model with the most Horse Power is the " + MostHPMake + " : " + MostHPModel);
	}

	/**
	 * method to output all the details of Subaru cars id make Subaru then use,
	 * display all method
	 * 
	 * @param cars
	 */
	public static void displayAllSubaruData(Car[] cars) {

		// variable to store make
		String make = "Subaru";
		// loop searching array for the make subaru
		for (int loop = 0; loop < cars.length; loop++) {
			// if method of getMake() is subaru in the car array then display it
			if (cars[loop].getMake().equalsIgnoreCase(make)) {
				cars[loop].displayAll();
			}
		}

	}

	/**
	 * method to find the average HorsePower
	 * 
	 * @param cars
	 */
	public static void averageHorsePower(Car[] cars) {

		double total = 0;

		for (int loop = 0; loop < cars.length; loop++) {
			total += cars[loop].getHorsePower();
		}
		System.out.printf("The average HP is %.2f", total / cars.length);

	}

	/**
	 * Method to get max speed of F1 class using the ISpeedCheck interface 
	 * @param cars
	 * @param calculateMaxSpeed
	 */
	public static void maxSpeed(Car[] cars, F1 Ferrari, F1 McLaren) {

		String ferrari = "Ferrari";
		String mcLaren = "McLaren";
		String make = cars[0].getMake();
		String model = cars[0].getModel();

		for (int loop = 0; loop < cars.length; loop++) {
			if (cars[loop].getMake().equalsIgnoreCase(ferrari)) {
				make = cars[loop].getMake();
				model = cars[loop].getModel();
				System.out.print(make + " : " + model  + " - ");
				Ferrari.calculateMaxSpeed();
			
			}
			if (cars[loop].getMake().equalsIgnoreCase(mcLaren)) {
				make = cars[loop].getMake();
				model = cars[loop].getModel();
				System.out.print(make + " : " + model + " - ");
				McLaren.calculateMaxSpeed();
				
			}
		}

	}

}
