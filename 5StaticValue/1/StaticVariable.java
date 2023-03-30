package Static2Value;


public class StaticVariable 
{

    static int count = 0;
    /*normal datatype store data in different locatin.
     So,for count need data in one laocation,
     that's why use static variable.
     */

    StaticVariable()
    {
        count++;
    }

    void toalstudent()
    {
        System.out.println("Total Student:"+count);
    }

}
