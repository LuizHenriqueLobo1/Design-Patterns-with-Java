package builder;

import concrete.Brand;

public interface Builder {
	public void reset();
	public void setModel(String model);
	public void setBrand(Brand brand);
	public void setProcessor(String processor);
	public void setHaveDedicatedGraph(boolean haveDedicatedGraph);
	public void setUsbPortsAmount(int usbPortsAmount);
}
