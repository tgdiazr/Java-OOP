/*
 * SortedArrayOOP-program
 * Author: Tania Diaz
 * Date: 12/05/2025
 * What this program does: Prompts the user to enter 10 numbers, generates 10 random numbers,
 * sorts the random numbers, deletes index 3, and prints all arrays.
 * Time spent: X hours
 * Honor Code: I pledge that this program represents my own program code. With help of Chatgpt.
 */

package chatGPTArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SortedArrayOOP {

    // Fields
    private ArrayList<Double> userNumbers;
    private ArrayList<Double> randomNumbers;

    // Constructor
    public SortedArrayOOP() {
        userNumbers = new ArrayList<>();
        randomNumbers = new ArrayList<>();
    }

    // Getters
    public ArrayList<Double> getUserNumbers() {
        return userNumbers;
    }

    public ArrayList<Double> getRandomNumbers() {
        return randomNumbers;
    }

    // Setters (optional, usually for reusability)
    public void setUserNumbers(ArrayList<Double> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public void setRandomNumbers(ArrayList<Double> randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    // Get input from user
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while(!scanner.hasNextDouble()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            userNumbers.add(scanner.nextDouble());
        }
        // scanner.close(); // do not close here if used elsewhere
    }

    // Generate random numbers
    public void generateRandomNumbers() {
        randomNumbers.clear();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextDouble() * 100);
        }
    }

    // Sort random numbers
    public void sortRandomNumbers() {
        Collections.sort(randomNumbers);
    }

    // Delete index 3
    public void deleteIndexThree() {
        if(randomNumbers.size() > 3) {
            randomNumbers.remove(3);
        }
    }

    // Print user numbers
    public void printUserNumbers() {
        System.out.println("User Entered Numbers: " + userNumbers);
    }

    // Print random numbers
    public void printRandomNumbers(String title) {
        System.out.println(title + ": " + randomNumbers);
    }

    @Override
    public String toString() {
        return "Final Random Numbers: " + randomNumbers;
    }
}
