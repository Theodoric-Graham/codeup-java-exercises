package shapes;
import util.Input;

public class CircleApp {

    private static int circles = 0;

    private static double radius;

    private static boolean confirm;

    private static Input input = new Input();

    public static void main(String[] args) {
        getRadius();
        askAgain();
    }

    public static Circle createNew(double radius) {
        Circle circle = new Circle(radius);
         circles++;
         return circle;
    }

    public static double getRadius() {
        radius = input.getDouble("Please enter a radius");
        createNew(radius);
        return radius;
    }

    public static boolean askAgain() {

        confirm = input.yesNo("Would you like to make another circle? [y/n]");
        if(confirm) {
            getRadius();
            System.out.printf("You have made %s circles %n", circles);
            return askAgain();
        } else {
            System.out.printf("Exiting the program, you made %s circles %n", circles);
        }
        return confirm;

    }
}
