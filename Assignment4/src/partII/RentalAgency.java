package partII;

import java.util.ArrayList;

import partI.Vehicle;

public class RentalAgency {
	private String name;
	private String city;
	private String state;
	private static int capacity = 10;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	private int[] rented = new int[capacity];
	
	public RentalAgency(String name, String city, String state) {
		this.name = name;
		this.city = city;
		this.state = state;
		
		for (int i = 0; i < capacity; i++) {
		    rented[i] = -1;
		}

	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public ArrayList<Vehicle> getCars() {
		return vehicles;
	}
	
	public int totalRentalCars() {
		return vehicles.size();
			
	}
	
	public Vehicle rentVehicle(int id) {
		int openSpot = -1;
		Vehicle rental = null;
		
		for(Vehicle car : vehicles) {
			if(car != null && car.getID() == id) {
				rental = car;
				break;
			}
		}
		
		for(int i=0; i<capacity; i++) {
			if(id == rented[i]) {
				return null;
			}
			if(rented[i] == -1) {
				openSpot = i;
			}
		}
		
		if(rental!=null&& openSpot!=-1) {
			rented[openSpot] = rental.getID();
			return rental;
		}
		
		return null;
		
	}
	
	public double returnVehicle(int id, int days) {
		Vehicle rental = null;
		int rentedSpot = -1;

		for(Vehicle car : vehicles) {
			if(car != null && car.getID() == id) {
				rental = car;
				break;
			}
		}
			
		for(int i = 0; i<capacity; i++) {
			if(rented[i] == id) {
				rentedSpot = i;
			}
		}
		
		if(rentedSpot!=-1 && rental != null) {
			rented[rentedSpot] = -1;
			return days*rental.getRentalRate();
		}
		
		return -1;
	}
	
	public ArrayList<Vehicle> carsInStock() {
		ArrayList<Vehicle>  inStock = new ArrayList<Vehicle>();
		int i = 0;
		
		for(Vehicle car : vehicles) {
		    if (car == null) continue; 
		    
		    boolean isRented = false;
		    for (int carID : rented) {
		        if (carID == car.getID()) {
		            isRented = true;
		            break;
		        }
		    }
		    
		    if (!isRented) {
		        inStock.add(car);
		    }
		}

		
		return inStock;
	}
	
	public boolean addCar(Vehicle car) {
		boolean inLot = false;
		boolean isRented = false;
		int openSpot = -1;
		
		
		if(vehicles.contains(car)) {
				inLot = true;
		}
			
		
		if(!inLot && vehicles.size()<10) {
			return vehicles.add(car);
		}
		
		return false;
		
	}
	
	public boolean removeVehicle(int id) {
		
		for(int rentedID: rented) {
			if(rentedID == id) {
				return false;
			}
		}
		
		for(Vehicle rental : vehicles) {
			if(rental != null && rental.getID() == id) {
				return vehicles.remove(rental);
			}
		}
		
		return false;
	}
	
	public Vehicle rentVehicle(Vehicle car) {
		int openSpot = -1;
		
		for(int i=0; i<capacity; i++) {
			if(car.getID() == rented[i]) {
				return null;
			}
			if(rented[i] == -1) {
				openSpot = i;
			}
		}
		
		if(vehicles.contains(car) && openSpot!=-1) {
			rented[openSpot] = car.getID();
			return car;
		}
		
		return null;
		
	}
	
	public double returnVehicle(Vehicle car, int days) {
		int rentedSpot = -1;
			
		for(int i = 0; i<capacity; i++) {
			if(rented[i] == car.getID()) {
				rentedSpot = i;
			}
		}
		
		if(rentedSpot!=-1 && vehicles.contains(car)) {
			rented[rentedSpot] = -1;
			return days* car.getRentalRate();
		}
		
		return -1;
	}
	
	public boolean removeVehicle(Vehicle car) {
		
		for(int rentedID: rented) {
			if(rentedID == car.getID()) {
				return false;
			}
		}
	
		if(vehicles.contains(car)) {
			return vehicles.remove(car);
		}
		
		return false;
	}
	
}
