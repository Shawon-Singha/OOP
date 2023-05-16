package StaticMethod;

public class StaticMethod 
{
    void display() //non static method
    {
        display1();
        System.out.println("This is Nonstatic method");
    }

    /*From non static method,we can call static method.
     but from static method,we can not call non static method.

     Else we can call from a static method to another static method

     */
    static void display1() //static method 
    {
      System.out.println("This is a static methid");
    }

}
