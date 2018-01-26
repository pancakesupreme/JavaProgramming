package Chapter7;

import java.util.Scanner;

/**
 * Program to assign grades to students based on other grades.
 *
 * @author Kieran Sowerby
 */
public class C7_1 {

    /**
     * Main method
     *
     * @param args main input from the console
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength = 0;
        int best = 0;
        System.out.println("Enter the amount of students: ");
        arrayLength = input.nextInt();
        int[] studentList = new int[arrayLength];
        for (int x = 0; x < studentList.length; x++) {
            System.out.println("Enter " + arrayLength + " scores: ");
            studentList[x] = input.nextInt();
        }
        for (int x = 0; x < studentList.length; x++) {
            if (studentList[x] > best) {
                best = studentList[x];
            }
            System.out.println(best);
        }
        for (int x = 0; x < studentList.length; x++) {
            if (studentList[x] >= (best - 10)) {
                System.out.println("Student " + x + " has a score of " + studentList[x] + " and a letter grade of A");
            } else if (studentList[x] >= (best - 20)) {
                System.out.println("Student " + x + " has a score of " + studentList[x] + " and a letter grade of B");
            } else if (studentList[x] >= (best - 30)) {
                System.out.println("Student " + x + " has a score of " + studentList[x] + " and a letter grade of C");
            } else if (studentList[x] >= (best - 40)) {
                System.out.println("Student " + x + " has a score of " + studentList[x] + " and a letter grade of D");
            } else {
                System.out.println("Student " + x + " has a score of " + studentList[x] + " and a letter grade of F");
            }
        }
    }
}
