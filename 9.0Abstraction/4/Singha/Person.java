package Singha;

public abstract class Person {
    private String name;
    
    public Person(String name){
       this.name = name;
    }

    public String getName()
    {
        return name;
    }

    abstract void display();
}
