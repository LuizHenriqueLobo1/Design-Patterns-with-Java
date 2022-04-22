package builder;

import concrete.Brand;

public class Director {

	public void buildGoodLaptop(Builder builder) {
		builder.reset();
		builder.setModel("Macbook Pro 2022");
		builder.setBrand(Brand.APPLE);
		builder.setProcessor("M1 MAX");
		builder.setHaveDedicatedGraph(false);
		builder.setUsbPortsAmount(0);
	}
	
	public void buildBadLaptop(Builder builder) {
		builder.reset();
		builder.setModel("Motion Gray Q464C");
		builder.setBrand(Brand.POSITIVO);
		builder.setProcessor("Intel Atom");
		builder.setHaveDedicatedGraph(false);
		builder.setUsbPortsAmount(2);
	}
	
	public void buildGamerLaptop(Builder builder) {
		builder.reset();
		builder.setModel("M15 R6");
		builder.setBrand(Brand.ALIENWARE);
		builder.setProcessor("Intel i7");
		builder.setHaveDedicatedGraph(true);
		builder.setUsbPortsAmount(2);
	}
}
