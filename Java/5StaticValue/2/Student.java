package StaticValue;

public class Student 
{
    String name;
    int id;
    static String university_name = "DIU";

    Student(String n,int i)
    {
        name = n;
        id = i;
    }

    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("University Name:"+university_name);
        System.out.println("\n");
    }
}
