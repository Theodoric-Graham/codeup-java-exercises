import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        game();
    }

    public static int random() {
        Random rand = new Random();
        int myRandInt = rand.nextInt(100);
        // To make it between 1(inclusive) and 100 (inclusive), add 1 to the number returned by the method.
        myRandInt += 1;
//        System.out.println(myRandInt);
        return myRandInt;
    }

    public static void game() {
        int guesses = 5;
        boolean passed;
        int randomNum = random();
        System.out.println("Guess a number between 1 and 100");
        do {
            Scanner sc = new Scanner(System.in);
            int userGuess = sc.nextInt();
            if(userGuess > 100 || userGuess < 1) {
                System.out.println("not a valid guess");
            }
            if (userGuess == randomNum) {
                System.out.println("GOOD GUESS");
                passed = true;
            } else if (userGuess < randomNum) {
                guesses--;
                System.out.printf("You have %d guesses %n", guesses);
                System.out.println("HIGHER");
                passed = false;
            } else {
                guesses--;
                System.out.printf("You have %d guesses %n", guesses);
                System.out.println("LOWER");
                passed = false;
            }
        } while (!passed && guesses != 0);
    }
}
