package thermometers;

import main.Zone;
import java.text.MessageFormat;

public class ThermometerBasic implements ThermometerIF {
	
	public void readTemp(Zone zone) {
		System.out.println(MessageFormat.format("Temperatura => {0}°", zone.getTemp()));
	}
}
