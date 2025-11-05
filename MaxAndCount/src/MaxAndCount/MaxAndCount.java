/*
 * MaxAndCount Program-OOP
 * Author: Tania Diaz
 * Date: 10/11/2025-resubmit
 * What this program does: This program prompts the user to enter integers until 0 is entered,
 * then finds the largest number and counts how many times it appears.
 * Time spent: 4 hours
 * Honor Code: I pledge that this program represents my own program code.
 */




package MaxAndCount;

import java.util.Scanner;

public class MaxAndCount {
	
	
	//fields
	
	private int number;
	private int max;
	private int countMax;
	
	
	//contructor


	public MaxAndCount(int number, int max, int countMax) {
		super();
		this.number = number;
		this.max = max;
		this.countMax = countMax;
	}
	
	
	//getterandsetters
	

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getCountMax() {
		return countMax;
	}
	public void setCountMax(int countMax) {
		this.countMax = countMax;
	}
	
	
	
	// Method to read integers from user until 0 is entered
	// and calculate the maximum value and its occurrences

	
	public void getInput() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter numbers (end with 0):");

	    int input = scanner.nextInt();

	    if (input != 0) { 
	        setNumber(input);   
	        setMax(getNumber());  
	        setCountMax(1);
	    }

	    while (input != 0) {
	        input = scanner.nextInt();
	        if (input == 0) break;

	        setNumber(input);  

	        if (getNumber() > getMax()) {
	            setMax(getNumber());   
	            setCountMax(1);      
	        } else if (getNumber() == getMax()) {
	            setCountMax(getCountMax() + 1);  
	        }
	    }

	    scanner.close();
	}


	// Method to display the maximum number and its occurrence count
	@Override
	public String toString() {
	    return "Maximum number: " + getMax() + 
	           "\nOccurrences of maximum: " + getCountMax();
	}
	
	// Main method: creates object, reads input, calculates max, and prints results

	public static void main(String[] args) {
			MaxAndCount exam = new MaxAndCount(0,0,0);
		    exam.getInput();          // reads numbers and calculates max & count
		    System.out.println(exam); // prints results
		}

	}