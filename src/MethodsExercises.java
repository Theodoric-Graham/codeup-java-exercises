import java.util.Scanner;

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
        getFactorial(5);
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
        System.out.println(userInput);
        long factorial = 0;
        return userInput;
    }






}
