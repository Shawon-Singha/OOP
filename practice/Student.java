package practice;

public class Student extends Person
{
   private String studentId; 

   public Student(String name,int age,String studentId)
   {
      super(name,age);
      this.studentId = studentId;
   }

   public void setStudentId(String studentId)
   {
      this.studentId = studentId;
   }

   public String getstudentId()
   {
    return studentId;
   }
}

