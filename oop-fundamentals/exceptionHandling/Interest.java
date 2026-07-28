package exceptionHandling;

/*
 * 
 * An application that prompts the user for a principal
 * amount, an interest rate, and number of years and
 * calculates compound interest with exception handling
 */

import java.util.Scanner; //package for input from keyboard
import java.util.InputMismatchException; //package for exceptions from Scanner

public class Interest { //begin class Interest

	//initialize fields
	private double amount;
	private double rate;
	private double principal;
	private int year;
	private int currentYear;
	private int timesPerYear;
	//create new object of class Scanner
	Scanner input = new Scanner(System.in);

	public Interest(double a, double r, double p, int tpy){ //begin constructor
		amount = a; //set value of amount
		rate = r; //set value of rate
		principal = p; //set value of principal
		timesPerYear = tpy; //set value of timesPerYear
	} //end 3 argument constructor

	public double getAmount() { //begin method getAmount
		return amount;
	} //end method getAmount

	public void setAmount(double a) { //begin method setAmount
			amount = a; //set value of amount
	} //end method setAmount

	public double getRate() { //begin method getRate
		return rate;
	} //end method getRate

	public void setRate(double r) { //begin method setRate
		if (r > 0) //if value entered is greater than zero
		{
			rate = r; //set value entered to rate
		}else
		{
			System.out.println("\nPlease enter a positive number.\n");
			promptInterest(); //print error message and allow the user to retry entry
		}
	} //end method setRate

	public double getPrincipal() { //begin method getPrincipal
		return principal;
	} //end method getPrincipal

	public void setPrincipal(double p) { //begin method setPrincipal
		if (p > 0) //if value entered is greater than zero
		{
			principal = p; //set value entered to principal
		} else
		{
			System.out.println("\nPlease enter a positive number.\n");
			promptPrincipal(); //print error message and allow the user to retry entry
		}
	} //end method setPrincipal

	public double getYear(){ //begin method getYear
		return year;
	} //end method getYear

	public void setYear(int y){ //begin method setYear
		if (y > 0) //if value entered is greater than zero
		{
			year = y; //set value entered to year
		}else
		{
			System.out.println("\nPlease enter a positive number.\n");
			promptYear(); //print error message and allow the user to retry entry
		}
	} //end method setYear

	public int getCurrentYear(){ //begin method getCurrentYear
		return currentYear;
	} //end method getCurrentYear

	public void setCurrentYear(int newYear){ //begin method setCurrentYear
		currentYear = newYear;
	} //end method setCurrentYear

	public int getTimesPerYear(){ //begin method getTimesPerYear
		return timesPerYear;
	} //end method getTimesPerYear

	public void setTimesPerYear(int tpy){ //begin method setTimesPerYear
		if (tpy > 0) //if value entered is greater than zero
		{
			timesPerYear = tpy; //set value entered to timesPerYear
		} else
		{
			System.out.println("\nPlease enter a positive number.\n");
			promptTimesPerYear(); //print error message and allow the user to retry entry
		}
	} //end method setTimesPerYear

	public void promptPrincipal(){ //begin method promptPrincipal
		boolean continueLoop = true; //set boolean for looping
		do
		{ //begin do...while statement
			try
			{ //begin try statement
				System.out.print("Enter the principal amount: ");
				setPrincipal(input.nextDouble()); //validate amount entered
				continueLoop = false; //stop the loop
			} //end try statement
			catch (InputMismatchException IME)
			{ //begin catch statement
				System.out.println("\nPlease enter a valid amount.\n");
				input.nextLine(); //print error message and restart the loop
			} //end catch statement
		} while (continueLoop); //end do...while statement
	} //end method promptPrincipal

	public void promptInterest(){ //begin method promptInterest
		boolean continueLoop = true; //boolean value for looping
		do
		{ //begin do...while statement
			try
			{ //begin try statement
				System.out.print("Enter the interest rate as a decimal: ");
				setRate(input.nextDouble()); //validate amount entered
				continueLoop = false; //stop the loop
			} //end try statement
			catch (InputMismatchException IME)
			{ //begin catch statement
				System.out.println("\nPlease enter a valid amount.\n");
				input.nextLine(); //print error message and restart the loop
			} //end catch statement
		} while (continueLoop); //end do...while statement
	} //end method promptInterest

	public void promptYear(){ //begin method promptYear
		boolean continueLoop = true; //boolean value for looping
		do
		{ //begin do...while statement
			try
			{ //begin try statement
				System.out.print("Enter the number of years to calculate: ");
				setYear(input.nextInt()); //validate amount entered
				continueLoop = false; //stop the loop
			} //end try statement
			catch (InputMismatchException IME)
			{ //begin catch statement
				System.out.println("\nPlease enter a valid amount.\n");
				input.nextLine(); //print error message and restart the loop
			} //end catch statement
		} while (continueLoop); //end do...while statement
	} //end method promptYear

	public void promptTimesPerYear(){ //begin method promptTimesPerYear
		boolean continueLoop = true; //boolean value for looping
		do
		{ //begin do...while statement
			try
			{ //begin try statement
				System.out.print("How many times a year is the interest compounded: ");
				setTimesPerYear(input.nextInt()); //validate amount entered
				continueLoop = false; //stop the loop
			} //end try statement
			catch (InputMismatchException IME)
			{ //begin catch statement
				System.out.println("\nPlease enter a valid amount.\n");
				input.nextLine(); //print error message and restart the loop
			} //end catch statement
		} while (continueLoop); //end do...while statement
	} //end method promptTimesPerYear

	public void calcInterest(){ //begin method calcInterest
		setAmount(getPrincipal() * Math.pow(1.0 + getRate() / getTimesPerYear(),
				getTimesPerYear() * getCurrentYear())); //calculate interest
	} //end method calcInterest

	public void loop(){ //begin method loop
		//as long as currentYear is less than year continue loop and increment currentYear
		for (currentYear = 1; currentYear <= year; currentYear++)
		{ //begin for statement
			calcInterest(); //calculate interest
			System.out.print(toString()); //print the method toString
		} //end for statement
	} //end method loop

	public String toString(){ //begin method toString
		return String.format("%4d%15s%,.2f\n", getCurrentYear(), "$",
				getAmount());
	} //end method toString

	public static void main(String[] args) { //metho main begins execution
			Interest i = new Interest(0, 0, 0, 0); //create new object of class Interest
			i.promptPrincipal(); //invoke method promptPrincipal
			i.promptInterest(); //invoke method promptInterest
			i.promptYear(); //invoke method promptYear
			i.promptTimesPerYear(); //invoke method promptTimesPerYear
			System.out.printf("\n%s%20s\n", "Year", "Amount"); //print column headers
			i.loop(); //invoke method loop

	} //end method main





} //end class Interest
