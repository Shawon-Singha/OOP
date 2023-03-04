package Singha;

public class Student 
{
    private String name;
    private int id;

    void info(String n,int i)
    {
        name = n;
        id = i;
    }

    void dispaly()
    {
        System.out.println("Name of student:"+name);
        System.out.println("Id of that student:"+id);
    }
}
