package concrete;

import java.text.MessageFormat;

public class Laptop {

	private String surname;
	private Brand  brand;
	private String model;
	private String processor;
	
	public Laptop(String surname, Brand brand, String model, String processor) {
		this.surname   = surname;
		this.brand     = brand;
		this.model     = model;
		this.processor = processor;
	}
	
	public Laptop() {
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public String toString() {
		return MessageFormat.format(
				"Surname: {0}, Brand: {1}, Model: {2}, Processor: {3}",
				this.getSurname(), this.getBrand(), this.getModel(), this.getProcessor()
		);
	}
}
