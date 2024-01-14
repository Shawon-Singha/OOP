package Singha;

public class Main1 implements Runnable{
    
    public void run(){
        System.out.println("Tread is running.");
    }

    public static void main(String[] args) {
        Main m= new Main();
        Thread t = new Thread(m);
        t.start();
    }
}
