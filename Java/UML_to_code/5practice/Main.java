package practice;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Majunder", 33, "00252455");
        System.out.println("Teacher Information : ");
        t.display();
        
        System.out.println();
        System.out.println("Student Information : ");
        Athlete a = new Athlete("Shawon", 19,"221-15-556", "Running");
        a.display2();
    }
}
