/*
 * mathClass Object-Oriented Program
 * Author: Tania Diaz
 * Date: 09/30/2025
 * What this program does: Gets your weight and height, calculates your BMI, and shows your BMI category.
 * Time spent: 3 hours
 * Honor Code: I pledge that this program represents my own program code.
 */

package mathClass;

import java.util.Scanner;

public class FiveMathClass {

    // Fields
    private double x;
    private double y;
    private double result;

    // Constructor with parameters (keep yours)
    public FiveMathClass(double x, double y, double result) {
        super();
        this.x = x;
        this.y = y;
        this.result = result;
    }

    // Getters & Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    // Calculations
    public void CalculateMathMax() {
        result = Math.max(x, y);
    }

    public void CalculateMathMin() {
        result = Math.min(x, y);
    }

    public void CalculateMathSqrtX() {
        result = Math.sqrt(x);
    }

    public void CalculateMathPow() {
        result = Math.pow(x, y);
    }

    public void CalculateMathAbsX() {
        result = Math.abs(x);
    }

    // Main method using getters and setters
    public static void main(String[] args) {
        FiveMathClass mathGame = new FiveMathClass(0, 0, 0);  // use your constructor
        Scanner scanner = new Scanner(System.in);

        // Input using setters
        System.out.print("Enter a number x: ");
        mathGame.setX(scanner.nextDouble());
        System.out.print("Enter a number y: ");
        mathGame.setY(scanner.nextDouble());

        // Max
        mathGame.CalculateMathMax();
        System.out.println("Max of x and y: " + mathGame.getResult());

        // Min
        mathGame.CalculateMathMin();
        System.out.println("Min of x and y: " + mathGame.getResult());

        // Square root of x
        mathGame.CalculateMathSqrtX();
        System.out.println("Square root of x: " + mathGame.getResult());

        // x raised to the power y
        mathGame.CalculateMathPow();
        System.out.println("x raised to the power y: " + mathGame.getResult());

        // Absolute value of x
        mathGame.CalculateMathAbsX();
        System.out.println("Absolute value of x: " + mathGame.getResult());
    }

    @Override
    public String toString() {
        return "FiveMathClass [x=" + x + ", y=" + y + ", result=" + result + "]";
    }
}
