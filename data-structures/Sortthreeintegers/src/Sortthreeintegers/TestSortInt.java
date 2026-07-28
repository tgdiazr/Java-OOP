/*
 * SortedIntsOOP-program
 * Author: Tania Diaz
 * Date: 09/14/2025
 * What this program does:  This program prompts the user to enter three numbers and sorts them in ascending order.
 * Time spent: 3 hours
 * Honor Code: I pledge that this program represents my own program code.
 */

package Sortthreeintegers;

public class TestSortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 1. Create a sortedIntsOOP object
		SortedIntsOOP mySortN = new SortedIntsOOP(0, 0, 0);

        // 2. Ask the user for input
        mySortN.getInput();

        // 3. Sort the numbers using the object
        mySortN.sortednums();

        // 4. Display the results
        System.out.println(mySortN);

	}

}
