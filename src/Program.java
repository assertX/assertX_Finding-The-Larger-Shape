package assignment_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		// Open files, the scanner, and writer.
		FileInputStream inputFile = new FileInputStream("shapes.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("result.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		
		// Create two objects which are null.
		Shape shape_1 = null;
		Shape shape_2 = null;
		
		// Loop through the input file
		while (scanner.hasNext()) {
			String shapeName_1 = scanner.next();
			double length_1 = scanner.nextDouble();
			String shapeName_2 = scanner.next();
			double length_2 = scanner.nextDouble();
			
			// Sets the first shape to the correct object
				if (shapeName_1.equals("SQUARE")) {
					shape_1 = new Square();
					Square square = ((Square) shape_1);
					
					square.setSide(length_1);
				}
				else {
					shape_1 = new Circle();
					Circle circle = ((Circle) shape_1);
					
					circle.setRadius(length_1);
				}
			
			// Sets the second shape to the correct object.
				if (shapeName_2.equals("SQUARE")) {
					shape_2 = new Square();
					Square square = ((Square) shape_2);
					
					square.setSide(length_2);
				}
				else {
					shape_2 = new Circle();
					Circle circle = ((Circle) shape_2);
					
					circle.setRadius(length_2);
				}
			
			// Write to the output file via bigger shape.
			if (shape_1.compareTo(shape_2) > 0) {
	            writer.println(shape_1.whatAmI());
	        } 
			else {
	            writer.println(shape_2.whatAmI());
	        }
		}	
		
		// Close files, scanner, and writer.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
		
  }	
		
}
