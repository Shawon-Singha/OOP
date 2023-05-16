package Singha;

public class Triangle extends Shape
{
    Triangle(double base,double height)
    {
        super(base, height);
    }

    void area()
    {
        double result = 0.5 * base * height;
        System.out.println("Result : "+result);
    }
}
