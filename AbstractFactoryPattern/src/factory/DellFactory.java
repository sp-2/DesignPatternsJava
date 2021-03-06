package factory;
import products.IntelCorei5;
import products.Memory;
import products.OS;
import products.Processor;
import products.RAM8GB;
import products.Screen;
import products.TouchScreen;
import products.Windows10OS;

public class DellFactory implements LaptopFactory{

	@Override
	public Processor createProcessor() {
		return new IntelCorei5();
	}

	@Override
	public OS createOS() {
		return new Windows10OS();
	}

	@Override
	public Screen createScreen() {
		return new TouchScreen();
	}

	@Override
	public Memory createMemory() {
		return new RAM8GB();
	}
}
