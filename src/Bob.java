import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean confirm;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Say something to Bob");
            String userInput = sc.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput == "") {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Would you like to ask another question? [y/n]");
            confirm = sc.nextLine().equalsIgnoreCase("y");
        } while (confirm);
        System.out.println("Done talking with Bob");
    }
}
