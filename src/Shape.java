package assignment_9;

public abstract class Shape implements ComparableType<Shape>{

	/**
	 * This will return the area of the current shape
	 * @return: area of shape
	 */
	public abstract double area();
	
	/**
	 * This will return the current name of the shape
	 * @return: name of shape
	 */
	public abstract String whatAmI();
	
	/**
	 * This will return which area is greater than the other area, (compares two objects).
	 * @return: if the area returns a positive integer then the area is greater
	 * 			if the area returns a negative integer then the area is smaller
	 * 			there will be no equal area in this assignment.
	 */
	@Override
	public int compareTo(Shape other) {
		return (int) (area() - other.area());
	}
}
