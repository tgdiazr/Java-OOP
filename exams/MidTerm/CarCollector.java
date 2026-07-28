// CarCollector.java
// Lets the user add, modify, and remove cars from a collection.

import java.util.ArrayList;
import java.util.Scanner;

public class CarCollector {

    // the list that holds all our cars
    static ArrayList<Car> collection = new ArrayList<Car>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== Car Collector ===");

        loadCars();
        modifyCars();
        removeCars();

        // show the final list
        System.out.println("\n=== Final Collection ===");
        if (collection.size() == 0) {
            System.out.println("No cars.");
        } else {
            for (int i = 0; i < collection.size(); i++) {
                System.out.println((i + 1) + ". " + collection.get(i));
            }
        }
    }

    // --- LOAD ---
    // asks the user for car details and adds them to the list
    public static void loadCars() {

        System.out.println("\n--- Add Cars ---");
        String answer = "y";

        while (answer.equals("y")) {

            System.out.print("Make: ");
            String make = scanner.nextLine();

            System.out.print("Model: ");
            String model = scanner.nextLine();

            System.out.print("Year: ");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.print("Purchase Price: ");
            int purchasePrice = Integer.parseInt(scanner.nextLine());

            System.out.print("Current Value: ");
            int currentValue = Integer.parseInt(scanner.nextLine());

            System.out.print("Expenses: ");
            int expenses = Integer.parseInt(scanner.nextLine());

            System.out.print("Condition (1-10): ");
            int condition = Integer.parseInt(scanner.nextLine());

            // create the car and add it to the list
            collection.add(new Car(make, model, year, purchasePrice,
                                   currentValue, expenses, condition));

            System.out.println("Car added!");

            System.out.print("Add another? (y/n): ");
            answer = scanner.nextLine();
        }
    }

    // --- MODIFY ---
    // lets the user pick a car and change one of its fields
    public static void modifyCars() {

        if (collection.size() == 0) return;

        System.out.println("\n--- Modify Cars ---");
        String answer = "y";

        while (answer.equals("y")) {

            // show the list
            for (int i = 0; i < collection.size(); i++) {
                System.out.println((i + 1) + ". " + collection.get(i));
            }

            System.out.print("Pick a car to modify (0 to stop): ");
            int pick = Integer.parseInt(scanner.nextLine());

            if (pick == 0) break;
            if (pick < 1 || pick > collection.size()) {
                System.out.println("Invalid number.");
                continue;
            }

            Car car = collection.get(pick - 1);

            System.out.println("1.Make  2.Model  3.Year  4.Purchase Price  5.Current Value  6.Expenses  7.Condition");
            System.out.print("Which field? (1-7): ");
            int field = Integer.parseInt(scanner.nextLine());

            if (field == 1) {
                System.out.print("New make: ");
                car.setMake(scanner.nextLine());
            } else if (field == 2) {
                System.out.print("New model: ");
                car.setModel(scanner.nextLine());
            } else if (field == 3) {
                System.out.print("New year: ");
                car.setYear(Integer.parseInt(scanner.nextLine()));
            } else if (field == 4) {
                System.out.print("New purchase price: ");
                car.setPurchasePrice(Integer.parseInt(scanner.nextLine()));
            } else if (field == 5) {
                System.out.print("New current value: ");
                car.setCurrentValue(Integer.parseInt(scanner.nextLine()));
            } else if (field == 6) {
                System.out.print("New expenses: ");
                car.setExpenses(Integer.parseInt(scanner.nextLine()));
            } else if (field == 7) {
                System.out.print("New condition: ");
                car.setCondition(Integer.parseInt(scanner.nextLine()));
            }

            System.out.println("Updated: " + car);

            System.out.print("Modify another? (y/n): ");
            answer = scanner.nextLine();
        }
    }

    // --- REMOVE ---
    // lets the user pick a car to delete from the list
    public static void removeCars() {

        if (collection.size() == 0) return;

        System.out.println("\n--- Remove Cars ---");
        String answer = "y";

        while (answer.equals("y") && collection.size() > 0) {

            // show the list
            for (int i = 0; i < collection.size(); i++) {
                System.out.println((i + 1) + ". " + collection.get(i));
            }

            System.out.print("Pick a car to remove (0 to stop): ");
            int pick = Integer.parseInt(scanner.nextLine());

            if (pick == 0) break;
            if (pick < 1 || pick > collection.size()) {
                System.out.println("Invalid number.");
                continue;
            }

            System.out.println("Removed: " + collection.remove(pick - 1));

            System.out.print("Remove another? (y/n): ");
            answer = scanner.nextLine();
        }
    }
}
