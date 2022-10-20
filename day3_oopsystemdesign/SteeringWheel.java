package day3_oopsystemdesign;

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
