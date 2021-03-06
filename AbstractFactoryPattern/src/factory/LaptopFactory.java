package factory;
import products.Memory;
import products.OS;
import products.Processor;
import products.Screen;

public interface LaptopFactory {
	Processor createProcessor();
	OS 		  createOS();
	Screen 	  createScreen();
	Memory 	  createMemory();
}