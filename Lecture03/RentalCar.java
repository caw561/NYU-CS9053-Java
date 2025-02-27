package problem2;

public class RentalCar {
	
	private static int nextid = 1;
	private int id;
	private String make;
	private String model;
	private int year;
	private double dailyCost = 1.0;
	
	public RentalCar(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		
		id = nextid;
		nextid++;
	}
	
	public void setDailyCost(double dailyCost) {
		this.dailyCost = dailyCost;
	}
	
	public double getDailyCost() {
		return dailyCost;
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

}
