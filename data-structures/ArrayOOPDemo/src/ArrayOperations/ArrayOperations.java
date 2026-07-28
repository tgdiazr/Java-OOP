/*
 * Arrays: Introduction – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 10/24/2025
 * What this program does: Prompts the user to enter 10 doubles, prints the array, fills it with random numbers, sorts the array, 
   and deletes the element at index 3 while demonstrating object-oriented programming concepts.
 * Time spent: 3 hours
 * Honor Code: I pledge that this program represents my own program code. I received help from Judy's video.
 */


package ArrayOperations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
	
	//field
	private double[] anArray;

	
    //method
	public ArrayOperations (int length) {
	
		anArray = new double[10];
	}
	
	//getters&setters

	public double[] getAnArray() {
		return anArray;
	}

	public void setAnArray(double[] anArray) {
		this.anArray = anArray;
	

	}
	
	//#1 prompt user to enter 10 double and loop through and fill array
	
	public void promptUser() {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please enter 10 doubles to fill the array:");
	    for (int i = 0; i < getAnArray().length; i++) {
	        System.out.print("Enter number " + (i+1) + ": ");
	        getAnArray()[i] = input.nextDouble();
	    }
	    
	    input.close();
	}
	//#2 print the array of 10 double

	public void printTheArray() {
	    System.out.println("");
	    for (int i = 0; i < getAnArray().length; i++) {
	        System.out.println(anArray[i]);
	    }

		}
	//#3 Fill an array with 10 random numbers and print the array
	
	public void fillWithRandomNums() {
	    for (int i = 0; i < getAnArray().length; i++) {
	        getAnArray()[i] = Math.random()*10;
	    }
	}
	
	//#4 sort the array and print
	
	public void sortTheArray() {
		Arrays.sort(getAnArray());
	}
	
	//#5 Delete index[3] o the array 
	public void deleteIndexThree() {
		int removeIndex = 3;
			for(int i = removeIndex; i < getAnArray().length -1; i++)
				getAnArray()[i] = getAnArray()[i + 1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations anArrayObject = new ArrayOperations(10);
		anArrayObject.promptUser();
		anArrayObject.printTheArray();
		
		System.out.println("------------------");
		
		anArrayObject.fillWithRandomNums();
		anArrayObject.printTheArray();
		System.out.println("------------------");
		
		anArrayObject.sortTheArray();
		anArrayObject.printTheArray();
		System.out.println("------------------");
		
		anArrayObject.deleteIndexThree();
		anArrayObject.printTheArray();
		System.out.println("------------------");
		
		
	}//end main
}//end of class
