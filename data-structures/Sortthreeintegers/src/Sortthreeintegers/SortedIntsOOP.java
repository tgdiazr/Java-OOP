/*
 * SortedIntsOOP-program
 * Author: Tania Diaz
 * Date: 09/14/2025
 * What this program does:  This program prompts the user to enter three numbers and sorts them in ascending order.
 * Time spent: 3 hours
 * Honor Code: I pledge that this program represents my own program code. 
 */

package Sortthreeintegers;

import java.util.Scanner;

public class SortedIntsOOP {
	
    //fields
	private double num1;
	private double num2;
	private double num3;
	
	
	//constructors
	

	public SortedIntsOOP(double num1, double num2, double num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	
	}

	//Getters&Setters
	
    public double getNum1() {
		return num1;
	}



	public void setNum1(double num1) {
		this.num1 = num1;
	}



	public double getNum2() {
		return num2;
	}



	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getNum3() {
		return num3;
	}



	public void setNum3(double num3) {
		this.num3 = num3;
	}

	/*Calculation
	 * 
	 */
	public void sortednums() {
	 if(getNum1() > getNum2()) {
		double tmp = getNum1();
		setNum1(getNum2());
		setNum2(tmp);
	 }
	 if(getNum2() > getNum3()) {
		double tmp = getNum2();
		setNum2(getNum3());
		setNum3(tmp);
	 }
	 if(getNum1() > getNum2()) {
		double tmp = getNum1();
		setNum1(getNum2());
		setNum2(tmp);
	 }
	}
	
	// Get input from user
    public void getInput() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a first number: ");
			setNum1(scanner.nextDouble());
			
			System.out.print("Enter a second number: ");
			setNum2(scanner.nextDouble());
			
			System.out.print("Enter a third number: ");
			setNum3(scanner.nextDouble());
		}
        

    }

	@Override
	public String toString() {
		return "Numbers sorted ascending: " + getNum1() + ", " + getNum2() + ", " + getNum3();
	}}
