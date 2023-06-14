package Hi;

public class BMW extends Car {

    public String bModel;
    public String bId;
    public Engine engine;// reference variable
    public Dashboard dashboard;// reference variable

    public BMW(String model, String color, String bModel, String bId, Engine engine, Dashboard dashboard) {
        super(model, color);
        this.bModel = bModel;
        this.bId = bId;
        this.engine = engine;
        this.dashboard = dashboard;
    }

    public void move() {
        System.out.print("BMW ");
        super.move();
    }

    void display1() {

        System.out.println(model);
        System.out.println(color);
        System.out.println(bModel);
        System.out.println(bId);
    }
}
