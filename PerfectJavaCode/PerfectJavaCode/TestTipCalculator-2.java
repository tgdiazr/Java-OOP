/*
 * Name: Private
 * Date: September 7, 2025
 * Course: CSCI-1260-D1 Introduction to Java Programming
 * Program: TestTipCalculator.java
 * Description: Test program that creates a TipCalculator object and calls its methods.
 * I put all input and output actions into the TipCalculator class.
 * Time Spent: 20 minutes
 * Honor Code: "I pledge that this program represents my own program code.
 * I received help from no one in designing and debugging my program."
 */

public class TestTipCalculator {
  public static void main(String[] args) {
    // creates a TipCalculator object
    TipCalculator t = new TipCalculator();

    // actions inside the TipCalculator class
    t.readInputs();
    t.computeTipAndTotal();
    t.displayResults();

    // print the object (calls toString automatically)
    System.out.println(t);
  }
}