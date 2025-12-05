// Base class
class Vehicle {
    String make;
    String model;
    int year;
}

// Derived class
class Car extends Vehicle {
    int numberOfDoors;

    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {

        // Create a Car object
        Car car1 = new Car();

        // Set values
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;
        car1.numberOfDoors = 4;

        // Display car details
        car1.displayDetails();
    }
}