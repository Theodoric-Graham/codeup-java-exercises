import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        The value of pi is approximately 3.14.
//        System.out.format("The value of pi is approximately %s", pi);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
//        int userInput;
//        System.out.println("Enter a Number: ");
//        userInput = sc.nextInt();
//        System.out.println(userInput);

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.println("Enter 3 words: ");
//        userInput = sc.nextLine();
//        String[] arrOfStr = userInput.split(" ", 3);
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.println("Enter a sentence: ");
//        String userSentence = sc.nextLine();
//        System.out.println(userSentence);

//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//        sc.useDelimiter("\n");
        System.out.println("enter a length");
        String length = sc.nextLine();
        System.out.println("enter a width");
        String width = sc.nextLine();

        int parsedWidth = parseInt(length);
        int parsedLength = parseInt(width);

        System.out.printf("%s %s", parsedLength, parsedWidth);

        double area = parsedWidth * parsedLength;
        System.out.println(area);
        double perimeter = (parsedWidth * 2) + (parsedLength * 2);
        System.out.println(perimeter);
        System.out.printf("The length is %s and the width is %s. Your area is %s, and your perimeter is %s", parsedLength, parsedWidth, area, perimeter);





    }
}
