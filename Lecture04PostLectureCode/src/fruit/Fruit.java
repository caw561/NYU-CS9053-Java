package fruit;

public class Fruit {

	public Fruit(String name) {
		System.out.println("created fruit " + name);
	}
	
	public static void main(String[] args) {
		Fruit f = new Fruit("generic fruit");
		Fruit f2 = new Fruit("generic fruit");
		System.out.println(f);
		System.out.println(f2.toString());
	}
}
