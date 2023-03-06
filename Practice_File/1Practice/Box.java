//must know about the claas,object,variable,method,constructor and data type

/*Creat a class called Box and pus instance variable height,depth,width.
 data type double. Must use parameterize constructor .
 Write the code using test class.
 */

package SIngha;

public class Box 
{
  double height,width,depth;

  Box(double h,double w,double d)
  {

    height = h;
    width = w;
    depth = d;

    

  }

  void displayvol()
  {
    double vol = height * width *depth;

    System.out.println("The volume is :"+vol);

  }
      
}
