package day3_oopsystemdesign;

public class Motorbike extends Vehicle {
    
    protected int numOfWheels;

    private boolean kickstart;

    Motorbike()
    {
        System.out.print("Bike has been constructed");
    }

    Motorbike(String brand,String fuelType,int registrationNumber, int yearOfManufacturing)
    {

        this.brand = brand;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.yearOfManufacturing = yearOfManufacturing;

        numOfWheels = 2;

        kickstart = false;
        

    }

    public void modeToStart(boolean kickstart)
    {
        this.kickstart = kickstart;

        if(kickstart)
        {
            Motorbike.vehicleEngine.start();
        }
        else{
            Motorbike.vehicleEngine.turnOff();
        }

    }


}
