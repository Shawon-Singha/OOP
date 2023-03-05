//parameterized constructor in Class

public class Practice 
{
    static String name,gender;
    static int id,age;


   Practice(String n,String m,int a,int i)
    {
        name = n;
        gender = m;
        age = a;
        id = i;
    }

    static void display()
    {
        System.out.println("Name"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Id:"+id); 
        System.out.println("\n");
    }

   

}
