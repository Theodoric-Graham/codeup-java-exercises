public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person theo = new Person("Theo");
        System.out.println(theo);
        System.out.println(theo.getName());
        theo.setName("Theodoric");
        System.out.println(theo);
        theo.sayHello();

//        names return as equal but they are not the same object
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        its not creating a new object, merely referencing the same object
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


//        Changing in one, since they both reference the same object, changes both
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());






    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello my name is " + name );
    }

}
