package Static_Keyword;

public class Static_Method2A 
{
    public static void main(String[] args) 
    {
        Static_Method2 ob1 = new Static_Method2();

        ob1.display();
        /*for display static and non static method at same time ,
        it is better to use non static method.
        Just call static method from non static method .
        in main function,creat object and call that non static method
        */

        System.out.println("\n");
        
        Static_Method2.display2();
    }
}
