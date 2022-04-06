package controllers;

import thermometers.ThermometerIF;
import thermometers.ThermometerHigh;
import actuators.ActuatorIF;
import actuators.ActuatorHigh;

public class ControllerHigh implements ControllerIF {

	private double maxTemp;
	
	public ControllerHigh(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	private double getMaxTemp() {
		return this.maxTemp;
	}
	
	public ThermometerIF getThermometer() {
		return new ThermometerHigh(this.getMaxTemp());
	}

	public ActuatorIF getActuator() {	
		return new ActuatorHigh(this.getMaxTemp());
	}	
}
