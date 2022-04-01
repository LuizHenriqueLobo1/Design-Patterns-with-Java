package entities;

import others.AnimalIF;

public class Dog implements AnimalIF {
	public void makeSound() {
		System.out.println("Au, au, au...");
	}
}
