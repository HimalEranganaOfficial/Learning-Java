public class inheritanceExample1 {
    public static void main(String args[]) {
        Car obj1 = new Car();
        System.out.println("This vehicle has " + obj1.wheels + " wheels.");
        System.out.println("Make of this vehicle is " + obj1.make);
        System.out.println("This vehicle has " + obj1.num_seats + " seats.");
        obj1.run();
        obj1.carry();
    }
}
class Vehicle {
    int wheels = 4;
    String make = "Toyota";
    void run() {
        System.out.println("This runs on ground");
    }
}
class Car extends Vehicle {
    int num_seats = 5;
    void carry() {
        System.out.println("This can carry people");
    }
}