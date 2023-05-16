package Static_Keyword;

public class Static_Method2 
{
    static int x = 10;
    void display()
    { 
        display1();
        //static method call in a non static method.
        System.out.println("I am non static");
        System.out.println(x);
        //allow to use static variable in non static method.
    }

    static void display1()
    {
        //display();
        /*non static method can't call in static method*/
        System.out.println("I am static");
    }

    static void display2()
    {
        display1();
        //allow to call from a static method to antoher static method.
        System.out.println("I am another Static method");

    }
}
