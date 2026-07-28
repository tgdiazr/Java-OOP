/*
 * Student: Tania Diaz
 * Date: 12/03/2025
 * Program Description:
 * This program calculates the area and perimeter of a rectangle.
 * It asks the user for width and height, checks that input is valid,
 * and then prints the results. Uses try-catch to handle wrong input.
 * Time Spent: 2 hours
 * Honor Code: I pledge that this program is my own work.
 * Help received from: no one
 */

package RectangleOOPException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleOOPException {

    // Fields for rectangle dimensions
    private double width;
    private double height;

    // Constructor to set width and height
    public RectangleOOPException(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters with check for positive numbers
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Error: Width must be positive.");
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error: Height must be positive.");
        }
    }

    // Calculate area
    public double getArea() {
        return width * height;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Scanner for user input
    Scanner input = new Scanner(System.in);

    // Ask user for width with exception handling
    public void promptWidth() {
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter width: ");
                double w = input.nextDouble();
                setWidth(w); // call setter
                if (w > 0) valid = true; // only exit if positive
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                input.nextLine(); // clear wrong input
            }
        }
    }

    // Ask user for height with exception handling
    public void promptHeight() {
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter height: ");
                double h = input.nextDouble();
                setHeight(h); // call setter
                if (h > 0) valid = true; // only exit if positive
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                input.nextLine(); // clear wrong input
            }
        }
    }

    // toString method to print rectangle info
    @Override
    public String toString() {
        return "\nRectangle:" +
                "\nWidth: " + width +
                "\nHeight: " + height +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }

    // Main method to run the program
    public static void main(String[] args) {
        RectangleOOPException rect = new RectangleOOPException(0, 0);

        rect.promptWidth();  // ask for width
        rect.promptHeight(); // ask for height

        System.out.println(rect.toString()); // print results
    }
}

