package client;
import factory.LaptopFactory;
import factory.MacBookAirFactory;
import products.Laptop;
import products.MacBookAirLaptop;

public class MacBookAirLaptopStore extends LaptopStore{
	protected  Laptop createLaptop() {
		Laptop laptop = null;
		
		LaptopFactory macBookAirFactory = new MacBookAirFactory();
		
		laptop = new MacBookAirLaptop(macBookAirFactory);
		laptop.assembleLaptop();
		
		return laptop;
	}
}