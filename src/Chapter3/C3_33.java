package Chapter3;

import java.util.Scanner;

/**
 * Program that uses comparisons like more than or less than to find out the
 * better option.
 *
 * @author Kieran Sowerby
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        if ((price1 / weight1) < (price2 / weight2)) {
            System.out.println("Rice package 1 is a better deal.");
        } else {
            System.out.println("Rice package 2 is a better deal.");
        }
        if ((price1 / weight1) == (price2 / weight2)) {
            System.out.println("Both packages have the same price.");
        }
    }
}
