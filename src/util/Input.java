package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
//        System.out.println("Type a string");
        String input = scanner.nextLine();
//        System.out.println(input);
        return input;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        System.out.println(input);
        return input;
    }

    public boolean yesNo() {
        System.out.println("Select [y/n]?");
        boolean input = scanner.next().equalsIgnoreCase("y");
        System.out.println(input);
        return input;
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        boolean input = scanner.next().equalsIgnoreCase("y");
        return input;
    }

    public int getInt(int min, int max) {
        System.out.printf("Pick a number between %d and %d %n", min, max);
        int input = scanner.nextInt();
        if (input > max || input < min) {
            System.out.println("Sorry not a valid number, try again!");
            return getInt(min, max);
        }
        System.out.printf("You chose number %d %n", input);
        return input;
    }

//    public int getInt() {
//        System.out.println("Enter an integer");
//        int input = scanner.nextInt();
//        System.out.printf("You selected %d %n", input);
//        return input;
//    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int input = scanner.nextInt();
        System.out.printf("You selected %d %n", input);
        return input;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Pick a double between %s and %s %n", min, max);
        double input = scanner.nextDouble();
        if (input > max || input < min) {
            System.out.println("Sorry not a valid double, try again!");
            return getDouble(min, max);
        }
        System.out.printf("You chose double %s %n", input);
        return input;
    }

//    public double getDouble() {
//        System.out.println("Enter a double");
//        double input = scanner.nextDouble();
//        System.out.printf("You selected %s %n", input);
//        return input;
//    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double input = scanner.nextDouble();
        System.out.printf("You selected %s %n", input);
        return input;
    }

    public int getInt() {
        System.out.println("Enter an Integer Value");
        String stringVal = getString();
        try {
            return Integer.valueOf(stringVal);
        } catch(NumberFormatException e) {
            System.out.println("Not an integer");
            return getInt();
        }
    }

    public double getDouble() {
        System.out.println("Enter a double");
        String stringVal = getString();
        try {
            return Double.valueOf(stringVal);
        } catch (NumberFormatException e) {
            System.out.println("Not a Double");
            return getDouble();
        }
    }

    public Integer getBinary() {
        System.out.println("Enter a binary");
        String stringVal = getString();
        try {
            return Integer.valueOf(stringVal, 2);
        } catch (NumberFormatException e) {
            System.out.println("Something wrong");
            return getBinary();
        }
    }

    public Integer getHex() {
        System.out.println("Enter a hexcode");
        String stringVal = getString();
        try {
            return Integer.valueOf(stringVal, 16);
        } catch (NumberFormatException e) {
            System.out.println("Somethings wrong");
            return getBinary();
        }
    }

}
