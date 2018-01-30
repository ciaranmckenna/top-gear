/**
 * 
 */
package topGear;

/**
 * @author Ciaran
 *
 */
public class FamilySaloon extends Car {
	
	/**
	 * instance var
	 */
	private boolean metallicPaint; 

	/**
	 * Default constructor
	 */
	public FamilySaloon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		
		this.metallicPaint = metallicPaint;
	}

	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return this.metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}
	
	/**
	 * method to display the information regarding saloon class
	 * 
	 */
	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		
		System.out.println("Metallic Paint \t: " + this.metallicPaint + "\n");
		
	}

}
