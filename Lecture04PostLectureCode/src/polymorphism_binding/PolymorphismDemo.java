package polymorphism_binding;
import shapes.*;

public class PolymorphismDemo {
	  /** Main method */
	  public static void main(String[] args) {
	    // Display circle and rectangle properties
		  GeometricObject go = new Circle(1, "red", false);
	    displayObject(go);
	    displayObject(new Rectangle
	        (1, 1, "black", true));
	    displayObject(new Triangle
		        (6, 5, "black", true));
	    displayObject(new Square(5));
	  }

	  /** Display geometric object properties */
	  public static void displayObject(GeometricObject object) {
	    System.out.println("Created on " + object.getDateCreated() +
	      ". Color is " + object.getColor());
	    
	    System.out.println(object.toString());
	    if (object instanceof Circle) {
	    	Circle c = (Circle)object;
	    	System.out.println("circle radius is "+ c.getRadius());
	    } else if (object instanceof Rectangle) {
	    	Rectangle r = (Rectangle)object;
	    	System.out.println("rectangle length, width is "+ 
	    	r.getLength() +", "+ r.getWidth());

	    }
	  }
	  
	  public static void getRectangleInfo(Rectangle rect) {
		  System.out.println("length is " + rect.getLength() + ", width is " + 
				  rect.getWidth());
		  rect.setLength(99);
		    System.out.println(rect.toString());
	  }
	}
