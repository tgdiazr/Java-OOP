/*
 * MidtermExam Program
 * Author: Tania Diaz
 * Date: 10/09/2025
 * What this program does: This program prompts the user to enter seven numbers,
 * sorts them in ascending order, and calculates the maximum value along with
 * how many times it appears.
 * Time spent: 4 hours
 * Honor Code: I pledge that this program represents my own program code.
 */


package MidtermExam;

import java.util.Scanner;

public class MidtermExam {
	
	// fields
	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double n5;
	private double n6;
	private double n7;

	private double max;
	private int countMax;  
	
	//constructor
	

	public MidtermExam(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double max,
		int countMax) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
		this.n6 = n6;
		this.n7 = n7;
		this.max = max;
		this.countMax = countMax;
	}
		
	//getter&setters
	

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}
	public double getN5() {
		return n5;
	}
	public void setN5(double n5) {
		this.n5 = n5;
	}
	public double getN6() {
		return n6;
	}
	public void setN6(double n6) {
		this.n6 = n6;
	}
	public double getN7() {
		return n7;
	}
	public void setN7(double n7) {
		this.n7 = n7;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public int getCountMax() {
		return countMax;
	}
	public void setCountMax(int countMax) {
		this.countMax = countMax;
	}

	
	//Calculations
	
	public void calculateMaxAndCount() {
	    double maxValue = getN1();
	    int count = 1;

	    if (getN2() > maxValue) {
	        maxValue = getN2();
	        count = 1;
	    } else if (getN2() == maxValue) {
	        count++;
	    }

	    if (getN3() > maxValue) {
	        maxValue = getN3();
	        count = 1;
	    } else if (getN3() == maxValue) {
	        count++;
	    }

	    if (getN4() > maxValue) {
	        maxValue = getN4();
	        count = 1;
	    } else if (getN4() == maxValue) {
	        count++;
	    }

	    if (getN5() > maxValue) {
	        maxValue = getN5();
	        count = 1;
	    } else if (getN5() == maxValue) {
	        count++;
	    }

	    if (getN6() > maxValue) {
	        maxValue = getN6();
	        count = 1;
	    } else if (getN6() == maxValue) {
	        count++;
	    }

	    if (getN7() > maxValue) {
	        maxValue = getN7();
	        count = 1;
	    } else if (getN7() == maxValue) {
	        count++;
	    }

	    setMax(maxValue);
	    setCountMax(count);
	        }
	  


	// Get input from user
	public void getInput() {
	    try (Scanner scanner = new Scanner(System.in)) {
	        System.out.print("Enter the first number: ");
	        setN1(scanner.nextDouble());
	        
	        System.out.print("Enter the second number: ");
	        setN2(scanner.nextDouble());
	        
	        System.out.print("Enter the third number: ");
	        setN3(scanner.nextDouble());
	        
	        System.out.print("Enter the fourth number: ");
	        setN4(scanner.nextDouble());
	        
	        System.out.print("Enter the fifth number: ");
	        setN5(scanner.nextDouble());
	        
	        System.out.print("Enter the sixth number: ");
	        setN6(scanner.nextDouble());
	        
	        System.out.print("Enter the seventh number: ");
	        setN7(scanner.nextDouble());
	    }

    }

	@Override
	public String toString() {
	    return "Numbers: " + getN1() + ", " + getN2() + ", " + getN3() + ", " + getN4() + ", " +
	           getN5() + ", " + getN6() + ", " + getN7() + "\nMaximum number: " + getMax() + 
	           ", appears: " + getCountMax();
	}

	public static void main(String[] args) {

		// 1. Create a maxandCountOOP object
		MidtermExam examNumbers = new MidtermExam(0, 0, 0, 0, 0, 0, 0, 0, 0);

		// 2. Ask the user for input
		examNumbers.getInput();

		// 3. Calculate maximum and its count
		examNumbers.calculateMaxAndCount();

		// 4. Display the results
		System.out.println(examNumbers);

		
	}

}
