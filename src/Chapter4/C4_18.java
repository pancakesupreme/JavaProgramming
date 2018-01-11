package Chapter4;

import java.util.Scanner;

/**
 * Program that introduces strings and the ASCII char system.
 *
 * @author Kieran Sowerby
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters, first being your major, M C or I, and the second your class, 1 2 3 or 4: ");
        String major = input.next();
        char x = major.charAt(0);
        char y = major.charAt(1);
        //Math
        if ((x == 77) && (y == 49)) {
            System.out.println("You have a major in Mathematics and are a Freshman. ");
        }
        if ((x == 77) && (y == 50)) {
            System.out.println("You have a major in Mathematics and are a Sohphomore. ");
        }
        if ((x == 77) && (y == 51)) {
            System.out.println("You have a major in Mathematics and are a Junior. ");
        }
        if ((x == 77) && (y == 52)) {
            System.out.println("You have a major in Mathematics and are a Senior. ");
        }
        //Computer Science
        if ((x == 67) && (y == 49)) {
            System.out.println("You have a major in Computer Science and are a Freshman. ");
        }
        if ((x == 67) && (y == 50)) {
            System.out.println("You have a major in Computer Science and are a Sophomore. ");
        }
        if ((x == 67) && (y == 51)) {
            System.out.println("You have a major in Computer Science and are a Junior. ");
        }
        if ((x == 67) && (y == 52)) {
            System.out.println("You have a major in Computer Science and are a Senior. ");
        }
        //Information Technology
        if ((x == 73) && (y == 49)) {
            System.out.println("You have a major in Information Technology and are a Freshman. ");
        }
        if ((x == 73) && (y == 50)) {
            System.out.println("You have a major in Information Technology and are a Sophomore. ");
        }
        if ((x == 73) && (y == 51)) {
            System.out.println("You have a major in Information Technology and are a Junior. ");
        }
        if ((x == 73) && (y == 52)) {
            System.out.println("You have a major in Information Technology and are a Senior. ");
        }
        if ((x != 73) && (x != 67) && (x != 77) || (y != 49) && (y != 50) && (y != 51) && (y != 52)) {
            System.out.println("Invalid input.");
        }
    }
}
