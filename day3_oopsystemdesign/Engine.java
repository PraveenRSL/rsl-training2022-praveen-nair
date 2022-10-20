package day3_oopsystemdesign;

public class Engine {
    
    protected String fuelType;
    public boolean isRunning;


    Engine(String fuelType, boolean isRunning)
    {
        this.fuelType = fuelType;
        this.isRunning = isRunning;
    }

    public void start()
    {
        
        System.out.print("Engine in ON");
        
    }

    public void turnOff()
    {
        // code for turning of the engine..
    }

}
