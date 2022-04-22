package main;

import builder.Director;
import builder.LaptopBuilder;
import concrete.Laptop;

public class App {

	private void run() {
		
		Director director = new Director();
		LaptopBuilder builder = new LaptopBuilder();
		
		director.buildGoodLaptop(builder);
		
		Laptop laptop = builder.getLaptop();
		
		System.out.println(laptop);
	}
	
	public static void main(String[] args) {
		(new App()).run();
	}
}
