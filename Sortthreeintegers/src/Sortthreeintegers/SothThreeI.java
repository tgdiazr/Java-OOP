package Sortthreeintegers;

import java.util.Scanner;

public class SothThreeI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two number to be sorted: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		
		}
        input.close();
        System.out.print("The sort number are: "+num1+" "+num2);
	}

}
