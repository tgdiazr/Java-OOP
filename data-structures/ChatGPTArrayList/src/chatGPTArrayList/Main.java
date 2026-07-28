package chatGPTArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        UserInput input = new UserInput();
        ArrayUtils utils = new ArrayUtils();

        // 1. Prompt the user to enter 10 doubles
        ArrayList<Double> userNumbers = input.getUserDoubles();

        // 2. Print user array
        System.out.println("\nUser Entered Numbers:");
        input.printArray(userNumbers);

        // 3. Generate random array
        ArrayList<Double> randomNumbers = utils.generateRandomArray();
        System.out.println("\nRandom Numbers:");
        utils.printArray(randomNumbers);

        // 4. Sort randomly generated array
        utils.sortArray(randomNumbers);
        System.out.println("\nSorted Random Numbers:");
        utils.printArray(randomNumbers);

        // 5. Delete index 3
        utils.deleteIndexThree(randomNumbers);
        System.out.println("\nAfter Deleting Index 3:");
        utils.printArray(randomNumbers);
    }
}
