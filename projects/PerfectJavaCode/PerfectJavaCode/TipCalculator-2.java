/*
 * Name: Private
 * Date: September 7, 2025
 * Course: CSCI-1260-D1 Introduction to Java Programming
 * Program: TipCalculator.java
 * Description: TipCalculator class with fields for subtotal and gratuity rate (percent),
 * constructors, getters and setters, and methods to read input from the keyboard,
 * compute the tip and total, display the results, and return a string description.
 * Time Spent: 1 hour
 * Honor Code: "I pledge that this program represents my own program code.
 * I received help from no one in designing and debugging my program."
 */

import java.util.Scanner;

public class TipCalculator {
  // data fields
  private double subtotal;            // amount before tip
  private double gratuityRatePercent; // tip rate as a percent 
  private double tipAmount;           // computed tip in dollars
  private double total;               // subtotal + tip

  // no-arg constructor that creates a default TipCalculator object
  public TipCalculator() {
    subtotal = 0.0;
    gratuityRatePercent = 0.0;
    tipAmount = 0.0;
    total = 0.0;
  }

  // constructor that creates a TipCalculator with specified values
  public TipCalculator(double subtotal, double gratuityRatePercent) {
    this.subtotal = subtotal;
    this.gratuityRatePercent = gratuityRatePercent;
    tipAmount = 0.0;
    total = 0.0;
  }

  // returns the subtotal
  public double getSubtotal() {
    return subtotal;
  }

  // returns the gratuity rate (percent)
  public double getGratuityRatePercent() {
    return gratuityRatePercent;
  }

  // returns the computed tip amount
  public double getTipAmount() {
    return tipAmount;
  }

  // returns the computed total
  public double getTotal() {
    return total;
  }

  // sets a new subtotal
  public void setSubtotal(double subtotal) {
    this.subtotal = subtotal;
  }

  // sets a new gratuity rate (percent)
  public void setGratuityRatePercent(double gratuityRatePercent) {
    this.gratuityRatePercent = gratuityRatePercent;
  }

  // sets a new tip amount
  public void setTipAmount(double tipAmount) {
    this.tipAmount = tipAmount;
  }

  // sets a new total
  public void setTotal(double total) {
    this.total = total;
  }

  // prompts the user to enter the subtotal and gratuity rate (percent)
  public void readInputs() {
    Scanner input = new Scanner(System.in);

    // prompts the user to enter subtotal
    System.out.print("Enter subtotal: ");
    setSubtotal(input.nextDouble());  // uses setter

    // prompts the user to enter gratuity rate as a percent
    System.out.print("Enter gratuity rate (percent): ");
    setGratuityRatePercent(input.nextDouble());  // uses setter
  }

  // computes the tip and total using operator precedence
  public void computeTipAndTotal() {
    // convert percent to decimal then multiply by subtotal
    setTipAmount(getSubtotal() * (getGratuityRatePercent() / 100.0)); // uses setter
    setTotal(getSubtotal() + getTipAmount()); // uses setter
  }

  // displays the tip and total
  public void displayResults() {
    System.out.println("Tip amount: " + getTipAmount());
    System.out.println("Total amount: " + getTotal());
  }

  // return a string description of the TipCalculator object
  // this uses the get methods as required
  @Override
  public String toString() {
    return "TipCalculator [subtotal=" + getSubtotal() +
           ", gratuityRatePercent=" + getGratuityRatePercent() +
           ", tipAmount=" + getTipAmount() +
           ", total=" + getTotal() + "]";
  }
}