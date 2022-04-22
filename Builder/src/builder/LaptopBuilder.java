package builder;

import concrete.Brand;
import concrete.Laptop;

public class LaptopBuilder implements Builder {

	public String model;
	public Brand brand;
	public String processor;
	public boolean haveDedicatedGraph;
	public int usbPortsAmount;
	
	public LaptopBuilder() {
		this.reset();
	}
	
	public void reset() {
		this.model     			= "No have model!";
		this.brand     			= Brand.WHITE_LABEL;
		this.processor 			= "No have processor!";
		this.haveDedicatedGraph = false;
		this.usbPortsAmount		= 0;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setHaveDedicatedGraph(boolean haveDedicatedGraph) {
		this.haveDedicatedGraph = haveDedicatedGraph;
	}

	public void setUsbPortsAmount(int usbPortsAmount) {
		this.usbPortsAmount = usbPortsAmount;
	}	

	public Laptop getLaptop() {
		return new Laptop(
				this.model,
				this.brand,
				this.processor,
				this.haveDedicatedGraph,
				this.usbPortsAmount
		);
	}
}
