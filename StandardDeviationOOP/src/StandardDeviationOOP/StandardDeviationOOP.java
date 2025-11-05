/*
 * StandardDeviation – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 10/04/2025-Resubmit
 * What this program does: This program calculates the mean and standard deviation of 10 numbers
 * entered by the user. It demonstrates object-oriented programming principles
 * including fields, constructors, getters/setters, and methods.
 * Time spent: 4 hours
 * Honor Code: I pledge that this program represents my own program code. 
 */

package StandardDeviationOOP;

import java.util.Scanner;

public class StandardDeviationOOP {

    // Fields
    private double sum = 0;
    private double square = 0;
    private int count = 10;
    private double mean;
    private double standardDeviation;

    // Constructor
    public StandardDeviationOOP(int count) {
        super();
        this.sum = sum;
        this.square = square;
        this.count = count;
        this.mean = mean;
        this.standardDeviation = standardDeviation;
    }

    // Getters & Setters
    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    // Ask input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + count + " numbers:");

        for (int i = 0; i < count; i++) {
            double number = scanner.nextDouble();
            sum += number;
            square += Math.pow(number, 2);
        }
    }

    // Calculations
    public void calculateMean() {
        setMean(getSum() / getCount());
    }

    public void calculateStandardDeviation() {
        setStandardDeviation(Math.sqrt((getSquare() - Math.pow(getSum(), 2) / getCount()) / (getCount() - 1)));
    }

    // toString method using getters
    @Override
    public String toString() {
        return String.format(
            "Results:\nMean = %.2f\nStandard Deviation = %.2f",
            getMean(), getStandardDeviation()
        );
    }

    // Main method
    public static void main(String[] args) {
        StandardDeviationOOP myStandardDeviationOOP = new StandardDeviationOOP(10);

        myStandardDeviationOOP.getInput();
        myStandardDeviationOOP.calculateMean();
        myStandardDeviationOOP.calculateStandardDeviation();

        // Use toString() to print results
        System.out.println(myStandardDeviationOOP);
    }
}
