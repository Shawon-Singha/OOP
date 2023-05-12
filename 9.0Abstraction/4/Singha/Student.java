package Singha;



public class Student extends Person {
   private static final char[] Name = null;
private int id;

   public Student(String name,int id)
   {
      super(name);
      this.id = id;
   }
   
   public void display(){
    System.out.println(Name);
    System.out.println(id);
   }
    
}
