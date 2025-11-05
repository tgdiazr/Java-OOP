/*
 * BMI Calculator – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 09/13/2025
 * What this program does: Gets your weight and height, calculates your BMI, and shows your BMI category.
 * Time spent: 2 hours
 * Honor Code: I pledge that this program represents my own program code. I received help from (enter the names of others that 
   helped with the assignment, write no one if you received no help) in designing and debugging my program
 */

package BMIOOP;

public class TestBMI {

    public static void main(String[] args) {

        // 1. Create a BMI object
        BMIOOPP myBMI = new BMIOOPP(0, 0, 0);

        // 2. Ask the user for input
        myBMI.getInput();

        // 3. Calculate BMI using the object
        myBMI.calculateBMI();

        // 4. Display the results
        System.out.println(myBMI);
    }
}
