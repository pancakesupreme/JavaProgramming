package Chapter6;

import java.util.Scanner;

/**Program that explores the usage of more methods.
 *
 * @author Kieran Sowerby
 */
public class P6 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many Euros are worth a dollar?: ");
        double euroToDollar = input.nextDouble();
        System.out.print("How many Pound Sterlings are worth a dollar?: ");
        double sterlingToDollar = input.nextDouble();
        System.out.print("How much Yen is worth a dollar?: ");
        double yenToDollar = input.nextDouble();
        String meme = "Yes";

        do {
            System.out.println("How many dollars are you converting?");
            double dollarConvert = input.nextDouble();
            System.out.print("Which currency do you want to convert?"
                    + "\nE for Euro, P for Pound Sterling, Y for Yen: ");
            String conversionType = input.next();
            if (conversionType.equalsIgnoreCase("E")) {
                conversion(euroToDollar, dollarConvert);
                System.out.printf("Your converted Euros is: %.2f", conversion(euroToDollar, dollarConvert));

            } else if (conversionType.equalsIgnoreCase("P")) {
                conversion(sterlingToDollar, dollarConvert);
                System.out.printf("Your converted Pound Sterlings is: %.2f", conversion(sterlingToDollar, dollarConvert));

            } else if (conversionType.equalsIgnoreCase("Y")) {
                conversion(yenToDollar, dollarConvert);
                System.out.printf("Your converted Yen is: %.2f", conversion(yenToDollar, dollarConvert));
            }
            do {
                System.out.println("\nWould you like another converison? YES or NO:");
                meme = input.next();

            } while ((!meme.equalsIgnoreCase("YES") && (!meme.equalsIgnoreCase("NO"))));

        } while (meme.equalsIgnoreCase("YES"));

    }

    public static double conversion(double currency, double dollars) {
        /**
     * Extra Method
     *
     * @param args arguments from command line prompt
     */

        if (dollars > 100) {
            return (dollars * 0.95 * currency);
        } else {
            return (dollars * 0.90 * currency);
        }
    }
}