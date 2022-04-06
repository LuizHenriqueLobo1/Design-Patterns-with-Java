package main;

import controllers.ControllerIF;
import controllers.ControllerHigh;

public class App {
	
	public void run() throws InterruptedException {
		
		Zone zone = new Zone();
		
		ControllerIF controller = new ControllerHigh(25);
		
		while(true) {
			controller.getThermometer().readTemp(zone);
			zone.randomize();
			controller.getActuator().modify(zone);
			Thread.sleep(100);
		}		
	}
	
	public static void main(String[] args) throws InterruptedException {
		(new App()).run();
	}
}
