package Chapter6;

import java.util.Scanner;

/**
 * Program to insert passwords
 *
 * @author Kieran Sowerby
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        System.out.println("Please enter a password: ");
        password = input.next();

        while (!lengthChecker(password) || !isValid(password) || !digitCounter(password)) {

            System.out.println("Invalid password.");

            if (!lengthChecker(password)) {
                System.out.println("Your password must have at least 8 characters.");
            }

            if (!isValid(password)) {
                System.out.println("Your password must both contain characters and digits");
            }

            if (!digitCounter(password)) {
                System.out.println("Your password does not have enough digits.");
            }

            System.out.println("Please enter another password: ");
            password = input.next();
        }

        if (digitCounter(password) && isValid(password) && lengthChecker(password)) {
            System.out.println("Your password is valid.");
        }
    }

    /**
     * method to check password length
     *
     * @param password the password itself
     * @return whether or not the password is too long
     */
    public static boolean lengthChecker(String password) {

        boolean tooLong;
        tooLong = password.length() >= 8;
        return tooLong;

    }

    /**
     * method to check password matching
     *
     * @param password the password we're checking
     * @return whether or not the password matches
     */
    public static boolean isValid(String password) {

        String n = ".*[0-9].*";
        String a = ".*[A-Z].*";
        return password.matches(n);
    }

    /**
     * method to check numbers
     *
     * @param password the password entered in
     * @return whether or not the password has the same numbers
     */
    public static boolean digitCounter(String password) {
        return password.matches("(?=(.*?\\d){2})[a-zA-Z0-9]{2,}");
    }
}
