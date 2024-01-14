package Anik;

public class Super1 extends Super
{
    void method()
    {
        display(); // for simple method(not over ride) ,no need to use "super"
        super.method(); // for calling method from parent class
        System.out.println("Another output of overiding method");
    }

    public static void main(String[] args) 
    {
        Super1 ob1 = new Super1();

        ob1.method();
    }
}
