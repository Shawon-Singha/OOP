/*"This" keyword like "Super" keyword.
 * just different Super uses to call from super class..
 * And this uses to call from same class.
 */

package Singha;

public class Person 
{
    void message()
    {
        System.out.println("This is method");
    }

    void display()
    {
        this.message(); 
        //try to access one method in other method.
        
        message();
        //both uses are correct ....

        System.out.println("Welcome");
    }
}
