package Method;

public class Static_Method2 
{
    public static void main(String[] args) 
    {
       Static_Method ob1 = new Static_Method();
       /*Non Static method,nust creat object */
       ob1.display1();

       Static_Method.display2();
       /*Staic method ,no needs to creat object */
    }
}
