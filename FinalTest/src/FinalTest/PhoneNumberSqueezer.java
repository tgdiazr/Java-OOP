package FinalTest;

// Student Name:  Tania Diaz
// Date:          May 16, 2026
// Assignment:    PhoneNumberSqueezer
// Description:   This program asks the user to enter a phone number in the format
//                505-747-2255 or 505 747 2255, removes all dashes and blanks,
//                prints the cleaned number, and reports how many times the digit 9
//                appears and at which positions it is found.

import java.util.Scanner;
import java.util.ArrayList;

public class PhoneNumberSqueezer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a phone number
        System.out.print("Please enter the phone number in format 505-555-1212 or 505 555 1212: ");
        String phoneNumber = scanner.nextLine();

        // Remove all dashes and spaces from the phone number
        String cleanedNumber = phoneNumber.replace("-", "").replace(" ", "");

        // Display the cleaned phone number
        System.out.println("After removing blanks or dashes: " + cleanedNumber);

        // Find all positions where the digit 9 appears (0-based index)
        ArrayList<Integer> nineLocations = new ArrayList<Integer>();

        for (int i = 0; i < cleanedNumber.length(); i++) {
            if (cleanedNumber.charAt(i) == '9') {
                nineLocations.add(i); // store the index position of each 9
            }
        }

        // Report the results based on whether any 9s were found
        if (nineLocations.isEmpty()) {
            System.out.println("There are no nines in " + cleanedNumber);
        } else {
            System.out.println("There are " + nineLocations.size() + " occurrences of the number 9 in "
                    + cleanedNumber + " and here are their locations: " + nineLocations);
        }

        scanner.close();
    }
}
