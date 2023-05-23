import java.util.Arrays;

public class ArrayExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        Person[] people = {new Person("theo"), new Person("cody"), new Person("cali")};
        System.out.println(Arrays.toString(people));


        for (Person element : people)

            System.out.print(element.getName() + " ");

    }




}
