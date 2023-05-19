import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class MethodsExercises {
    public static void main(String[] args) {
//     int product = multiplication(8, 4);
//        System.out.println(product);
//        subtraction(6, 3);
//        addition(6, 3);
//        division(6, 3);
//        modulus(6, 3);
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);
//        getFactorial();
//        rollDice();


    }

    public static int multiplication(int x, int y) {
//        int multiplied = x * y;
//        System.out.println(multiplied);
//        int number = 0;
//        for (int i = 0; i < y; i++) {
//            number += x;
//        }
//        System.out.println(number);
        // if x is less than
        // y swap the numbers
        if (x < y)
//            if 2 < 4 return multiplication(4,2)
            return multiplication(y, x);
            // iteratively calculate
            // y times sum of x
        else if (y != 0)
//            4 + multiplication(4, 1)
//            4 + multiplication(4, 0)
//            4 + 4 + 0 = 8
//            8 + 8 + 8 + 8 + 0
            return (x + multiplication(x, y - 1));

            // if any of the two numbers is
            // zero return zero
        else
            return 0;
    }

    public static void subtraction(int x, int y) {
        int subtracted = x - y;
        System.out.println(subtracted);
    }

    public static void addition(int x, int y) {
        int added = x + y;
        System.out.println(added);
    }

    public static void division(double x, double y) {
        double divided = x / y;
        System.out.println(divided);
    }

    public static void modulus(double x, double y) {
        double remainder = x % y;
        System.out.println(remainder);
    }

    public static int getInteger(int min, int max) {
        //take a number input between given min and max
        System.out.printf("Enter a number between %d and %d: %n", min, max);
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if(userNum < min || userNum > max) {
            System.out.println("That is not a valid number");
            return getInteger(min, max);
        }
        return userNum;
    }

    public static long getFactorial() {
        System.out.println("Enter a integer between 1 and 10");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int fact = 1;
        if(userInput > 10 || userInput < 1) {
            System.out.println("Invalid number");
            return  getFactorial();
        }
        for(int i = 1; i <= userInput; i++) {
            fact = fact* i;
        }
        System.out.println(fact);
        return fact;
    }

    public static void rollDice() {
        boolean confirm;

        do {
            System.out.println("Enter the number of sides for a pair of dice. ");
            int roll = 0;
            int roll2 = 0;
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);
            int range = sc.nextInt();
            while (true) {
                roll = rand.nextInt(range + 1);
                if (roll != 0) break;
            }
            while (true) {
                roll2 = rand.nextInt(range + 1);
                if (roll2 != 0) break;
            }
            System.out.printf("The first dice roll was %d, and the second was %d %n", roll, roll2);
            System.out.println("Would you like to ask another question? [y/n]");
            confirm = sc.next().equalsIgnoreCase("y");
        }while(confirm);
    }








}
