package Chapter2;

import java.util.Scanner;

/**
 * Program to use multiple inputs and store them into the correct variables and
 * using them in computations.
 *
 * @author Kieran Sowerby
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius of a cylinder: ");
        double radius = input.nextDouble();
        //Asking for the radius
        System.out.print("Enter a length of a cylinder: ");
        double length = input.nextDouble();
        //Asking for length after asking for radius
        //Now solve
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The volume for the cylinder of radius "
                + radius + " and length " + length + " is " + volume
                + " and the area is " + area);
    }
}
