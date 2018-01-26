package Chapter7;

import java.util.Scanner;

/**Program that compares arrays
 *
 * @author Kieran Sowerby
 */
public class C7_26 {
/**
 * 
 * @param args main input from the console
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list1, list2;
        int firstNum, secondNum;

        //Determines first array
        System.out.println("Please enter an integer list: ");
        firstNum = input.nextInt();
        list1 = new int[firstNum];
        for (int x = 0; x < firstNum; x++) {
            list1[x] = input.nextInt();
        }

        //Determines second array
        System.out.println("Please enter a second integer list: ");
        secondNum = input.nextInt();
        list2 = new int[secondNum];
        for (int x = 0; x < secondNum; x++) {
            list2[x] = input.nextInt();
        }

        if (equals(list1, list2) == true) {
            System.out.println("Two lists are strictly identical.");
        } else {
            System.out.println("Two lists are not strictly identical.");
        }
    }
/**
 * 
 * @param list1 the first array
 * @param list2 the second array
 * @return if the arrays are the same length
 */
    public static boolean equals(int[] list1, int[] list2) {
        int rightCounter = 0; // rightCounter determines if each number in loop are correct

        //Checks if lists are same length
        if (list1.length == list2.length) {
            for (int x = 0; x < list1.length; x++) {
                if (list1[x] == list2[x]) {
                    rightCounter++;
                }
            }
        }
        return (rightCounter == list1.length && rightCounter == list2.length);
    }
}
