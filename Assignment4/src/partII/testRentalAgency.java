package partII;

import partI.*;
import java.util.ArrayList;

public class testRentalAgency {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency("Fast Rentals", "Los Angeles", "CA");

        Car car1 = new Car("Toyota", "Corolla", 2020, 5);
        car1.setRentalRate(40.0);
        
        Car car2 = new Car("Honda", "Civic", 2021, 5);
        car2.setRentalRate(45.0);

        Truck truck1 = new Truck("Ford", "Escape", 2022, 3000.0);
        truck1.setRentalRate(70.0);

        Motorcycle bike1 = new Motorcycle("Harley", "Sportster", 2019, false);
        bike1.setRentalRate(35.0);

        PickupTruck pickup1 = new PickupTruck("Chevy", "Silverado", 2023, 2000.0, 5.5, true);
        pickup1.setRentalRate(60.0);

        DeliveryTruck delivery1 = new DeliveryTruck("Mercedes", "Sprinter", 2022, 3500.0, 10.5);
        delivery1.setRentalRate(80.0);
        
        System.out.println("\n=== Adding Vehicles ===");
        System.out.println("Added car1: " + agency.addCar(car1) + " - should be True"); 
        System.out.println("Added car2: " + agency.addCar(car2) + " - should be True"); 
        System.out.println("Added truck1: " + agency.addCar(truck1) + " - should be True"); 
        System.out.println("Added bike1: " + agency.addCar(bike1) + " - should be True"); 
        System.out.println("Added pickup1: " + agency.addCar(pickup1) + " - should be True"); 
        System.out.println("Added delivery1: " + agency.addCar(delivery1) + " - should be True"); 

        System.out.println("\nTotal vehicles in stock: " + agency.totalRentalCars() + " - should be 6"); 
       
        System.out.println("\n=== Renting Vehicles ===");
        System.out.println("Renting car1: " + agency.rentVehicle(car1)); 
        System.out.println("Renting truck1: " + agency.rentVehicle(truck1)); 
        System.out.println("Renting bike1: " + agency.rentVehicle(bike1)); 
        System.out.println("Renting car1 again: " + agency.rentVehicle(car1) + "- Should be null because it has already been rented"); 

        
        System.out.println("\n=== Available Vehicles After Renting ===");
        ArrayList<Vehicle> availableCars = agency.carsInStock();
        for (Vehicle v : availableCars) {
            System.out.println(v);
        }

        System.out.println("\n=== Returning Vehicles ===");
        System.out.println("Returning car1 for 3 days. Cost: $" + agency.returnVehicle(car1, 3)); 
        System.out.println("Returning truck1 for 2 days. Cost: $" + agency.returnVehicle(truck1, 2));

        System.out.println("\n=== Removing Vehicles ===");
        System.out.println("Removing bike1 (rented): " + agency.removeVehicle(bike1) + " - should be false, still rented");

        System.out.println("Returning bike1 for 5 days. Cost: $" + agency.returnVehicle(bike1, 5)); 
        System.out.println("Removing bike1 (now available): " + agency.removeVehicle(bike1)); 
        System.out.println("\nTotal vehicles in stock after removals: " + agency.totalRentalCars());

        System.out.println("\n=== Testing Capacity ===");
        for (int i = 0; i < 6; i++) { 
            Vehicle extraCar = new Car("BrandX", "ModelY", 2025, 4);
            System.out.println("Adding Car " + (i + 1) + ": " + agency.addCar(extraCar));
        }
    }
}

