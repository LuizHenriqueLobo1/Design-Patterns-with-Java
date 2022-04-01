package entities;

import others.AnimalIF;

public class Cat implements AnimalIF {
	public void makeSound() {
		System.out.println("Miau, miau...");
	}
}
