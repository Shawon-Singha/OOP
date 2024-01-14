package Static_Keyword;

public class Student 
{
    String name;
    int id;
    static String uni_name="DIU";

    Student(String n,int i)
    {
       name = n;
       id = i;
    }

    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Id : "+id);
        System.out.println("Uni_Name:"+uni_name);
        System.out.println("\n");
    }

}
