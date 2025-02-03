 
package assignment_2;

public class PolymorphismVehicle {

    public static void vehicleTestDrive(vehicle vehicle){
        vehicle.EngineStarts();
    }
    public static void main(String[] args){
        vehicle myCar = new car();
        vehicle myMotorcycle = new motorcycle();

        System.out.println("Car:");
        vehicleTestDrive(myCar);
        
        System.out.println("Motorcycle:");
        vehicleTestDrive(myMotorcycle);
    }
}
class vehicle{
    void EngineStarts(){
        System.out.println("The vehicle's engine is starting...");
    }
}
class car extends vehicle{
    void EngineStarts(){
       System.out.println("The car's engine starts with a push button.");
    }
}
class motorcycle extends vehicle{
    void EngineStarts(){
       System.out.println("The motorcycle's engine starts with a kickstart.");
    }
}



