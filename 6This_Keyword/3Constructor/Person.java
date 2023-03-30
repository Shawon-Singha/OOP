package Singha;

public class Person 
{
    String name;
    int age;
    double height;

    Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    Person(String name,int age,double height)
    {
        this(name,age);
        this.height = height;
        System.out.println("Height : "+height);
    }

    
}
