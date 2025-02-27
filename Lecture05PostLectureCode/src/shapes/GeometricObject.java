package shapes;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
				" and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public int compareTo(GeometricObject o) {
		return Double.compare(this.getArea(), o.getArea());
	}
	
	public static void main(String[] args) {
		GeometricObject go = new Circle(5.0);
		System.out.println("area of go is " + go.getArea());
	}
}




/* implements Comparable<GeometricObject> 
 * 	
	public int compareTo(GeometricObject o) {
		return Double.compare(this.getArea(), o.getArea());
	}
 */
 
