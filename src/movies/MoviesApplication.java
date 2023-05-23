package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static int choice;
    public static Scanner sc = new Scanner(System.in);

    public static String moviesShown = "";

    public static void main(String[] args) {
       movieApp();
    }

    public static String movieApp() {
        movieMenu();
        return showMovies(choice);

    }

    //Creates the movie selection menu and returns the number choice
    public static int movieMenu() {
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("-----------------------------");
        System.out.printf("Enter your choice ");
        choice = sc.nextInt();
        return choice;
    }

    // takes the updated choice variable and passes it into showMovies, triggering a case
    public static String showMovies(int selection) {
        switch (selection) {
            case 0:
                System.out.println("Ending the application");
                break;
            case 1:
                // Loops over the movies and adds them to the MoviesShown string
                for (Movie element : MoviesArray.findAll()) {
                    moviesShown += element.getName() + " -- " + element.getCategory() +"\n";
                }
                System.out.println(moviesShown);
                break;
            case 2:
                //passing in the category for sortMovies method
                sortMovies("animated");
                break;
            case 3:
                sortMovies("drama");
                break;
            case 4:
                sortMovies("horror");
                break;
            case 5:
                sortMovies("scifi");
                break;
            default:
                System.out.println("Not a valid entry, please select an option");
                return movieApp();

        }
    return moviesShown;
    }

    //takes a category and filters the array based on it
    public static String sortMovies(String category) {
        for (Movie element : MoviesArray.findAll()) {
            //if its the selected category, then add that movie to the moviesShown string
            if(element.getCategory() == category) {
                moviesShown += element.getName() + " -- " + element.getCategory() +"\n";

            }
        }
        System.out.println(moviesShown);
        return moviesShown;
    }


}
