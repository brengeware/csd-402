//Brennan Cheatwood
//CSD402 | M2 Assignment: Rock Paper Scissors

import java.util.Scanner;
import java.util.Random;




public class RPS {

    //colors from stackoverflow
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {

        //input reader
        Scanner input = new Scanner(System.in);

        //Random object
        Random rand = new Random();

        //Computer chooses random number between 1 and 3
        int computerChoice = rand.nextInt(3) + 1;
        
        //Ask for input
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println(ANSI_BLUE + "Rock Paper Scissors" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "Enter 1 for Rock, 2 for Paper, 3 for Scissors: " + ANSI_RESET);
        System.out.println("");
        int userChoice = input.nextInt();

        //convert computerChoice number into readable words
        String computerWord = "";
        if (computerChoice == 1) {
            computerWord = "Rock";
        } else if (computerChoice == 2) {
            computerWord = "Paper";
        } else if (computerChoice == 3) {
            computerWord = "Scissors";
        }

        //Convert userChoise number into words
        String userWord = "";
        if (userChoice == 1) {
            userWord = "Rock";
        } else if (userChoice == 2) {
            userWord = "Paper";
        } else if (userChoice == 3) {
            userWord = "Scissors";
        }

        //Print outs
        System.out.println("");
        System.out.println(ANSI_BLUE + "Computer chose: " + computerWord + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "You chose: " + userWord + ANSI_RESET);
        System.out.println("");



        //Compute the winner
        if (computerChoice == userChoice) {
            System.out.println(ANSI_YELLOW + "RESULT: Tied! What are the odds?!" + ANSI_RESET);
            System.out.println("");
        } else if (userChoice == 1 && computerChoice == 3) {
            System.out.println(ANSI_GREEN + "RESULT: You won! Your rock crushed the computer's scissors." + ANSI_RESET);
        } else if (userChoice == 2 && computerChoice == 1) {
            System.out.println(ANSI_GREEN + "RESULT: You won! Your paper hides the rock so well, it'll never be seen again." + ANSI_RESET);
        } else if (userChoice == 3 && computerChoice == 2) {
            System.out.println(ANSI_GREEN + "RESULT: You Won! Your scissors mercilessly slice the paper into smithereens..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "RESULT: You Lost! The almighty computer has won this round..." + ANSI_RESET);
        }

        //Closer scanner
        input.close();


    }
}
