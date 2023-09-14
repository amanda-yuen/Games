package RockPaperScissors;
/*
 * accept a move from the player from the keyboard
 * need the computer to select a move at random
 * */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //keyboard input
        while (true) {

            String[] rps = {"rock", "paper", "scissors"};

//rps.length = 3, when we pass a 3 into random nextInt method, it will return a
//random num between 0 and 2.
            String computerMove = rps[new Random().nextInt(rps.length)];


            String playerMove; //declared outside because we need it outside the while loop

            while (true) {
                System.out.println("Please enter your move (rock, paper or scissors)");
                playerMove = scanner.nextLine(); //get the next line from user = player move

                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move");
            }

            System.out.println("Computer played " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) System.out.println("You lose!");
                else if (computerMove.equals("scissors")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) System.out.println("You win!");
                else if (computerMove.equals("scissors")) {
                    System.out.println("You lose!");
                }
            } else {
                if (computerMove.equals("paper")) System.out.println("You win!");
                else if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                }
            }
            System.out.println("Play again? y/n");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) break;


        }
        scanner.close();
    }
}
