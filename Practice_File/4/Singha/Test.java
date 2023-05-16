package Singha;

public class Test 
{
    public static void main(String[] args) {
        
        Shape s;
        s = new Rectangle(10,20);
        s.area();

        s = new Triangle(12.5,10.0);
        s.area();

        s = new Circle(12.5);
        s.area();
    }
}
