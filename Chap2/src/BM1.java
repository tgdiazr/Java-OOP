/*
 * Author: Tania Diaz
 * Date: August 30, 2025
 * Program: This program calculates the Body Mass Index (BMI) based on
 *          user input of weight in pounds and height in inches.
 * Time spent: 1 hour
 * Honor Code: I pledge that this program represents my own program code.
 * I received help from no one in designing and debugging my program.
 */

// Import Scanner for user input
import java.util.Scanner;

public class BM1 {

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
        
        // Compute the BMI
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        
        // Display the result
        System.out.println("BMI " + bmi);
    }

}