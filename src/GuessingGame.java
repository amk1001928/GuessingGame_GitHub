import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner (System.in);
    
    // Added Strings and int 
    String correctName = "Emma";
    String guesses = "";
    int guessesCount = 0;

        // System print & add scanner
    do {
        System.out.println("Guess my name (type stop to exit)");
        guesses = scanner.nextLine();
        

        // Stop and correct name condition added
        if (guesses.equalsIgnoreCase("Stop")) {
            break;
        }
        guessesCount++;

        if (guesses.equalsIgnoreCase(correctName)) {
            System.out.println("Congratulations!");
            break;
        }
        }
        // Final entry count added
        while (true);
        System.out.println("You guessed " + guessesCount + " times.");

        
    }
}
