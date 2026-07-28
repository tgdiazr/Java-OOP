package StandardDeviation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestStandardDeviation {

    public static void main(String[] args) {

        StandardDeviation stdDevApp = new StandardDeviation();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        // Fault-tolerant input
        while (true) {
            try {
                System.out.print("Enter the quantity of random numbers to generate: ");
                count = scanner.nextInt();
                if (count <= 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // clear invalid input
            }
        }

        // Generate numbers, calculate mean/std, write/read file
        stdDevApp.generateRandomNumbers(count);
        stdDevApp.calculateMean();
        stdDevApp.calculateStdDev();
        stdDevApp.printResults();
        stdDevApp.writeToFile("Results.txt");
        stdDevApp.readFromFile("Results.txt");
        
        System.out.println("Saving file in: " + System.getProperty("user.dir"));

    }
}
