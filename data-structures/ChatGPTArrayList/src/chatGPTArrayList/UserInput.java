package chatGPTArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    private Scanner scanner = new Scanner(System.in);

    // Method to get 10 doubles from the user
    public ArrayList<Double> getUserDoubles() {
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            numbers.add(num);
        }
        return numbers;
    }

    // Method to print an ArrayList
    public void printArray(ArrayList<Double> list) {
        System.out.println(list);
    }
}
