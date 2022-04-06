package thermometers;

import java.text.MessageFormat;
import main.Zone;

public class ThermometerHigh implements ThermometerIF {
	
	private double maxTemp;
	
	public ThermometerHigh(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	private double getMaxTemp() {
		return this.maxTemp;
	}
	
	public void readTemp(Zone zone) {
		if(getMaxTemp() > zone.getTemp())
			System.out.println(MessageFormat.format("Temperatura => {0}°", zone.getTemp()));
		else
			System.err.println(MessageFormat.format("Temperatura => {0}°", zone.getTemp()));
	}
}
