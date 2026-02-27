public class Lab03Main {

    public static void main(String[] args) {

        CarCatalog catalog = new CarCatalog();

        catalog.addCar(new Car("Camry", "Toyota", 2020));
        catalog.addCar(new Car("Civic", "Honda", 2019));
        catalog.addCar(new Car("Corolla", "Toyota", 2020));
        catalog.addCar(new Car("Focus", "Ford", 2018));
        catalog.addCar(new Car("X5", "BMW", 2022));
        catalog.addCar(new Car("Accord", "Honda", 2021));
        catalog.addCar(new Car("RAV4", "Toyota", 2019));
        catalog.addCar(new Car("Mustang", "Ford", 2020));

        catalog.printAllCars();
        catalog.printCarsFromYear(2018);
    }
}