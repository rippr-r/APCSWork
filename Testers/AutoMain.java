public class AutoMain {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Max speed of car: " + car.maxSpeed + " km/h");
        car.displayMaxSpeed(); // This calls with the SUPER keyword

        car.vroom();

        Car car2 = new Car(); // Just by having this, it will call the constructor of the class
    }
}
