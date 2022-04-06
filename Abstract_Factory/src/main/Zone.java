package main;

import java.util.Random;

public class Zone {
	
	public double temp = 25;

	public double getTemp() {
		return this.temp; 
	}
	
	public void warm(double intensisty) {
		this.temp += this.getVariation(intensisty);
	}
	
	public void cool(double intensisty) {
		this.temp -= this.getVariation(intensisty);
	}
	
	private double getVariation(double intensisty) {
		return new Random().nextDouble() * intensisty;
	}

	public void randomize() {
		Random random = new Random();
		int value = random.nextInt(3);
		if (random.nextBoolean())
			this.cool(value); 
		else
			this.warm(value); 
	}
}
