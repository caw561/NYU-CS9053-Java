package arraylists;
import java.util.ArrayList;
import shapes.*;
import shapes.GeometricObject;
public class ArrayListTests {

	public static void main(String[] args) {
		ArrayList arList = new ArrayList();
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("hello");
		stringList.add("goodbye");
		stringList.add("java");
		
		for (String str : stringList) {
			System.out.println(str);
		}
		ArrayList<GeometricObject> goList = new ArrayList<>();
		goList.add(new Circle());
		goList.add(new Rectangle(5,6));
		goList.add(new Triangle(3,4));
		
		System.out.println("goList.get(1) is " + 
		goList.get(1));
		for (GeometricObject go : goList) {
			System.out.println(go.equals(new Circle()));
		}
		goList.remove(new Circle());
		System.out.println("goList: "+ goList);
		
		ArrayList<Integer> intArrayList = new ArrayList<>();
		for (int i=0;i<10;i++) {
			intArrayList.add((int)(Math.random()*Integer.MAX_VALUE));
		}
		System.out.println(intArrayList.toString());
	}

}
