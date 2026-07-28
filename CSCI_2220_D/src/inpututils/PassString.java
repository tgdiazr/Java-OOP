package inpututils;

/*
 * Name: Tania Diaz
 * Date: 02/15/2026
 * Assignment: PassString
 * Description: This program tests whether Java passes a String
 *              by value or by reference. It shows that changing
 *              the String inside a method does not affect the
 *              original variable in main().
 */

public class PassString {

    public static void main(String[] args) {

        // Initialize a String variable
        String someText = "Hello there!";

        System.out.println("This is the PassString example program.\n");

        // Show value before calling the method
        System.out.println("We're in main() about to call ChangeString(). Value of someText: " 
                           + someText + "\n");

        // Call method and pass the String
        ChangeString(someText);

        // Show value after returning from the method
        System.out.println("We just got back to main() from ChangeString(). Value of someText: " 
                           + someText + "\n");
    }

    // Method that attempts to change the String
    private static void ChangeString(String someText) {

        // Display value received from main()
        System.out.println("We're at the top of ChangeString(). Contents of someText: " 
                           + someText + "\nLet's change it!");

        // Attempt to change the String
        someText = "qweryuip!";

        // Display the new value inside the method
        System.out.println("We're at the bottom of ChangeString(). Value of someText: " 
                           + someText + "\n");
    }
}
