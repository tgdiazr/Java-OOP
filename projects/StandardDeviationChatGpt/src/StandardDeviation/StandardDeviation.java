/*
 * StandardDeviationApp
 * Author: Tania Diaz
 * Date: 12/05/2025
 * What this program does: Generates random numbers, calculates mean and standard deviation,
 * writes the numbers, mean, and standard deviation to Results.txt, reads from the file, and prints results.
 * Time spent: X hours
 * Honor Code: I pledge that this program represents my own program code. I received help from no one.
 */

package StandardDeviation;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class StandardDeviation {

    private ArrayList<Integer> numbers;
    private double mean;
    private double stdDev;

    // Constructor
    public StandardDeviation() {
        numbers = new ArrayList<>();
        mean = 0;
        stdDev = 0;
    }

    // Generate random numbers (1-500)
    public void generateRandomNumbers(int count) {
        Random random = new Random();
        numbers.clear();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(500) + 1);
        }
    }

    // Calculate mean
    public void calculateMean() {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        mean = sum / numbers.size();
    }

    // Calculate standard deviation
    public void calculateStdDev() {
        double sum = 0;
        for (int num : numbers) {
            sum += Math.pow(num - mean, 2);
        }
        stdDev = Math.sqrt(sum / numbers.size());
    }

    // Write results to file
    public void writeToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Numbers: " + numbers + "\n");
            writer.write("Mean: " + mean + "\n");
            writer.write("Standard Deviation: " + stdDev + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read results from file
    public void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\nReading from file " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    // Print results to console
    public void printResults() {
        System.out.println("\nNumbers: " + numbers);
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDev);
    }
}
