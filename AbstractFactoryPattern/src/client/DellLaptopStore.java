package client;
import factory.DellFactory;
import factory.LaptopFactory;
import products.DellLaptop;
import products.Laptop;

public class DellLaptopStore extends LaptopStore{
	protected  Laptop createLaptop() {
		Laptop laptop = null;
		
		LaptopFactory dellFactory = new DellFactory();
		
		laptop = new DellLaptop(dellFactory);
		laptop.assembleLaptop();
		
		return laptop;
	}
}