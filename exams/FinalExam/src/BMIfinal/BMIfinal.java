/*
 * BMIfinal.java
 * Author: Tania Diaz
 * Date: 12/05/2025
 * What this program does: This class stores the user's weight and height,
 * calculates the BMI, and tells the BMI category. It also handles wrong input.
 * Time spent: 3 hours
 * Honor Code: I pledge that this program represents my own program code.
 * I received help from no one.
 */

package BMIfinal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIfinal {

    // Private fields to store weight, height, and BMI
    private double weight;
    private double height;
    private double bmi;

    // Constructor that sets starting values
    public BMIfinal(double weight, double height, double bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    // Getters and setters for each field
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getBmi() { return bmi; }
    public void setBmi(double bmi) { this.bmi = bmi; }

    // Calculates BMI using pounds and inches
    public void calculateBMI() {
        setBmi(weight * 0.45359237 / Math.pow(height * 0.0254, 2.0));
    }

    // Gets user input for weight and height with error checking
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        // Ask for weight until user enters a correct number
        do {
            try {
                System.out.print("Enter your weight in pounds: ");
                setWeight(scanner.nextDouble());
                if (weight <= 0) throw new InputMismatchException(); // invalid numbers
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine(); // clears the bad input
            }
        } while (!validInput);

        // Reset flag for next input
        validInput = false;

        // Ask for height until user enters a correct number
        do {
            try {
                System.out.print("Enter your height in inches: ");
                setHeight(scanner.nextDouble());
                if (height <= 0) throw new InputMismatchException();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine();
            }
        } while (!validInput);
    }

    // Determines the correct BMI category
    public String getBMICategory() {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Healthy weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    // Returns a formatted string of all BMI information
    @Override
    public String toString() {
        return String.format("Weight: %.2f lbs, Height: %.2f in, BMI: %.2f, Category: %s",
                weight, height, bmi, getBMICategory());
    }
}
