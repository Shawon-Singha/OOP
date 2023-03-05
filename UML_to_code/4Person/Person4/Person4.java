//constructor overloading

package Person;

public class Person4 
{
    String name;
    int age;

    Person4()
    {
     
    }

    Person4(String n,int a)
    {
      name = n;
      age = a;
    }

    void display()
    {
      System.out.println("Name:"+name);
      System.out.println("Age:"+age);
      System.out.println("\n");
    }
}
