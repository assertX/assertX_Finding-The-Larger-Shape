# assertX_Finding_The_Larger_Shape
In this assignment, you are going to write a Java program that compares the areas of the 2 shapes in each row of the input file.  Your program finds out the shape in each row that has the larger area, and writes the shape to the output file.

•The input file is a plain text file (filename: shapes.txt).

•Each row in the input file contains the information of 2 shapes.  The first token is the name of the first shape (either "SQUARE" or "CIRCLE").  The second token is the side length (or radius) of the first shape.  The third token is the name of the second shape (either "SQUARE" or "CIRCLE").  The last token is the side length (or radius) of the second shape.

•It is guaranteed that each row contains exactly 1 square and exactly 1 circle, but there is no guarantee for the order of the shapes.

•It is guaranteed that the two shapes in each row will never have the same area.  In other words, you can definitely distinguish the larger shape in each row of the input file.

•You cannot assume (or guess) the number of shapes in the input file.  In other words, no matter how many shapes are stored in the input file, your program should correctly process all of them.

•There may be empty lines at the beginning, in the middle, and/or at the end of the input file.  Your program should smartly skip those empty lines.



•The output file is a plain text file (filename: result.txt).

•After finding out the larger shape in each row of the input file, your program should write the name of the larger shape (Either "Square" or "Circle") to the output file.  Each result should be a separate line in the output file.
