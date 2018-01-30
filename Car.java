/**
 * 
 */
package topGear;

/**
 * @author Ciaran
 *
 */
public class Car {

	/**
	 * instance vars for make, model and horse power
	 */
	private String make;
	private String model;
	private int horsePower;

	/**
	 * Default constructor
	 */
	public Car() {
	}

	/**
	 * constructor with arguements
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(String make, String model, int horsePower) {

		this.make = make;
		this.model = model;
		this.horsePower = horsePower;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @param make
	 *            the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return this.horsePower;
	}

	/**
	 * @param horsePower
	 *            the horsePower to set
	 */
	public void setHorsePower(int horsePower) {

		if (horsePower >= 0 && horsePower <= 2500) {
			this.horsePower = horsePower;
		} else {
			this.horsePower = -1;
		}

	}

	/**
	 * method to display instance var information
	 */
	public void displayAll() {

		System.out.println("Make 	\t: " + this.make);
		System.out.println("Model	\t: " + this.model);
		System.out.println("Horse Power \t: " + this.horsePower);

	}

}
