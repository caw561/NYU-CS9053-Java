package shapes;

import java.util.Date;
import java.util.Objects;

public class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	public GeometricObject() {
		
		this.color = "green";
		this.filled = true;
		this.dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
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
		return this.filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public static void printShape(GeometricObject go) {
		System.out.println("GeometricObject: "+ go.color +
		 ", "+ go.filled + ", " + go.dateCreated);
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(color, filled);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeometricObject other = (GeometricObject) obj;
		return Objects.equals(color, other.color) && filled == other.filled;
	}

	public String toString() {
		return "GeometricObject[color=" + this.color + ", filled=" + this.filled + "]";
	}
	
	public static void main (String[] args) {
		GeometricObject s1 = new GeometricObject();
		String outString = "The object: "+ s1;
		//System.out.println(outString);
		s1.setColor("brown");
		s1.setFilled(false);
		System.out.println(s1.toString());
		System.out.println("s1 color is " + s1.getColor());
		System.out.println("s1 filled is " + s1.isFilled());
		
		GeometricObject s2 = new GeometricObject("purple", true);
		//System.out.println(s2.toString());
		
		//GeometricObject.printShape(s2);
		s1.setColor(null);
		GeometricObject s3 = new GeometricObject ("brown", false);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
	
	

}
