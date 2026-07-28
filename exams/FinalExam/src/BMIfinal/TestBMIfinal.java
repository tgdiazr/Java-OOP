/*
 * TestBMIfinal.java
 * Author: Tania Diaz
 * Date: 12/05/2025
 * This program tests the BMIfinal class. It creates 3 BMI objects,
 * asks the user to enter height and weight for each one, calculates BMI,
 * prints the results, and saves everything to a text file called myBMI.txt.
 */

package BMIfinal;

import java.io.PrintWriter;
import java.io.IOException;

public class TestBMIfinal {

    public static void main(String[] args) {

        // Create three BMI objects with default starting values
        BMIfinal p1 = new BMIfinal(0, 0, 0);
        BMIfinal p2 = new BMIfinal(0, 0, 0);
        BMIfinal p3 = new BMIfinal(0, 0, 0);

        // Get input and calculate BMI for each object
        System.out.println("---- Person 1 ----");
        p1.getInput();
        p1.calculateBMI();

        System.out.println("---- Person 2 ----");
        p2.getInput();
        p2.calculateBMI();

        System.out.println("---- Person 3 ----");
        p3.getInput();
        p3.calculateBMI();

        // Print results to the screen
        System.out.println("\nRESULTS:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Write all results to a text file
        try {
            PrintWriter writer = new PrintWriter("myBMI.txt");
            writer.println("BMI RESULTS:");
            writer.println(p1.toString());
            writer.println(p2.toString());
            writer.println(p3.toString());
            writer.close();

            System.out.println("\nmyBMI.txt saved successfully.");

        } catch (IOException e) {
            // If file writing fails, show a simple error message
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
