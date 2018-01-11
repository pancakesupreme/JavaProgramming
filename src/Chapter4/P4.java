package Chapter4;

import java.util.Scanner;

/**
 * Program that combines different variables and how to use them; integers,
 * doubles, and strings. `
 *
 * @author Kieran Sowerby
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from cmd line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asks for the name of the first bidder and stores it
        System.out.print("What's the name of the first bidder? : ");
        String bidder1 = input.next();

        //Asks for the hours of work bidder1 needs
        System.out.print("How many hours of work do you need? :");
        int hours1 = input.nextInt();

        //Asks for how much bidder1 chargers per hour
        System.out.print("How much does " + bidder1 + " charge per hour? :");
        double hourlyCharge1 = input.nextDouble();

        //Asks for the name of the second bidder
        System.out.print("What's the name of the second bidder? : ");
        String bidder2 = input.next();

        //Asks for the hours of work bidder2 needs
        System.out.print("How many hours of work does " + bidder2 + " need? : ");
        int hours2 = input.nextInt();

        //Asks for the amount bidder2 charges per hour
        System.out.print("How much does " + bidder2 + " charge per hour? :");
        double hourlyCharge2 = input.nextDouble();

        //now do some math stuff
        double cost1 = hours1 * hourlyCharge1;
        double cost2 = hours2 * hourlyCharge2;

        if (cost1 < cost2) {
            System.out.printf("The winner of the bid is %s with a total cost of %.2f", bidder1,
                    cost1);
        }
        if (cost1 > cost2) {
            System.out.printf("The winner of the bid is %s with a total cost of %.2f", bidder2,
                    cost2);
        }
        if ((cost1 == cost2) && (hours1 < hours2)) {
            System.out.printf("The winner of the bid is " + bidder1 + " because " + bidder1
                    + " has the same cost as " + bidder2 + " ,however, "
                    + bidder1 + " estimates less hours.");
        }
        if ((cost1 == cost2) && (hours1 > hours2)) {
            System.out.printf("The winner of the bid is " + bidder2 + " because"
                    + bidder2 + " has the same cost as " + bidder1 + " ,however, " + bidder2
                    + " estimates less hours");
        }
        if ((cost1 == cost2) && (hours1 == hours2)) {
            System.out.printf("Both bidders have the same bid, with " + bidder1
                    + " needing " + hours1 + " hours of work, and having a cost per hour of "
                    + hourlyCharge1 + ", which comes to a total of %.2f ."
                    + bidder2 + " needs " + hours2 + " hours of work, and has a cost per hour of "
                    + hourlyCharge2 + ", which comes to a toal of %.2f .", cost1, cost2);
        }
    }
}
