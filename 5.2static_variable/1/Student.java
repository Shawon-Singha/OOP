//Count the Student

package Static_Variable;

public class Student 
{
   static int count = 0; // static variable

    Student()
    {
        count++;
    }

    void display()
    {
        System.out.println("Total:"+count);
    }
}
