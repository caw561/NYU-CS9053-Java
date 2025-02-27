package shapes;

public abstract class Triangle extends GeometricObject {
	double base;
	double height;
	@Override
	public double getArea() {
		return 0.5*base*height;
	}



}
