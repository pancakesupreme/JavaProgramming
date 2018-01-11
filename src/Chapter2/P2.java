package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate multiple things based off of other input.
 *
 * @author Kieran Sowerby
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meal, drink, dessert, subtotal, salesTax, taxTotal, gratuityRate, almostcompleteTotal,
                completeTotal;

        System.out.print("Enter meal amount: ");
        //Don't put double in front of meal because you already defined meal being a variable in line 6
        meal = input.nextDouble();
        System.out.print("Enter drink amount: ");
        drink = input.nextDouble();
        System.out.print("Enter dessert amount: ");
        dessert = input.nextDouble();

        subtotal = meal + dessert + drink;
        gratuityRate = 0.15;
        salesTax = 0.1;
        taxTotal = salesTax * subtotal;
        almostcompleteTotal = (subtotal + taxTotal) * gratuityRate;
        completeTotal = almostcompleteTotal + taxTotal + subtotal;
        System.out.println("The subotal is " + subtotal + ", the amount of sales tax is " + taxTotal
                + ", the gratuity amount is " + almostcompleteTotal + ", and the final total is " + completeTotal);

    }

}
