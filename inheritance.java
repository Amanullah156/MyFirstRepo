
class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}


class Car extends Vehicle {
    private String modelName = "Mustang";
    public void showDetails() {
        System.out.println(brand + " " + modelName);
    }
}

class Bike extends Vehicle {
    private String modelName = "honda";
    public void showDetails() {
        System.out.println(brand + " " + modelName);
    }
}

class Truck extends Vehicle {
    private int loadCapacity = 10000; 
    public void showDetails() {
        System.out.println(brand + " Truck with load capacity: " + loadCapacity + " kg");
    }
}


class Bus extends Vehicle {
    private int passengerCapacity = 50; 
    public void showDetails() {
        System.out.println(brand + " Bus with passenger capacity: " + passengerCapacity);
    }
}


public class MainClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        myCar.showDetails();

        Bike myBike = new Bike();
        myBike.honk();
        myBike.showDetails();

        Truck myTruck = new Truck();
        myTruck.honk();
        myTruck.showDetails();

        Bus myBus = new Bus();
        myBus.honk();
        myBus.showDetails();
    }
}



