package Singha;

// anonymous class,no need to declare class

public class Test3 {
    public static void main(String[] args) 
    {

    Person p = new Person() //just imagine this is a class.
    {
        void display() //override
        {
            System.out.println("Hi,This is a Test class.");
        }
        
    };

    p.display();

    }
}
