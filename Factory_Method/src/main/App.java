package main;

import factorys.AnimalFactory;

import others.AnimalIF;
import others.AnimalType;

public class App {
	
	public void run() { 
		AnimalFactory factory = AnimalFactory.getFactory(AnimalType.WOLF);
		AnimalIF animal = factory.getAnimal();
		animal.makeSound();
	}
	
	public static void main(String[] args) {
		(new App()).run();
	}
}
