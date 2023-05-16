/*it is a process that allows a class to have two or more than two 
 method having in same name, but parameter must be different*/

package SIngha;

public class Method_Overloading 
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }

    void add(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }

    void add(double m,double n)
    {
        System.out.println(m+n);
    }

    void add()
    {
        System.out.println("No Value.");
    }
}
