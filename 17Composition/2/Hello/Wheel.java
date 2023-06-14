package Hello;

public class Wheel {
    public String wheel_type;
    public int wheel_price;


    public Wheel(String wheel_type,int wheel_price){
        this.wheel_type = wheel_type;
        this.wheel_price = wheel_price;
    }

    void display(){
        System.out.println("Wheel Info");
        System.out.println("Wheel Type : " +wheel_type);
        System.out.println("Wheel price : " + wheel_price);
    }
}
