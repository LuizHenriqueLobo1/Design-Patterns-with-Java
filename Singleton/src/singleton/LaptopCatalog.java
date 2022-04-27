package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import concrete.Laptop;

public class LaptopCatalog {
	
	private List<Laptop> laptops;
	
	private static LaptopCatalog laptopCatalog = null;
	
	private LaptopCatalog() {
		this.laptops = new ArrayList<Laptop>();
	}
	
	public static LaptopCatalog getLaptopCatalog() {
		if(LaptopCatalog.laptopCatalog == null) {
			LaptopCatalog.laptopCatalog = new LaptopCatalog();
		}
		return LaptopCatalog.laptopCatalog;
	}
	
	public void addLaptop(Laptop laptop) {
		this.laptops.add(laptop);
	}
	
	public List<Laptop> getLaptos() {
		return this.laptops;
	}
	
	private Laptop getLaptopBySurname(String surname) {
		return this.laptops.stream().filter(laptop -> laptop.getSurname().equals(surname)).collect(Collectors.toList()).get(0);
	}
	
	public void deleteLaptopBySurname(String surname) {
		this.laptops.remove(this.getLaptopBySurname(surname));
	}
	
	public void printLaptops() {
		this.laptops.forEach(laptop -> System.out.println(laptop));
	}
}
