// Pez.java
// Author: Tania Diaz
// Course: CSCI 2220
// Date: March 23, 2026
// Description: This program simulates a Pez dispenser using a Stack.
//              The user can load candy colors into a Stack using push(),
//              find the position of the first red Pez, and reverse
//              the contents of the dispenser using a second Stack.

package Stack;

import java.util.Stack;
import java.util.Scanner;

public class Pez {

	public static void main(String[] args) {
		
		// Create the Pez dispenser (Stack) and Scanner
		Stack<String> pez = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		String color;

		// Load the Stack with candy colors
		System.out.println("=== Loading Pez Dispenser ===");
		System.out.println("Enter candy colors (press Enter with no text to stop):");
		
		while (true) {
			System.out.print("Enter color: ");
			color = scanner.nextLine();
			
			// Stop if user enters empty string
			if (color.length() == 0) {
				break;
			}
			
			pez.push(color);
			System.out.println(color + " added!");
		}

		// Print the Stack contents
		System.out.println("\n=== Pez Dispenser Contents ===");
		System.out.println(pez);

		// Find the first red Pez
		int redPosition = pez.search("red");
		if (redPosition == -1) {
			System.out.println("\nNo red Pez found in the dispenser.");
		} else {
			System.out.println("\nFirst red Pez is at position: " + redPosition);
		}

		// Reverse the Stack using a second Stack
		Stack<String> reversedPez = new Stack<>();
		while (!pez.isEmpty()) {
			reversedPez.push(pez.pop());
		}

		// Print the reversed Stack
		System.out.println("\n=== Reversed Pez Dispenser Contents ===");
		System.out.println(reversedPez);

		scanner.close();
	}

}
