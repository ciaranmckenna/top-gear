/**
 * 
 */
package topGear;

/**
 * @author Ciaran
 *
 */
public class F1 extends Car implements ISpeedChecker {
	/**
	 * instance var for area
	 */
	private double area;

	/**
	 * Default constructor
	 */
	public F1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with arguments 
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public F1(String make, String model, int horsePower, double area) {
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
	 * Display all information regarding the F1 class 
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("F1");
		System.out.println("Area 	\t: " + this.area + "\n");
	}

	/**
	 * method to work out the max speed of a car
	 */
	@Override
	public double calculateMaxSpeed() {
		
		double maxSpeed =  (this.area * this.getHorsePower())/10;
		
		System.out.printf(" the max speed is %.3f\n" , maxSpeed);
		return maxSpeed ;
	}

}
