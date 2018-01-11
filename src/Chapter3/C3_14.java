package Chapter3;

import java.util.Scanner;

/**
 * Program that begins to use syntax from the math.java library.
 *
 * @author Kieran Sowerby
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("0 is heads, 1 is tails, enter a guess for heads or tails: ");
        int guess = input.nextInt();
        int result = (int) (Math.random() * 2);
        if (guess == result) {
            System.out.println("You are correct.");
        } else {
            System.out.println("You are not correct");
        }
    }
}
