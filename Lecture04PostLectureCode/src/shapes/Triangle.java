package shapes;

public class Triangle extends GeometricObject {

	double base;
	double height;
	
	public Triangle() {
		this.base =1.0;
		this.height = 1.0;
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		
	}
	
	public Triangle(double base, double height,
			String color, boolean filled) {
		super(color, filled);
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		return 0.5 * this.base*this.height;
	}
	
	public String toString() {
		return "Triangle["+super.toString() +
				", base="+this.base + ", height="
			+ this.height;
	}
}
