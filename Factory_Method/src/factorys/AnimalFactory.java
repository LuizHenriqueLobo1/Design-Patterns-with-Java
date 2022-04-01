package factorys;

import java.lang.reflect.InvocationTargetException;

import others.AnimalIF;
import others.AnimalType;

public abstract class AnimalFactory {

	public static AnimalFactory getFactory(AnimalType type) {
		try {
			return (AnimalFactory)Class.forName(type.getFactoryName()).getConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException error) {
			System.err.println("Error: " + error);
		}
		return null;
	}
	
	public abstract AnimalIF createAnimal();
	
	public AnimalIF getAnimal() {
		return createAnimal();
	}
}
