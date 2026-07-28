/*
 * Name: Tania Diaz
 * Date: 02/08/2026
 * Assignment: CarValues ArrayList Program
 * Description: This program allows the user to enter the current values of their cars,
 *              stores them in a Java ArrayList, displays all entered values, and
 *              calculates and displays the total and average car value. The program
 *              stops accepting input when the user enters a value of zero or less.
 * Time Spent: 2 hours
 * Honor Code: I pledge that this program represents my own program code.
 * I received help from no one in designing and debugging my program.
 */

package inpututils;

import java.util.Scanner;
import java.util.ArrayList;

public class CarValues
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int ttl = 0;
        int value;

        ArrayList<Integer> carVals = new ArrayList<Integer>();

        System.out.println("The CarValues ArrayList program. Enter car values. Enter 0 or less to stop.");

        while (true)
        {
            System.out.print("\nEnter car value (0 or less to stop): ");
            value = input.nextInt();

            if (value <= 0)
                break;

            carVals.add(value);
            ttl += value;
        }

        System.out.println("\nHere are your car values: " + carVals);

        double avg = (double) ttl / carVals.size();

        System.out.println("Total value: " + ttl);
        System.out.printf("Average value: %.2f\n", avg);

        input.close();
    }
}

