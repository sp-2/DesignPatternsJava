package client;
import products.Laptop;

public abstract class LaptopStore {
	
	public Laptop orderLaptop() {
		Laptop laptop = createLaptop();
		//laptop.assembleLaptop();
		return laptop;
	}
	
	protected abstract Laptop createLaptop();
	
}