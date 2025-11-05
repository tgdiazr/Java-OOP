/*
 * Investment Calculator – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 09/30/2025
 * What this program does: Reads an investment amount, annual interest rate, and number of years from the user,
 * calculates the future investment value using monthly compounding, and displays the result.
 * Time spent: 4 hours
 * Honor Code: I pledge that this program represents my own program code.
 */




package InvestmentCalculator;

import java.util.Scanner;

public class InvestmentCalculator {
	
	private double investmentAmount;
	private double annualInterestRate;
	private int numberOfYears;

	//Constructors
	public InvestmentCalculator(double investmentAmount, double annualInterestRate, int numberOfYears) {
		super();
		this.investmentAmount = investmentAmount;
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
	}
	
	
	//Getters&Setters

	public double getInvestmentAmount() {
		return investmentAmount;
	}


	public void setInvestmentAmount(double investmentAmount) {
		this.investmentAmount = investmentAmount;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	public int getNumberOfYears() {
		return numberOfYears;
	}


	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	
    //Calculations
	
	public double calculateFutureValue() {
	    double monthlyInterestRate = annualInterestRate / 12 / 100; // convert percentage to decimal
	    return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
	}
	
	@Override
	public String toString() {
	    return String.format("Investment Amount: $%.2f\nAnnual Interest Rate: %.2f%%\nYears: %d\nFuture Value: $%.2f",
	                          getInvestmentAmount(), getAnnualInterestRate(), getNumberOfYears(), calculateFutureValue());
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // 1. Create Scanner for user input
	    Scanner scanner = new Scanner(System.in);

	    // 2. Ask user for information
	    System.out.print("Enter investment amount: ");
	    double amount = scanner.nextDouble();

	    System.out.print("Enter annual interest rate (percent): ");
	    double rate = scanner.nextDouble();

	    System.out.print("Enter number of years: ");
	    int years = scanner.nextInt();

	    // 3. Create InvestmentCalculator object
	    InvestmentCalculator invCalc = new InvestmentCalculator(0, 0, 0);

	    // 4. Set the values using setters
	    invCalc.setInvestmentAmount(amount);
	    invCalc.setAnnualInterestRate(rate);
	    invCalc.setNumberOfYears(years);

	    // 5. Calculate and display the future value
	    System.out.printf("Future Investment Value: $%.2f\n", invCalc.calculateFutureValue());
	}
}
