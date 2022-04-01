package factorys;

import entities.Cat;
import others.AnimalIF;

public class CatFactory extends AnimalFactory {
	public AnimalIF createAnimal() {
		return new Cat();
	}
}
