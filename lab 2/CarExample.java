public class CarExample {
    public static void main(String[] args) {

        System.out.println("Hello Student, let's create a couple of cars using our Car class!");

        Car civic = new Car("Civic", 170);

        civic.start();
        civic.drive();
        civic.turn();
        civic.stop();
    }
}
