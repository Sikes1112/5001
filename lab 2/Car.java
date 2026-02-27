public class Car {
    // 1) Attributes (data stored inside each Car)
    private String model;
    private int horsePower;

    // 2) Constructor (runs when you create a new Car)
    public Car(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    // 3) Methods (actions the car can do)
    public void start() {
        System.out.println(model + " is starting");
        System.out.println("The engine with " + horsePower + " hp is starting");
    }

    public void drive() {
        System.out.println(model + " is driving");
    }

    public void turn() {
        System.out.println(model + " is making a turn");
    }

    public void stop() {
        System.out.println(model + " is stopping");
    }
}

