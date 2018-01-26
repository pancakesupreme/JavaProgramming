package Chapter7;

import java.util.Scanner;

/**
 * Program to find the average of an array
 *
 * @author Kieran Sowerby
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args main input from the console
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How large is the array?: ");
        int arrayLength = input.nextInt();
        int[] bucky = new int[arrayLength];
        jeff(bucky, arrayLength);
        System.out.println("Your average is: " + joe(bucky));
        steve(bucky);
    }

    /**
     * Method to create the array itself
     *
     * @param bucky the array you've used
     * @param arraySize the size of the array you want to have
     */
    public static void jeff(int[] bucky, int arraySize) {
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < bucky.length; x++) {
            System.out.println("Enter a number for the array: ");
            bucky[x] = input.nextInt();
        }
    }

    /**
     * Method to find the average of the array
     *
     * @param bucky once more the array
     * @return the average number
     */
    public static int joe(int[] bucky) {
        int average = 0;
        for (int x = 0; x < bucky.length; x++) {
            average += bucky[x];
        }
        average = average / bucky.length;
        return average;
    }

    /**
     * Method to print the array
     *
     * @param bucky prints the array
     */
    public static void steve(int[] bucky) {
        for (int x = 0; x < bucky.length; x++) {
            System.out.println(bucky[x]);
        }
    }
}
