package StandardDeviation;

import java.util.Scanner;

public class StandardDeviation {

    public static void main(String[] args) {

        double sum = 0;
        double square = 0;
        int count = 10; // number of inputs

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < count; i++) {
            double number = input.nextDouble();
            sum += number;
            square += Math.pow(number, 2);
        }

        double mean = sum / count;
        double stdeviation = Math.sqrt((square - sum * sum / count) / (count - 1));

        System.out.println("The numbers added equal: " + sum);
        System.out.println("The mean is: " + mean);
        System.out.println("The standard deviation is: " + stdeviation);

        input.close();
    }
}


