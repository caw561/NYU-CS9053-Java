package animals;

import edibles.Edible;

public class Duck extends Animal implements Edible {

	@Override
	public String howToEat() {
		
		return "Duck: make duck breast l'orange";
	}

	@Override
	public String sound() {
		return "Duck: Quack! Quack!";
	}

}
