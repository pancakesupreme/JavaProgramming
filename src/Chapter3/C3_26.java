package Chapter3;

import java.util.Scanner;

/**
 * Program that introduces boolean statements and different operands.
 *
 *
 * @author Kieran Sowerby
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        boolean check5 = ((number % 5) == 0);
        boolean check6 = ((number % 6) == 0);
        if ((check5 == true) && (check6 == true)) {
            System.out.println("Is " + number + " divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + number + " divisible by 5 and 6? false");
        }
        if ((check5 == true) || (check6 == true)) {
            System.out.println("Is " + number + " divisible by 5 or 6? true");

        } else {
            System.out.println("Is " + number + " divisible by 5 or 6? false");
        }
        if ((check5 == true) ^ (check6 == true)) {
            System.out.println("Is " + number + " divisible by 5 or 6,"
                    + "but not both? true");
        } else {
            System.out.println("Is " + number + " divisible by 5 or 6, "
                    + "but not both? false");
        }
    }
}
