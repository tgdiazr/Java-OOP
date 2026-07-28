package chatGPTArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayUtils {

    // Method to fill array with 10 random numbers
    public ArrayList<Double> generateRandomArray() {
        ArrayList<Double> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextDouble() * 100); // random double 0–100
        }
        return numbers;
    }

    // Method to sort an ArrayList
    public void sortArray(ArrayList<Double> list) {
        Collections.sort(list);
    }

    // Method to delete index 3 (4th element)
    public void deleteIndexThree(ArrayList<Double> list) {
        if (list.size() > 3) {
            list.remove(3);
        }
    }

    // Method to print any ArrayList
    public void printArray(ArrayList<Double> list) {
        System.out.println(list);
    }
}
