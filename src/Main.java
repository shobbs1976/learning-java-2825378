import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Who coded this?";
        String choiceOne = "Bill Nye";
        String choiceTwo = "Bob Hope";
        String choiceThree = "Stephen Hobbs";

        String correctAnswer = choiceThree;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);


        // Have the user input an answer
        // Retrieve the user's input
        Scanner scanner = new Scanner(System.in);

        String inputAnswer = scanner.nextLine();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (inputAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Good job. '" + choiceThree + "' is the correct answer.");
        }else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("I am sorry '" + inputAnswer + "' is not the correct answer.");
            System.out.println("The correct answer is '" + choiceThree + "'.  Thank you for playing and better luck next time.");
        }

    }

}
