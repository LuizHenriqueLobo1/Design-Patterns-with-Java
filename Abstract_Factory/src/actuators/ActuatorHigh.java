package actuators;

import main.Zone;
import java.text.MessageFormat;

public class ActuatorHigh implements ActuatorIF {
	
	private double maxTemp;

	public ActuatorHigh(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	private double getMaxTemp() {
		return this.maxTemp;
	}
	
	public void modify(Zone zone) {
		double temp = zone.getTemp();
		if(temp > this.getMaxTemp()) {
			double delta = temp - this.getMaxTemp();
			System.err.println(MessageFormat.format(">>> Resfriando: {0}°", delta));
			zone.cool(delta);
		}	
	}
}
