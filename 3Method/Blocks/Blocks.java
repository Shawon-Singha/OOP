package Static_Blocks;

public class Blocks 
{
    static int id;
    static String name;

    static
    {
       id = 5290;
       name = "Shawon";
    }

     void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("\n");
    }

    static void display1()
    {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("\n");
    }


    
}
