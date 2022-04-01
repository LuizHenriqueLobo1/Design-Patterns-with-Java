package factorys;

import entities.Dog;
import others.AnimalIF;

public class DogFactory extends AnimalFactory {
	public AnimalIF createAnimal() {
		return new Dog();
	}
}
