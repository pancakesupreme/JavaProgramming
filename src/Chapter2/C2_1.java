package Chapter2;

import java.util.Scanner;

/**
 * Program that introduces the use of a scanner to take input from the user.
 *
 * @author Kieran Sowerby
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        // Convert celsius to fahrenheit
        double farenheit = 9.0 / 5 * celsius + 32;
        System.out.println("Celsius " + celsius + " is "
                + farenheit + " in Farenheit");

    }
}
