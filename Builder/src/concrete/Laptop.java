package concrete;

import java.text.MessageFormat;

public class Laptop {
	
	private String model;
	private Brand brand;
	private String processor;
	private boolean haveDedicatedGraph;
	private int usbPortsAmount;
	
	public Laptop(String model, Brand brand, String processor, boolean haveDedicatedGraph, int usbPortsAmount) {
		this.model 				= model;
		this.brand 				= brand;
		this.processor 			= processor;
		this.haveDedicatedGraph = haveDedicatedGraph;
		this.usbPortsAmount 	= usbPortsAmount;
	}

	public Laptop() {
		this.model     			= "No have model!";
		this.brand     			= Brand.WHITE_LABEL;
		this.processor 			= "No have processor!";
		this.haveDedicatedGraph = false;
		this.usbPortsAmount		= 0;
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
	
	public String getProcessor() {
		return processor;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public boolean isHaveDedicatedGraph() {
		return haveDedicatedGraph;
	}
	
	public void setHaveDedicatedGraph(boolean haveDedicatedGraph) {
		this.haveDedicatedGraph = haveDedicatedGraph;
	}
	
	public int getUsbPortsAmount() {
		return usbPortsAmount;
	}
	
	public void setUsbPortsAmount(int usbPortsAmount) {
		this.usbPortsAmount = usbPortsAmount;
	}
	
	public String toString() {
		return MessageFormat.format(
				"Model: {0}\nBrand: {1}\nProcessor: {2}\nDedicated Graph: {3}\nUSB Ports Amount: {4}",
				this.getModel(), this.getBrand(), this.getProcessor(), this.isHaveDedicatedGraph(), this.getUsbPortsAmount()
		);
	}
}
