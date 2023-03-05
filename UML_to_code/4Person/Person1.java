package Person;

public class Person1 
{
    private String name;
    private int age;

    public static void main(String[] args) 
    {
        Person1 p1 = new Person1();
        p1.name = "Shawon";
        p1.age = 21;

        System.out.println("Person1 name:"+p1.name);
        System.out.println("Person1 age:"+p1.age);

        Person1 p2 = new Person1();
        p2.name = "Anik";
        p2.age = 22;

        System.out.println("\n\nPerson2 name:"+p2.name);
        System.out.println("Person2 age:"+p2.age);

    }
}
