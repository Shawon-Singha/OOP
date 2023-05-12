package Singha;

public class Main {
    
    public static void main(String[] args) {
       
        Human h = new Human();
        h.eat();
        h.move();
        h.talk();
        System.out.println("\n");

        Lion l = new Lion();
        l.eat();
        l.move();
        l.hunt();
        System.out.println("\n");

        Bird b = new Bird();
        b.eat();
        b.move();
        b.fly();



    }
}
