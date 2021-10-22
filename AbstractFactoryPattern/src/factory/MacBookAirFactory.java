package factory;
import products.AppleM1Chip;
import products.MacOSBigSur11;
import products.Memory;
import products.OS;
import products.Processor;
import products.RAM16GB;
import products.RetinaScreen;
import products.Screen;

public class MacBookAirFactory implements LaptopFactory{
	@Override
	public Processor createProcessor() {
		return new AppleM1Chip();
	}

	@Override
	public OS createOS() {
		return new MacOSBigSur11();
	}

	@Override
	public Screen createScreen() {
		return new RetinaScreen();
	}

	@Override
	public Memory createMemory() {
		return new RAM16GB();
	}
}