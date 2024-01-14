package Hi;

public class Main {
    public static void main(String[] args) {
        Engine et = new Engine(12.0231);

        Dashboard dt = new Dashboard("boAt");

        Toyata t = new Toyata("ASD12", "RED", "W100", "121-15", et, dt);

        t.move();
        t.display();
        
        System.out.println("\n");
        
        Engine eb = new Engine(15.0025);
        Dashboard db = new Dashboard("BoAt");

        BMW b = new BMW("Awr152","Black","m50","125-585",eb,db);

        b.move();
        b.display1();

    }
}
