package problem2;

public class RentalAgency {
	
	private String name;
	private String city;
	private String state;
	private static int capacity = 10;
	private RentalCar[] rentalCars = new RentalCar[10];
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
	
	public RentalCar[] getCars() {
		return rentalCars;
	}
	
	
	public int totalRentalCars() {
		int carCount = 0;
		for(RentalCar car : rentalCars) {
			if(car != null){
				carCount++;
			}
		}
		return carCount;
			
	}
	
	public RentalCar rentCar(int id) {
		int openSpot = -1;
		RentalCar rental = null;
		
		for(RentalCar car : rentalCars) {
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
	
	public double returnCar(int id, int days) {
		RentalCar rental = null;
		int rentedSpot = -1;

		for(RentalCar car : rentalCars) {
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
			return days*rental.getDailyCost();
		}
		
		return -1;
		
		
	}
	
	public RentalCar[] carsInStock() {
		RentalCar[] inStock = new RentalCar[10];
		int i = 0;
		
		for(RentalCar car : rentalCars) {
		    if (car == null) continue; 
		    
		    boolean isRented = false;
		    for (int carID : rented) {
		        if (carID == car.getID()) {
		            isRented = true;
		            break;
		        }
		    }
		    
		    if (!isRented) {
		        inStock[i++] = car;
		    }
		}

		
		return inStock;
	}
	
	public boolean addCar(RentalCar car) {
		boolean inLot = false;
		boolean isRented = false;
		int openSpot = -1;
		
		for(int i=0; i<capacity; i++) {
			if(rentalCars[i] != null &&rentalCars[i].getID() == car.getID()) {
				inLot = true;
				break;
			}
			
			if(rentalCars[i] == null) {
				openSpot = i;
			}
		}
		
		for(int rentedID: rented) {
			if(rentedID == car.getID()) {
				isRented = true;
				break;
			}
		}
		
		if(!inLot && !isRented && openSpot != -1) {
			rentalCars[openSpot] = car;
			return true;
		}
		
		return false;
		
	}
	
	public boolean removeCar(int id) {
		int lotSpot = -1;
		boolean isRented = false;
		
		for(int i=0; i<capacity; i++) {
			if(rentalCars[i] != null && rentalCars[i].getID() == id) {
				lotSpot = i;
			}
		}
		
		for(int rentedID: rented) {
			if(rentedID == id) {
				isRented = true;
				break;
			}
		}
		
		if(lotSpot!=-1 && !isRented) {
			rentalCars[lotSpot] = null;
			return true;
		}
		
		return false;
	}
	
}
