import java.util.ArrayList;

public class CarCatalog {

    private ArrayList<Car> cars;

    public CarCatalog() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

    public void printAllCars() {
        System.out.println("=== All Cars ===");

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void printCarsFromYear(int year) {
        System.out.println("\n=== Cars from " + year + " ===");

        for (Car car : cars) {
            if (car.getYear() == year) {
                System.out.println(car.getBrand() + " " + car.getYear());
            }
        }
    }
}