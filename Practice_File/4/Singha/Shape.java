package Singha;

public abstract class Shape 
{
    double base,height;

    Shape(double base,double height)
    {
       this.base = base;
       this.height = height;
    }

    abstract void area();

}
