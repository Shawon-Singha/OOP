package Singha;

public class Mobile 
{
    private String modelName;
    private String brand;
    private int code;
    private double price;

    void info(String m,String b,int c,double p)
    {
      modelName = m;
      brand = b;
      code = c;
      price = p;
    }

    void display()
    {
        System.out.println("Model Name:"+modelName);
        System.out.println("Brand:"+brand);
        System.out.println("Mobile Code:"+code);
        System.out.println("Price :"+price);
    }
}
