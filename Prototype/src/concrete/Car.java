package concrete;

import java.text.MessageFormat;

import prototype.Prototype;

public class Car implements Prototype {

	private String model;
	private Brand brand;
	private Color color;
	private String year;
	
	public Car(String model, Brand brand, Color color, String year) {
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.year = year;
	}

	public Car(Car car) {
		this.model = car.getModel();
		this.brand = car.getBrand();
		this.color = car.getColor();
		this.year  = car.getYear();
	}
	
	public Car() {
	}
	
	public Object cloning() {
		return new Car(this);
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Brand getBrand() {
		return brand;
	}
	
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String toString() {
		return MessageFormat.format(
				"Model: {0}\nBrand: {1}\nColor: {2}\nYear: {3}\n", 
				this.getModel(), this.getBrand(), this.getColor(), this.getYear()
		);
	}
}
