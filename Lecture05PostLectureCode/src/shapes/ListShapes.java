package shapes;
import java.util.ArrayList;
import java.util.List;

public class ListShapes {

	public static double meanArea(List<? extends GeometricObject> shapeList) {
		double sum = 0;
		for (GeometricObject g : shapeList) {
			sum += g.getArea();
		}
		return sum/shapeList.size();
	}
	public static void main(String[] args) {
		ArrayList<GeometricObject> shapeList = 
				new ArrayList<GeometricObject>();

		ArrayList<Circle> circleList = 
				new ArrayList<Circle>();
		Circle circle = new Circle(5);
		Rectangle rect = new Rectangle(4,5);
		Circle circle2 = new Circle(2);
		shapeList.add(circle);
		shapeList.add(rect);
		shapeList.add(new Rectangle(66,4));
		shapeList.add(new Circle(1.0));
		shapeList.add(circle2);
		circleList.add(circle);
		circleList.add(circle2);
		
		double theMeanArea = meanArea(circleList);
		shapeList.sort( (s1, s2) -> -Double.compare(s1.getPerimeter(), s2.getPerimeter()));
		
		for (int i = 0; i < shapeList.size();i++) {
			GeometricObject shape = shapeList.get(i);
			System.out.println("shape is "+ shape.toString());
			System.out.println("area of shape is "+ shape.getArea());
			System.out.println("perimeter of shape is "+ 
					shape.getPerimeter());
			System.out.println("-------");
			}
	}
}
