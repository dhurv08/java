package Programs2.inheritance;

import java.util.Scanner;

public class VehicleRental {
    Scanner scanner = new Scanner(System.in);
    String registrationNumber;
    float rentalRate;

    void setData(String registrationNumber , float rentalRate){
        this.registrationNumber = registrationNumber;
        this.rentalRate = rentalRate;
    }
    void calculateRentalCharge(int days){
        // System.out.print("Enter the Number of days for Rental = ");
        // days = scanner.nextInt();
        System.out.println("\nRegistration Number of Rental = "+ registrationNumber);
        System.out.println("Rental charge for "+ days + " days = " + (days*rentalRate));
    }
    //CAR
    public class Car extends VehicleRental{
        float additionalCharge;
        void setData(String registrationNumber , float rentalRate , float additionalCharge){
            super.setData(registrationNumber, rentalRate);
            this.additionalCharge = additionalCharge;
        }
        void calculateRentalCharge(int days){
            super.calculateRentalCharge(days);  
            // System.out.println("But Rental Rate with Additional charges = "+ ((rentalRate*days)+additionalCharge));
            // System.out.println("Registration Number of Rental = "+ registrationNumber);
            // System.out.println("Rental charge for "+ days + " days = " + (days*rentalRate));
            System.out.println("But Rental Rate with Additional charges = "+ ((rentalRate+additionalCharge)*days));

        }
    }
    //BIKE
    public class Bike extends VehicleRental{
        void setData(String registrationNumber , float rentalRate ){
            super.setData(registrationNumber, rentalRate);
        }  
        void calculateRentalCharge(int days){
            super.calculateRentalCharge(days);
        }
    }

    //TRUCK
    public class Truck extends VehicleRental{
        float additionalCharge;
        void setData(String registrationNumber , float rentalRate , float additionalCharge){
            super.setData(registrationNumber, rentalRate);
            this.additionalCharge = additionalCharge;
        }
        void calculateRentalCharge(int days){
            super.calculateRentalCharge(days);  
            System.out.println("But Rental Rate with Additional charges = "+ ((rentalRate+additionalCharge)*days));

        }
    }

    //main function
    public static void main(String[] args) {
        VehicleRental vehicleRental = new VehicleRental();
        //car
        Car car = vehicleRental.new Car();
        car.setData("PB 08 1234", 3000, 500);
        car.calculateRentalCharge(5);

        //bike
        Bike bike = vehicleRental.new Bike();
        bike.setData("PB 08 5678" , 5000 );
        bike.calculateRentalCharge(3);

        //truck
        Truck truck = vehicleRental.new Truck();
        truck.setData("PB 10 3289", 10000 , 1000);
        truck.calculateRentalCharge(5);
    }
}
