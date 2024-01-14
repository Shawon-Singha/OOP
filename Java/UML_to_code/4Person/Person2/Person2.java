package Person;

public class Person2 
{
    String name;
    int age;

    public void insertValue(String n,int a)
    {
       name = n;
       age = a;
    }

    public void displayValue()
    {
      System.out.println("Name of Person2:"+name);
      System.out.println("Age of Person2:"+age);
      System.out.println("\n\n");
    }
}
