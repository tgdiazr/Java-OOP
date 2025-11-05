
/*
 * Object Oriented Program
 * fields & methods
 * constructor and object
 * 
 * tdiaz version 1.0
 * 08/27/25
 * Program Description: This program demonstrates Object-Oriented Programming (OOP) 
 * by creating a Rectangle class with private fields, a constructor, and methods 
 * to calculate the area and perimeter. It creates a rectangle object and 
 * displays its details.
 * Time Spent: 2 hours
 * Honor Code: I pledge that this program represents my own program code.
 * I received help from no one in designing and debugging my program.
 */



// Import Scanner to get input from the user
import java.util.Scanner;

//name of the Java class
//all classes use upper camel case naming 
public class RectangleOOP2 {
	
	
	/*
	 * Fields(attributes) are always private.
	 * They describe the object: here width and height.
	 * 
	 * */
	private double width; private double height;
	
	
	//constructor: use to initialize a RectangleOOP with width and height
	public RectangleOOP2(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/*
	 * Methods define the behavior of the object.
	 * getArea() and getPerimeter() calculate values based on fields.
	 * 
	 * */	
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}
   /*
    * toString() method returns a String that describe the object.
    * It is automatically called when we print the object.
    */

	@Override
	public String toString() {
	    return "Rectangle [width=" + width 
	           + ", height=" + height 
	           + ", area=" + getArea() 
	           + ", perimeter=" + getPerimeter() + "]";
	}


	//execution begins here at the main method
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 // Ask user for weight in pounds
        System.out.print("Enter your width: ");
        double width = input.nextDouble();
        
        System.out.print("Enter your height: ");
        double height = input.nextDouble();
        
        
        
		//Use the constructor to create the object named nameSomeObject
		RectangleOOP2 nameSomeObject = new RectangleOOP2(width, height);
		//constructor
		
		/*
		 * print the object (toString() will be called)
		 * */
		System.out.println(nameSomeObject);


	}//end the main method 

}//end the class
