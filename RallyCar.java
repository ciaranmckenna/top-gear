package topGear;

public class RallyCar extends Car {
	
	/**
	 * instance vars
	 */

	private double area;
	
	/**
	 * default constructor
	 */
	public RallyCar() {
	}

	/**
	 * constructor with args 
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return this.area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	
	/**
	 * method to display information regarding rally car class
	 */
	@Override
	public void displayAll() {
		System.out.println("Rally Car");
		super.displayAll();
		System.out.println("Area 	\t: " + this.area + "\n");
	}

}
