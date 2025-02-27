package partI;

public class Truck extends Vehicle{

	private double cargoCapacity;
	
	public Truck(String make, String model, int year, double cargoCapacity) {
		super(make, model,year);
		this.cargoCapacity = cargoCapacity;
	}
	
	public double getCargoCapacity() {
		return cargoCapacity;
	}
	
	@Override
    public String toString() {
        return "Truck{make = " + super.getMake() + ", model = " + super.getModel() + ", year =" 
        		+ super.getYear() + ", cargo capacity = " + cargoCapacity + "}";
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (super.equals(obj)) {
			if (obj instanceof Truck) {
				Truck t = (Truck)obj;
				return this.cargoCapacity == t.cargoCapacity;
			}
		}
		return false;
	}
}
