package Interface;

public class C implements A,B
{
    public void play()
    {
        System.out.println("Hi,I am from C.");
    }

    public void play(int a) // Same method never accepted.
    {
        System.out.println("Hi,I am from C with argument.");
    }
}
