package day3_oopsystemdesign;

public class Car extends Vehicle{
    
    protected int numOfWheels;

    protected int numOfDoor;

    public  SteeringWheel steeringWheel;

    boolean isHeadLightOn;

    public boolean ignition;

    Car()
    {
        System.out.println("car has been constructed");
        numOfDoor = 4;
        steeringWheel = new SteeringWheel(85.5f);
        isHeadLightOn = false;
        numOfWheels = 4;
        ignition = false;
    }

    Car(String brand,String fuelType,int registrationNumber,int yearOfManufacturing)
    {
        this.brand = brand;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.yearOfManufacturing = yearOfManufacturing;

    }

// this method will change the state of headlight when required.
    public void changeStateofHeadLight(boolean isHeadLightOn)
    {
        this.isHeadLightOn = isHeadLightOn;

        if(isHeadLightOn)
        {
            System.out.println("head light is ON");
        }
        else
        {
            System.out.println("head light is OFF");
        }

    }

// this will tell the engine that I have given the ignition turn on the engine and turn off when required..
    public void modeToStart(boolean ignition)
    {

        this.ignition  = ignition;

        if(ignition)
        {
            Car.vehicleEngine.start();
        }
        else
        {
            Car.vehicleEngine.turnOff();
        }

    }

    public class SteeringWheel{
    

        float angleOfSteer;
        SteeringWheel(float angle)
        {
            angleOfSteer = angle;
        }
    
        // this function will tell us the direction of steer..
        public void steerDirection(float angleOfSteer)
        {
    
            this.angleOfSteer = angleOfSteer;
    
            if(angleOfSteer > 0 )
            {
                System.out.print("Steer to right");
            }
            else
            {
                System.out.print("Steer to left");
            }
    
        }
    
    
    }


}
