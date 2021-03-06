package products;
import factory.LaptopFactory;

public class DellLaptop extends Laptop{

	LaptopFactory laptopFactory;
	
	public DellLaptop(LaptopFactory laptopFactory) {
		this.laptopFactory = laptopFactory;
	}
	
	 public void assembleLaptop() {
		 name 		= "Dell Inspiron";
		 processor 	= laptopFactory.createProcessor();
		 os   		= laptopFactory.createOS();
		 memory 	= laptopFactory.createMemory();
	     screen 	= laptopFactory.createScreen();
	 }	 
}