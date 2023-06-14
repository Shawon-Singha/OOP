package Hello;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW", "1233qw", 60000);

        c.display1();

        Wheel w = new Wheel("Drift",200);
        w.display();
    }
}
