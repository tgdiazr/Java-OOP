/*
 * BMI Calculator – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 09/13/2025
 * What this program does: Gets your weight and height, calculates your BMI, and shows your BMI category.
 * Time spent: 2 hours
 * Honor Code: I pledge that this program represents my own program code. I received help from (enter the names of others that 
   helped with the assignment, write no one if you received no help) in designing and debugging my program
 */


package BMIOOP;

import java.util.Scanner;
public class BMIOOPP {
	
	//fields
	
	private double weight;
	private double height;
	private double bmi;
	
	//Constructors
	
		public BMIOOPP(double weight, double height, double bmi) {
			super();
			this.weight = weight;
			this.height = height;
			this.bmi = bmi;
		}
		
		//getters & setters

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getBmi() {
			return bmi;
		}

		public void setBmi(double bmi) {
			this.bmi = bmi;
		}
		
		/*Calculation
		* one pound is 0.45359237 kilograms and one inch is 0.0254 meters
		*
		* */
		public void calculateBMI() {
		setBmi(getWeight()*0.45359237/(Math.pow(getHeight()*0.0254,2.0)));
		}
		
		// Get input from user
	    public void getInput() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Enter your weight in pounds: ");
				this.weight = scanner.nextDouble();
				
				System.out.print("Enter your height in inches: ");
				this.height = scanner.nextDouble();
			}
	      }
	    
	    //BMI category method
	    public String getBMICategory() {
	    	if (bmi < 18.5){
	    		return "Underweight: Your BMI is less than 18.5";
	    	}
	    	else if (bmi < 25) {
	    		return "Healthy weight: Your BMI is 18.5 to 24.9";
	    	}
	    	else if (bmi < 30) {
	    		return "Overweight: Your BMI is 25 to 29.9";
	    	}else {
	    		return "Obese: your BMI is 30 or higher";
	    	
	    	}
	    }

	    
		
		@Override
		public String toString() {
			return "your health info: " + "weight in lbs " + getWeight()
					+ ", height in inches " + getHeight() + ", your Bmi=" + String.format("%.2f", getBmi()) +
					", Category: "+ getBMICategory();   
	     }
         }
