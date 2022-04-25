package main;

import concrete.Car;
import concrete.Brand;
import concrete.Color;

public class App {

	public void run() {
		Car car = new Car("Sandero", Brand.RENAULT, Color.BLACK, "2017");
		Car carClone = (Car) car.cloning();
		
		System.out.println(car);
		System.out.println(carClone);
		System.out.println(car.equals(carClone));
	}
	
	public static void main(String[] args) {
		(new App()).run();
	}
}
