package partI;


public class Car extends Vehicle {
	
	private int numSeats;
	
	public Car(String make, String model, int year, int numSeats) {
		super(make, model, year);
		this.numSeats = numSeats;
	}
	
	public int getNumSeats() {
		return numSeats;
	}
	
	@Override
    public String toString() {
        return "Car{make = " + super.getMake() + ", model = " + super.getModel() + ", year =" 
        		+ super.getYear() + ", numSeats = " + numSeats + "}";
    }
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (super.equals(obj)) {
			if (obj instanceof Car) {
				Car c = (Car)obj;
				return this.numSeats == c.numSeats;
			}
		}
		return false;
	}
}
