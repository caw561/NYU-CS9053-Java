package animals;

public abstract class Animal implements Comparable<Animal> {

	private double weight;
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
	
	public int compareTo(Animal a) {
		return Double.compare(this.weight, a.weight);
	}
	
	public abstract String sound();
}
