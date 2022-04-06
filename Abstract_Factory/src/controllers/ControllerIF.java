package controllers;

import actuators.ActuatorIF;
import thermometers.ThermometerIF;

public interface ControllerIF {
	public ThermometerIF getThermometer();
	public ActuatorIF getActuator();
}
