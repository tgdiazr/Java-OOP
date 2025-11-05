
/*
 * Object-Oriented Program (OOP)
 * 
 * Author: Tania Diaz
 * Date: 08/27/25
 * 
 * Program Description:
 * This program calculates a person's BMI using OOP. 
 * The user enters their weight in pounds and height in inches.
 * The program converts them to kilograms and meters, creates an object, 
 * and shows the BMI.
 * 
 * Time Spent: 2 hours
 * Honor Code: I pledge that this program is my own work.
 * I received help from no one.
 */

// Import Scanner to get input from the user
import java.util.Scanner;

public class BMIOOP {

    // Fields to store weight in kg and height in meters
    private double weightInKg;
    private double heightInMeters;

    // Constructor: sets the weight and height for the object
    public BMIOOP(double weightInKg, double heightInMeters) {
        this.weightInKg = weightInKg;
        this.heightInMeters = heightInMeters;
    }

    // Method to calculate BMI
    public double bmi() {
        return weightInKg / (heightInMeters * heightInMeters);
    }

    // toString method to print BMI
    @Override
    public String toString() {
        return "BMI = " + bmi();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double weightInKg = weightInPounds * 0.45359237;

        // Ask user for height in inches
        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();
        double heightInMeters = heightInInches * 0.0254;

        // Create a BMI object
        BMIOOP person = new BMIOOP(weightInKg, heightInMeters);

        // Show the BMI
        System.out.println(person);

        input.close();
    }
}

