// Vehicle.java
public class Vehicle {
    protected String model;
    protected double fuelEfficiency;
    protected double distanceTraveled;
    protected double maxSpeed;

    public Vehicle(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.distanceTraveled = distanceTraveled;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo(String type) {
        System.out.println(type + " Model: " + model);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " mpg");
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
        System.out.println("Max Speed: " + maxSpeed + " mph");
        System.out.println();
    }
}

// Car.java
class Car extends Vehicle {
    public Car(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed) {
        super(model, fuelEfficiency, distanceTraveled, maxSpeed);
    }

    public void display() {
        super.displayInfo("Car");
    }
}

// Truck.java
class Truck extends Vehicle {
    public Truck(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed) {
        super(model, fuelEfficiency, distanceTraveled, maxSpeed);
    }

    public void display() {
        super.displayInfo("Truck");
    }
}
