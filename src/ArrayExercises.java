import java.util.Arrays;

public class ArrayExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Theo");
        people[1] = new Person("Paige");
        people[2] = new Person("Cali");
        Person addedPerson = new Person("Cody");

        for (Person element : people) {
            System.out.print(element.getName() + " \n");
        }

        addPerson(people, addedPerson);
    }

    public static Person[] addPerson(Person[] people, Person newPerson  ) {
        //creating an array named morePeople, that is a copy of people, and adding 1 extra length,
        Person[] morePeople = Arrays.copyOf(people, people.length + 1);
        morePeople[morePeople.length-1] = newPerson;
//        for (Person element : morePeople) {
//            System.out.print(element.getName() + " ");
//        }
        return morePeople;

    }




}
