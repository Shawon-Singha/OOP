package Singha;

public class Student 
{
    final String Name; //blank final variable
    final int age;  //blank final variable

   // finale variable must initial in constructor
    Student()
    {
        Name = "Shawon";
        age = 21;
    }

    void display()
    {
        System.out.println("Name: "+Name);
        System.out.println("Age : "+age);
    }
}
