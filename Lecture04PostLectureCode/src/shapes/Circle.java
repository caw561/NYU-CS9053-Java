package shapes;

public class Circle extends GeometricObject {
	private double radius;
	
	public Circle() {
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	public double getPerimeter() {
		return Math.PI*2*this.radius;
	}
	
	public double getDiameter() {
		return 2*this.radius;
	}
	

	public static void printShape(GeometricObject go) {
		System.out.println("Circle: "+ go.getColor() +
		 ", "+ go.isFilled() + ", " + go.getDateCreated());
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (super.equals(o)) {
			if (o instanceof Circle) {
				Circle c = (Circle)o;
				return this.radius == c.radius;
			}
		}
		return false;
	}
	
	public String toString() {
		// the output of "A Circle with radius=xxx, which is a subclass of yyy", 
		// where yyy is the output of the toString() method from the superclass
		// is also acceptable
		return "Circle[" + super.toString() + ", radius=" + this.radius + "]";
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		System.out.println("radius = " + c1.getRadius());
		System.out.println("area = " + c1.getArea());
		System.out.println("perimeter = " + c1.getPerimeter());
		System.out.println("color = " + c1.getColor());

		Circle c2 = new Circle(3.5);
		System.out.println("c1.equals(c2)? " +
		c1.equals(c2));
		System.out.println(c2.toString());
		
		Circle c3 = new Circle(2.5, "magenta", false);
		System.out.println(c3.toString());
		
		Circle.printShape(c3);
		GeometricObject.printShape(c3);
		
		GeometricObject go = new Circle(3.5, "purple", true);
		System.out.println("go has color " + go.getColor());
		System.out.println("c2.equals(go)? "+
		c2.equals(go));
	}

}
