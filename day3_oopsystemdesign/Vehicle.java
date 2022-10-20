package day3_oopsystemdesign;

public class Vehicle {

    public String brand;
    public String fuelType;
    protected int numOfWheels;
    protected static Engine vehicleEngine;
    protected int registrationNumber;
    protected int yearOfManufacturing;

    

    /**
     * 
     */
    public void drive()
    {
        // code for driving of vehicle.
    }

    public void accelarte()
    {
        System.out.println("acclerator is pressed");
    }

    public void brake()
    {
        System.out.println("brakes are applied");
    }

    public void installEngine()
    {
        System.out.println("Engine is installed");
    }
    
}
