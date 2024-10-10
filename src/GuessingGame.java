import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner (System.in);
    
    String correctName = "Emma";
    String guesses = "";
    int guessesCount = 0;


    do {
        System.out.println("Guess my name (type stop to exit)");
        guesses = scanner.nextLine();
        

        if (guesses.equalsIgnoreCase("Stop")) {
            break;
        }
        guessesCount++;

        if (guesses.equalsIgnoreCase(correctName)) {
            System.out.println("Congratulations!");
            break;
        }
        }
        while (true);
        System.out.println("You guessed " + guessesCount + " times.");

        
    }
}
