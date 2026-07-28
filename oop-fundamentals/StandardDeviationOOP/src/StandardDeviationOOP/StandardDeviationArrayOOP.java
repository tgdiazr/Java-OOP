/*
 * StandardDeviationArray– Object-Oriented Program
 * Author: Tania Diaz
 * Date: 10/25/2025
 * What this program does: This program calculates the mean and standard deviation of 10 numbers
 * entered by the user. It demonstrates object-oriented programming principles
 * including fields, constructors, getters/setters, and methods.
 * Time spent: 4 hours
 * Honor Code: I pledge that this program represents my own program code. 
 */

package StandardDeviationOOP;

import java.util.Arrays;
import java.util.Scanner;

public class StandardDeviationArrayOOP {

    // Fields
    private double sum = 0;
    private int count = 10;
    private double mean;
    private double standardDeviation;
    
    private double[] numbers;//array to store the input numbers

    // Constructor
    public StandardDeviationArrayOOP(int count) {
        super();
        this.sum = sum;
        this.count = count;
        this.mean = mean;
        this.standardDeviation = standardDeviation;
        numbers = new double[count];//initialize array with size = count
    }

    // Getters & Setters
    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
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

    public double[] getNumbers() {
		return numbers;
	}

	public void setNumbers(double[] numbers) {
		this.numbers = numbers;
	}

	// Ask input from the user
	public void getInput() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter " + count + " numbers:");

	    for (int i = 0; i < getNumbers().length; i++) { 
	        double number = scanner.nextDouble();
	        getNumbers()[i] = number; 
	        setSum(getSum() + number); 
	    }
	}

    // Calculations
    public void calculateMean() {
        setMean(getSum() / getCount());
    }


    public void calculateStandardDeviation() {
        double sumSquares = 0;

        for (double num : getNumbers()) { 
            sumSquares += Math.pow(num - getMean(), 2); 
        }

        setStandardDeviation(Math.sqrt(sumSquares / (getCount() - 1))); 
    
    }

    // toString method using getters
    @Override
    public String toString() {
        return "Numbers: " + Arrays.toString(getNumbers()) + 
               "\nMean = " + String.format("%.2f", getMean()) + 
               "\nStandard Deviation = " + String.format("%.2f", getStandardDeviation());
    
    }

    // Main method
    public static void main(String[] args) {
        StandardDeviationArrayOOP myStandardDeviationOOP = new StandardDeviationArrayOOP(10);

        myStandardDeviationOOP.getInput();
        myStandardDeviationOOP.calculateMean();
        myStandardDeviationOOP.calculateStandardDeviation();

        // Use toString() to print results
        System.out.println(myStandardDeviationOOP);
    }
}
