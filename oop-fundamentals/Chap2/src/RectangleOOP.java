/*
 * Object-Oriented Program (OOP)
 * Fields, methods, constructor, and object
 * 
 * Author: Tania Diaz
 * Date: 08/27/25
 * Program Description: This program calculates the area and perimeter of a rectangle
 * using Object-Oriented Programming. The user enters width and height, a Rectangle
 * object is created, and the results are displayed.
 * Time Spent: 2 hours
 * Honor Code: I pledge that this program represents my own program code.
 * I received help from no one in designing and debugging my program.
 */

// Import Scanner to get input from the user
import java.util.Scanner;

// Name of the Java class (UpperCamelCase)
public class RectangleOOP {

    // Fields (attributes) are private to encapsulate the data
    private double width;
    private double height;

    // Constructor: initializes the object with width and height
    public RectangleOOP(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    //Setter methods
    public void setWidth(double width) {
    	this.width = width;
    }
 
    public void setHeight(double height) {
    	this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString method to display object information
    @Override
    public String toString() {
        return "Rectangle [width=" + width 
               + ", height=" + height 
               + ", area=" + getArea() 
               + ", perimeter=" + getPerimeter() + "]";
    }

    // Main method: execution begins here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for width
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        // Ask user for height
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        // Close the Scanner
        input.close();

        // Create a Rectangle object
        RectangleOOP rectangle = new RectangleOOP(width, height);

        // Print the rectangle details
        System.out.println(rectangle);
    }
}
