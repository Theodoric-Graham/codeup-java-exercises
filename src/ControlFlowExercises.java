import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Question 1
        //1a
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
        //1b
//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i < 100);

//        int i = 100;
//        do {
//                    System.out.println(i);
//            i -= 5;
//        } while (i > -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//
//
//        } while (i < 1000000);
        //1c
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//        for(int i = 0; i < 100; i += 2) {
//            System.out.println(i);
//        }
//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        //Question 2

//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //Question 3
//        System.out.println("What number would you like to go up to?");
        Scanner sc = new Scanner(System.in);
//        int userNum = parseInt(sc.nextLine());
//        System.out.printf(" %s | %s | %s %n", "number", "squared", "cubed");
//        System.out.printf("--------|---------|-------%n");
//        for (int i = 1; i <= userNum; i++ ) {
//            System.out.printf(" %-6d | %-7d | %d %n", i, i * i,  i * i * i);
//        }

        //Question 4
        System.out.println("Enter a grade from 0 to 100");
        int grade = parseInt(sc.nextLine());

//        if (grade >= 88) {
//            System.out.println("you got an A");
//        } else if (grade >= 80) {
//            System.out.println("you got a B");
//        } else if (grade >= 67) {
//            System.out.println("you got a C");
//        } else if (grade >= 60) {
//            System.out.println("you got a D");
//        } else if (grade <= 59) {
//            System.out.println("you got an F");
//        }



    }
}
