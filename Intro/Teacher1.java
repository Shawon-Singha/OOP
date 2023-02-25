
package twice.oop1;


public class Teacher1 
{
    public static void main(String[] args)
    {
        Teacher teacher1; // object declare
        teacher1 = new Teacher(); // object creat.
        // Teacher teacher1 = new Teacher();  both correct.
        
        teacher1.name = "Shawon Singha";
        teacher1.gender = "Male";
        teacher1.phone = 186272;
        teacher1.age = 35;
        
        System.out.println("Name : "+teacher1.name);
        System.out.println("Gender : "+teacher1.gender);
        System.out.println("Phone : "+teacher1.phone);
        System.out.println("Age : "+teacher1.age);
        
        Teacher teacher2 = new Teacher();
        
        teacher2.name = "Nakib Al Hasan";
        teacher2.gender = "Male";
        teacher2.phone = 186452;
        teacher2.age = 55;
        
        System.out.println("Name : "+teacher2.name);
        System.out.println("Gender : "+teacher2.gender);
        System.out.println("Phone : "+teacher2.phone);
        System.out.println("Age : "+teacher2.age);
        
    }
}
