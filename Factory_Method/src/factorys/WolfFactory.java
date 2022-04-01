package factorys;

import entities.Wolf;
import others.AnimalIF;

public class WolfFactory extends AnimalFactory {
	public AnimalIF createAnimal() {
		return new Wolf();
	}
}
