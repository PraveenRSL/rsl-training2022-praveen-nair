package day3_oopsystemdesign;

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Factory factory = new Factory(); // create object of type factory so that vehicles can be manufactured..

        Car newCar = (Car) factory.produce("Car"); // car object is created 

        // all the attributes and methods related to car will be visible.

        
        newCar.ignition = true;

        newCar.changeStateofHeadLight(true);
        
        System.out.println(newCar.numOfDoor);

        newCar.accelarte();;


    }

   

}
