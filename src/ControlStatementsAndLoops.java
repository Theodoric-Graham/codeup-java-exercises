import java.util.Scanner;

public class ControlStatementsAndLoops {
    public static void main(String[] args) {
//        System.out.println(10 > 5); //true
//        System.out.println(5 == 5); //true
//        System.out.println(true == false); //false
//        System.out.println(2 <= 2); //true
        //Strings are not mutable
        String string1 = "a";
        String string3 = "a";
        Scanner sc = new Scanner(System.in);
        System.out.println("type 'a'");
        String string2 = sc.nextLine();
        System.out.println("String 1 = " + string1);
        System.out.println("String 2 = " + string2);
//        System.out.println("String 2 == String 1" + string1 == string2); //false
//        System.out.println("String 1 == String 3" + string1 == string3);
        System.out.println("String 1 == String 3 = " + string1.equals(string3));
    }
}
