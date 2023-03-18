package practice;

public class Teacher extends Person 
{
    private String teacherId;

    public Teacher(String name,int age,String teacherId)
    {
       super(name,age);
       this.teacherId = teacherId;
    }

    public void setTeacherId(String teacherId)
    {
       this.teacherId = teacherId;
    }

    public String getTeacString()
    {
        return teacherId;
    }
   public void display()
   {
      System.out.println(getname());
      System.out.println(getage());
   }

}
