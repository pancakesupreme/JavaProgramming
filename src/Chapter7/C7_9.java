package Chapter7;

import java.util.Scanner;
import java.util.Arrays;
/**
 * Program to look at the smallest number
 *
 * @author Kieran Sowerby
 */
public class C7_9 {
/**
 * 
 * @param args 
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Please enter 10 numbers: ");
        for (int x = 0; x < 10; x++) {
            numbers[x] = input.nextDouble();
        }
        System.out.println("The minimum number is " + min(numbers));
    }
/**
 * 
 * @param array the array you've used
 * @return the sorted array
 */
    public static double min(double[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
