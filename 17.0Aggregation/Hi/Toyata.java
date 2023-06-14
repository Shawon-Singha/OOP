package Hi;



public class Toyata extends Car{
    private String tModel;
    private String tId;
    public Engine engine; //reference variable
    public Dashboard dashboard; //reference variable

    public Toyata(String model,String color,String tModel,String tId,Engine engine,Dashboard dashboard){
         super(model,color);
         this.tModel = tModel;
         this.tId = tId;
         this.engine = engine;
         this.dashboard = dashboard;
    }

    public String getTModel(){
        return tModel;
    }
    public String getTId(){
        return tId;
    }

    public void move(){
      System.out.print("Toyata ");
        super.move();
    }

    void display(){
       
        
        System.out.println(model);
        System.out.println(color);
        System.out.println(tModel);
        System.out.println(tId);
    }

    
    
}
