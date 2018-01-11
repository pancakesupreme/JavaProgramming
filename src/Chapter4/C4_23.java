package Chapter4;

import java.util.Scanner;

/**
 * Program that shows examples for displaying numbers with decimal places.
 *
 * @author Kieran Sowerby
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1;
        System.out.print("Enter employee's name: ");
        name1 = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        System.out.print("Enter state tax witholding rate: ");
        double stateTax = input.nextDouble();
        System.out.printf("Hours worked: %.2f", hours);
        System.out.printf(" Pay Rate: %.2f", payRate);
        double grossPay = hours * payRate;
        System.out.printf(" Gross Pay: %.2f", grossPay);
        System.out.println(" Deductions: ");
        double federalWith = (payRate * fedTax) * 10;
        double stateWith = (payRate * stateTax) * 10;
        double totalTax = stateWith + federalWith;
        double totalPay = grossPay - totalTax;
        System.out.printf(" Federal Witholding: %.2f ", federalWith);
        System.out.printf(" State Witholding: %.2f ", stateWith);
        System.out.printf(" Total Deduction: %.2f ", totalTax);
        System.out.printf(" Net Pay: %.2f", totalPay);
    }
}
