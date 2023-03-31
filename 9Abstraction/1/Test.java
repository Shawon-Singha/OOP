package Singha;

public class Test 
{
    public static void main(String[] args) 
    {
        MobileUser m; // In abstarct can't creat object
        m = new Rahim();
        m.sendMessage();
        m.dispaly();

        m = new Karim();
        m.sendMessage();
    }
}