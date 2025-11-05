/*
 *Tip Calculator – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 09/07/2025
 * What this program does: Asks the user to enter a subtotal amount and a gratuity rate(tip percentage).
   It calculates the tip and the total amount(sutotal + tip).
 * Time spent: 4 hours
 * Honor Code: I pledge that this program represents my own program code. I received help from (enter the names of others that 
   helped with the assignment, write no one if you received no help) in designing and debugging my program
 */

package TipCalculator;


public class TestTipCalculator {

	public static void main(String[] args) {
		
	        // 1. Create a TipCalculator object
		TipCalculator myTip = new TipCalculator(0, 0, 0, 0);

	        // 2. Ask the user for input
	        myTip.getInput();

	        // 3. Calculate Tip and total using the object
	        myTip.calculateTip();
	        myTip.calculateTotal();

	        // 4. Display the results
	        System.out.println(myTip);
	}

}
