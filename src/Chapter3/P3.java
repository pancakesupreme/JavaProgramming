package Chapter3;

import java.util.Scanner;

/**
 * Program to fully explore if statements and if else statements.
 *
 * @author Kieran Sowerby
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1-100: ");
        double number1 = input.nextDouble();
        System.out.print("Enter a second number from 1-100: ");
        double number2 = input.nextDouble();
        if (number1 > number2) {
            System.out.println("Number 1 is greater than Number 2");
        }
        if (number1 < number2) {
            System.out.println("Number 1 is less than Number 2");
        }
        if (number1 == number2) {
            System.out.println("The two numbers are equal.");
        } else {
            System.out.println("The two numbers are not equal.");
        }
        if (number1 <= number2) {
            System.out.println("Number 1 is less than or equal to Number 2");
        }
        if (number2 == 0) {
            System.out.println("Cannot divide by zero.");
        }
        if ((number1 % number2) < 1 && number2 != 0) {
            System.out.println("Proper Fraction");
        } else {
            System.out.println("Improper Fraction");
        }
        if (number1 >= 90) {
            System.out.println("A");
        } else if (number1 >= 80) {
            System.out.println("B");
        } else if (number1 >= 70) {
            System.out.println("C");
        } else if (number1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (number2 >= 1 && number2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
