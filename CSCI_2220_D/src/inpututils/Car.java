// Car.java
// Author: Tania Diaz
// Course: CSCI 2220
// Date: March 15, 2026
// Description: This class represents a car in a collection.
//              It stores car details such as make, model, year,
//              purchase price, current value, expenses, and condition.
//              It also calculates the profit or loss on each car.
package inpututils;

public class Car {
 // car data
 private String make;
 private String model;
 private int year;
 private int purchasePrice;
 private int currentValue;
 private int expenses;
 private int condition;
 private int pnl; // profit or loss

 // constructor - sets all values when a Car is created
 public Car(String make, String model, int year,
            int purchasePrice, int currentValue,
            int expenses, int condition) {

     this.make = make;
     this.model = model;
     this.year = year;
     this.purchasePrice = purchasePrice;
     this.currentValue = currentValue;
     this.expenses = expenses;
     this.condition = condition;

     calcPnL(); // calculate profit/loss right away
 }

 // calculates profit or loss
 // profit = current value - (purchase price + expenses)
 public void calcPnL() {
     pnl = currentValue - (purchasePrice + expenses);
 }

 // getters
 public String getMake()          { return make; }
 public String getModel()         { return model; }
 public int getYear()             { return year; }
 public int getPurchasePrice()    { return purchasePrice; }
 public int getCurrentValue()     { return currentValue; }
 public int getExpenses()         { return expenses; }
 public int getCondition()        { return condition; }
 public int getPnL()              { return pnl; }

 // setters
 // note: the three below call calcPnL() because they affect profit/loss
 public void setMake(String make)           { this.make = make; }
 public void setModel(String model)         { this.model = model; }
 public void setYear(int year)              { this.year = year; }
 public void setCondition(int condition)    { this.condition = condition; }

 public void setPurchasePrice(int purchasePrice) {
     this.purchasePrice = purchasePrice;
     calcPnL();
 }

 public void setCurrentValue(int currentValue) {
     this.currentValue = currentValue;
     calcPnL();
 }

 public void setExpenses(int expenses) {
     this.expenses = expenses;
     calcPnL();
 }

 // prints a summary of the car
 public String toString() {
     return year + " " + make + " " + model
          + " | Condition: " + condition
          + " | Paid: $" + purchasePrice
          + " | Expenses: $" + expenses
          + " | Value: $" + currentValue
          + " | P/L: $" + pnl;
 }
}
