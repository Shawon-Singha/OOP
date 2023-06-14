package Hello;

public class Car {
     public String name;
    public String model;
    public int price;
    public String wheel_type;
    public int wheel_price;
    public Wheel wheel;

    public Car(String name,String model,int price){
        this.name = name;
        this.model = model;
        this.price = price;

        
        wheel = new Wheel(wheel_type, wheel_price);
    }

    void display1(){
        System.out.println("Car info");
        System.out.println("Car name : " +name);
        System.out.println("Car model : " +model);
        System.out.println("Car price : " +price);
    }
}
