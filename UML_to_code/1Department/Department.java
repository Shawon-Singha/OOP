package Singha;

public class Department 
{
    private String deptName;
    private int deptCode;
    private String faculty;

    void info(String n,int c,String f)
    {
        deptName = n;
        deptCode = c;
        faculty = f;
    }

    void display()
    {
        System.out.println("Name of Department :"+deptName);
        System.out.println("ID of Department :"+deptCode);
        System.out.println("Name of Faculty:"+faculty);
    }
}
