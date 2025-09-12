// Abstract class representing a Vehicle
abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void start(); // Abstract method to start the vehicle

    public void stop() {
        System.out.println("Stopping the " + brand + " " + model);
    }
}

// Interface representing a Music Player
interface MusicPlayer {
    void playMusic(); // Method to play music
    void stopMusic(); // Method to stop playing music
}

// Concrete class Car that extends Vehicle and implements MusicPlayer
class Car extends Vehicle implements MusicPlayer {
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Starting the " + brand + " " + model);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music in the " + brand + " " + model);
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music in the " + brand + " " + model);
    }
}

public class AbstractInterfaceExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.playMusic();
        car.stopMusic();
        car.stop();
    }
}
