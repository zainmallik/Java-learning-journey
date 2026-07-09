class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is Running");
    }
}

public class SuperSubClass {

    public static void main(String[] args) {

        Bike obj = new Bike();

        obj.start();
        obj.ride();
    }
}