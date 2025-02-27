package partI;

public class DeliveryTruck extends Truck {

	private double height;
	
	public DeliveryTruck(String make, String model, int year, double cargoCapacity, double height) {
		super(make, model, year, cargoCapacity);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		return "DeliveryTruck{make = " + super.getMake() + ", model = " + super.getModel() + ", year = " + super.getYear()
			+ ", cargo capacity = " + super.getCargoCapacity() + ", height = " + height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (super.equals(obj)) {
			if (obj instanceof DeliveryTruck) {
				DeliveryTruck d = (DeliveryTruck)obj;
				return this.height == d.height;
			}
		}
		return false;
	}
}
