/*
 * Name: Tania Diaz
 * Date: 02/15/2026
 * Assignment: ActorsArrayListFuncs
 * Description: This program allows the user to enter actor names,
 *              stores them in a Java ArrayList, displays and sorts them,
 *              and allows the user to modify actor names.
 */

package inpututils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ActorsArrayListFuncs {

    public static void main(String[] args) {

        ArrayList<String> actors = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("This program allows you to enter names of actors.");
        System.out.println("Press Enter with no name to stop.\n");

        // Load actors
        LoadActors(actors, input);

        if (actors.size() > 0) {

            // Display actors
            DisplayActors(actors);

            // Sort actors
            Collections.sort(actors);
            System.out.println("\nSorted list:");
            DisplayActors(actors);

            System.out.println("\nThere are " + actors.size() + " actors in the ArrayList!");

            // Modify actors
            ModifyActors(actors, input);

        } else {
            System.out.println("\nNo actors were entered.");
        }

        input.close();
    }

    // --- Function to load actors ---
    private static void LoadActors(ArrayList<String> actors, Scanner input) {
        while (true) {
            System.out.print("Enter an actor's name: ");
            String name = input.nextLine();
            if (name.length() > 0) {
                actors.add(name);
            } else {
                break;
            }
        }
    }

    // --- Function to display actors ---
    private static void DisplayActors(ArrayList<String> actors) {
        System.out.println("\nCurrent actor list:");
        for (String actor : actors) {
            System.out.println(actor);
        }
    }

    // --- Function to modify actors ---
    private static void ModifyActors(ArrayList<String> actors, Scanner input) {
        while (true) {
            System.out.print("\nEnter actor name to modify (or press Enter to quit): ");
            String search = input.nextLine();
            if (search.length() == 0) {
                break;  // Stop if empty
            }

            if (actors.contains(search)) {
                int index = actors.indexOf(search);
                System.out.print("Enter new name: ");
                String newName = input.nextLine();
                actors.set(index, newName);  // Update the list
                System.out.println("Actor updated!");
                DisplayActors(actors);  // Show updated list
            } else {
                System.out.println("Actor not found.");
            }
        }
    }
}
