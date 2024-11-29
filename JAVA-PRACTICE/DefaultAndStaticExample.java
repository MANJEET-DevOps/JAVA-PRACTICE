interface Vehicle {
    void start(); // Abstract method

    // Default method
    default void fuelType() {
        System.out.println("Fuel type is petrol.");
    }

    // Static method
    static void vehicleInfo() {
        System.out.println("Vehicles are a mode of transport.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

public class DefaultAndStaticExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.fuelType(); // Calling default method
        Vehicle.vehicleInfo(); // Calling static method
    }
}
