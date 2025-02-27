package partI;

public class PickupTruck extends Truck {

	private double bedLength;
	private boolean crewCab;
	
	public PickupTruck(String make, String model, int year, double cargoCapacity, double bedLength, boolean crewCab) {
		super(make, model, year, cargoCapacity);
		this.bedLength = bedLength;
		this.crewCab = crewCab;
	}
	
	public double getBedLength() {
		return bedLength;
	}
	
	public boolean getcrewCab() {
		return crewCab;
	}
	
	@Override
    public String toString() {
        return "PickupTruck{make = " + super.getMake() + ", model = " + super.getModel() + ", year =" 
        		+ super.getYear() + ", cargo capacity = " + super.getCargoCapacity() + ", bed length" + bedLength 
        		+ ", crew cab" + crewCab + "}";
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (super.equals(obj)) {
			if (obj instanceof PickupTruck) {
				PickupTruck p = (PickupTruck)obj;
				return this.bedLength == p.bedLength && this.crewCab == p.crewCab;
			}
		}
		return false;
	}
}
