package Singha;

public class Circle extends Shape
{
    
    Circle(double r)
    {
        super(r,r);
    }

    void area()
    {
        double result = Math.PI * base * height;
        System.out.println("Result : "+result);
    }
}
