/*
 * Class: CMSC203 
 * Instructor:Ashique Tanveer 
 * Description: Write a program that tests your ESP (extrasensory perception). The program should randomly select the name of a color from the following list of words:
Red, Green, Blue, Orange, Yellow

 * Due: 06/20/23
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Dagmawi Kebede
*/

import java.util.Scanner;
import java.util.Random;

public class EspProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your MC M#: ");
        String mcNumber = scanner.nextLine();

        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();

        System.out.print("Due Date: ");
        String DueDate = scanner.nextLine();
        
        System.out.println("\nLet's play the ESP game!");
        System.out.println("I will randomly select a color, and you need to guess it.");
        System.out.println("You have 10 attempts.");

        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        int numCorrectGuesses = 0;

        for (int i = 1; i <= 10; i++) {
            int randomIndex = random.nextInt(colors.length);
            String selectedColor = colors[randomIndex];

            System.out.print("\nAttempt " + i + ": Guess the color: ");
            String userGuess = scanner.nextLine();

            System.out.println("Selected color: " + selectedColor);

            if (userGuess.equalsIgnoreCase(selectedColor)) {
                System.out.println("Correct guess!");
                numCorrectGuesses++;
            } else {
                System.out.println("Wrong guess!");
            }
        }

        System.out.println("\nGame over!");
        System.out.println("Number of correct guesses: " + numCorrectGuesses);

        // Additional code for further processing or actions based on the user input can be added here
    }
}
