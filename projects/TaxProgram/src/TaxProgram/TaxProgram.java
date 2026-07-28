/*
 * Tax Program – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 10/10/2025-Resubmit
 * What this program does: Prompts the user for filing status and income, calculates taxes for single filers using 
   progressive tax brackets, and displays the total tax owed. If the user selects married, it shows a message that 
   this section is under construction.
 * Time spent: 7 hours
 * Honor Code: I pledge that this program represents my own program code. I received help from (enter the names of others that 
   helped with the assignment, write no one if you received no help) in designing and debugging my program
 */



package TaxProgram;

import java.util.Scanner;

public class TaxProgram {

    private double income;
    private int status; // 1 = Single, 2 = Married
    private double taxes;

    public TaxProgram(double income, int status, double taxes) {
        this.income = income;
        this.status = status;
        this.taxes = taxes;
    }

    public double getIncome() { return income; }
    public void setIncome(double income) { this.income = income; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public double getTaxes() { return taxes; }
    public void setTaxes(double taxes) { this.taxes = taxes; }

    // Progressive tax calculation
    public double getTaxesCategory() {
        double tax = 0;

        if(getStatus() == 1) { // Single
            if(getIncome() > 626350) tax += (getIncome() - 626350) * 0.37;
            if(getIncome() > 250525) tax += (Math.min(getIncome() , 626350) - 250525) * 0.35;
            if(getIncome() > 197300) tax += (Math.min(getIncome() , 250525) - 197300) * 0.32;
            if(getIncome() > 103350) tax += (Math.min(getIncome() , 197300) - 103350) * 0.24;
            if(getIncome() > 48475)  tax += (Math.min(getIncome() , 103350) - 48475) * 0.22;
            if(getIncome() > 11925)  tax += (Math.min(getIncome() , 48475) - 11925) * 0.12;
            tax += Math.min(getIncome(), 11925) * 0.10;
        } else if(getStatus() == 2) { // Married
            System.out.println("We are building this section");
            return 0;
        }

        return tax;
    }

    // Get user input
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your income: ");
        setIncome(scanner.nextDouble());

        System.out.print("What is your status?: (1) Single (2) Married: ");
        setStatus(scanner.nextInt()); 
        
        scanner.close();
    }

    // Calculate total taxes
    private void calculateTaxesTotal() {
        setTaxes(getTaxesCategory());
    }
    

    @Override
    public String toString() {
        return "TaxProgram [income=" + getIncome() +
               ", status=" + (getStatus() == 1 ? "Single" : "Married") +
               ", taxes=" + getTaxes() + "]";
    }

    
	public static void main(String[] args) {
        TaxProgram program = new TaxProgram(0, 0, 0);
        program.getInput();
        program.calculateTaxesTotal();
        System.out.println(program);
    }
}

	
