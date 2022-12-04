package assignment_9;

public class Circle extends Shape{
	// Data fields
	private double radius;
	
	// Constructors
	public Circle() {}
	
	// Constructor with initial values
	public Circle(double radius) { this.radius = radius;}
	
	// Getter
	/**
	 * This will return the radius of the circle
	 * @return: radius of circle
	 */
	public double getRadius() {return radius;}
	
	// Setter
	/**
	 * This will set the radius of the circle
	 * @param: radius of circle
	 */
	public void setRadius(double radius) {this.radius = radius;}
	
	
	
	// Methods
	
	/**
	 * This will return to the total area of the circle
	 * @return: total area of circle
	 */
	@Override
	public double area() {
		double totalArea = 0;
		
		totalArea = Math.PI * Math.pow(radius, 2);
		return totalArea;
	}
	
	/**
	 * This will return the current name of the shape
	 * @return: name of shape
	 */
	@Override
	public String whatAmI() {
		String name = "Circle";
		return name;
	}

}
