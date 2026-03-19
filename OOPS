// Abstraction
abstract class Vehicle {
    abstract void start();   // abstract method
}

// Inheritance
class Car extends Vehicle {
    
    // Encapsulation
    private String brand;

    // Getter
    public String getBrand() {
        return brand;
    }

    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Polymorphism (method overriding)
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    
    // Polymorphism (method overriding)
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class Main {
    public static void main(String[] args) {

        // Encapsulation usage
        Car c = new Car();
        c.setBrand("Toyota");
        System.out.println("Car brand: " + c.getBrand());

        // Polymorphism
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();  // Calls Car method
        v2.start();  // Calls Bike method
    }
}
