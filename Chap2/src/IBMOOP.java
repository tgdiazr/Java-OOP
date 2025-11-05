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

// Import Scanner for user input
import java.util.Scanner;

//name of the Java class
//all classes use upper camel case naming 
public class IBMOOP {
	
	
	/*
	 * Fields(attributes) are always private.
	 * They describe the object: here width and height.
	 * 
	 * */
	private double weightInKg;
	private double heightInMeters;
	
	
	//constructor: use to initialize a IBMOOP with width and height
	public IBMOOP(double weightInKg, double heightInMeters) {
		this.weightInKg = weightInKg;
		this.heightInMeters = heightInMeters;
	}

	/*
	 * Methods define the behavior of the object.
	 * getArea() and getPerimeter() calculate values based on fields.
	 * 
	 * */	
	public double bmi() {
		return weightInKg / (heightInMeters * heightInMeters);
	}

   /*
    * toString() method returns a String that describe the object.
    * It is automatically called when we print the object.
    */

	@Override
	public String toString() {
	    return "BMI =" + bmi();
	}


	//execution begins here at the main method
    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        // Prompt the user to enter weight in pounds
	        System.out.print("Enter a number for weightInPounds: ");
	        double weightInPounds = input.nextDouble();
	        double weightInKg = weightInPounds * 0.45359237;
	        
	        // Prompt the user to enter height in inches
	        System.out.print("Enter a number for heightInInches: ");
	        double heightInInches = input.nextDouble();    
	        double heightInMeters = heightInInches * 0.0254;
		
		//Use the constructor to create the object named nameSomeObject
		IBMOOP nameSomeObject = new IBMOOP( weightInKg, heightInMeters);
		//constructor
		
		/*
		 * print the object (toString() will be called)
		 * */
		System.out.println(nameSomeObject);


	}//end the main method 

}//end the class