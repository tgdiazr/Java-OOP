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

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
	}

		//Fields
	
		private double total;
		private double tip;
		private double subtotal;
		private double gratuityRate;
	
		
		
		//Constructors
		
		public TipCalculator(double total, double tip, double subtotal, double gratuityRate) {
			super();
			this.total = total;
			this.tip = tip;
			this.subtotal = subtotal;
			this.gratuityRate = gratuityRate;
			
		//Getter and Setters	
			
	}

	   public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public double getTip() {
			return tip;
		}

		public void setTip(double tip) {
			this.tip = tip;
		}

		public double getSubtotal() {
			return subtotal;
		}

		public void setSubtotal(double subtotal) {
			this.subtotal = subtotal;
		}

		public double getGratuityRate() {
			return gratuityRate;
		}

		public void setGratuityRate(double gratuityRate) {
			this.gratuityRate = gratuityRate;
    }


    /*Calculation
     * Tip and Total
     *
     * */

     public void calculateTip() {
     setTip(getSubtotal() * (getGratuityRate()/100));
	 }

     public void calculateTotal() {
     setTotal(getSubtotal() + getTip());

     }

     // Get input from user
    public void getInput() {
    try (Scanner scanner = new Scanner(System.in)) {
	System.out.print("What is the subtotal: ");
	this.subtotal = scanner.nextDouble();
	
	System.out.print("What is the percent of tip: ");
	this.gratuityRate = scanner.nextDouble();
}
}
    @Override
    public String toString() {
        return "Subtotal: $" + String.format("%.2f", getSubtotal()) +
               ", Gratuity Rate: " + getGratuityRate() + "%" +
               ", Tip: $" + String.format("%.2f", getTip()) +
               ", Total: $" + String.format("%.2f", getSubtotal());
    }	

}

