package Chapter5;

import java.util.Scanner;

/**Program that plays rock paper scissors.
 *
 * @author Kieran Sowerby
 */

public class C5_34 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        int computer, compWins = 0, humanWins = 0;

        System.out.println("Ready to play Rock Paper Scissors?");
        System.out.println("Please enter rock, paper, or scissors to get started: ");

        answer = input.next();

        while (compWins - humanWins < 2 || humanWins - compWins < 2) {
            computer = (int) (Math.random() * 4);
            switch (answer.toUpperCase()) {
                case ("ROCK"):
                    switch (computer) {
                        case 1:
                            System.out.println("It's a tie!");
                            break;
                        case 2:
                            System.out.println("Computer wins a round.");
                            compWins++;
                            break;
                        default:
                            System.out.println("Human wins a round.");
                            humanWins++;
                            break;
                    }
                    System.out.println("Please enter rock paper or scissors once again: ");
                    answer = input.next();
                    break;
                case ("PAPER"):
                    switch (computer) {
                        case 1:
                            System.out.println("Human wins a round.");
                            humanWins++;
                            continue;
                        case 2:
                            System.out.println("It's a tie!");
                            break;
                        default:
                            System.out.println("Computer wins a round.");
                            compWins++;
                            break;
                    }
                    System.out.println("Please enter rock paper or scissors once again: ");
                    answer = input.next();
                    break;
                case ("SCISSORS"):
                    switch (computer) {
                        case 1:
                            System.out.println("Computer wins a round.");
                            compWins++;
                            break;
                        case 2:
                            System.out.println("Human wins a round.");
                            humanWins++;
                            break;
                        default:
                            System.out.println("It's a tie!");
                            break;
                    }
                    System.out.println("Please enter rock paper or scissors once again: ");
                    answer = input.next();
                    break;
                default:
                    System.out.println("Invalid option! Please enter rock paper or scissors: ");
                    answer = input.next();
            }
            if (compWins - humanWins > 2) {
                System.out.println("Computer wins!");
            } else if (humanWins - compWins > 2) {
                System.out.println("Human wins!");
            }
        }
    }
} 
