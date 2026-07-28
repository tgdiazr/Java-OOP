package exceptionHandling;

/*
 * exe for Interest class
 * 
 * 
 * 
 */

public class InterestTest { //begin method InterestTest

	public static void main(String[] args) { //metho main begins execution
		Interest i = new Interest(0, 0, 0, 0); //create new object of class Interest
		i.promptPrincipal(); //invoke method promptPrincipal
		i.promptInterest(); //invoke method promptInterest
		i.promptYear(); //invoke method promptYear
		i.promptTimesPerYear(); //invoke method promptTimesPerYear
		System.out.printf("\n%s%20s\n", "Year", "Amount"); //print column headers
		i.loop(); //invoke method loop

	} //end method main

} //end class InterestTest
