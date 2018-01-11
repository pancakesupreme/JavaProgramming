package Chapter2;

import java.util.Scanner;

/**
 * Program to use scanners to find percents of things and how to use them in
 * programs.
 *
 * @author Kieran Sowerby
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        //Now for the tip
        System.out.print("Enter the tip percentage: ");
        double tip = input.nextDouble();
        //Calcualte the total amount
        double totaltip = (tip / 100) * subtotal;
        double total = totaltip + subtotal;
        System.out.println("The total amount is " + total + " and the tip is "
                + totaltip);
    }
}
