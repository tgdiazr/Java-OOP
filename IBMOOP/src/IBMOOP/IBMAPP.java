package IBMOOP;

import java.util.Scanner;

public class IBMAPP {
	//fields
	private double weight;
	private double height;
	private double bmi;
	
	Scanner input = new Scanner(System.in);
	//Constructors
	public IBMAPP(double weight, double height, double bmi) {
		super();
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;	
		
	}
	
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

	public void getInput() {
		System.out.print("Enter your weight in lbs: ");
		setWeight(input.nextDouble());
		
		System.out.print("Enter your Height in Inches: ");
		setHeight(input.nextDouble());
		
	}
	public void calculation() {
		
		setBmi(getWeight()*0.45359237/(Math.pow(getHeight()*0.0254,0.2)));
		
	}
	
	
	@Override
	public String toString() {
		return "your healt info: " + "weight " + getWeight()
				+ ", height in inches " + getHeight() + ", your Bmi()=" + String.format("%.2f", getBmi()) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		IBMAPP bmiObject = new IBMAPP(0,0,0);
		bmiObject.getInput();
		bmiObject.calculation();
		
		System.out.print(bmiObject);
		
		
	}// end of main method
	
	

}//End
