// Alexander Shegstad
// 10/30/2022
// Mod 3 Assignment (Rock Paper Scissors)

// I will be requesting input
import java.util.Objects;
import java.util.Scanner;
// I want there to be a little delay in the output.
// It gives the impression that the computer is doing some intense Rock-Paper-Scissors calculations.
// Also, the suspense is nice.
import java.util.concurrent.*;

/*
Write a program that is similar to the popular game titled “Rock-Paper-Scissors.” The program randomly generates the
number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors. Then, the program is to prompt the user
to enter a value of 1, 2, or 3. Next, the program displays a clear readable message displaying both the computer’s
selection, the user’s selection, and the results.
 */
public class Game {

    // The exception handling here was suggested by the IDE because I was receiving warnings about my sleep() use.
    public static void main(String[] args) throws InterruptedException {

        // First I'll display the title of the game, and the rules...
        //
        System.out.println("\n\t\tWelcome to Rock Paper Scissors!\n");
        System.out.println("**************************************************");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("If you are not familiar, the rules are as follows: \n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Rock beats Scissors...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Paper beats Rock... \n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("and Scissors beats Paper!\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("CHOOSE WISELY... \n");
        TimeUnit.SECONDS.sleep(2);

        // preparing the variables that will help with my loops.
        boolean playAgain;
        String cpuChoice;
        String userChoice = null;

        while (true) {
            double randomNum = Math.random() * 3;
            int randomNumber = (int)randomNum;
            // I use 0, 1, and 2 for the CPU choices, because the RNG includes the zero, and I only want three options.
            if (randomNumber == 0) {
                cpuChoice = "Rock";
            } else if (randomNumber == 1) {
                cpuChoice = "Paper";
            } else if (randomNumber == 2) {
                cpuChoice = "Scissors";
            } else {
                cpuChoice = "CPU couldn't decide";
            }

            // Asking for user input
            Scanner input = new Scanner(System.in);
            System.out.println("It's time to enter your choice: \n");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Enter 1 for Rock\n");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Enter 2 for Paper\n");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Enter 3 for Scissors\n");
            int userInput = input.nextInt();

            // using the int input to assign the correct game choice.
            // I'll be using s different variable for running my if statements than I will displaying information to the user.
            switch (userInput) {
                case 1 -> {
                    userChoice = "Rock";
                    System.out.println();
                    System.out.println("\t\tEntry noted!");
                }
                case 2 -> {
                    userChoice = "Paper";
                    System.out.println();
                    System.out.println("\t\tEntry noted!");
                }
                case 3 -> {
                    userChoice = "Scissors";
                    System.out.println();
                    System.out.println("\t\tNot what I would have gone with, but you do you!");
                }
                default -> System.out.println("\t\tNot a valid choice");
            }


            // Time to determine the winner, but I'm going to work with the int values so that I can more easily use my
            // comparison operators.


            System.out.println("The computer selected " + cpuChoice + "...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You selected " + userChoice + "...");
            System.out.println();
            TimeUnit.SECONDS.sleep(2);
            // Just for fun!
            System.out.println("\tNow let me think...\n");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\t\tCarry the 4...\n");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\t\t\tAaargh!! I HATE FRACTIONS\n");
            TimeUnit.SECONDS.sleep(2);


            // Now to calculate and display the results! (with a little bit of character...)
            if(userInput == 1){ // If the user selects 1 (Rock)
                if(randomNumber == 0){ // If RNG chooses Rock
                    System.out.print("There ain't enough room in this app for the both of us...");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.print("We both selected the same answer. It is a DRAW!");
                }
                else if(randomNumber == 1){ // If RNG chooses Paper
                    System.out.println("You have lost! Everyone this side of the Mississippi knows Paper COVERS Rock!");
                }
                else if(randomNumber == 2){ // If RNG Chooses Scissors
                    System.out.println("You have won! You Rock CRUSHES the Scissors into scrap metal!");
                }
            }
            else if(userInput == 2){ // If the user selects 2 (Paper)
                if(randomNumber == 0){
                    // If RNG chooses Rock
                    System.out.println("You win! The Paper COVERED that Rock like it's a Xmas Gift!");
                }
                else if(randomNumber == 1) {
                    // If RNG chooses Paper
                    System.out.println("You both selected the same paper. It is a draw!");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You can draw on the front, I'll draw on the back!");
                }
                else if(randomNumber == 2) {
                    // If RNG chooses Scissors
                    System.out.println("Better luck next time! Scissors CUTS Paper to shreds!");
                }
            }
            else if(userInput == 3) { // If user chooses Scissors
                if (randomNumber == 0) {
                    // If RNG chooses Rock
                    System.out.println("On no! You've been CRUSHED!\n Scissors don't stand a chance against Rocks!");
                }
                else if (randomNumber == 1) {
                    // If RNG chooses Paper
                    System.out.println("You Win! Even with the cheap safety scissors you selected");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You were able to CUT that paper into wonderful origami Snowflakes!");
                }
                else if (randomNumber == 2) {
                    // If RNG chooses Scissors
                    System.out.println("You're a mind/CPU reader! We picked the same option!");
                }
            }

            // Giving the options to continue the loop, or to exit...
            TimeUnit.SECONDS.sleep(2);
            Scanner endGame = new Scanner(System.in);
            System.out.println("Do you want to continue playing?\t(Y/N)");
            String input_2 = endGame.nextLine();
            if(Objects.equals(input_2, "n") || Objects.equals(input_2, "N")){
                System.out.println("Thanks for playing! See you next time!");
                playAgain = false;
                break;
            }
            else if(input_2 == "y" || input_2 == "Y") {
                System.out.println("Alright, let's do this!");
            }
            TimeUnit.SECONDS.sleep(2);

        }

    }
}
