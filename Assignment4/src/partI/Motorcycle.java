package partI;

public class Motorcycle extends Vehicle {

	private boolean hasSideCar;
	
	public Motorcycle(String make, String model, int year, boolean hasSideCar) {
		super(make, model, year);
		this.hasSideCar = hasSideCar;
	}
	
	public boolean getHasSideCar() {
		return hasSideCar;
	}
	
	@Override
    public String toString() {
        return "Motorcycle{make = " + super.getMake() + ", model = " + super.getModel() + ", year =" 
        		+ super.getYear() + ", hasSideCar = " + hasSideCar + "}";
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (super.equals(obj)) {
			if (obj instanceof Motorcycle) {
				Motorcycle m = (Motorcycle)obj;
				return this.hasSideCar == m.hasSideCar;
			}
		}
		return false;
	}
}
