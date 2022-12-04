package assignment_9;

public class Square extends Shape{
	// Data fields
	private double side;
	
	// Constructors
	public Square() {}
	
	// Constructor with initial values
	public Square(double side) { this.side = side;}
	
	// Getter
	/**
	 * This will return the side number of the square
	 * @return: side number of square
	 */
	public double getSide() {return side;}
	
	// Setter
	/**
	 *  This will set the side of the square
	 * @param: sets side of square
	 */
	public void setSide(double side) {this.side = side;}
	
	
	
	// Methods
	
	/**
	 * This will calculate the total area of the square
	 * @return: total area of square
	 */
	@Override
	public double area() {
		double totalArea = 0;
		
		totalArea = side * side;
		return totalArea;
	}
	
	/**
	 * This will return the name of the current shape.
	 * @return: name of shape
	 */
	@Override
	public String whatAmI() {
		String name = "Square";
		return name;
	}

}
