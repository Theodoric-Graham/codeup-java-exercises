package notes;

import java.util.*;

public class JavaNotes {
    //    using scanner globally
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        int x = 5 * 4 % 3;
//        System.out.println(x);

        //Lists, Sets, Maps
        //a list allows you to add and remove elements like in an array easier (array list ie. vector) general solution
        //stack can push and pop
        //declare an array list
        //all elements inside an array list need to be the same type
        //start with data type

//    fruits.add("banana");
        ArrayList<String> fruits;
        fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
//        System.out.println(fruits);

        // can also give it any # of string args
        // can make a new array list from some other list
        fruits = new ArrayList<>(Arrays.asList("guava", "peach"));
//        System.out.println(fruits);

        //show size() instead of .length
//        System.out.println(fruits.size());

        //add another element
        fruits.add("banana");
//        System.out.println(fruits.size());
        //get an element at a given index
        fruits.add(1, "apple");
//        System.out.println(fruits);
        //bulk add
        fruits.addAll(Arrays.asList("plum", "apple", "papaya", "durian"));
//        System.out.println(fruits);
        //loops with arrayList (get method and pass in index)
        //for i
//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.printf("the fruit at index %d is %s\n", i, fruits.get(i));
//        }

        //javas foreach (data type, element, whole array, need to make index if you want access)
//        int i = 0;
//        for (String fruit : fruits) {
//            fruit = "starfruit";
//            System.out.printf("the fruit at index %d is %s\n", i++, fruit);
//            i++;
//        }

        //does not mutate
//        System.out.println(fruits);

        //.indexOf(),  searches for an element and returns the first occurrence at the index
        //case-sensitive
        //no good way to find second element
//        System.out.println(fruits.indexOf("Apple"));
//        System.out.println(fruits.lastIndexOf("apple"));
//        System.out.println(fruits.contains("apple"));
        //.remove() does mutate
//        System.out.println(fruits.remove("apple"));
//        System.out.println(fruits);
        //returns the remove element
//        System.out.println(fruits.remove(1));
//        System.out.println(fruits);
//        System.out.println(fruits.removeAll(Arrays.asList("apple", "mango")));
//        System.out.println(fruits);
//        System.out.printf("still have fruits? %b \n", fruits.isEmpty());
//        fruits.clear();
//        System.out.printf("still have fruits? %b \n", fruits.isEmpty());

        //hashmaps (meant for searching)
        //arrays and arrayLists are not great for searching for something specific
        //first arg is key data type, 2nd arg is value data type
        HashMap<String, String> fruitsMap = new HashMap<>();

        // .put()
        fruitsMap.put("fruit", "dragonfruit");
        System.out.println(fruitsMap);
        //.putIfAbsent() case sensitive for key
        fruitsMap.putIfAbsent("fruit", "banana");
        System.out.println(fruitsMap);
        //.get() give it key value, will give null if it doesnt exist
        System.out.println(fruitsMap.get("fruit"));
        System.out.println(fruitsMap.get("Fruit"));
        //.getOrDefault() if this doesnt exist, create this value with this key
        System.out.println(fruitsMap.getOrDefault("Fruit", "APPLE"));
        System.out.println(fruitsMap);
        //.containsKey() returns boolean if it contains the key
        System.out.println(fruitsMap.containsKey("fruit"));
        //.containsValue() returns boolean if it contains the value
        System.out.println(fruitsMap.containsValue("dragonfruit"));
        //.replace() 1st arg is key, 2nd is value, mutates original, if no key returns null
        fruitsMap.replace("fruit", "lemon");
        System.out.println(fruitsMap);
        //.remove()
        //.clear()
        //.isEmpty()
        //Set does not show duplicates, ordered
        Set<String> keys = fruitsMap.keySet();
        for (String key : keys) {
            System.out.println("SET");
            System.out.println(fruitsMap.get(key));
        }

        //HashSet, only shows no duplicates, does not maintain order
        HashSet<String> fruitSet = new HashSet<>();

        fruitSet.add("orange");
        fruitSet.add("banana");
        fruitSet.add("apple");
        fruitSet.add("apple");

        System.out.println(fruitSet);

        //iterate over the set
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }




    }


}
