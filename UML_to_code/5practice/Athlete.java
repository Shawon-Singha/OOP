package practice;

import javax.xml.transform.Source;

public class Athlete extends Student {
   private String sport;

   public Athlete(String name, int age, String studentId, String sport) {
      super(name, age, studentId);
      this.sport = sport;
   }

   public void setSport(String sport) {
      this.sport = sport;
   }

   public String getSport() {
      return sport;
   }

   public void display2() {
      System.out.println(getname());
      System.out.println(getage());
      System.out.println(getstudentId());
      System.out.println(getSport());

   }

   

}
