package chatGPTArrayList;

public class TestSortedArray {

    public static void main(String[] args) {
        // Create object
        SortedArrayOOP arrayObj = new SortedArrayOOP();

        // 1. Get user input
        arrayObj.getUserInput();
        arrayObj.printUserNumbers();

        // 2. Generate random numbers
        arrayObj.generateRandomNumbers();
        arrayObj.printRandomNumbers("Random Numbers");

        // 3. Sort random numbers
        arrayObj.sortRandomNumbers();
        arrayObj.printRandomNumbers("Sorted Random Numbers");

        // 4. Delete index 3
        arrayObj.deleteIndexThree();
        arrayObj.printRandomNumbers("After Deleting Index 3");
    }
}
