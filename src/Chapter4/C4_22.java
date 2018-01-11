package Chapter4;

import java.util.Scanner;

/**
 * Program that explores substrings and different things that can be done with
 * strings.
 *
 * @author Kieran Sowerby
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1, string2;
        System.out.println("Enter string 1: ");
        string1 = input.next();
        System.out.println("Enter string 2: ");
        string2 = input.next();
        if (string1.contains(string2)) {
            System.out.println("String 2 is a substring of string 1.");
        } else {
            System.out.println("String 1 is not a substring of string 2.");
        }
    }
}
