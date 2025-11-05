package PayrollApp;
import java.util.Scanner;

public class PayrollApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Obtain input
        System.out.print("Enter employee's name: ");
        String name = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double fedTaxWithholdingRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxWithholdingRate = input.nextDouble();

        double grossPay = hours * payRate;
        double fedTaxWithholding = grossPay * fedTaxWithholdingRate;
        double stateTaxWithholding = grossPay * stateTaxWithholdingRate;
        double totalDeduction = fedTaxWithholding + stateTaxWithholding;
        double netPay = grossPay - totalDeduction;

        // Output
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Hours Worked: %.2f\n", hours);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.2f%%): $%.2f\n",
                fedTaxWithholdingRate * 100, fedTaxWithholding);
        System.out.printf("  State Withholding (%.2f%%): $%.2f\n",
                stateTaxWithholdingRate * 100, stateTaxWithholding);
        System.out.printf("  Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);

        input.close(); // good practice to close Scanner
    }
}
