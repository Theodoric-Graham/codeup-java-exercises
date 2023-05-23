import java.util.Random;

public class ServerNameGenerator {
    public static Random rand = new Random();

    public static String[] adjective = {"attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "drab", "elegant", "fancy", "fit"};

    public static String[] nouns = {"actor", "gold", "painting", "banana", "hospital", "quill", "death", "library", "teacher", "vegetable"};

    public static void main(String[] args) {
        randomElement(adjective);
        randomElement(nouns);
        System.out.println("Here is your server name");
        System.out.printf("%s-%s", randomElement(adjective), randomElement(nouns));
    }

    public static String randomElement(String[] arr) {
        // create random int between 0 and 9
        int random = rand.nextInt(10);

        // return a random element of the passed in array based on passed in random index
        return arr[random];
    }
}
