package Singha;

public class Rectangle extends Shape
{
    Rectangle(double base,double height)
    {
        super(base, height);
    }

    void area()
    {
        double result = base * height;
        System.out.println("Result : "+result);
    }
}
