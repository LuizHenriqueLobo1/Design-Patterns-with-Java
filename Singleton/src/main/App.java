package main;

import concrete.Brand;
import concrete.Laptop;
import singleton.LaptopCatalog;

public class App {

	public void run() {

		LaptopCatalog laptopCatalog1 = LaptopCatalog.getLaptopCatalog();
		
		laptopCatalog1.addLaptop(new Laptop("Good Laptop", Brand.APPLE, "Macbook Air", "M1"));
		laptopCatalog1.addLaptop(new Laptop("Very Bad Laptop", Brand.POSITIVO, "Motion Q464C", "Intel Atom Z8350"));
		
		System.out.println("laptopCatalog 1");
		laptopCatalog1.printLaptops();
		
		LaptopCatalog laptopCatalog2 = LaptopCatalog.getLaptopCatalog();
		
		System.out.println("\nlaptopCatalog 2");
		laptopCatalog2.printLaptops();
		
		laptopCatalog2.deleteLaptopBySurname("Very Bad Laptop");
		
		System.out.println("\nlaptopCatalog 1");
		laptopCatalog1.printLaptops();
		
		System.out.println("\nlaptopCatalog 2");
		laptopCatalog2.printLaptops();
		
		System.out.println("\nlaptopCatalog 1: " + laptopCatalog1);
		System.out.println("laptopCatalog 2: " + laptopCatalog2);
	}
	
	public static void main(String[] args) {
		(new App()).run();
	}
}
