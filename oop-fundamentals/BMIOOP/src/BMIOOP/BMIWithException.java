/*
 * BMI Calculator – Fault-Tolerant Object-Oriented Program
 * Author: Tania Diaz
 * Date: 12/03/2025
 * What this program does: Prompts the user for weight and height, calculates BMI, 
 *                          and displays the BMI category. Handles invalid input with exceptions.
 * Time spent: 2 hours
 * Honor Code: I pledge that this program represents my own program code.
 * I received help from no one in designing and debugging my program.
 */

package BMIOOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIWithException {

    // Fields
    private double weight;
    private double height;
    private double bmi;

    // Constructor
    public BMIWithException(double weight, double height, double bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    // Getters & Setters
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getBmi() { return bmi; }
    public void setBmi(double bmi) { this.bmi = bmi; }

    // Calculate BMI
    public void calculateBMI() {
        setBmi(weight * 0.45359237 / Math.pow(height * 0.0254, 2.0));
    }

    // Get input with exception handling
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        // Weight
        do {
            try {
                System.out.print("Enter your weight in pounds: ");
                setWeight(scanner.nextDouble());
                if (weight <= 0) throw new InputMismatchException();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine(); // clear invalid input
            }
        } while (!validInput);

        // Height
        validInput = false;
        do {
            try {
                System.out.print("Enter your height in inches: ");
                setHeight(scanner.nextDouble());
                if (height <= 0) throw new InputMismatchException();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine(); // clear invalid input
            }
        } while (!validInput);
    }

    // BMI category
    public String getBMICategory() {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Healthy weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Weight: %.2f lbs, Height: %.2f in, BMI: %.2f, Category: %s",
                weight, height, bmi, getBMICategory());
    }

    // Main method – runs the program
    public static void main(String[] args) {
        BMIWithException myBMI = new BMIWithException(0, 0, 0);
        myBMI.getInput();     // Prompt user for input
        myBMI.calculateBMI(); // Calculate BMI
        System.out.println(myBMI); // Display results
    }
}
