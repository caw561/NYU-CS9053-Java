package partI;

import java.util.Objects;

public class Vehicle {
	
	private int id;
	private static int nextid = 1;
	private String make;
	private String model;
	private int year;
	private double rentalRate;
	
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		
		id = nextid;
		nextid++;
	}
	
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	
	public double getRentalRate() {
		return rentalRate;
	}
	
	public int getID() {
		return id;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	@Override
    public String toString() {
        return "Vehicle{make = " + make + ", model = " + model + ", year =" + year + "}";
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model) && year == other.year && id == other.id;
	}

}
