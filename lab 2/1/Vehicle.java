public class Vehicle {
    protected String model;
    protected double fuelEfficiency;
    protected double distanceTraveled;
    protected double maxSpeed;
    protected double fuel; // Шинэ атрибут

    // Constructor-д fuel нэмсэн
    public Vehicle(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed, double fuel) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.distanceTraveled = distanceTraveled;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println(model + " refueled with " + amount + " gallons.");
        }
    }

    public void displayInfo(String type) {
        System.out.println(type + " Model: " + model);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " mpg");
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
        System.out.println("Max Speed: " + maxSpeed + " mph");
        System.out.println("Fuel Remaining: " + fuel + " gallons"); // шинэ мөр
        System.out.println();
    }
}


