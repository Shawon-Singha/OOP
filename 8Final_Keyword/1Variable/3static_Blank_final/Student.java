package Singha;

public class Student 
{
    static final String name; //static blank final variable
    static final int age;  // static blank final variable

   // for intial static blank final variable,must need static block
    static{
    name = "Shawon";
    age = 25;
   }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
    }
}
