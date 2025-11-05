/*
 * Payroll Application – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 10/10/2025-resubmit
 * What this program does: Gets employee information, calculates gross pay, tax withholdings, total deductions,
 * and net pay, and displays a formatted payroll report.
 * Time spent: 3 hours
 * Honor Code: I pledge that this program represents my own program code. I received help from no one in designing and debugging my program.
 */


package PayrollAppOOP;

import java.util.Scanner;


public class PayrollAppOOP {
	
	
	//fields
	
	private String name;
	private double hours;
	private double payRate; 
	private double fedTaxWithholdingRate;
	private double stateTaxWithholdingRate;
	private double grossPay;
	private double fedTaxWithholding;
	private double stateTaxWithholding;
	private double totalDeduction;
	private double netPay;
	
	
	
	//Constructor
		
	public PayrollAppOOP(String name, double hours, double payRate, double fedTaxWithholdingRate,
			double stateTaxWithholdingRate, double grossPay, double fedTaxWithholding, double stateTaxWithholding,
			double totalDeduction, double netPay) {
		super();
		this.name = name;
		this.hours = hours;
		this.payRate = payRate;
		this.fedTaxWithholdingRate = fedTaxWithholdingRate;
		this.stateTaxWithholdingRate = stateTaxWithholdingRate;
		this.grossPay = grossPay;
		this.fedTaxWithholding = fedTaxWithholding;
		this.stateTaxWithholding = stateTaxWithholding;
		this.totalDeduction = totalDeduction;
		this.netPay = netPay;
	}
	//getter&setters
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public double getFedTaxWithholdingRate() {
		return fedTaxWithholdingRate;
	}
	public void setFedTaxWithholdingRate(double fedTaxWithholdingRate) {
		this.fedTaxWithholdingRate = fedTaxWithholdingRate;
	}
	public double getStateTaxWithholdingRate() {
		return stateTaxWithholdingRate;
	}
	public void setStateTaxWithholdingRate(double stateTaxWithholdingRate) {
		this.stateTaxWithholdingRate = stateTaxWithholdingRate;
	}
	
	public double getGrossPay() {
		return grossPay;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getFedTaxWithholding() {
		return fedTaxWithholding;
	}

	public void setFedTaxWithholding(double fedTaxWithholding) {
		this.fedTaxWithholding = fedTaxWithholding;
	}

	public double getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(double stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public double getTotalDeduction() {
		return totalDeduction;
	}

	public void setTotalDeduction(double totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	public double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}

	
	
	
	
	///Calculations
	// double grossPay = hours * payRate;
    //double fedTaxWithholding = grossPay * fedTaxWithholdingRate;
    //double stateTaxWithholding = grossPay * stateTaxWithholdingRate;
    //double totalDeduction = fedTaxWithholding + stateTaxWithholding;
    //double netPay = grossPay - totalDeduction;
	


	public void calculateGrossPay() {
		setGrossPay(getHours() * getPayRate());  
		}
	public void calculateFedTaxWithholding() {
		setFedTaxWithholding(getGrossPay() * getFedTaxWithholdingRate());
	}
	
	public void calculateStateTaxWithholding() {
		setStateTaxWithholding(getGrossPay() * getStateTaxWithholdingRate()); 
	}
	public void calculateTotalDeduction() {
		setTotalDeduction(getFedTaxWithholding() + getStateTaxWithholding());
	}
	public void calculateNetPay() {
		setNetPay(getGrossPay() - getTotalDeduction());
	}

	//// Get input from user
	public void getInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter employee's name: ");
			setName(scanner.nextLine());
			
			System.out.print("Enter number of hours worked in a week: ");
			setHours(scanner.nextDouble());
       
			System.out.print("Enter hourly pay rate: ");
			setPayRate(scanner.nextDouble());
       
			System.out.print("Enter federal tax withholding rate: ");
			setFedTaxWithholdingRate(scanner.nextDouble());
       
			System.out.print("Enter state tax withholding rate: ");
			setStateTaxWithholdingRate(scanner.nextDouble());
   }
}

	

	@Override
	public String toString() {
	    return String.format(
	        "Employee Name: %s\n" +
	        "Hours Worked: %.2f\n" +
	        "Pay Rate: $%.2f\n" +
	        "Gross Pay: $%.2f\n" +
	        "Deductions:\n" +
	        "  Federal Withholding (%.2f%%): $%.2f\n" +
	        "  State Withholding (%.2f%%): $%.2f\n" +
	        "  Total Deduction: $%.2f\n" +
	        "Net Pay: $%.2f",
	        getName(),
	        getHours(),
	        getPayRate(),
	        getGrossPay(),
	        getFedTaxWithholdingRate() * 100, getFedTaxWithholding(),
	        getStateTaxWithholdingRate() * 100, getStateTaxWithholding(),
	        getTotalDeduction(),
	        getNetPay()
	    );
	}


	public static void main(String[] args) {
	    PayrollAppOOP myPayRoll = new PayrollAppOOP(
	        "", 0, 0, 0, 0, 0, 0, 0, 0, 0
	    );

	    // 2. Ask the user for input
	    myPayRoll.getInput();

	    // 3. Calculate payroll
	    myPayRoll.calculateGrossPay();
	    myPayRoll.calculateFedTaxWithholding();
	    myPayRoll.calculateStateTaxWithholding();
	    myPayRoll.calculateTotalDeduction();
	    myPayRoll.calculateNetPay();

	    // 4. Display the results
	    System.out.println(myPayRoll);
	}


	}

