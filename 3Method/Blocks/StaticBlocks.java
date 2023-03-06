package Blocks;

public class StaticBlocks 
{
    static int id;
    static String name;

    static   //statics blocks
    {
       id = 221-15-5290;
       name = "Shawon";
    }

    static void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
    }

    /*
    public static void main(String[] args) 
    {
       StaticBlocks.display(); 
    }
    */
}
