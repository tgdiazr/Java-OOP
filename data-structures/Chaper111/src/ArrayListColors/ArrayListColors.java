/*
 * ArrayListColors-OOP Program
 * Author: Tania Diaz
 * Date: 11/01/2025
 * What this program does: This program manages two ArrayLists of colors. It can concatenate the lists, print them, convert all color names to uppercase, delete sublist elements, and reverse the lists.
 * Time spent: 4 hours
 * Honor Code: I pledge that this program represents my own program code.
 */



package ArrayListColors;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListColors {
	
	//fields
	private ArrayList<String> colors;
	private ArrayList<String> colors2;
	
	//constructor
	public ArrayListColors(ArrayList<String> colors, ArrayList<String> colors2) {
		super();
		this.colors = colors;
		this.colors2 = colors2;
		

	    // Add 12 colors to colors
	    colors.add("blue");
	    colors.add("red");
	    colors.add("green");
	    colors.add("pink");
	    colors.add("purple");
	    colors.add("orange");
	    colors.add("black");
	    colors.add("white");
	    colors.add("gray");
	    colors.add("gold");
	    colors.add("silver");
	    colors.add("teal");

	    // Add 6 colors to colors2
	    colors2.add("brown");
	    colors2.add("blue");
	    colors2.add("yellow");
	    colors2.add("magenta");
	    colors2.add("cyan");
	    colors2.add("olive");
	}

	
	//getter&setters
	

	public ArrayList<String> getColors() {
		return colors;
	}

	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}

	public ArrayList<String> getColors2() {
		return colors2;
	}

	public void setColors2(ArrayList<String> colors2) {
		this.colors2 = colors2;
	}
	
	//Methods
	
	
	//1.- add list one to list two(concatenate lists)
	public ArrayList<String> concatenateColors() {
	    ArrayList<String> allColors = new ArrayList<>(getColors());
	    allColors.addAll(getColors2());
	    return allColors;
	}
	
	//2.- Print the list (loop through and print)

	 public void printList(ArrayList<String> list) {
		 for (String color : list) {
	         System.out.println(color);
		 }
	}
	 
	 //3.- convert the lower case string objects to uppercase(toUpperCase())
		 public void colorsToUpperCase() {
			 for (int i = 0; i < getColors().size(); i++) {
			 getColors().set(i, getColors().get(i).toUpperCase());
			    }
			    
			 for (int i = 0; i < getColors2().size(); i++) {
			 getColors2().set(i, getColors2().get(i).toUpperCase());
			    }
			}

		 public void printColors() {
		     System.out.println("Colors 1:");
		     for (String color : getColors()) {
		         System.out.println(color);
		     }

		     System.out.println("Colors 2:");
		     for (String color : getColors2()) {
		         System.out.println(color);
		     }
		 }
	 
	//4.- delete sublist items (simply delete some elements) (subList(int start, int end).clear())
		 public void deleteSublistColors(int start, int end) {
		     getColors().subList(start, end).clear();
		 }

		 // Delete elements from colors2
		 public void deleteSublistColors2(int start, int end) {
		     getColors2().subList(start, end).clear();
		 }
    //5.- reverse the list
		 public void reverseColors() {
		     Collections.reverse(getColors());
		     Collections.reverse(getColors2());
		 }

	public static void main(String[] args) {

	    // Create object and lists
	    ArrayListColors manager = new ArrayListColors(new ArrayList<>(), new ArrayList<>());

	    // Print original lists
	    System.out.println("Original lists:");
	    manager.printColors();
	    
	    // Concatenate lists and print
	    System.out.println("Concatenated list:");
	    ArrayList<String> allColors = manager.concatenateColors();
	    manager.printList(allColors);

	    // Convert to uppercase and print
	    manager.colorsToUpperCase();
	    System.out.println("\nLists in uppercase:");
	    manager.printColors();

	    // Delete sublists and print
	    manager.deleteSublistColors(0, 2);      // deletes first 2 elements from colors
	    manager.deleteSublistColors2(1, 3);     // deletes elements 1 and 2 from colors2
	    System.out.println("\nLists after deleting sublists:");
	    manager.printColors();

	    // Reverse the lists and print
	    manager.reverseColors();
	    System.out.println("\nReversed lists:");
	    manager.printColors();
	}	    
	}
	

	

