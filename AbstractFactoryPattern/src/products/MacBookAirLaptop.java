package products;
import factory.LaptopFactory;

public class MacBookAirLaptop extends Laptop{
	
	LaptopFactory laptopFactory;
	
	public MacBookAirLaptop(LaptopFactory laptopFactory) {
		this.laptopFactory = laptopFactory;
	}
	
	 public void assembleLaptop() {
		 name 		= "MacBook Air";
		 processor 	= laptopFactory.createProcessor();
		 os   		= laptopFactory.createOS();
		 memory 	= laptopFactory.createMemory();
	     screen 	= laptopFactory.createScreen();
	 }	 
}
