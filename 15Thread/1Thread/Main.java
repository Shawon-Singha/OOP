package Singha;

public class Main extends Thread {
    public void run() /*"run()"" must use in Thread.
                      bcz in Thread, "run()" is entry point of a code. */
    {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Main m = new Main();

     

        m.start(); //start the execution of code.
                // it calls the "run()" .

        /*run() method directly like m.run().
         * To start a new thread and execute the run() method concurrently, you should use the start()
         */
    }

    
}
