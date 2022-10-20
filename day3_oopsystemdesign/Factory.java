package day3_oopsystemdesign;

public class Factory {

    public Vehicle produce(String vehicleType)
    {

        if(vehicleType == null)
        {
            return null;
        }
        if(vehicleType.equalsIgnoreCase("Car"))
        {
            return new Car();
        }
        else if(vehicleType.equalsIgnoreCase("MotorBike"))
        {
            return new Motorbike();
        }

        return null;

    }
    
}
