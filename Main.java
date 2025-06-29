public class Main {
    public static void main(String[] args) {
        // Create and test Car object
        Car myCar = new Car(120, 40.5, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();
        System.out.println("Car speed: " + myCar.getSpeed());
        System.out.println("Number of doors: " + myCar.getNumberOfDoors());

        System.out.println(); // Separator

        // Create and test Bicycle object
        Bicycle myBike = new Bicycle(20, 0.0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();
        System.out.println("Bicycle speed: " + myBike.getSpeed());
        System.out.println("Has bell: " + myBike.getHasBell());
    }
}