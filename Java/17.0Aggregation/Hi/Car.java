package Hi;

public class Car {
    public String model;
    public String color;

    public Car(String model,String color){
        this.model = model;
        this.color = color;
    }

    public void move(){
        System.out.println("Car can move");
    }
}
